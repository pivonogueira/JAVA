package com.estacio.extensao.token_randomico.service;

import com.estacio.extensao.token_randomico.dto.UsuarioDTO;
import com.estacio.extensao.token_randomico.exceptions.ResourceNotFoundException;
import com.estacio.extensao.token_randomico.exceptions.RestBadRequestException;
import com.estacio.extensao.token_randomico.mapper.UsuarioMapper;
import com.estacio.extensao.token_randomico.models.Chave;
import com.estacio.extensao.token_randomico.models.RecuperarSenha;
import com.estacio.extensao.token_randomico.models.Token;
import com.estacio.extensao.token_randomico.models.Usuario;
import com.estacio.extensao.token_randomico.repository.UsuarioRepository;
import com.estacio.extensao.token_randomico.utils.TokenUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    UsuarioMapper mapper;
    @Autowired
    TokenUtils tokenUtils;
    @Autowired
    UsuarioRepository usuarioRepository;

    @Transactional
    public Usuario criarUsuario(UsuarioDTO usuarioDTO) {
        Usuario usuario = mapper.fromDto(usuarioDTO);
        Token token = tokenUtils.criarTokenEChaves();
        usuario.setToken(token);
        usuarioRepository.save(usuario);
        return usuario;
    }

    @Transactional
    public void excluirUsuario(Long id) {
        usuarioRepository.deleteById(id);
    }

    @Transactional
    public UsuarioDTO atualizarDadosUsuario(Long id, UsuarioDTO dto) {
        Usuario usuario = usuarioRepository.getReferenceById(id);
        copyToEntity(usuario, dto);
        usuarioRepository.save(usuario);
        return new UsuarioDTO(usuario);
    }

    public Page<UsuarioDTO> findAllPaged(Pageable pageable) {
        Page<Usuario> page = usuarioRepository.findAll(pageable);
        return page.map(customer -> new UsuarioDTO(customer));
    }

    public UsuarioDTO buscarPorId(Long id) {
        Optional<Usuario> optional = usuarioRepository.findById(id);
        Usuario turn = optional.orElseThrow(() -> new ResourceNotFoundException("Cliente não encontrado."));
        return new UsuarioDTO(turn);
    }

    public void recuperarSenha(Long id, RecuperarSenha recuperarSenha) throws RestBadRequestException {
        Optional<Usuario> optional = usuarioRepository.findById(id);
        if (optional.isEmpty()) {
            throw new ResourceNotFoundException("Usuário não encontrado");
        }
        Chave chave = tokenUtils.verificarToken(recuperarSenha);
        verificacaoDeTokenParaUsuario(optional, chave);
        optional.get().setSenha(recuperarSenha.getNovaSenha());
        usuarioRepository.save(optional.get());
    }

    private Chave verificacaoDeTokenParaUsuario(Optional<Usuario> usuario, Chave chave) throws RestBadRequestException {
        List<Chave> chaves = usuario.get().getToken().getChaves();
        for (Chave chaveUsuario : chaves) {
            if (chaveUsuario.equals(chave)) {
                tokenUtils.invalidarChave(chaveUsuario);
                return chaveUsuario;
            }
        }
        throw new RestBadRequestException("Chave inválida");
    }

    private void copyToEntity(Usuario usuario, UsuarioDTO dto) {
        usuario.setNome(dto.getNome());
        usuario.setCpf(dto.getCpf());
        usuario.setSenha(dto.getSenha());
        usuario.setDataNascimento(dto.getDataNascimento());
        usuario.setEmail(dto.getEmail());
        usuario.setAdministrador(dto.getAdministrador());
    }
}

package com.estacio.extensao.token_randomico.service;

import com.estacio.extensao.token_randomico.exceptions.RestBadRequestException;
import com.estacio.extensao.token_randomico.models.Chave;
import com.estacio.extensao.token_randomico.models.Login;
import com.estacio.extensao.token_randomico.models.Token;
import com.estacio.extensao.token_randomico.models.Usuario;
import com.estacio.extensao.token_randomico.repository.TokenRepository;
import com.estacio.extensao.token_randomico.repository.UsuarioRepository;
import com.estacio.extensao.token_randomico.utils.TokenUtils;
import jakarta.persistence.EntityNotFoundException;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TokenService {

    @Autowired
    TokenUtils tokenUtils;
    @Autowired
    TokenRepository tokenRepository;
    @Autowired
    UsuarioRepository usuarioRepository;


    @SneakyThrows
    public List<Chave> resetarChaves(Long id, Login login) {
        Optional<Usuario> administrador = usuarioRepository.findByCpf(login.getCpf());
        if (administrador.isEmpty()) {
            throw new RestBadRequestException("Usuário " + login.getCpf() + " não encontrado.");
        }
        if (!administrador.get().getAdministrador()) {
            throw new RestBadRequestException("Usuário " + login.getCpf() + " não tem autorização para resetar o token.");
        }
        Usuario usuario = usuarioRepository.getReferenceById(id);
        if (usuario == null) {
            throw new EntityNotFoundException("Usuário com ID " + id + " não encontrado.");
        }
        Token tokenAtual = usuario.getToken();
        Token novoToken = tokenUtils.substituirChaves(tokenAtual);
        return novoToken.getChaves();
    }

}


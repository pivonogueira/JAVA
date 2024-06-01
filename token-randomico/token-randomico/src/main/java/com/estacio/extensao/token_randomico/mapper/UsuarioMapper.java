package com.estacio.extensao.token_randomico.mapper;

import com.estacio.extensao.token_randomico.dto.UsuarioDTO;
import com.estacio.extensao.token_randomico.models.Usuario;
import org.springframework.stereotype.Component;

@Component
public class UsuarioMapper {

    public Usuario fromDto(UsuarioDTO dto) {
        Usuario entity = new Usuario();
        entity.setNome(dto.getNome());
        entity.setCpf(dto.getCpf());
        entity.setSenha(dto.getSenha());
        entity.setDataNascimento(dto.getDataNascimento());
        entity.setEmail(dto.getEmail());
        entity.setAdministrador(dto.getAdministrador());
        return entity;
    }
}

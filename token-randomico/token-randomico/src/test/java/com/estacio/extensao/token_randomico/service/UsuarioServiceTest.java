package com.estacio.extensao.token_randomico.service;

import com.estacio.extensao.token_randomico.dto.UsuarioDTO;
import com.estacio.extensao.token_randomico.models.Token;
import com.estacio.extensao.token_randomico.models.Usuario;
import com.estacio.extensao.token_randomico.mapper.UsuarioMapper;
import com.estacio.extensao.token_randomico.repository.UsuarioRepository;
import com.estacio.extensao.token_randomico.utils.TokenUtils;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@SpringBootTest
@SpringJUnitConfig
public class UsuarioServiceTest {

    @Mock
    private UsuarioMapper usuarioMapper;
    @Mock
    private TokenUtils tokenUtils;
    @Mock
    private UsuarioRepository usuarioRepository;
    @InjectMocks
    private UsuarioService usuarioService;

    @Test
    public void testCriarUsuario() {
        UsuarioDTO usuarioDTO = criarUsuarioDTO();

        Token token = new Token();
        when(tokenUtils.criarTokenEChaves()).thenReturn(token);

        Usuario usuario = new Usuario();
        when(usuarioMapper.fromDto(usuarioDTO)).thenReturn(usuario);

        when(usuarioRepository.save(usuario)).thenReturn(usuario);

        Usuario result = usuarioService.criarUsuario(usuarioDTO);

        verify(usuarioMapper, times(1)).fromDto(usuarioDTO);
        verify(tokenUtils, times(1)).criarTokenEChaves();
        verify(usuarioRepository, times(1)).save(usuario);

        assertEquals(usuario, result);
    }

    private UsuarioDTO criarUsuarioDTO() {
        UsuarioDTO dto = new UsuarioDTO();
        dto.setNome("Teste");
        dto.setEmail("teste@example.com");
        dto.setDataNascimento(new Date(1999 - 11 - 20));
        dto.setSenha("senha");
        dto.setCpf("123456789");
        dto.setAdministrador(true);
        return dto;
    }
}

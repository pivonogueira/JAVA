package com.estacio.extensao.token_randomico.controller;

import com.estacio.extensao.token_randomico.dto.UsuarioDTO;
import com.estacio.extensao.token_randomico.exceptions.RestBadRequestException;
import com.estacio.extensao.token_randomico.models.Chave;
import com.estacio.extensao.token_randomico.models.RecuperarSenha;
import com.estacio.extensao.token_randomico.models.Usuario;
import com.estacio.extensao.token_randomico.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {

    @Autowired
    UsuarioService service;

    @PostMapping
    public ResponseEntity<List<Chave>> criarusuario(@RequestBody UsuarioDTO usuarioDTO) {
        Usuario usuario = service.criarUsuario(usuarioDTO);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(usuario.getId()).toUri();
        return ResponseEntity.created(uri).body(usuario.getToken().getChaves());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarUsuario(@PathVariable Long id) {
        service.excluirUsuario(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<UsuarioDTO> atualizarUsuario(@PathVariable Long id, @RequestBody UsuarioDTO dto) {
        UsuarioDTO usuarioAtualizado = service.atualizarDadosUsuario(id, dto);
        return ResponseEntity.ok().body(usuarioAtualizado);
    }

    @GetMapping
    public ResponseEntity<Page<UsuarioDTO>> buscarTodos(Pageable pageable) {
        Page<UsuarioDTO> page = service.findAllPaged(pageable);
        return ResponseEntity.ok().body(page);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<UsuarioDTO> buscarPorId(@PathVariable Long id) {
        UsuarioDTO dto = service.buscarPorId(id);
        return ResponseEntity.ok().body(dto);
    }

    @PostMapping("/{id}/recuperar")
    public ResponseEntity<Void> esqueciMinhaSenha(@PathVariable Long id, @RequestBody RecuperarSenha recuperarSenha) throws RestBadRequestException {
        service.recuperarSenha(id, recuperarSenha);
        return ResponseEntity.ok().build();
    }

}

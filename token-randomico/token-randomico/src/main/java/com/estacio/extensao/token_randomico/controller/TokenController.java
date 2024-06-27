package com.estacio.extensao.token_randomico.controller;

import com.estacio.extensao.token_randomico.models.Chave;
import com.estacio.extensao.token_randomico.models.Login;
import com.estacio.extensao.token_randomico.service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/token")
public class TokenController {

    @Autowired
    TokenService service;

    @PutMapping("/{id}")
    public ResponseEntity<List<Chave>> resetarChaves(@PathVariable Long id, @RequestBody Login login){
        List<Chave> novasChaves =  service.resetarChaves(id, login);
        return ResponseEntity.ok().body(novasChaves);
    }
}

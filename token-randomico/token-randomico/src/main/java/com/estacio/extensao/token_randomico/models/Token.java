package com.estacio.extensao.token_randomico.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@Table(name = "tr_token")
public class Token {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "token", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Chave> chaves;

    public Token() {
        this.chaves = new ArrayList<>();
    }

    public void gerarChaves() {
        for (int i = 0; i < 5; i++) {
            Chave chave = new Chave();
            chave.gerarChave();
            chave.setToken(this);
            this.chaves.add(chave);
        }
    }
}
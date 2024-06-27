package com.estacio.extensao.token_randomico.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Random;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tr_chaves")
public class Chave {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private Long id;

    private Integer chaveRandomica;

    @JsonIgnore
    private Boolean usado;

    @ManyToOne
    @JoinColumn(name = "token_id", referencedColumnName = "id")
    @JsonIgnore
    private Token token;

    public void gerarChave() {
        this.chaveRandomica = 100000 + new Random().nextInt(899999);
        this.usado = false;
    }
}
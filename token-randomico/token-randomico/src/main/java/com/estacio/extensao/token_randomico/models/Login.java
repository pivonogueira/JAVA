package com.estacio.extensao.token_randomico.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
public class Login {

    private String cpf;
    private String senha;
}

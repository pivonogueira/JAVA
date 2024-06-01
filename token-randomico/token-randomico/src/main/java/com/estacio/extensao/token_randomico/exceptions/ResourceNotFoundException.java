package com.estacio.extensao.token_randomico.exceptions;

public class ResourceNotFoundException extends  RuntimeException {

    public ResourceNotFoundException(String msg) {
        super(msg);
    }
}
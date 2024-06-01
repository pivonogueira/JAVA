package com.estacio.extensao.token_randomico.exceptions;

import org.apache.coyote.BadRequestException;

public class RestBadRequestException extends BadRequestException {

    public RestBadRequestException(String msg) {
        super(msg);
    }
}

package com.jhegner.desafio.frontend.dto;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class EnvioTweetDTO {

    private final String mensagem;

    public EnvioTweetDTO(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return mensagem;
    }

}

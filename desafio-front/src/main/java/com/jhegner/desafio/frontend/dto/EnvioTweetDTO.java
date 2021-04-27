package com.jhegner.desafio.frontend.dto;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class EnvioTweetDTO {

    private final String mensagem;
    private final LocalDateTime dataHora;

    public EnvioTweetDTO(String mensagem) {
        this.mensagem = mensagem;
        this.dataHora = LocalDateTime.now();
    }

    public String getMensagem() {
        return mensagem;
    }

    public String getDataHora() {
        return dataHora.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm"));
    }

    @Override
    public String toString() {
        return "EnvioTweetDTO{" +
                "mensagem='" + mensagem + '\'' +
                ", dataHora=" + getDataHora() +
                '}';
    }
}

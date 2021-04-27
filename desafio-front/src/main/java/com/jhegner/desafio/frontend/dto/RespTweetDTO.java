package com.jhegner.desafio.frontend.dto;

public class RespTweetDTO {

    private final String mensagem;
    private final String dataHora;

    public RespTweetDTO(String mensagem, String dataHora) {
        this.mensagem = mensagem;
        this.dataHora = dataHora;
    }

    public String getMensagem() {
        return mensagem;
    }

    public String getDataHora() {
        return dataHora;
    }
}

package com.jhegner.desafio.backend.dto;

public class RespTweetDTO {

    private String mensagem;
    private String dataHora;

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

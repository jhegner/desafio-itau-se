package com.jhegner.desafio.frontend.dto;

public class RespSmsDTO {

    private final String telefone;
    private final String mensagem;
    private final String dataHora;

    public RespSmsDTO(String telefone, String mensagem, String dataHora) {
        this.mensagem = mensagem;
        this.dataHora = dataHora;
        this.telefone = telefone;
    }

    public String getMensagem() {
        return mensagem;
    }

    public String getDataHora() {
        return dataHora;
    }
}

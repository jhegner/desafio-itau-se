package com.jhegner.desafio.backend.dto;

public class RespSmsDTO {

    private String numero;
    private String mensagem;
    private String dataHora;

    public RespSmsDTO(String numero, String mensagem, String dataHora) {
        this.numero = numero;
        this.mensagem = mensagem;
        this.dataHora = dataHora;
    }

    public String getNumero() {
        return numero;
    }

    public String getMensagem() {
        return mensagem;
    }

    public String getDataHora() {
        return dataHora;
    }
}

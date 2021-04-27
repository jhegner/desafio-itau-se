package com.jhegner.desafio.frontend.model;

import java.time.LocalDateTime;

public class SmsModel {

    private String numeroTelefone;
    private String mensagem;
    private LocalDateTime time;

    public SmsModel(String numeroTelefone, String mensagem) {
        this.numeroTelefone = numeroTelefone;
        this.mensagem = mensagem;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}

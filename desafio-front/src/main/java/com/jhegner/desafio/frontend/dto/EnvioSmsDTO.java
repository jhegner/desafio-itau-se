package com.jhegner.desafio.frontend.dto;

import java.time.format.DateTimeFormatter;

public class EnvioSmsDTO {

    private final String telefone;
    private final String mensagem;

    public EnvioSmsDTO(String telefone, String mensagem) {
        this.telefone = telefone;
        this.mensagem = mensagem;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getMensagem() {
        return mensagem;
    }


}

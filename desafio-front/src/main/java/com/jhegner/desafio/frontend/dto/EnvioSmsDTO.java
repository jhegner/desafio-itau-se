package com.jhegner.desafio.frontend.dto;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class EnvioSmsDTO {

    private final String telefone;
    private final String mensagem;
    private final LocalDateTime dataHora;

    public EnvioSmsDTO(String telefone, String mensagem) {
        this.telefone = telefone;
        this.mensagem = mensagem;
        this.dataHora = LocalDateTime.now();
    }

    public String getTelefone() {
        return telefone;
    }

    public String getMensagem() {
        return mensagem;
    }

    public String getDataHora(){
        return dataHora.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm"));
    }

    @Override
    public String toString() {
        return "EnvioSmsDTO{" +
                "telefone='" + telefone + '\'' +
                ", mensagem='" + mensagem + '\'' +
                ", dataHora=" + getDataHora() +
                '}';
    }
}

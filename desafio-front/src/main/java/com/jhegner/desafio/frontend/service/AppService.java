package com.jhegner.desafio.frontend.service;

import com.jhegner.desafio.frontend.dto.EnvioSmsDTO;
import com.jhegner.desafio.frontend.dto.EnvioTweetDTO;
import com.jhegner.desafio.frontend.dto.RespSmsDTO;
import com.jhegner.desafio.frontend.dto.RespTweetDTO;

import java.util.Arrays;
import java.util.List;

@org.springframework.stereotype.Service
public class AppService {

    public void tweetar(EnvioTweetDTO tweet) {
        System.out.println("Novo tweet: ->" + tweet);
    }

    public void enviarSms(EnvioSmsDTO sms) {
        System.out.println("Novo SMS: ->" + sms);
    }

    public List<RespSmsDTO> buscaTodosSms() {
        return null;
    }

    public List<RespTweetDTO> buscaTodosTweet() {
        return null;
    }

}

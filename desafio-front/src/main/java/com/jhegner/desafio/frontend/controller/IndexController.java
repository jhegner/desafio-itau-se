package com.jhegner.desafio.frontend.controller;

import com.jhegner.desafio.frontend.dto.EnvioSmsDTO;
import com.jhegner.desafio.frontend.dto.EnvioTweetDTO;
import com.jhegner.desafio.frontend.model.SmsModel;
import com.jhegner.desafio.frontend.model.TweetModel;
import com.jhegner.desafio.frontend.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller
public class IndexController {

    private AppService svc;

    @Autowired
    public IndexController(AppService svc) {
        this.svc = svc;
    }

    @RequestMapping(value = "/login")
    public String login() {
        return "redirect:dash";
    }

    private void clean(Model model) {
        model.addAllAttributes(Map.of("formTweet", new TweetModel(""),
                "formSMS", new SmsModel("", "")));
    }

    @GetMapping("/dash")
    public String goViewDash(Model model) {
//        clean(model);
        return "/dash/dash";
    }

    @GetMapping("/dash/tweet")
    public String goViewDashWithTweet(Model model) {
        model.addAttribute("formTweet", new TweetModel(""));
        return "/dash/dash";
    }

    @GetMapping("/dash/sms")
    public String goViewDashWithSMS(Model model) {
        model.addAttribute("formSMS", new SmsModel("", ""));
        return "/dash/dash";
    }

    @RequestMapping(value = "/dash/sendTweet", method = RequestMethod.POST)
    public String saveTweet(@ModelAttribute("formTweet") TweetModel form, Model model) {
        svc.tweetar(new EnvioTweetDTO(form.getTexto()));
//        clean(model);
        return "/dash/dash";
    }

    @RequestMapping(value = "/dash/sendSMS", method = RequestMethod.POST)
    public String saveSms(@ModelAttribute("formSMS") SmsModel form, Model model) {
        svc.enviarSms(new EnvioSmsDTO(form.getNumeroTelefone(), form.getMensagem()));
//        clean(model);
        return "/dash/dash";
    }

}

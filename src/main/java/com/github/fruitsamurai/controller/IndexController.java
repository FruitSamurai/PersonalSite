package com.github.fruitsamurai.controller;

import com.github.fruitsamurai.entity.Mail;
import com.github.fruitsamurai.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * Created by fanshion on 2017/5/9.
 */
@Controller
public class IndexController {

    @Autowired
    private MailService mailService;

    @GetMapping(value = "/")
    public String index(ModelMap model){
        return "index";
    }

    @GetMapping(value = "/contactme")
    public String contactMe(ModelMap model){
        return "contact/contact";
    }

}

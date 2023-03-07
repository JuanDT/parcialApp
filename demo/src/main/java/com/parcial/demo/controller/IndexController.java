package com.parcial.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class IndexController {
    @GetMapping({ "/", "", "/index" })
    public String index(Model model) {
        model.addAttribute("titulo", "Bienvenido");
        return "index";
    }

    // @RequestMapping("/form")
    // public String contactenos(Model model) {
    //     model.addAttribute("mensaje", "Formulario");
    //     return "formulario";
    // }
}

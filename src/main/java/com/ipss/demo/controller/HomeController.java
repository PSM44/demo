package com.ipss.demo.controller; // Asegúrate de que el paquete coincida con el de tu aplicación principal

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        // Retorna la vista "index.html"
        return "index";
    }
}
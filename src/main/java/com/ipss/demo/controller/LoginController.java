package com.ipss.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    // Página principal de selección de rol
    @GetMapping("/login")
    public String showLoginPage() {
        return "login"; // login.html
    }

    // Redirige directamente al dashboard del estudiante
    // Redirige directamente al dashboard del estudiante
@GetMapping("/login/estudiante")
public String redirectEstudiante() {
    return "redirect:/dashboard-estudiante";
}

// Redirige directamente al dashboard del profesor
@GetMapping("/login/profesor")
public String redirectProfesor() {
    return "redirect:/dashboard-profesor";
}

}



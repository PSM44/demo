package com.ipss.demo.controller;

import com.ipss.demo.dto.ProfesorPracticaDTO;
import com.ipss.demo.dto.AlumnoPracticaDTO;
import com.ipss.demo.model.Practica;
import com.ipss.demo.service.PracticaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class DashboardController {

    @Autowired
    private PracticaService practicaService;

    // ---------- DASHBOARD ESTUDIANTE ----------
    @GetMapping("/dashboard-estudiante")
    public String dashboardEstudiante(Model model) {
        model.addAttribute("practicas", practicaService.findAll());
        model.addAttribute("practica", new Practica());

        // Para el estudiante: SELECT de PROFESORES (con todos los datos)
        List<ProfesorPracticaDTO> profesores = practicaService.listarProfesoresConDatosDesdePractica();
        model.addAttribute("profesores", profesores);

        // (Opcional) Si quisieras además mostrar select de alumnos aquí, lo puedes añadir:
        // List<AlumnoPracticaDTO> alumnos = practicaService.listarAlumnosConDatosDesdePractica();
        // model.addAttribute("alumnos", alumnos);

        return "dashboard-estudiante";
    }

    @PostMapping("/dashboard-estudiante/crear-practica")
    public String crearPracticaEstudiante(
            @Valid @ModelAttribute("practica") Practica practica,
            BindingResult result,
            Model model) {

        if (result.hasErrors()) {
            model.addAttribute("practicas", practicaService.findAll());
            model.addAttribute("profesores", practicaService.listarProfesoresConDatosDesdePractica());
            return "dashboard-estudiante";
        }

        practicaService.save(practica);
        return "redirect:/dashboard-estudiante";
    }

    // ---------- DASHBOARD PROFESOR ----------
    @GetMapping("/dashboard-profesor")
    public String dashboardProfesor(Model model) {
        model.addAttribute("practicas", practicaService.findAll());
        model.addAttribute("practica", new Practica());

        // Para el profesor: SELECT de ALUMNOS (como ya lo tenías)
        List<AlumnoPracticaDTO> alumnos = practicaService.listarAlumnosConDatosDesdePractica();
        model.addAttribute("alumnos", alumnos);

        return "dashboard-profesor";
    }

    @PostMapping("/dashboard-profesor/crear-practica")
    public String crearPracticaProfesor(
            @Valid @ModelAttribute("practica") Practica practica,
            BindingResult result,
            Model model) {

        if (result.hasErrors()) {
            model.addAttribute("practicas", practicaService.findAll());
            model.addAttribute("alumnos", practicaService.listarAlumnosConDatosDesdePractica());
            return "dashboard-profesor";
        }

        practicaService.save(practica);
        return "redirect:/dashboard-profesor";
    }
}


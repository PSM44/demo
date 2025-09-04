package com.ipss.demo.controller;

import com.ipss.demo.model.Practica;
import com.ipss.demo.service.PracticaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/practicas")
public class PracticaController {

    @Autowired
    private PracticaService practicaService;

    // Provee un objeto "practica" vacío siempre al modelo
    @ModelAttribute("practica")
    public Practica defaultPractica() {
        return new Practica();
    }

    // Listar todas las prácticas para el dashboard del estudiante
    @GetMapping("/estudiante/dashboard")
    public String listarPracticasEstudiante(Model model) {
        model.addAttribute("practicas", practicaService.findAll());
        return "dashboard-estudiante";
    }

    // Ver una práctica específica
    @GetMapping("/ver/{id}")
    public String verPractica(@PathVariable Long id,
                              @RequestParam(name = "rol", required = false, defaultValue = "estudiante") String rol,
                              Model model) {
        Practica practica = practicaService.findById(id);
        model.addAttribute("practica", practica);
        model.addAttribute("rol", rol);
        return "practica-ver";
    }

    // Mostrar formulario para editar práctica
    // Mostrar formulario para editar práctica
@GetMapping("/editar/{id}")
public String editarPractica(@PathVariable Long id,
                             @RequestParam(name = "rol", required = false, defaultValue = "estudiante") String rol,
                             Model model) {
    Practica practica = practicaService.findById(id);
    model.addAttribute("practica", practica);
    model.addAttribute("rol", rol); // necesario para que sepa si vuelve al dashboard profesor o estudiante
    return "practica-form";
}


    // Guardar nueva práctica o actualizar existente
    @PostMapping({"/guardar", "/actualizar"})
    public String guardarOActualizarPractica(@ModelAttribute Practica practica,
                                             @RequestParam(name = "rol", required = false, defaultValue = "estudiante") String rol) {
        practicaService.save(practica);

        if ("profesor".equals(rol)) {
            return "redirect:/dashboard-profesor";
        } else {
            return "redirect:/practicas/estudiante/dashboard";
        }
    }

    // Eliminar práctica
    @GetMapping("/eliminar/{id}")
    public String eliminarPractica(@PathVariable Long id,
                                   @RequestParam(name = "rol", required = false, defaultValue = "estudiante") String rol) {
        practicaService.deleteById(id);

        if ("profesor".equals(rol)) {
            return "redirect:/dashboard-profesor";
        } else {
            return "redirect:/practicas/estudiante/dashboard";
        }
    }
}



package com.ipss.demo.service;

import com.ipss.demo.model.ProfesorSupervisor;
import com.ipss.demo.repository.ProfesorRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.List;

@Service
public class ProfesorService {

    private final ProfesorRepository profesorRepository;

    public ProfesorService(ProfesorRepository profesorRepository) {
        this.profesorRepository = profesorRepository;
    }

    // Buscar profesor por email
    public ProfesorSupervisor buscarPorEmail(String email) {
        Optional<ProfesorSupervisor> encontrado = profesorRepository.findByEmail(email);
        return encontrado.orElse(null);
    }

    // Guardar o actualizar profesor
    public ProfesorSupervisor guardar(ProfesorSupervisor profesor) {
        return profesorRepository.save(profesor);
    }

    // Listar todos los profesores
    public List<ProfesorSupervisor> obtenerTodos() {
        return profesorRepository.findAll();
    }
}

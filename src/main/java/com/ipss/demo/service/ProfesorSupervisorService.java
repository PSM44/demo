package com.ipss.demo.service;

import com.ipss.demo.model.ProfesorSupervisor;
import com.ipss.demo.repository.ProfesorSupervisorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfesorSupervisorService {

    @Autowired
    private ProfesorSupervisorRepository profesorRepository;

    // Guardar profesor
    public ProfesorSupervisor save(ProfesorSupervisor profesor) {
        return profesorRepository.save(profesor);
    }

    // Buscar por email
    public Optional<ProfesorSupervisor> findByEmail(String email) {
        return profesorRepository.findByEmail(email);
    }

    // Listar todos
    public List<ProfesorSupervisor> findAll() {
        return profesorRepository.findAll();
    }
}

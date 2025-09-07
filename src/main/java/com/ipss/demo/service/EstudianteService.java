package com.ipss.demo.service;

import com.ipss.demo.model.Estudiante;
import com.ipss.demo.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudianteService {

    @Autowired
    private EstudianteRepository estudianteRepository;

    public Estudiante findByEmail(String email) {
        return estudianteRepository.findByEmail(email);
    }

    public Estudiante save(Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }
}



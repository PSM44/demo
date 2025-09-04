package com.ipss.demo.service;

import com.ipss.demo.dto.ProfesorPracticaDTO;
import com.ipss.demo.dto.AlumnoPracticaDTO;
import com.ipss.demo.model.Practica;
import com.ipss.demo.repository.PracticaRepository;
import com.ipss.demo.repository.projection.AlumnoResumen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PracticaService {

    @Autowired
    private PracticaRepository practicaRepository;

    // CRUD
    public Practica save(Practica practica) { return practicaRepository.save(practica); }
    public Practica findById(Long id) { return practicaRepository.findById(id).orElse(null); }
    public List<Practica> findAll() { return practicaRepository.findAll(); }
    public void deleteById(Long id) { practicaRepository.deleteById(id); }

    // Búsquedas
    public List<Practica> findByEstudianteEmail(String email) { return practicaRepository.findByEstudianteEmail(email); }
    public List<Practica> findByProfesorEmail(String email) { return practicaRepository.findByProfesorEmail(email); }

    // Select alumnos (simple)
    public List<AlumnoResumen> listarAlumnosDesdePracticas() {
        return practicaRepository.findDistinctAlumnosDesdePractica();
    }

    // Alumnos con todos los datos (última práctica por alumno)
    public List<AlumnoPracticaDTO> listarAlumnosConDatosDesdePractica() {
        List<Practica> todas = practicaRepository.findAll(Sort.by(Sort.Direction.DESC, "id"));
        Map<String, AlumnoPracticaDTO> mapa = new LinkedHashMap<>();

        for (Practica p : todas) {
            if (p.getEstudianteNombre() == null || p.getEstudianteNombre().trim().isEmpty()) continue;

            String key = (Optional.ofNullable(p.getEstudianteNombre()).orElse("").trim().toLowerCase())
                    + "|" + (Optional.ofNullable(p.getEstudianteApellido()).orElse("").trim().toLowerCase())
                    + "|" + (Optional.ofNullable(p.getEstudianteCarrera()).orElse("").trim().toLowerCase());

            if (!mapa.containsKey(key)) {
                mapa.put(key, AlumnoPracticaDTO.from(p));
            }
        }
        return new ArrayList<>(mapa.values());
    }

    // >>> Profesores con todos los datos (última práctica por profesor)
    public List<ProfesorPracticaDTO> listarProfesoresConDatosDesdePractica() {
        List<Practica> todas = practicaRepository.findAll(Sort.by(Sort.Direction.DESC, "id"));
        Map<String, ProfesorPracticaDTO> mapa = new LinkedHashMap<>();

        for (Practica p : todas) {
            if (p.getProfesorNombre() == null || p.getProfesorNombre().trim().isEmpty()) continue;

            String key = (Optional.ofNullable(p.getProfesorNombre()).orElse("").trim().toLowerCase())
                    + "|" + (Optional.ofNullable(p.getProfesorApellido()).orElse("").trim().toLowerCase())
                    + "|" + (Optional.ofNullable(p.getProfesorEmail()).orElse("").trim().toLowerCase());

            if (!mapa.containsKey(key)) {
                mapa.put(key, ProfesorPracticaDTO.from(p));
            }
        }
        return new ArrayList<>(mapa.values());
    }
}


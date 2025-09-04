package com.ipss.demo.repository;

import com.ipss.demo.model.Practica;
import com.ipss.demo.repository.projection.AlumnoResumen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PracticaRepository extends JpaRepository<Practica, Long> {

    // Devuelve todas las prácticas de un estudiante según su email
    List<Practica> findByEstudianteEmail(String email);

    // Devuelve todas las prácticas asignadas a un profesor según su email
    List<Practica> findByProfesorEmail(String email);

    // Lista de alumnos distintos (nombre, apellido, carrera) tomada desde la tabla PRACTICA
    @Query("""
           select distinct 
                  p.estudianteNombre  as nombre, 
                  p.estudianteApellido as apellido, 
                  p.estudianteCarrera as carrera
           from Practica p
           where p.estudianteNombre is not null and p.estudianteNombre <> ''
           """)
    List<AlumnoResumen> findDistinctAlumnosDesdePractica();
}



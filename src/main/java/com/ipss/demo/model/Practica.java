package com.ipss.demo.model;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Entity
public class Practica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Datos del estudiante
    private String estudianteNombre;
    private String estudianteApellido;
    private String estudianteCarrera;
    private String estudianteEmail;

    // Datos del profesor
    private String profesorNombre;
    private String profesorApellido;
    private String profesorTelefono;
    private String profesorEmail;

    // Datos de la empresa
    private String empresaNombre;
    private String empresaDireccion;
    private String empresaTelefono;

    // Datos del jefe directo
    private String jefeNombre;
    private String jefeApellido;
    private String jefeTelefono;
    private String jefeEmail;

    // Detalle de la práctica
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaInicio;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaTermino;

    @Column(length = 1000)
    private String descripcionActividades;

    private String estado;

    // Constructor vacío
    public Practica() {}

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getEstudianteNombre() { return estudianteNombre; }
    public void setEstudianteNombre(String estudianteNombre) { this.estudianteNombre = estudianteNombre; }

    public String getEstudianteApellido() { return estudianteApellido; }
    public void setEstudianteApellido(String estudianteApellido) { this.estudianteApellido = estudianteApellido; }

    public String getEstudianteCarrera() { return estudianteCarrera; }
    public void setEstudianteCarrera(String estudianteCarrera) { this.estudianteCarrera = estudianteCarrera; }

    public String getEstudianteEmail() { return estudianteEmail; }
    public void setEstudianteEmail(String estudianteEmail) { this.estudianteEmail = estudianteEmail; }

    public String getProfesorNombre() { return profesorNombre; }
    public void setProfesorNombre(String profesorNombre) { this.profesorNombre = profesorNombre; }

    public String getProfesorApellido() { return profesorApellido; }
    public void setProfesorApellido(String profesorApellido) { this.profesorApellido = profesorApellido; }

    public String getProfesorTelefono() { return profesorTelefono; }
    public void setProfesorTelefono(String profesorTelefono) { this.profesorTelefono = profesorTelefono; }

    public String getProfesorEmail() { return profesorEmail; }
    public void setProfesorEmail(String profesorEmail) { this.profesorEmail = profesorEmail; }

    public String getEmpresaNombre() { return empresaNombre; }
    public void setEmpresaNombre(String empresaNombre) { this.empresaNombre = empresaNombre; }

    public String getEmpresaDireccion() { return empresaDireccion; }
    public void setEmpresaDireccion(String empresaDireccion) { this.empresaDireccion = empresaDireccion; }

    public String getEmpresaTelefono() { return empresaTelefono; }
    public void setEmpresaTelefono(String empresaTelefono) { this.empresaTelefono = empresaTelefono; }

    public String getJefeNombre() { return jefeNombre; }
    public void setJefeNombre(String jefeNombre) { this.jefeNombre = jefeNombre; }

    public String getJefeApellido() { return jefeApellido; }
    public void setJefeApellido(String jefeApellido) { this.jefeApellido = jefeApellido; }

    public String getJefeTelefono() { return jefeTelefono; }
    public void setJefeTelefono(String jefeTelefono) { this.jefeTelefono = jefeTelefono; }

    public String getJefeEmail() { return jefeEmail; }
    public void setJefeEmail(String jefeEmail) { this.jefeEmail = jefeEmail; }

    public LocalDate getFechaInicio() { return fechaInicio; }
    public void setFechaInicio(LocalDate fechaInicio) { this.fechaInicio = fechaInicio; }

    public LocalDate getFechaTermino() { return fechaTermino; }
    public void setFechaTermino(LocalDate fechaTermino) { this.fechaTermino = fechaTermino; }

    public String getDescripcionActividades() { return descripcionActividades; }
    public void setDescripcionActividades(String descripcionActividades) { this.descripcionActividades = descripcionActividades; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    // Método para Thymeleaf: retorna clase CSS según el estado
    public String getEstadoClass() {
        if (estado == null) return "";
        switch (estado.toLowerCase()) {
            case "pendiente":
                return "bg-yellow-200";
            case "aprobada":
                return "bg-green-200";
            case "rechazada":
                return "bg-red-200";
            default:
                return "";
        }
    }
}











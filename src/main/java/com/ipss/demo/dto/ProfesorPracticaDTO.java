package com.ipss.demo.dto;

import com.ipss.demo.model.Practica;

import java.time.LocalDate;

public class ProfesorPracticaDTO {

    private Long practicaId;

    // Profesor
    private String profesorNombre;
    private String profesorApellido;
    private String profesorTelefono;
    private String profesorEmail;

    // Estudiante
    private String estudianteNombre;
    private String estudianteApellido;
    private String estudianteCarrera;
    private String estudianteEmail;

    // Detalle
    private LocalDate fechaInicio;
    private LocalDate fechaTermino;
    private String descripcionActividades;
    private String estado;

    // Empresa
    private String empresaNombre;
    private String empresaDireccion;
    private String empresaTelefono;

    // Jefe
    private String jefeNombre;
    private String jefeApellido;
    private String jefeTelefono;
    private String jefeEmail;

    public ProfesorPracticaDTO() {}

    public static ProfesorPracticaDTO from(Practica p) {
        ProfesorPracticaDTO dto = new ProfesorPracticaDTO();
        dto.practicaId = p.getId();

        // Profesor
        dto.profesorNombre = p.getProfesorNombre();
        dto.profesorApellido = p.getProfesorApellido();
        dto.profesorTelefono = p.getProfesorTelefono();
        dto.profesorEmail = p.getProfesorEmail();

        // Estudiante
        dto.estudianteNombre = p.getEstudianteNombre();
        dto.estudianteApellido = p.getEstudianteApellido();
        dto.estudianteCarrera = p.getEstudianteCarrera();
        dto.estudianteEmail = p.getEstudianteEmail();

        // Detalle
        dto.fechaInicio = p.getFechaInicio();
        dto.fechaTermino = p.getFechaTermino();
        dto.descripcionActividades = p.getDescripcionActividades();
        dto.estado = p.getEstado();

        // Empresa
        dto.empresaNombre = p.getEmpresaNombre();
        dto.empresaDireccion = p.getEmpresaDireccion();
        dto.empresaTelefono = p.getEmpresaTelefono();

        // Jefe
        dto.jefeNombre = p.getJefeNombre();
        dto.jefeApellido = p.getJefeApellido();
        dto.jefeTelefono = p.getJefeTelefono();
        dto.jefeEmail = p.getJefeEmail();

        return dto;
    }

    // Getters/Setters
    public Long getPracticaId() { return practicaId; }
    public void setPracticaId(Long practicaId) { this.practicaId = practicaId; }

    public String getProfesorNombre() { return profesorNombre; }
    public void setProfesorNombre(String profesorNombre) { this.profesorNombre = profesorNombre; }

    public String getProfesorApellido() { return profesorApellido; }
    public void setProfesorApellido(String profesorApellido) { this.profesorApellido = profesorApellido; }

    public String getProfesorTelefono() { return profesorTelefono; }
    public void setProfesorTelefono(String profesorTelefono) { this.profesorTelefono = profesorTelefono; }

    public String getProfesorEmail() { return profesorEmail; }
    public void setProfesorEmail(String profesorEmail) { this.profesorEmail = profesorEmail; }

    public String getEstudianteNombre() { return estudianteNombre; }
    public void setEstudianteNombre(String estudianteNombre) { this.estudianteNombre = estudianteNombre; }

    public String getEstudianteApellido() { return estudianteApellido; }
    public void setEstudianteApellido(String estudianteApellido) { this.estudianteApellido = estudianteApellido; }

    public String getEstudianteCarrera() { return estudianteCarrera; }
    public void setEstudianteCarrera(String estudianteCarrera) { this.estudianteCarrera = estudianteCarrera; }

    public String getEstudianteEmail() { return estudianteEmail; }
    public void setEstudianteEmail(String estudianteEmail) { this.estudianteEmail = estudianteEmail; }

    public LocalDate getFechaInicio() { return fechaInicio; }
    public void setFechaInicio(LocalDate fechaInicio) { this.fechaInicio = fechaInicio; }

    public LocalDate getFechaTermino() { return fechaTermino; }
    public void setFechaTermino(LocalDate fechaTermino) { this.fechaTermino = fechaTermino; }

    public String getDescripcionActividades() { return descripcionActividades; }
    public void setDescripcionActividades(String descripcionActividades) { this.descripcionActividades = descripcionActividades; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

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
}

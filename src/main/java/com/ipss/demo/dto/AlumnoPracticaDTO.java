package com.ipss.demo.dto;

import com.ipss.demo.model.Practica;

import java.time.LocalDate;

public class AlumnoPracticaDTO {

    private Long practicaId;

    // Estudiante
    private String nombre;
    private String apellido;
    private String carrera;
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

    // Profesor
    private String profesorNombre;
    private String profesorApellido;
    private String profesorTelefono;
    private String profesorEmail;

    public AlumnoPracticaDTO() {}

    public static AlumnoPracticaDTO from(Practica p) {
        AlumnoPracticaDTO dto = new AlumnoPracticaDTO();
        dto.practicaId = p.getId();

        dto.nombre = p.getEstudianteNombre();
        dto.apellido = p.getEstudianteApellido();
        dto.carrera = p.getEstudianteCarrera();
        dto.estudianteEmail = p.getEstudianteEmail();

        dto.fechaInicio = p.getFechaInicio();
        dto.fechaTermino = p.getFechaTermino();
        dto.descripcionActividades = p.getDescripcionActividades();
        dto.estado = p.getEstado();

        dto.empresaNombre = p.getEmpresaNombre();
        dto.empresaDireccion = p.getEmpresaDireccion();
        dto.empresaTelefono = p.getEmpresaTelefono();

        dto.jefeNombre = p.getJefeNombre();
        dto.jefeApellido = p.getJefeApellido();
        dto.jefeTelefono = p.getJefeTelefono();
        dto.jefeEmail = p.getJefeEmail();

        dto.profesorNombre = p.getProfesorNombre();
        dto.profesorApellido = p.getProfesorApellido();
        dto.profesorTelefono = p.getProfesorTelefono();
        dto.profesorEmail = p.getProfesorEmail();

        return dto;
    }

    // Getters y Setters
    public Long getPracticaId() { return practicaId; }
    public void setPracticaId(Long practicaId) { this.practicaId = practicaId; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public String getCarrera() { return carrera; }
    public void setCarrera(String carrera) { this.carrera = carrera; }

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

    public String getProfesorNombre() { return profesorNombre; }
    public void setProfesorNombre(String profesorNombre) { this.profesorNombre = profesorNombre; }

    public String getProfesorApellido() { return profesorApellido; }
    public void setProfesorApellido(String profesorApellido) { this.profesorApellido = profesorApellido; }

    public String getProfesorTelefono() { return profesorTelefono; }
    public void setProfesorTelefono(String profesorTelefono) { this.profesorTelefono = profesorTelefono; }

    public String getProfesorEmail() { return profesorEmail; }
    public void setProfesorEmail(String profesorEmail) { this.profesorEmail = profesorEmail; }
}

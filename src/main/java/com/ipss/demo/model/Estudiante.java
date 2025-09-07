package com.ipss.demo.model;

import jakarta.persistence.*;

@Entity
public class Estudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String email;
    private String password;
    private String carrera;
    private String rut; // ← agregado

    public Estudiante() {}

    public Estudiante(String nombre, String email, String password, String carrera, String rut) {
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.carrera = carrera;
        this.rut = rut; // ← agregado
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getCarrera() { return carrera; }
    public void setCarrera(String carrera) { this.carrera = carrera; }

    public String getRut() { return rut; } // ← agregado
    public void setRut(String rut) { this.rut = rut; } // ← agregado
}


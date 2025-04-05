package com.example.TallerArquitectura2.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Carrera {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @ManyToOne
    @JoinColumn(name = "facultad_id")
    private Facultad facultad;

    @ManyToMany(mappedBy = "carreras")
    private List<Estudiante> estudiantes;

    public Carrera() {
    }

    public Carrera(Long id, String nombre, Facultad facultad, List<Estudiante> estudiantes) {
        this.id = id;
        this.nombre = nombre;
        this.facultad = facultad;
        this.estudiantes = estudiantes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Facultad getFacultad() {
        return facultad;
    }

    public void setFacultad(Facultad facultad) {
        this.facultad = facultad;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    @Override
    public String toString() {
        return "Carrera{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", facultad=" + facultad +
                ", estudiantes=" + estudiantes +
                '}';
    }
}

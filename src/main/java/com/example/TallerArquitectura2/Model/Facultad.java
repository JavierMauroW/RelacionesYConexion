package com.example.TallerArquitectura2.Model;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class Facultad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @OneToMany(mappedBy = "facultad", cascade = CascadeType.ALL)
    private List<Carrera> carreras;

    public Facultad() {
    }

    public Facultad(Long id, String nombre, List<Carrera> carreras) {
        this.id = id;
        this.nombre = nombre;
        this.carreras = carreras;
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

    public List<Carrera> getCarreras() {
        return carreras;
    }

    public void setCarreras(List<Carrera> carreras) {
        this.carreras = carreras;
    }

    @Override
    public String toString() {
        return "Facultad{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", carreras=" + carreras +
                '}';
    }
}
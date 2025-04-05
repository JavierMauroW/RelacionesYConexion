package com.example.TallerArquitectura2.Model;

import jakarta.persistence.*;

import java.time.LocalDate;


@Entity
public class Matricula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate fecha;

    @ManyToOne
    @JoinColumn(name = "estudiante_id")
    private Estudiante estudiante;

    public Matricula() {
    }

    public Matricula(Long id, LocalDate fecha, Estudiante estudiante) {
        this.id = id;
        this.fecha = fecha;
        this.estudiante = estudiante;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    @Override
    public String toString() {
        return "Matricula{" +
                "id=" + id +
                ", fecha=" + fecha +
                ", estudiante=" + estudiante +
                '}';
    }
}



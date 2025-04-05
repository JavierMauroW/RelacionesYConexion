package com.example.TallerArquitectura2.Model;

import jakarta.persistence.*;

import java.util.List;

    @Entity
    public class Estudiante  {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String nombre;

        @ManyToMany
        @JoinTable(
                name = "estudiante_carrera",
                joinColumns = @JoinColumn(name = "estudiante_id"),
                inverseJoinColumns = @JoinColumn(name = "carrera_id")
        )
        private List<Carrera> carreras;

        @OneToMany(mappedBy = "estudiante", cascade = CascadeType.ALL)
        private List<Matricula> matriculas;

        public Estudiante() {
        }

        public Estudiante(Long id, String nombre, List<Carrera> carreras, List<Matricula> matriculas) {
            this.id = id;
            this.nombre = nombre;
            this.carreras = carreras;
            this.matriculas = matriculas;
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

        public List<Matricula> getMatriculas() {
            return matriculas;
        }

        public void setMatriculas(List<Matricula> matriculas) {
            this.matriculas = matriculas;
        }



    }

package com.bauzil.crud.courses.courses_api.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "cursos")
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "nome")
    private String nome;
    
    // Relação um-para-muitos com professores
    @OneToMany(mappedBy = "curso")
    private List<Professor> professores;
    
    // Relação um-para-muitos com estudantes
    @OneToMany(mappedBy = "curso")
    private List<Estudante> estudantes;

    // Getters e Setters
}

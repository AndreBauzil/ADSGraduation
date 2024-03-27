package com.bauzil.courses_api.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

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
    @OneToMany(mappedBy = "cursoId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Professor> professores;

    @OneToMany(mappedBy = "cursoId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Estudante> estudantes;

    // Getters e Setters
}

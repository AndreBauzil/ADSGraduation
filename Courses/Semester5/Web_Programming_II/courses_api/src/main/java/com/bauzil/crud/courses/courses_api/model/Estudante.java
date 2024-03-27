package com.bauzil.crud.courses.courses_api.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "estudantes")
public class Estudante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "nome")
    private String nome;
    
    // Relação muitos-para-um com curso
    @ManyToOne
    @JoinColumn(name = "curso_id")
    private Curso curso;

    // Getters e Setters
}

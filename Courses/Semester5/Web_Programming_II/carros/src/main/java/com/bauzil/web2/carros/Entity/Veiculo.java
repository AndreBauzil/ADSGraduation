package com.bauzil.web2.carros.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Veiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String placa;
    private String cor;
    private String modelo;
    private String marca;
    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private Categoria categoria;
    private String imagem;

}
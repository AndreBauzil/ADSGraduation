package com.bauzil.web2.carros.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.bauzil.web2.carros.Repository.CategoriaRepository;

@Controller
public class CategoriaController {

    @Autowired
    private CategoriaRepository categoriaRepository;

    // Métodos para listar, adicionar, editar e excluir categorias
}
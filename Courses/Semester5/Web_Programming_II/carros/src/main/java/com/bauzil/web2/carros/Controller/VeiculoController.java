package com.bauzil.web2.carros.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.bauzil.web2.carros.Repository.VeiculoRepository;

@Controller
public class VeiculoController {

    @Autowired
    private VeiculoRepository veiculoRepository;

    // Métodos para listar, adicionar, editar e excluir veículos
}
package com.bauzil.web2.carros.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bauzil.web2.carros.Repository.VeiculoRepository;

@Service
public class VeiculoService {

    @Autowired
    private VeiculoRepository veiculoRepository;

    // Métodos para realizar operações de CRUD em veículos
}
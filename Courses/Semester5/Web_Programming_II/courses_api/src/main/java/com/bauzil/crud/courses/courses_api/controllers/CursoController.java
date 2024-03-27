package com.bauzil.crud.courses.courses_api.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bauzil.crud.courses.courses_api.DTOs.CursoDTO;
import com.bauzil.crud.courses.courses_api.services.CursoServices;

import lombok.AllArgsConstructor;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/v1/cursos")
public class CursoController {
    private final CursoServices cursoServices;
    
    // Listar Todos
    @GetMapping
    public ResponseEntity<List<CursoDTO>> findAll() {
        List<CursoDTO> cursoList = cursoServices.findAll();

        return ResponseEntity.ok().body(cursoList);
    }

    // Listar por ID
    @GetMapping(value = "/{id}")
    public ResponseEntity<CursoDTO> findById(@PathVariable Long id) {
        CursoDTO curso = cursoServices.findById(id);
        
        return ResponseEntity.ok().body(curso);
    }
}

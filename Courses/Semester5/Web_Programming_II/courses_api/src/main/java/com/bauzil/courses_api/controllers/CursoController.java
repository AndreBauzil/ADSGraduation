package com.bauzil.courses_api.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bauzil.courses_api.DTOs.CursoDTO;
import com.bauzil.courses_api.services.CursoService;

import lombok.AllArgsConstructor;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@AllArgsConstructor
@RequestMapping(value = "/v1/cursos")
public class CursoController {
    private final CursoService cursoService;
    
    // Listar todos cursos
    @GetMapping
    public ResponseEntity<List<CursoDTO>> findAll() {
        List<CursoDTO> cursoList = cursoService.findAll();

        return ResponseEntity.ok().body(cursoList);
    }

    // Listar curso por ID
    @GetMapping(value = "/{id}")
    public ResponseEntity<CursoDTO> findById(@PathVariable Long id) {
        CursoDTO curso = cursoService.findById(id);
        
        return ResponseEntity.ok().body(curso);
    }

    // Inserir novo curso
    @PostMapping
    public ResponseEntity<CursoDTO> insertCurso(@RequestBody CursoDTO cursoDTO) {
        CursoDTO cursoPersisted = cursoService.insert(cursoDTO);
        
        return ResponseEntity.ok(cursoPersisted);
    }

    // Atualizar curso
    @PutMapping
    public ResponseEntity<CursoDTO> updateCurso(@RequestBody CursoDTO cursoDTO) {
        CursoDTO cursoUpdated = cursoService.update(cursoDTO);

        return ResponseEntity.ok(cursoUpdated);
    }

    // Deletar curso
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<String> delete (@PathVariable Long id) {
        cursoService.delete(id);

        return ResponseEntity.ok("Curso com o id: " + id + ", foi excluído com sucesso.");
    }
}

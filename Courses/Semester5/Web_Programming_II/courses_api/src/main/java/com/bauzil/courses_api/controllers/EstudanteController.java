package com.bauzil.courses_api.controllers;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import com.bauzil.courses_api.DTOs.EstudanteDTO;
import com.bauzil.courses_api.services.EstudanteService;

import lombok.AllArgsConstructor;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/v1/estudantes")
public class EstudanteController {
    private final EstudanteService estudanteService;
    
    // Listar todos os estudantes
    @GetMapping
    public ResponseEntity<List<EstudanteDTO>> findAllEstudantes() {
        List<EstudanteDTO> estudanteList = estudanteService.findAll();

        return ResponseEntity.ok().body(estudanteList);
    }

    // Listar estudante por ID
    @GetMapping(value = "/{id}")
    public ResponseEntity<EstudanteDTO> findEstudanteById(@PathVariable Long id) {
        EstudanteDTO estudante = estudanteService.findById(id);
        
        return ResponseEntity.ok().body(estudante);
    }

    // Inserir novo estudante
    @PostMapping
    public ResponseEntity<EstudanteDTO> insertEstudante(@RequestBody EstudanteDTO estudanteDTO) {
        EstudanteDTO estudantePersisted = estudanteService.insert(estudanteDTO);
        
        return ResponseEntity.ok(estudantePersisted);
    }

    // Atualizar estudante
    @PutMapping
    public ResponseEntity<EstudanteDTO> updateEstudante(@RequestBody EstudanteDTO estudanteDTO) {
        EstudanteDTO estudanteUpdated = estudanteService.update(estudanteDTO);

        return ResponseEntity.ok(estudanteUpdated);
    }

    // Deletar estudante
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deleteEstudante(@PathVariable Long id) {
        estudanteService.delete(id);

        return ResponseEntity.noContent().build();
    }
}

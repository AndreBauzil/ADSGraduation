package com.bauzil.courses_api.controllers;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import com.bauzil.courses_api.DTOs.ProfessorDTO;
import com.bauzil.courses_api.services.ProfessorService;

import lombok.AllArgsConstructor;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/v1/professores")
public class ProfessorController {
    private final ProfessorService professorService;
    
    // Listar todos os professores
    @GetMapping
    public ResponseEntity<List<ProfessorDTO>> findAllProfessores() {
        List<ProfessorDTO> professorList = professorService.findAll();

        return ResponseEntity.ok().body(professorList);
    }

    // Listar professor por ID
    @GetMapping(value = "/{id}")
    public ResponseEntity<ProfessorDTO> findProfessorById(@PathVariable Long id) {
        ProfessorDTO professor = professorService.findById(id);
        
        return ResponseEntity.ok().body(professor);
    }

    // Inserir novo professor
    @PostMapping
    public ResponseEntity<ProfessorDTO> insertProfessor(@RequestBody ProfessorDTO professorDTO) {
        ProfessorDTO professorPersisted = professorService.insert(professorDTO);
        
        return ResponseEntity.ok(professorPersisted);
    }

    // Atualizar professor
    @PutMapping
    public ResponseEntity<ProfessorDTO> updateProfessor(@RequestBody ProfessorDTO professorDTO) {
        ProfessorDTO professorUpdated = professorService.update(professorDTO);

        return ResponseEntity.ok(professorUpdated);
    }

    // Deletar professor
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deleteProfessor(@PathVariable Long id) {
        professorService.delete(id);

        return ResponseEntity.noContent().build();
    }
}

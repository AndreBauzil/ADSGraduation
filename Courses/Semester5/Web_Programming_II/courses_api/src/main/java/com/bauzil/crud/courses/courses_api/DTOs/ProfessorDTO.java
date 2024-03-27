package com.bauzil.crud.courses.courses_api.DTOs;

import lombok.Data;

@Data
public class ProfessorDTO {
    private Long id;
    private String nome;
    private Long cursoId; // Para representar o ID do curso ao qual o professor está vinculado

}

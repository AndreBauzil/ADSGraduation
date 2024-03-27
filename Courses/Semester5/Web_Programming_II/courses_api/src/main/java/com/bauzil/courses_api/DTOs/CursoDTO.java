package com.bauzil.courses_api.DTOs;

import lombok.Data;

import java.util.List;

@Data
public class CursoDTO {
    private Long id;
    private String nome;
    private List<Long> professoresIds;
    private List<Long> estudantesIds;
}

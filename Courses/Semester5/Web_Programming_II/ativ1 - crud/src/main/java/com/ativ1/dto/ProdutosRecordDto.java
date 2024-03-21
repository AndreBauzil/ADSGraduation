package com.ativ1.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ProdutosRecordDto (@NotBlank String nome, @NotNull boolean status, @NotBlank String descricao) {
    
}

package com.ativ1.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ativ1.dto.ProdutosRecordDto;
import com.ativ1.model.ProdutosModel;
import com.ativ1.repositories.ProdutosRepository;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class ProdutosController {
    @Autowired
    ProdutosRepository repositorio;

    @PostMapping("/produtos")
    public ResponseEntity<ProdutosModel> 
        salvarProduto(
            @Valid 
            @RequestBody
            ProdutosRecordDto produtosDTO
        ) {
        var produtosModel = new ProdutosModel();
        BeanUtils.copyProperties(produtosDTO, produtosModel);
        
        return ResponseEntity.status(HttpStatus.CREATED).body(repositorio.save(produtosModel));
    }

    @GetMapping("/produtos")
    public ResponseEntity<List<ProdutosModel>> listarProdutos() {
        return ResponseEntity.status(HttpStatus.OK).body(repositorio.findAll());
    }
    
    @GetMapping("/produtos/{id}")
    public ResponseEntity<Object> listarUmProduto(@PathVariable(value="id") int id) {
        Optional<ProdutosModel> produto = repositorio.findById(id);

        if (produto.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Produto não encontrado");
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(produto.get());
    }
    
}

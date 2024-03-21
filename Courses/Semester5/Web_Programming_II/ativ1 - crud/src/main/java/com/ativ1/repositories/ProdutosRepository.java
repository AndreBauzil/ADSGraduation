package com.ativ1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ativ1.model.ProdutosModel;

@Repository
public interface ProdutosRepository 
    extends JpaRepository<ProdutosModel, Integer> {
    
}

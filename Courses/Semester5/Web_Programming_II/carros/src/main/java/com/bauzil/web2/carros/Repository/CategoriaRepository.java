package com.bauzil.web2.carros.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bauzil.web2.carros.Entity.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {}

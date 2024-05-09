package com.bauzil.web2.carros.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bauzil.web2.carros.Entity.Veiculo;

public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {}
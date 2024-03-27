package com.bauzil.crud.courses.courses_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bauzil.crud.courses.courses_api.model.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {}

package com.bauzil.courses_api.repositories;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bauzil.courses_api.model.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {
    @Query("SELECT DISTINCT c FROM Curso c LEFT JOIN FETCH c.professores LEFT JOIN FETCH c.estudantes")
    Set<Curso> findAllWithProfessoresAndEstudantes();
}

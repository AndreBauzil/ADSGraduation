package com.bauzil.courses_api.services;

import java.util.List;
import java.util.Set;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.Conditions;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import com.bauzil.courses_api.DTOs.CursoDTO;
import com.bauzil.courses_api.model.Curso;
import com.bauzil.courses_api.repositories.CursoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CursoService {

    private final CursoRepository cursoRepository;
    private final ModelMapper modelMapper;

    // Listar todos cursos
    public List<CursoDTO> findAll() {
        Set<Curso> cursoSet = cursoRepository.findAllWithProfessoresAndEstudantes();

        List<CursoDTO> cursoDTOList = cursoSet.stream()
            .map(curso -> modelMapper.map(curso, CursoDTO.class))
            .collect(Collectors.toList());

        return cursoDTOList;
    }

    // Listar curso por ID
    public CursoDTO findById(Long id) {
        Optional<Curso> cursoOptional = cursoRepository.findById(id);
        Curso curso = cursoOptional.orElse(null);

        return modelMapper.map(curso, CursoDTO.class);
    }

    // Inserir novo curso
    public CursoDTO insert(CursoDTO cursoDTO) {
        Curso curso = modelMapper.map(cursoDTO, Curso.class);
        Curso cursoPersisted = cursoRepository.save(curso);
        
        return modelMapper.map(cursoPersisted, CursoDTO.class);
    }

    // Atualizar curso
    public CursoDTO update(CursoDTO cursoDTO) {
        CursoDTO cursoPersisted = this.findById(cursoDTO.getId());
        modelMapper.getConfiguration().setPropertyCondition(Conditions.isNotNull());
        modelMapper.map(cursoDTO, cursoPersisted);
        CursoDTO cursoUpdated = this.insert(cursoPersisted);

        return cursoUpdated;
    }

    // Deletar curso
    public void delete(Long id) {
        cursoRepository.deleteById(id);
    }
}

package com.bauzil.crud.courses.courses_api.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.bauzil.crud.courses.courses_api.DTOs.CursoDTO;
import com.bauzil.crud.courses.courses_api.model.Curso;
import com.bauzil.crud.courses.courses_api.repositories.CursoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CursoServices {

    private final CursoRepository cursoRepository;
    private final ModelMapper modelMapper;

    // Listar todos
    public List<CursoDTO> findAll() {
        List<Curso> cursoList = cursoRepository.findAll();

        List<CursoDTO> cursoDTOList = cursoList.stream()
            .map(curso -> modelMapper.map(curso, CursoDTO.class))
            .collect(Collectors.toList());

        return cursoDTOList;
    }

    // Listar por ID
    public CursoDTO findById(Long id) {
        Optional<Curso> curso = cursoRepository.findById(id);

        return modelMapper.map(curso, CursoDTO.class);
    }
}

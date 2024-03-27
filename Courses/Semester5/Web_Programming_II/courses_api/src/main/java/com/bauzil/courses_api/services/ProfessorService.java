package com.bauzil.courses_api.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.Conditions;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import com.bauzil.courses_api.DTOs.ProfessorDTO;
import com.bauzil.courses_api.model.Professor;
import com.bauzil.courses_api.repositories.ProfessorRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProfessorService {

    private final ProfessorRepository professorRepository;
    private final ModelMapper modelMapper;

    // Listar todos os professores
    public List<ProfessorDTO> findAll() {
        List<Professor> professorList = professorRepository.findAll();

        List<ProfessorDTO> professorDTOList = professorList.stream()
            .map(professor -> modelMapper.map(professor, ProfessorDTO.class))
            .collect(Collectors.toList());

        return professorDTOList;
    }

    // Listar professor por ID
    public ProfessorDTO findById(Long id) {
        Optional<Professor> professor = professorRepository.findById(id);

        return modelMapper.map(professor, ProfessorDTO.class);
    }

    // Inserir novo professor
    public ProfessorDTO insert(ProfessorDTO professorDTO) {
        Professor professor = modelMapper.map(professorDTO, Professor.class);
        Professor professorPersisted = professorRepository.save(professor);
        
        return modelMapper.map(professorPersisted, ProfessorDTO.class);
    }

    // Atualizar professor
    public ProfessorDTO update(ProfessorDTO professorDTO) {
        ProfessorDTO professorPersisted = this.findById(professorDTO.getId());
        modelMapper.getConfiguration().setPropertyCondition(Conditions.isNotNull());
        modelMapper.map(professorDTO, professorPersisted);
        ProfessorDTO professorUpdated = this.insert(professorPersisted);

        return professorUpdated;
    }

    // Deletar professor
    public void delete(Long id) {
        professorRepository.deleteById(id);
    }
}

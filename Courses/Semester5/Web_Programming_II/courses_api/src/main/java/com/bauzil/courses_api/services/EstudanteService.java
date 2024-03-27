package com.bauzil.courses_api.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.Conditions;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import com.bauzil.courses_api.DTOs.EstudanteDTO;
import com.bauzil.courses_api.model.Estudante;
import com.bauzil.courses_api.repositories.EstudanteRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EstudanteService {

    private final EstudanteRepository estudanteRepository;
    private final ModelMapper modelMapper;

    // Listar todos os estudantes
    public List<EstudanteDTO> findAll() {
        List<Estudante> estudanteList = estudanteRepository.findAll();

        List<EstudanteDTO> estudanteDTOList = estudanteList.stream()
            .map(estudante -> modelMapper.map(estudante, EstudanteDTO.class))
            .collect(Collectors.toList());

        return estudanteDTOList;
    }

    // Listar estudante por ID
    public EstudanteDTO findById(Long id) {
        Optional<Estudante> estudante = estudanteRepository.findById(id);

        return modelMapper.map(estudante, EstudanteDTO.class);
    }

    // Inserir novo estudante
    public EstudanteDTO insert(EstudanteDTO estudanteDTO) {
        Estudante estudante = modelMapper.map(estudanteDTO, Estudante.class);
        Estudante estudantePersisted = estudanteRepository.save(estudante);
        
        return modelMapper.map(estudantePersisted, EstudanteDTO.class);
    }

    // Atualizar estudante
    public EstudanteDTO update(EstudanteDTO estudanteDTO) {
        EstudanteDTO estudantePersisted = this.findById(estudanteDTO.getId());
        modelMapper.getConfiguration().setPropertyCondition(Conditions.isNotNull());
        modelMapper.map(estudanteDTO, estudantePersisted);
        EstudanteDTO estudanteUpdated = this.insert(estudantePersisted);

        return estudanteUpdated;
    }

    // Deletar estudante
    public void delete(Long id) {
        estudanteRepository.deleteById(id);
    }
}

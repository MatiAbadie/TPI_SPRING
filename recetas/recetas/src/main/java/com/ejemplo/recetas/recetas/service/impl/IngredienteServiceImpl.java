package com.ejemplo.recetas.recetas.service.impl;

import com.ejemplo.recetas.dto.IngredienteDTO;
import com.ejemplo.recetas.mapper.IngredienteMapper;
import com.ejemplo.recetas.model.Ingrediente;
import com.ejemplo.recetas.repository.IngredienteRepository;
import com.ejemplo.recetas.service.IngredienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class IngredienteServiceImpl implements IngredienteService {

    @Autowired
    private IngredienteRepository ingredienteRepository;

    @Override
    public List<IngredienteDTO> obtenerIngredientesPorReceta(Long recetaId) {
        List<Ingrediente> ingredientes = ingredienteRepository.findByRecetaId(recetaId);
        return ingredientes.stream()
                .map(IngredienteMapper.INSTANCE::ingredienteToIngredienteDTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<IngredienteDTO> obtenerIngredientesPorPaso(Long recetaId, Long pasoId) {
        List<Ingrediente> ingredientes = ingredienteRepository.findByPasoId(pasoId);
        return ingredientes.stream()
                .map(IngredienteMapper.INSTANCE::ingredienteToIngredienteDTO)
                .collect(Collectors.toList());
    }
}
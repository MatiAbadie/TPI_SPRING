package com.ejemplo.recetas.recetas.service;

import com.ejemplo.recetas.dto.IngredienteDTO;

import java.util.List;

public interface IngredienteService {

    List<IngredienteDTO> obtenerIngredientesPorReceta(Long recetaId);

    List<IngredienteDTO> obtenerIngredientesPorPaso(Long recetaId, Long pasoId);
}
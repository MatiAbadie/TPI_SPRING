package com.ejemplo.recetas.recetas.service;

import com.ejemplo.recetas.dto.RecetaDTO;

import java.util.List;

public interface RecetaService {

    RecetaDTO crearReceta(RecetaDTO recetaDTO);

    RecetaDTO obtenerRecetaPorId(Long id);

    List<RecetaDTO> obtenerRecetasPorCategoria(Long categoriaId);

    void eliminarReceta(Long id);

    RecetaDTO actualizarPasosDeReceta(Long recetaId, Long pasoId, RecetaDTO recetaDTO);
}

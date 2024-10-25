package com.ejemplo.recetas.recetas.service;

import com.ejemplo.recetas.dto.CategoriaDTO;

import java.util.List;

public interface CategoriaService {

    List<CategoriaDTO> obtenerTodasLasCategorias();

    interface RecetaService {
        RecetaDTO crearReceta(RecetaDTO recetaDTO);
        RecetaDTO obtenerRecetaPorId(Long id);
        List<RecetaDTO> obtenerRecetasPorCategoria(Long categoriaId);
        void eliminarReceta(Long id);
    }
}

package com.ejemplo.recetas.recetas.service;

import com.ejemplo.recetas.dto.PasoDTO;

import java.util.List;

public interface PasoService {

    List<PasoDTO> obtenerPasosPorReceta(Long recetaId);

    PasoDTO actualizarPaso(Long recetaId, Long pasoId, PasoDTO pasoDTO);
}
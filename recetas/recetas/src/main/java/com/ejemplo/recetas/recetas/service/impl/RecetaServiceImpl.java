package com.ejemplo.recetas.recetas.service.impl;

import com.ejemplo.recetas.dto.RecetaDTO;
import com.ejemplo.recetas.mapper.RecetaMapper;
import com.ejemplo.recetas.model.Receta;
import com.ejemplo.recetas.repository.RecetaRepository;
import com.ejemplo.recetas.service.RecetaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RecetaServiceImpl implements RecetaService {

    @Autowired
    private RecetaRepository recetaRepository;

    @Override
    public RecetaDTO crearReceta(RecetaDTO recetaDTO) {
        Receta receta = RecetaMapper.INSTANCE.recetaDTOToReceta(recetaDTO);
        Receta recetaGuardada = recetaRepository.save(receta);
        return RecetaMapper.INSTANCE.recetaToRecetaDTO(recetaGuardada);
    }

    @Override
    public RecetaDTO obtenerRecetaPorId(Long id) {
        Receta receta = recetaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Receta no encontrada"));
        return RecetaMapper.INSTANCE.recetaToRecetaDTO(receta);
    }

    @Override
    public List<RecetaDTO> obtenerRecetasPorCategoria(Long categoriaId) {
        List<Receta> recetas = recetaRepository.findByCategoriaId(categoriaId);
        return recetas.stream()
                .map(RecetaMapper.INSTANCE::recetaToRecetaDTO)
                .collect(Collectors.toList());
    }

    @Override
    public void eliminarReceta(Long id) {
        recetaRepository.deleteById(id);
    }

    @Override
    public RecetaDTO actualizarPasosDeReceta(Long recetaId, Long pasoId, RecetaDTO recetaDTO) {
        Receta receta = recetaRepository.findById(recetaId)
                .orElseThrow(() -> new RuntimeException("Receta no encontrada"));
        receta.setPasos(RecetaMapper.INSTANCE.recetaDTOToReceta(recetaDTO).getPasos());
        recetaRepository.save(receta);
        return RecetaMapper.INSTANCE.recetaToRecetaDTO(receta);
    }
}

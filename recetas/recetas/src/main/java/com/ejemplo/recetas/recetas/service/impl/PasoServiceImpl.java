package com.ejemplo.recetas.recetas.service.impl;

import com.ejemplo.recetas.dto.PasoDTO;
import com.ejemplo.recetas.mapper.PasoMapper;
import com.ejemplo.recetas.model.Paso;
import com.ejemplo.recetas.repository.PasoRepository;
import com.ejemplo.recetas.service.PasoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PasoServiceImpl implements PasoService {

    @Autowired
    private PasoRepository pasoRepository;

    @Override
    public List<PasoDTO> obtenerPasosPorReceta(Long recetaId) {
        List<Paso> pasos = pasoRepository.findByRecetaId(recetaId);
        return pasos.stream()
                .map(PasoMapper.INSTANCE::pasoToPasoDTO)
                .collect(Collectors.toList());
    }

    @Override
    public PasoDTO actualizarPaso(Long recetaId, Long pasoId, PasoDTO pasoDTO) {
        Paso paso = pasoRepository.findById(pasoId)
                .orElseThrow(() -> new RuntimeException("Paso no encontrado"));
        paso.setDescripcion(pasoDTO.getDescripcion());
        paso.setTiempoEstimado(pasoDTO.getTiempoEstimado());
        paso.setOpcional(pasoDTO.isOpcional());
        pasoRepository.save(paso);
        return PasoMapper.INSTANCE.pasoToPasoDTO(paso);
    }
}
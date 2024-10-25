package com.ejemplo.recetas.recetas.mapper;

import com.ejemplo.recetas.dto.RecetaDTO;
import com.ejemplo.recetas.model.Receta;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

public interface RecetaMapper {

    RecetaMapper INSTANCE = Mappers.getMapper(RecetaMapper.class);

    @Mapping(source = "categoria", target = "categoria")
    @Mapping(source = "pasos", target = "pasos")
    RecetaDTO recetaToRecetaDTO(Receta receta);

    @Mapping(source = "categoria", target = "categoria")
    @Mapping(source = "pasos", target = "pasos")
    Receta recetaDTOToReceta(RecetaDTO recetaDTO);

}

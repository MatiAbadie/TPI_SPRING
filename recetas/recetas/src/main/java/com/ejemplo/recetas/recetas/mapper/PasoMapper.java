package com.ejemplo.recetas.recetas.mapper;

import com.ejemplo.recetas.dto.PasoDTO;
import com.ejemplo.recetas.model.Paso;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PasoMapper {

    PasoMapper INSTANCE = Mappers.getMapper(PasoMapper.class);

    @Mapping(source = "ingredientes", target = "ingredientes")
    PasoDTO pasoToPasoDTO(Paso paso);

    @Mapping(source = "ingredientes", target = "ingredientes")
    Paso pasoDTOToPaso(PasoDTO pasoDTO);
}














package com.ejemplo.recetas.recetas.mapper;

import com.ejemplo.recetas.dto.IngredienteDTO;
import com.ejemplo.recetas.model.Ingrediente;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface IngredienteMapper {

    IngredienteMapper INSTANCE = Mappers.getMapper(IngredienteMapper.class);

    IngredienteDTO ingredienteToIngredienteDTO(Ingrediente ingrediente);

    Ingrediente ingredienteDTOToIngrediente(IngredienteDTO ingredienteDTO);
}
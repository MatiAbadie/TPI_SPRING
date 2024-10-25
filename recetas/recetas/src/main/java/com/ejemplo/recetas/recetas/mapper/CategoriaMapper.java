package com.ejemplo.recetas.recetas.mapper;

import com.ejemplo.recetas.dto.CategoriaDTO;
import com.ejemplo.recetas.model.Categoria;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CategoriaMapper {

    CategoriaMapper INSTANCE = Mappers.getMapper(CategoriaMapper.class);

    CategoriaDTO categoriaToCategoriaDTO(Categoria categoria);

    Categoria categoriaDTOToCategoria(CategoriaDTO categoriaDTO);
}
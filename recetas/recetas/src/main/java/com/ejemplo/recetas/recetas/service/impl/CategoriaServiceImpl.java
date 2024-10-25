package com.ejemplo.recetas.recetas.service.impl;

import com.ejemplo.recetas.dto.CategoriaDTO;
import com.ejemplo.recetas.mapper.CategoriaMapper;
import com.ejemplo.recetas.model.Categoria;
import com.ejemplo.recetas.repository.CategoriaRepository;
import com.ejemplo.recetas.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Override
    public List<CategoriaDTO> obtenerTodasLasCategorias() {
        List<Categoria> categorias = categoriaRepository.findAll();
        return categorias.stream()
                .map(CategoriaMapper.INSTANCE::categoriaToCategoriaDTO)
                .collect(Collectors.toList());
    }
}

package com.ejemplo.recetas.recetas.repository;

import com.ejemplo.recetas.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}

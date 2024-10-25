package com.ejemplo.recetas.recetas.repository;

import com.ejemplo.recetas.model.Ingrediente;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface IngredienteRepository extends JpaRepository<Ingrediente, Long> {
    List<Ingrediente> findByPasoId(Long pasoId);
}
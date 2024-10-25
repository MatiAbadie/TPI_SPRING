package com.ejemplo.recetas.recetas.repository;

import com.ejemplo.recetas.model.Receta;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface RecetaRepository extends JpaRepository<Receta, Long> {
    List<Receta> findByCategoriaId(Long categoriaId);
}

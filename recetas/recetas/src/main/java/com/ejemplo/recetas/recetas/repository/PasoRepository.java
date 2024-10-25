package com.ejemplo.recetas.recetas.repository;

import com.ejemplo.recetas.model.Paso;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface PasoRepository extends JpaRepository<Paso, Long> {
    List<Paso> findByRecetaId(Long recetaId);
}
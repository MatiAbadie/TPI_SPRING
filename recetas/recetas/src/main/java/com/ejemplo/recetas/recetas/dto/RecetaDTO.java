package com.ejemplo.recetas.recetas.dto;

import com.ejemplo.recetas.model.Dificultad;
import com.ejemplo.recetas.dto.CategoriaDTO;
import com.ejemplo.recetas.dto.PasoDTO;
import java.util.List;

public class RecetaDTO {

    private Long id;
    private String nombre;
    private String descripcion;
    private Dificultad dificultad;
    private CategoriaDTO categoria;
    private List<PasoDTO> pasos;

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Dificultad getDificultad() {
        return dificultad;
    }

    public void setDificultad(Dificultad dificultad) {
        this.dificultad = dificultad;
    }

    public CategoriaDTO getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaDTO categoria) {
        this.categoria = categoria;
    }

    public List<PasoDTO> getPasos() {
        return pasos;
    }

    public void setPasos(List<PasoDTO> pasos) {
        this.pasos = pasos;
    }
}

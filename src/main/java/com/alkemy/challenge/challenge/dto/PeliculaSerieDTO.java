package com.alkemy.challenge.challenge.dto;

import com.alkemy.challenge.challenge.entity.Genero;
import com.alkemy.challenge.challenge.entity.Personaje;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class PeliculaSerieDTO {
    private Long id;
    private String imagen;
    private String titulo;
    private LocalDate fechaCreacion;
    private Float calificacion;
    private List<Personaje> personajes;
    private Genero generoId;
}

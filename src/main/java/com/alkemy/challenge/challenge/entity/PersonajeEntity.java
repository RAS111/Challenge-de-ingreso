package com.alkemy.challenge.challenge.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "personaje")
@Setter
@Getter
public class PersonajeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String nombre;
    private String imagen;
    private Integer edad;
    private Float peso;
    private String historia;

    @ManyToMany(
            cascade = {
                CascadeType.PERSIST,
                CascadeType.MERGE
    })
    @JoinTable(name = "personaje_pelicula_serie",
            joinColumns = @JoinColumn(name = "personaje_id", nullable = false),
            inverseJoinColumns = @JoinColumn(name = "pelicula_serie_id", nullable = false))
    private Set<PeliculaSerieEntity> peliculaSeries = new HashSet<>();

}

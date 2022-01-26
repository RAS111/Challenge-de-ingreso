package com.alkemy.challenge.challenge.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Setter
@Getter
@SQLDelete(sql = "UPDATE personaje SET deleted = true WHERE id=?")
@Where(clause = "deleted=false")
public class Personaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String imagen;
    private Integer edad;
    private Float peso;
    private String historia;

    private boolean deleted = Boolean.FALSE;

    @ManyToMany(
            cascade = {
                CascadeType.PERSIST,
                CascadeType.MERGE
    })

    @JoinTable(name = "personaje_pelicula_serie",
            joinColumns = @JoinColumn(name = "personaje_id", nullable = false),
            inverseJoinColumns = @JoinColumn(name = "pelicula_serie_id", nullable = false))
    private Set<PeliculaSerie> peliculaSeries = new HashSet<>();

}

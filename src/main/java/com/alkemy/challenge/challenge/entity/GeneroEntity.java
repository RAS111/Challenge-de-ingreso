package com.alkemy.challenge.challenge.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "genero")
@Setter
@Getter
public class GeneroEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nombre;
    private String imagen;

    @OneToMany(mappedBy = "generoId",fetch=FetchType.LAZY, cascade = CascadeType.ALL)
    private List<PeliculaSerieEntity> peliculaSerie;
}

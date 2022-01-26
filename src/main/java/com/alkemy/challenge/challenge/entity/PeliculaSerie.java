package com.alkemy.challenge.challenge.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "pelicula_serie")
@Setter
@Getter
@SQLDelete(sql = "UPDATE pelicula-serie SET deleted = true WHERE id=?")
@Where(clause = "deleted=false")
public class PeliculaSerie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String imagen;
    private String titulo;

    @Column(name = "fecha_creacion")
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private LocalDate fechaCreacion;

    private Float calificacion;

    @ManyToMany(mappedBy = "peliculaSeries", cascade = CascadeType.MERGE)
    private List<Personaje> personajes = new ArrayList<>();

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinColumn(name="genero_id")
    private Genero generoId;

    private boolean deleted = Boolean.FALSE;
}

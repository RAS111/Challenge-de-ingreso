package com.alkemy.challenge.challenge.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.util.List;

@Entity
@Setter
@Getter
@SQLDelete(sql = "UPDATE genero SET deleted = true WHERE id=?")
@Where(clause = "deleted=false")
public class Genero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String imagen;

    @OneToMany(mappedBy = "generoId",fetch=FetchType.LAZY, cascade = CascadeType.MERGE)
    private List<PeliculaSerie> peliculaSerie;

    private boolean deleted = Boolean.FALSE;

}

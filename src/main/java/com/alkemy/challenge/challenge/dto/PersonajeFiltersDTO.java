
//TODO: FALTA TERMINAR
package com.alkemy.challenge.challenge.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class PersonajeFiltersDTO {
    private String nombre;
    private Integer edad;
    private Float peso;
    private Set<Long> peliculaSerie;
    private String order;

    public PersonajeFiltersDTO (String nombre, Integer edad, Float peso, Set<Long> peliculaSerie, String order){
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.peliculaSerie = peliculaSerie;
        this.order = order;
    }

    public boolean isASC() { return this.order.compareToIgnoreCase("ASC") == 0; }

    public boolean isDESC() { return this.order.compareToIgnoreCase("DESC") == 0; }
}

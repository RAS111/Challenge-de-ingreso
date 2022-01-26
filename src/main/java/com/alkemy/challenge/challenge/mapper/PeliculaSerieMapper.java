package com.alkemy.challenge.challenge.mapper;

import com.alkemy.challenge.challenge.dto.PeliculaSerieDTO;
import com.alkemy.challenge.challenge.entity.PeliculaSerie;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PeliculaSerieMapper {

    public PeliculaSerie peliculaSerieDTO2Entity(PeliculaSerieDTO dto){
        PeliculaSerie peliculaSerieEntity = new PeliculaSerie();
        peliculaSerieEntity.setImagen(dto.getImagen());
        peliculaSerieEntity.setTitulo(dto.getTitulo());
        peliculaSerieEntity.setFechaCreacion(dto.getFechaCreacion());
        peliculaSerieEntity.setCalificacion(dto.getCalificacion());
        peliculaSerieEntity.setPersonajes(dto.getPersonajes());
        peliculaSerieEntity.setGeneroId(dto.getGeneroId());
        return peliculaSerieEntity;
    }

    public PeliculaSerieDTO peliculaSerieEntity2DTO(PeliculaSerie entity){
        PeliculaSerieDTO dto = new PeliculaSerieDTO();
        dto.setId(entity.getId());
        dto.setImagen(entity.getImagen());
        dto.setTitulo(entity.getTitulo());
        dto.setFechaCreacion(entity.getFechaCreacion());
        dto.setCalificacion(entity.getCalificacion());
        dto.setPersonajes(entity.getPersonajes());
        dto.setGeneroId(entity.getGeneroId());
        return dto;
    }

    public List<PeliculaSerieDTO> peliculaSerieEntity2DTOList(List<PeliculaSerie> entities){
        List<PeliculaSerieDTO> dtos = new ArrayList<>();
        for (PeliculaSerie entity : entities) {
            dtos.add(this.peliculaSerieEntity2DTO(entity));
        }
        return dtos;
    }

}

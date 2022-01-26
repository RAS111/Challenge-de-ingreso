package com.alkemy.challenge.challenge.mapper;

import com.alkemy.challenge.challenge.dto.PersonajeDTO;
import com.alkemy.challenge.challenge.entity.Personaje;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonajeMapper {

    public Personaje personajeDTO2Entity(PersonajeDTO dto){
        Personaje personajeEntity = new Personaje();
        personajeEntity.setNombre(dto.getNombre());
        personajeEntity.setImagen(dto.getImagen());
        personajeEntity.setEdad(dto.getEdad());
        personajeEntity.setPeso(dto.getPeso());
        personajeEntity.setHistoria(dto.getHistoria());
        return personajeEntity;
    }

    public PersonajeDTO personajeEntity2DTO(Personaje entity){
        PersonajeDTO dto = new PersonajeDTO();
        dto.setId(entity.getId());
        dto.setNombre(entity.getNombre());
        dto.setImagen(entity.getImagen());
        dto.setEdad(entity.getEdad());
        dto.setPeso(entity.getPeso());
        dto.setHistoria(entity.getHistoria());
        return dto;
    }

    public List<PersonajeDTO> personajeEntity2DTOList(List<Personaje> entities){
        List<PersonajeDTO> dtos = new ArrayList<>();
        for (Personaje entity : entities) {
            dtos.add(this.personajeEntity2DTO(entity));
        }
        return dtos;
    }

}

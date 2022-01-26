package com.alkemy.challenge.challenge.service;

import com.alkemy.challenge.challenge.dto.PersonajeDTO;

import java.util.List;


public interface PersonajeService {

    PersonajeDTO save(PersonajeDTO dto);

    List<PersonajeDTO> getAllPersonajes();


    void delete(Long id);

    //TODO: FALTA TERMINAR
    /*
    //id
    PersonajeDTO getDetailsById(Long id);

    //filters
    List<PersonajeDTO> getByFilters(String nombre, Integer edad, Float peso, Set<Long> peliculaSerie, String order);
    */
}

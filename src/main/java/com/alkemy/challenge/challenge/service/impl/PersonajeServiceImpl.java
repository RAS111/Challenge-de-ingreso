package com.alkemy.challenge.challenge.service.impl;

import com.alkemy.challenge.challenge.dto.PersonajeDTO;
import com.alkemy.challenge.challenge.entity.Personaje;
import com.alkemy.challenge.challenge.mapper.PersonajeMapper;
import com.alkemy.challenge.challenge.repository.PersonajeRepository;
import com.alkemy.challenge.challenge.service.PersonajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonajeServiceImpl implements PersonajeService {

    //TODO: FALTA TERMINAR
    /*private PersonajeSpecification personajeSpecification;

    @Autowired
    public PersonajeServiceImpl (
      PersonajeSpecification personajeSpecification
    ){
        this.personajeSpecification = personajeSpecification;
    }*/


    @Autowired
    private PersonajeMapper personajeMapper;
    @Autowired
    PersonajeRepository personajeRepository;

    public PersonajeDTO save(PersonajeDTO dto) {
        Personaje entity = personajeMapper.personajeDTO2Entity(dto);
        Personaje entitySaved = personajeRepository.save(entity);
        PersonajeDTO result = personajeMapper.personajeEntity2DTO(entitySaved);
        return result;
    }

    public List<PersonajeDTO> getAllPersonajes() {
        List<Personaje> entities = personajeRepository.findAll();
        List<PersonajeDTO> result = personajeMapper.personajeEntity2DTOList(entities);
        return result;
    }



    public void delete(Long id) {
        this.personajeRepository.deleteById(id);
    }
/*
    //filters
    @Override
    public PersonajeDTO getDetailsById(Long id) {
        return null;
    }

    @Override
    public List<PersonajeDTO> getByFilters(String nombre, Integer edad, Float peso, Set<Long> peliculaSerie, String order) {
      PersonajeFiltersDTO filtersDTO = new PersonajeFiltersDTO(nombre, edad, peso, peliculaSerie, order);
      List<Personaje> entities = this.personajeRepository.findAll(this.personajeSpecification.getByFilters(filtersDTO));

    }*/
}

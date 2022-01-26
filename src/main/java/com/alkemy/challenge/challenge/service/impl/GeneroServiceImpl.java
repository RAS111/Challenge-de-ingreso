package com.alkemy.challenge.challenge.service.impl;

import com.alkemy.challenge.challenge.dto.GeneroDTO;
import com.alkemy.challenge.challenge.entity.Genero;
import com.alkemy.challenge.challenge.mapper.GeneroMapper;
import com.alkemy.challenge.challenge.repository.GeneroRepository;
import com.alkemy.challenge.challenge.service.GeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeneroServiceImpl implements GeneroService {

    @Autowired
    private GeneroMapper generoMapper;
    @Autowired
    GeneroRepository generoRepository;

    public GeneroDTO save(GeneroDTO dto){
        Genero entity = generoMapper.generoDTO2Entity(dto);
        Genero entitySaved = generoRepository.save(entity);
        GeneroDTO result = generoMapper.generoEntity2DTO(entitySaved);
        return result;
    }

    public List<GeneroDTO> getAllGeneros(){
        List<Genero> entities = generoRepository.findAll();
        List<GeneroDTO> result = generoMapper.generoEntity2DTOList(entities);
        return result;
    }

    public void delete(Long id) {
        this.generoRepository.deleteById(id);
    }

}

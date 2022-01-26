package com.alkemy.challenge.challenge.service.impl;


import com.alkemy.challenge.challenge.dto.PeliculaSerieDTO;
import com.alkemy.challenge.challenge.entity.PeliculaSerie;
import com.alkemy.challenge.challenge.mapper.PeliculaSerieMapper;
import com.alkemy.challenge.challenge.repository.PeliculaSerieRepository;
import com.alkemy.challenge.challenge.service.PeliculaSerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeliculaSerieServiceImpl  implements PeliculaSerieService {

    @Autowired
    private PeliculaSerieMapper peliculaSerieMapper;
    @Autowired
    PeliculaSerieRepository peliculaSerieRepository;

    public PeliculaSerieDTO save(PeliculaSerieDTO dto) {
        PeliculaSerie entity = peliculaSerieMapper.peliculaSerieDTO2Entity(dto);
        PeliculaSerie entitySaved = peliculaSerieRepository.save(entity);
        PeliculaSerieDTO result = peliculaSerieMapper.peliculaSerieEntity2DTO(entitySaved);
        return result;
    }

    public List<PeliculaSerieDTO> getAllPeliculaSerie() {
        List<PeliculaSerie> entities = peliculaSerieRepository.findAll();
        List<PeliculaSerieDTO> result = peliculaSerieMapper.peliculaSerieEntity2DTOList(entities);
        return result;
    }

    public void delete(Long id) {
        this.peliculaSerieRepository.deleteById(id);
    }

}

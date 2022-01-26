package com.alkemy.challenge.challenge.service;

import com.alkemy.challenge.challenge.dto.PeliculaSerieDTO;

import java.util.List;

public interface PeliculaSerieService {

    PeliculaSerieDTO save(PeliculaSerieDTO dto);


    List<PeliculaSerieDTO> getAllPeliculaSerie();


    void delete(Long id);
}

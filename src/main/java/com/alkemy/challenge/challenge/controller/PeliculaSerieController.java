package com.alkemy.challenge.challenge.controller;

import com.alkemy.challenge.challenge.dto.PeliculaSerieDTO;
import com.alkemy.challenge.challenge.service.PeliculaSerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("movies")
public class PeliculaSerieController {

    @Autowired
    private PeliculaSerieService peliculaSerieService;

    @GetMapping
    public ResponseEntity<List<PeliculaSerieDTO>> getAll(){
        List<PeliculaSerieDTO> peliculaSerie = peliculaSerieService.getAllPeliculaSerie();
        return ResponseEntity.ok().body(peliculaSerie);
    }

    @PostMapping
    public ResponseEntity<PeliculaSerieDTO> save(@RequestBody PeliculaSerieDTO peliculaSerie){
        PeliculaSerieDTO peliculaSerieGuardado = peliculaSerieService.save(peliculaSerie);
        return ResponseEntity.status(HttpStatus.CREATED).body(peliculaSerieGuardado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        this.peliculaSerieService.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}

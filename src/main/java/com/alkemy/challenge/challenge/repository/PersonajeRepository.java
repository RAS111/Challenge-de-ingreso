package com.alkemy.challenge.challenge.repository;

import com.alkemy.challenge.challenge.entity.Personaje;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonajeRepository extends JpaRepository<Personaje, Long>{

    //TODO: FALTA TERMINAR
    List<Personaje> findAll(Specification<Personaje> spec);

}

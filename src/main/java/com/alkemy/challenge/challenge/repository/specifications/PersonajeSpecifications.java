
//TODO: FALTA TERMINAR

/*package com.alkemy.challenge.challenge.repository.specifications;


import com.alkemy.challenge.challenge.dto.PersonajeFiltersDTO;
import com.alkemy.challenge.challenge.entity.Personaje;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class PersonajeSpecifications {

    public Specification<Personaje> getByFilters(PersonajeFiltersDTO filtersDTO){
        return ((root, query, criteriaBuilder) -> {

            List<Predicate> predicates = new ArrayList<>();

            if (StringUtils.hasLength(filtersDTO.getNombre())){
                predicates.add(
                        (Predicate) criteriaBuilder.like(
                                criteriaBuilder.lower(root.get("denominacion")),
                                "%" + filtersDTO.getNombre().toLowerCase() + "%"
                        )
                );
            }

            if (StringUtils.hasLength(filtersDTO.getEdad())){

            }

        })
    }

}*/

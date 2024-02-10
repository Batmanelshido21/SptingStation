package com.prueba.prueba.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import com.prueba.prueba.DTO.PlayStationDTO;
import com.prueba.prueba.Objetos.PlayStationPlus;

@Repository
public interface PlayStationPlusRepository extends JpaRepository<PlayStationPlus, Long> {

    @Procedure
    PlayStationDTO DTOPlay();
    
}

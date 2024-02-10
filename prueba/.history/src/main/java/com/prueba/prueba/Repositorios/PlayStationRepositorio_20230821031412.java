package com.prueba.prueba.Repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import com.prueba.prueba.DTO.PlayStationDTO;
import com.prueba.prueba.Objetos.PlayStation;

@Repository
public interface PlayStationRepositorio extends JpaRepository<PlayStation, String>{
 
    @Procedure(name = "DTOPlay5")
    List<PlayStationDTO> DTOPlay2();

}

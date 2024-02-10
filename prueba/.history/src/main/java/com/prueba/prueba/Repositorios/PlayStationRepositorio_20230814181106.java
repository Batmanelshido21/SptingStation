package com.prueba.prueba.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prueba.prueba.Objetos.PlayStation;

@Repository
public interface PlayStationRepositorio extends JpaRepository<PlayStation, String>{
    
}

package com.prueba.prueba.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prueba.prueba.Objetos.PlayStation;

public interface PlayStationRepositorio extends JpaRepository<PlayStation, String>{
    
}

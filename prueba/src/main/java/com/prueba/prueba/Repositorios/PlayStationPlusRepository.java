package com.prueba.prueba.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prueba.prueba.Objetos.PlayStationPlus;

@Repository
public interface PlayStationPlusRepository extends JpaRepository<PlayStationPlus, Long> {
    
    
}

package com.prueba.prueba.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prueba.prueba.Objetos.Partida;

@Repository
public interface PartidaRepositorio extends JpaRepository<Partida,String> {
    
}

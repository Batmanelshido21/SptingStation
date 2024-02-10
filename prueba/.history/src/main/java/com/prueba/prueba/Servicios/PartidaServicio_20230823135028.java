package com.prueba.prueba.Servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.prueba.Objetos.Partida;
import com.prueba.prueba.Repositorios.PartidaRepositorio;

@Service
public class PartidaServicio {
    
    @Autowired
    PartidaRepositorio partidaRepositorio;

    Partida partidaN;

    public Partida registrarPartida(Partida partida){
        if(partidaRepositorio.existsById(partida.getIdPartidas())){
            return partidaN;
        }else{
            return partidaRepositorio.save(partida);
        }
    }
}

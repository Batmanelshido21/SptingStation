package com.prueba.prueba.Servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.prueba.DTO.PlayStationDTO;
import com.prueba.prueba.Objetos.PlayStation;
import com.prueba.prueba.Repositorios.PlayStationRepositorio;

import jakarta.transaction.Transactional;

@Service
public class PlayStationServicio {
    
    @Autowired
    PlayStationRepositorio playStationRepositorio;
    PlayStation play = new PlayStation();

    public PlayStation registrarPlayStation(PlayStation playStation){
        
        if(playStationRepositorio.existsById(playStation.getNoSerie())){
            return play;
        }else{
            return playStationRepositorio.save(playStation);
        }
    }

    public List<PlayStation> obtenerPlayStations(){
        return playStationRepositorio.findAll();
    }

    public void eliminarPlayStation(String noSerie){
        playStationRepositorio.deleteById(noSerie);
    }

    public PlayStation modificarPlayStation(PlayStation playStation){
        if(playStationRepositorio.existsById(playStation.getNoSerie())){
            return playStationRepositorio.save(playStation);
        }else{
            return play;
        }
    }

    @Transactional
    public List<PlayStationDTO> obtenerDTO(){
        return playStationRepositorio.DTOPlay();
    }

    public Long numeroPlays(){
        return playStationRepositorio.numeroPlays();
    }
}

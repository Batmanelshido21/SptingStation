package com.prueba.prueba.Servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.prueba.Objetos.PlayStationPlus;
import com.prueba.prueba.Repositorios.PlayStationPlusRepository;

@Service
public class PlayStationPlusServicio {
    
    @Autowired
    PlayStationPlusRepository playStationPlusRepository;
    PlayStationPlus plus = new PlayStationPlus();

    public PlayStationPlus registrarPlayStationPlus(PlayStationPlus psPlus){

        if(playStationPlusRepository.existsById(psPlus.getIdPlayStationPlus())){
            return plus;
        }else{
            return playStationPlusRepository.save(psPlus);
        }
    }

    public PlayStationPlus modificarPlayStationPlus(PlayStationPlus psPlus){
        if(playStationPlusRepository.existsById(psPlus.getIdPlayStationPlus())){
            return playStationPlusRepository.save(psPlus);
        }else{
            return plus;
        }
    }

    public List<PlayStationPlus> obtenerPlayStationPlus(){
        return playStationPlusRepository.findAll();
    }
}

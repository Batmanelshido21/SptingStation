package com.prueba.prueba.Servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.prueba.Objetos.PlayStationPlus;
import com.prueba.prueba.Repositorios.PlayStationPlusRepository;

@Service
public class PlayStationPlusServicio {
    
    @Autowired
    PlayStationPlusRepository playStationPlusRepository;

    public PlayStationPlus registrarPlayStationPlus(PlayStationPlus psPlus){

        if(playStationPlusRepository.existsById(psPlus.getIdPlayStationPlus())){
            return playStationPlusRepository.save(psPlus);
        }
    }
}

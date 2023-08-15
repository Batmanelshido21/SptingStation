package com.prueba.prueba.Controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.prueba.Objetos.PlayStation;
import com.prueba.prueba.Servicios.PlayStationServicio;

@RestController
@RequestMapping("/PlayStation")
public class PlayStationControlador {
    
    @Autowired
    PlayStationServicio playStationServicio;

    @PostMapping("/registrarPlayStation")
    public PlayStation registrarPlayStation(PlayStation playStation){
        return playStationServicio.registrarPlayStation(playStation);
    }
}

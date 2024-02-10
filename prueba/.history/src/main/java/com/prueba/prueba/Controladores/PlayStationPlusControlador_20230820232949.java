package com.prueba.prueba.Controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.prueba.Objetos.PlayStationPlus;
import com.prueba.prueba.Servicios.PlayStationPlusServicio;
import com.prueba.prueba.Servicios.PlayStationServicio;

@RestController
@RequestMapping("/playStationPlus")
public class PlayStationPlusControlador {
    
    @Autowired
    PlayStationPlusServicio playStationPlusServicio;

    @PostMapping("/registrarPsPlus")
    public PlayStationPlus registrarPsPlus(@RequestBody PlayStationPlus playStationPlus){
        return playStationPlusServicio.registrarPlayStationPlus(playStationPlus);
    }
}

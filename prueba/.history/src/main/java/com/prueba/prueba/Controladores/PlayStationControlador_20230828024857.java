package com.prueba.prueba.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.prueba.DTO.PlayStationDTO;
import com.prueba.prueba.Objetos.PlayStation;
import com.prueba.prueba.Servicios.PlayStationServicio;

@RestController
@RequestMapping("/PlayStation")
public class PlayStationControlador {
    
    @Autowired
    PlayStationServicio playStationServicio;

    @PostMapping("/registrarPlayStation")
    public PlayStation registrarPlayStation(@RequestBody PlayStation playStation){
        return playStationServicio.registrarPlayStation(playStation);
    }

    @GetMapping("/obtenerPlayStations")
    public List<PlayStation> obtenerPlayStation(){
        return playStationServicio.obtenerPlayStations();
    }

    @DeleteMapping("/eliminarPlayStation")
    public void eliminarPlayStation(@RequestParam String noSerie){

        playStationServicio.eliminarPlayStation(noSerie);
    }

    @PutMapping("/modificarPlayStation")
    public PlayStation modificarPlayStation(@RequestBody PlayStation playStation){
        return playStationServicio.modificarPlayStation(playStation);
    }

    @GetMapping("/obtenerDTO")
    public List<PlayStationDTO> obtener(){
        return playStationServicio.obtenerDTO();
    }

    @GetMapping("plays")
    public Long numeroPlays(){
        return playStationServicio.numeroPlays();
    }
}

package com.prueba.prueba.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.prueba.DTO.PlayStationDTO;
import com.prueba.prueba.Objetos.PlayStation;
import com.prueba.prueba.Servicios.PlayStationServicio;

@RestController
@ResponseBody
public class PlayStationControlador {
    
    @Autowired
    PlayStationServicio playStationServicio;

    @PostMapping(path = "/registrarPlayStation",consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE})
    public PlayStation registrarPlayStation(PlayStation playStation){
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

    @CrossOrigin
    @PutMapping(value="/modificarPlayStation",consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE},produces = {MediaType.APPLICATION_FORM_URLENCODED_VALUE})
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

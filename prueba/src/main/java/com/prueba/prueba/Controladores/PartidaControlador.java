package com.prueba.prueba.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.prueba.Objetos.Partida;
import com.prueba.prueba.Servicios.PartidaServicio;

@RestController
@RequestMapping("/partida")
public class PartidaControlador {
    
    @Autowired
    PartidaServicio partidaServicio;

    @PostMapping("/registrarPartida")
    public Partida registrarPartida(@RequestBody Partida partida){

        return partidaServicio.registrarPartida(partida);
    }

    @GetMapping("/obtenerPartidas")
    public List<Partida> obtenerPartidas(){
        return partidaServicio.obtenerPartidas();
    }
}

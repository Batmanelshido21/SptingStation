package com.prueba.prueba.Controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.prueba.Objetos.Cuenta;
import com.prueba.prueba.Servicios.CuentaServicio;

@RestController
@RequestMapping("/cuenta")
public class CuentaControlador {

    @Autowired
    CuentaServicio cuentaServicio;

    @PostMapping("/registrarCuenta")
    public Cuenta registrarCuenta(@RequestBody Cuenta cuenta){
        
        return cuentaServicio.registrarCuenta(cuenta);
    }
    
}

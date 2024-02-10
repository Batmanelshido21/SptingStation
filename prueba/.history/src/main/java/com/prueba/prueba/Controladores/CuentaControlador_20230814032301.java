package com.prueba.prueba.Controladores;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @PutMapping("/modificarCuenta")
    public Cuenta modificarCuenta(@RequestBody Cuenta cuenta){
        return cuentaServicio.modificarCuenta(cuenta);
    }

    @GetMapping("/obtenerCuentas")
    public List<Cuenta> obtenerCuentas(){
        return cuentaServicio.obtenerCuentas();
    }

    @GetMapping("/obtenerCuentaPorNombre")
    public Optional<Cuenta> obtenerCuentaPorNombre(@RequestParam String nombre){
        return cuentaServicio.obtenerCuentaPorNombre(nombre);
    }

    @DeleteMapping("/eliminarCuenta")
    public void eliminarCuenta(@PathVariable String nombre){
        cuentaServicio.eliminarcuenta(nombre);
    }
    
}

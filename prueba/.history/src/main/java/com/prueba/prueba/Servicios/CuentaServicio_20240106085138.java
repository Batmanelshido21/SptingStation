package com.prueba.prueba.Servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.prueba.Objetos.Cuenta;
import com.prueba.prueba.Repositorios.CuentaRepositorio;


@Service
public class CuentaServicio {
    
    @Autowired
    CuentaRepositorio cuentaRepositorio;

    Cuenta cuentaP = new Cuenta();

    public Cuenta registrarCuenta(Cuenta cuenta){
        

        if(cuentaRepositorio.existsById(cuenta.getNombreUsuario())){
            return cuentaP;
        }
        else{
            return cuentaRepositorio.save(cuenta);
            
        }
    }

    public Cuenta modificarCuenta(Cuenta cuenta){
        if(cuentaRepositorio.existsById(cuenta.getNombreUsuario())){
            return cuentaRepositorio.save(cuenta);
        }else{
            return cuentaP;
        }
    }

    public List<Cuenta> obtenerCuentas(){
        return cuentaRepositorio.findAll();
    }

    public Optional<Cuenta> obtenerCuentaPorNombre(String nombre){
        return cuentaRepositorio.findById(nombre);
    }

    public void eliminarcuenta(String nombre){
        cuentaRepositorio.deleteById(nombre);
    }
}

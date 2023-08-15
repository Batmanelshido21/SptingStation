package com.prueba.prueba.Servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.prueba.Objetos.Cuenta;
import com.prueba.prueba.Repositorios.CuentaRepositorio;

import jakarta.transaction.Transactional;

@Service
public class CuentaServicio {
    
    @Autowired
    CuentaRepositorio cuentaRepositorio;

    public Cuenta registrarCuenta(Cuenta cuenta){
        Cuenta cuentaP = new Cuenta();

        if(cuentaRepositorio.existsById(cuenta.getNombreUsuario())){
            return cuentaP;
        }
        else{
            return cuentaRepositorio.save(cuenta);
            
        }
    }
}

package com.prueba.prueba.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prueba.prueba.Objetos.Cuenta;

public interface CuentaRepositorio extends JpaRepository<Cuenta,String>{
    
}

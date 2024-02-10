package com.prueba.prueba.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prueba.prueba.Objetos.Cuenta;

@Repository
public interface CuentaRepositorio extends JpaRepository<Cuenta,String>{

    
}

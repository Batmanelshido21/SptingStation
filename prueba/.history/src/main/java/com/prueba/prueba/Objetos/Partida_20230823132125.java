package com.prueba.prueba.Objetos;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="Partida")
public class Partida {

    @Id
    @Column(name="idPartidas",nullable = false, unique = true)
    private String idPartidas;

    @Column(name="fecha",nullable = false,unique = false)
    private Date fecha;

    
    
}

package com.prueba.prueba.Objetos;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="PlayStationPlus")
public class PlayStationPlus {

    @Id
    @Column(name="idPlayStationPlus",unique = true, nullable = false)
    private int idPlayStationPlus;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "PlayStation_noSerie", referencedColumnName = "noSerie",
    nullable = true)
    private PlayStation playStation;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Cuenta_nombreUsuario", referencedColumnName = "nombreUsuario",
    nullable = true)
    private Cuenta cuenta;
}

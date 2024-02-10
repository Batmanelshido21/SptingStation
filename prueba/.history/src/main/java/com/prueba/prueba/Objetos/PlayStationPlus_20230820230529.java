package com.prueba.prueba.Objetos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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

    
    
}

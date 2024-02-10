package com.prueba.prueba.Objetos;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="PlayStation")
public class PlayStation {

    @Id
    @Column(name="noSerie",nullable = false,unique = true)
    private String noSerie;

    @Column(name="nombre", nullable = false, unique = false)
    private String nombre;

    @Column(name="paisOrigen",nullable = false, unique = false)
    private String paisOrigen;

    @Column(name="year", nullable = false, unique = false)
    private int year;

    @Column(name ="cuenta", nullable = true)
    @ManyToMany(cascade = {CascadeType.MERGE, CascadeType.PERSIST}, fetch = FetchType.EAGER)
    @JoinTable(name = "PlayStation_has_Cuenta", joinColumns = @JoinColumn(name="PlayStation_noSerie"),
    inverseJoinColumns = @JoinColumn(name = "Cuenta_nombreUsuario"))
    Set<Cuenta>cuenta;

    @OneToOne(mappedBy = "playStation")
    @JsonIgnore
    private PlayStationPlus psPlus;
}

package com.prueba.prueba.DTO;

public class PlayStationDTO {
    
    private String noSerie;

    private String nombre;

    public PlayStationDTO(String noSerie, String nombre) {
        super();
        this.noSerie = noSerie;
        this.nombre = nombre;
    }

    public String getNoSerie() {
        return noSerie;
    }

    public void setNoSerie(String noSerie) {
        this.noSerie = noSerie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}

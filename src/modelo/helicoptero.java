/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author carli
 */
public class helicoptero extends vehiculo_aereo {
    private int helices;
    private int aterrizaje;
    public helicoptero(String enciendido, String freno) {
        super(enciendido, freno);
    }

    public helicoptero(int helices, int aterrizaje, String enciendido, String freno) {
        super(enciendido, freno);
        this.helices = helices;
        this.aterrizaje = aterrizaje;
    }

    public helicoptero(int helices, int aterrizaje, String volar, String despegar, String aterizar, String enciendido, String freno) {
        super(volar, despegar, aterizar, enciendido, freno);
        this.helices = helices;
        this.aterrizaje = aterrizaje;
    }

    public int getHelices() {
        return helices;
    }

    public void setHelices(int helices) {
        this.helices = helices;
    }

    public int getAterrizaje() {
        return aterrizaje;
    }

    public void setAterrizaje(int aterrizaje) {
        this.aterrizaje = aterrizaje;
    }
    
}

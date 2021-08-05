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
public class avion extends vehiculo_aereo {
    private int hora_de_salida;
    private int hora_de_entreda;
    public avion(String enciendido, String freno) {
        super(enciendido, freno);
    }

    public avion(int hora_de_salida, int hora_de_entreda, String enciendido, String freno) {
        super(enciendido, freno);
        this.hora_de_salida = hora_de_salida;
        this.hora_de_entreda = hora_de_entreda;
    }

    public avion(int hora_de_salida, int hora_de_entreda, String volar, String despegar, String aterizar, String enciendido, String freno) {
        super(volar, despegar, aterizar, enciendido, freno);
        this.hora_de_salida = hora_de_salida;
        this.hora_de_entreda = hora_de_entreda;
    }

    public int getHora_de_salida() {
        return hora_de_salida;
    }

    public void setHora_de_salida(int hora_de_salida) {
        this.hora_de_salida = hora_de_salida;
    }

    public int getHora_de_entreda() {
        return hora_de_entreda;
    }

    public void setHora_de_entreda(int hora_de_entreda) {
        this.hora_de_entreda = hora_de_entreda;
    }
    
}

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
public class vehiculo_aereo extends vehiculo {
    private String volar;
    private String despegar;
    private String aterizar;
    public vehiculo_aereo(String enciendido, String freno) {
        super(enciendido, freno);
    }

    public vehiculo_aereo(String volar, String despegar, String aterizar, String enciendido, String freno) {
        super(enciendido, freno);
        this.volar = volar;
        this.despegar = despegar;
        this.aterizar = aterizar;
    }

    public String getVolar() {
        return volar;
    }

    public void setVolar(String volar) {
        this.volar = volar;
    }

    public String getDespegar() {
        return despegar;
    }

    public void setDespegar(String despegar) {
        this.despegar = despegar;
    }

    public String getAterizar() {
        return aterizar;
    }

    public void setAterizar(String aterizar) {
        this.aterizar = aterizar;
    }
      @Override
     public void encender(){}
    @Override
    public void apagar (){}
    @Override
       public void acelerar(){}
    @Override
    public void frenar(){}
} 

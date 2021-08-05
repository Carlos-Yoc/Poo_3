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
public class vehiculo {
    private String enciendido, freno;

    public vehiculo(String enciendido, String freno) {
        this.enciendido = enciendido;
        this.freno = freno;
    }

    public String getEnciendido() {
        return enciendido;
    }

    public void setEnciendido(String enciendido) {
        this.enciendido = enciendido;
    }

    public String getFreno() {
        return freno;
    }

    public void setFreno(String freno) {
        this.freno = freno;
    }
    public void encender(){}
    public void apagar (){}
    public void acelerar(){}
    public void frenar(){}
}

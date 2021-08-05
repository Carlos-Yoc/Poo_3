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
public class automovil extends vehiculo_terestre {
    private String modelo;
    private String motor;
    public automovil(String enciendido, String freno) {
        super(enciendido, freno);
    }

    public automovil(String modelo, String motor, String enciendido, String freno) {
        super(enciendido, freno);
        this.modelo = modelo;
        this.motor = motor;
    }

    public automovil(String modelo, String motor, String llantas, int toneladas, String enciendido, String freno) {
        super(llantas, toneladas, enciendido, freno);
        this.modelo = modelo;
        this.motor = motor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }
    
}

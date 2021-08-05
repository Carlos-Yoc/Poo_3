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
public class vehiculo_terestre extends vehiculo {
    private String llantas;
    private int toneladas;

    public vehiculo_terestre(String enciendido, String freno) {
        super(enciendido, freno);
    }

    public vehiculo_terestre(String llantas, int toneladas, String enciendido, String freno) {
        super(enciendido, freno);
        this.llantas = llantas;
        this.toneladas = toneladas;
    }

    public int getToneladas() {
        return toneladas;
    }

    public void setToneladas(int toneladas) {
        this.toneladas = toneladas;
    }

    public String getLlantas() {
        return llantas;
    }

    public void setLlantas(String llantas) {
        this.llantas = llantas;
    }
    @Override
     public void encender(){
      System.out.println("Motor: "+getMotor());}
    @Override
    public void apagar (){}
    @Override
       public void acelerar(){}
    @Override
    public void frenar(){}

    private String getMotor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    
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
public class moto extends vehiculo_terestre {
     private String Tipo_de_llanta; 
     private String peso; 
            
    public moto(String enciendido, String freno) {
        super(enciendido, freno);
    }

    public moto(String Tipo_de_llanta, String peso, String enciendido, String freno) {
        super(enciendido, freno);
        this.Tipo_de_llanta = Tipo_de_llanta;
        this.peso = peso;
    }

    public moto(String Tipo_de_llanta, String peso, String llantas, int toneladas, String enciendido, String freno) {
        super(llantas, toneladas, enciendido, freno);
        this.Tipo_de_llanta = Tipo_de_llanta;
        this.peso = peso;
    }

    public String getTipo_de_llanta() {
        return Tipo_de_llanta;
    }

    public void setTipo_de_llanta(String Tipo_de_llanta) {
        this.Tipo_de_llanta = Tipo_de_llanta;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }
    
}

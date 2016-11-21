/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author awsilva
 */
public class Tipo {
    
    protected  String tipo1;
    protected  String tipo2; 
    
    public Tipo(String tipo1, String tipo2){
        this.tipo1 = tipo1;
        this.tipo2 = tipo2;
    }
    
    public String getTipo1() {
        return tipo1;
    }

    public void setTipo1(String tipo1) {
        this.tipo1 = tipo1;
    }

    public String getTipo2() {
        return tipo2;
    }

    public void setTipo2(String tipo2) {
        this.tipo2 = tipo2;
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicaNegocios;

/**
 *
 * @author MIGUEL
 */
public class tiquete {
    
    public tiquete(int fila, int asiento, vuelo vuel){
        this.fila = fila;
        this.asiento = asiento;
        this.vuel = vuel;
        this.numero = fila + asiento;
    }

    /**
     * @return the fila
     */
    public int getFila() {
        return fila;
    }

    /**
     * @param fila the fila to set
     */
    public void setFila(int fila) {
        this.fila = fila;
    }

    /**
     * @return the asiento
     */
    public int getAsiento() {
        return asiento;
    }

    /**
     * @param asiento the asiento to set
     */
    public void setAsiento(int asiento) {
        this.asiento = asiento;
    }
    
    public int getNumero(){
        return numero;
    }
    
    private int fila;
    private int asiento;
    private int numero;
    private vuelo vuel;
     
}

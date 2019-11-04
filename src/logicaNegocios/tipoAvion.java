/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicaNegocios;

/**
 *
 * @author Kike
 */
public class tipoAvion {

    private String id;
    private Integer anno;
    private String modelo;
    private String marca;
    private Integer canPasajeros;
    private Integer canFilas;
    private Integer asientosFila;

    public tipoAvion() {
        this.id = null;
        this.anno = 0;
        this.modelo = null;
        this.marca = null;
        this.canPasajeros = 0;
        this.canFilas = 0;
        this.asientosFila = 0;
    }

    public tipoAvion(String id, Integer anno, String modelo, String marca, Integer canPasajeros, Integer canFilas, Integer asientosFila) {
        this.id = id;
        this.anno = anno;
        this.modelo = modelo;
        this.marca = marca;
        this.canPasajeros = canPasajeros;
        this.canFilas = canFilas;
        this.asientosFila = asientosFila;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getAnno() {
        return anno;
    }

    public void setAnno(Integer anno) {
        this.anno = anno;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getCanPasajeros() {
        return canPasajeros;
    }

    public void setCanPasajeros(Integer canPasajeros) {
        this.canPasajeros = canPasajeros;
    }

    public Integer getCanFilas() {
        return canFilas;
    }

    public void setCanFilas(Integer canFilas) {
        this.canFilas = canFilas;
    }

    public Integer getAsientosFila() {
        return asientosFila;
    }

    public void setAsientosFila(Integer asientosFila) {
        this.asientosFila = asientosFila;
    }


}

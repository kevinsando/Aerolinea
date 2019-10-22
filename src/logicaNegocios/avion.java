package logicaNegocios;

public class avion {

    String ID;
    int anno;
    String modelo;
    String marca;
    int cantPasajeros;
    int cantFil;
    int cantCol;
    int cantAsientosFilas;

    public avion() {
        this.ID = null;
        this.anno = 0;
        this.modelo = null;
        this.marca = null;
        this.cantPasajeros = 0;
        this.cantFil = 0;
        this.cantCol = 0;
        this.cantAsientosFilas = 0;
    }

    public avion(String ID, int anno, String modelo, String marca, int cantPasajeros, int cantFil, int cantCol, int cantAsientosFilas) {
        this.ID = ID;
        this.anno = anno;
        this.modelo = modelo;
        this.marca = marca;
        this.cantPasajeros = cantPasajeros;
        this.cantFil = cantFil;
        this.cantCol = cantCol;
        this.cantAsientosFilas = cantAsientosFilas;
    }

    public String getID() {
        return ID;
    }

    public int getAnno() {
        return anno;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public int getCantPasajeros() {
        return cantPasajeros;
    }

    public int getCantFil() {
        return cantFil;
    }

    public int getCantCol() {
        return cantCol;
    }

    public int getCantAsientosFilas() {
        return cantAsientosFilas;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCantPasajeros(int cantPasajeros) {
        this.cantPasajeros = cantPasajeros;
    }

    public void setCantFil(int cantFil) {
        this.cantFil = cantFil;
    }

    public void setCantCol(int cantCol) {
        this.cantCol = cantCol;
    }

    public void setCantAsientosFilas(int cantAsientosFilas) {
        this.cantAsientosFilas = cantAsientosFilas;
    }
    
    

}

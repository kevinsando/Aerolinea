package logicaNegocios;


public class tiquete {
    
    public tiquete(int fila, int asiento, vuelo vuel){
        this.fila = fila;
        this.asiento = asiento;
        this.vuel = vuel;
        this.numero = fila + asiento;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getAsiento() {
        return asiento;
    }

    
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

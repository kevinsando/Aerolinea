package logicaNegocios;


public class tiquete {
    
    public tiquete(int fila, int asiento, String vuel){
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

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setVuel(String vuel) {
        this.vuel = vuel;
    }

    public String getVuel() {
        return vuel;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "tiquete{" + "fila=" + fila + ", asiento=" + asiento + ", numero=" + numero + ", vuelo=" + vuel + ", usuario=" + usuario + ", precio=" + precio + '}';
    }
    
    
    
    private int fila;
    private int asiento;
    private int numero;
    private String vuel;
    private String usuario;
    private int precio;
    
     
}

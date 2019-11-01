package logicaNegocios;

public class ruta {
    private String ID;
    private String origen;
    private String destino;
    private float duracion;

    public ruta(String ID, String origen, String destino, float duracion) {
        this.ID = ID;
        this.origen = origen;
        this.destino = destino;
        this.duracion = duracion;
    }

    public ruta() {
    }

    public String getID() {
        return ID;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public float getDuracion() {
        return duracion;
    }
    
    
}

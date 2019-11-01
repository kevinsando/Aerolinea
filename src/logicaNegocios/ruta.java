package logicaNegocios;

public class ruta {

    private String ID;
    private String origen;
    private String destino;
    private int duracion;

    public ruta(String ID, String origen, String destino, int duracion) {
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

    public int getDuracion() {
        return duracion;
    }

    @Override
    public String toString() {
        return "ruta{" + "ID=" + ID + ", origen=" + origen + ", destino=" + destino + ", duracion=" + duracion + '}';
    }

}

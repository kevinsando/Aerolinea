package logicaNegocios;

public class ruta {

    private String ID;
    private String origen;
    private String destino;
    private int duracionH;//duracion Hora
    private int duracionM;//Duracion Minutos

    public ruta(String ID, String origen, String destino, int duracionH,int duracionM) {
        this.ID = ID;
        this.origen = origen;
        this.destino = destino;
        this.duracionH = duracionH;
        this.duracionM=duracionM;
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

    public int getDuracionH() {
        return duracionH;
    }
    public int getDuracionM(){
        return duracionM;
    }
    @Override
    public String toString() {
        return "ruta{" + "ID=" + ID + ", origen=" + origen + ", destino=" + destino + ", duracion=" + duracionH +':'+duracionM+ '}';
    }

}

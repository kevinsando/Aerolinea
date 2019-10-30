package logicaNegocios;

public class vuelo {
    boolean ida;
    boolean regreso;
    String origen;
    String destino;
    String fechaIda;
    String fechaRegreso;
    avion avion;

    public vuelo() {
        this.ida = false;
        this.regreso = false;
        this.origen = null;
        this.destino = null;
        this.fechaIda = null;
        this.fechaRegreso = null;
       // this.avion = null;
    }

    public vuelo(boolean ida, boolean regreso, String origen, String destino, String fechaIda, String fechaRegreso) {
        this.ida = ida;
        this.regreso = regreso;
        this.origen = origen;
        this.destino = destino;
        this.fechaIda = fechaIda;
        this.fechaRegreso = fechaRegreso;
        //this.avion = avion;
    }

    public boolean isIda() {
        return ida;
    }

    public boolean isRegreso() {
        return regreso;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public String getFechaIda() {
        return fechaIda;
    }

    public String getFechaRegreso() {
        return fechaRegreso;
    }

    /*public avion getAvion() {
        return avion;
    }*/

    public void setIda(boolean ida) {
        this.ida = ida;
    }

    public void setRegreso(boolean regreso) {
        this.regreso = regreso;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setFechaIda(String fechaIda) {
        this.fechaIda = fechaIda;
    }

    public void setFechaRegreso(String fechaRegreso) {
        this.fechaRegreso = fechaRegreso;
    }

  /*  public void setAvion(avion avion) {
        this.avion = avion;
    }*/
    
    
    
}

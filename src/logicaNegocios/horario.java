package logicaNegocios;


public class horario {
    String id;
    String dia;
    int hora;
    int minutos;
    int horaLlegada;
    int minutosLlegada;
    int precio;
    int descuento;
    String ruta;

    public horario() {
    }

    public horario(String id, String dia, int hora, int minutos,int horaLlegada,int minutosLlegada, int precio, int descuento, String ruta) {
        this.id = id;
        this.dia = dia;
        this.hora = hora;
        this.minutos = minutos;
        this.horaLlegada=horaLlegada;
        this.minutosLlegada=minutosLlegada;
        this.precio = precio;
        this.descuento = descuento;
        this.ruta = ruta;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public int getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(int horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public int getMinutosLlegada() {
        return minutosLlegada;
    }

    public void setMinutosLlegada(int minutosLlegada) {
        this.minutosLlegada = minutosLlegada;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getId() {
        return id;
    }

    public String getDia() {
        return dia;
    }

    public int getHora() {
        return hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getPrecio() {
        return precio;
    }

    public int getDescuento() {
        return descuento;
    }

    public String getRuta() {
        return ruta;
    }

    @Override
    public String toString() {
        return "horario{" + "id=" + id + ", dia=" + dia + ", hora=" + hora + ", minutos=" + minutos + ", precio=" + precio + ", descuento=" + descuento + ", ruta=" + ruta + '}';
    }
    
    
}

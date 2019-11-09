package logicaNegocios;

public class vuelo {

    String codigo;
    int tipo;
    String avionIda;
    String avionRegreso;
    String origen;
    String destino;
    String diaSemana;
    String hora;
    String minutos;
    String horaLlegada;
    String minutosLlegada;
    String pasajeros;
    String descuento;
    String idHorario;//NUEVO ATRIBUTO

    public vuelo(String codigo, int tipo, String avionIda, String avionRegreso, String idHorario) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.avionIda = avionIda;
        this.avionRegreso = avionRegreso;
        this.idHorario = idHorario;
    }

    public String getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(String idHorario) {
        this.idHorario = idHorario;
    }

    public vuelo(String codigo, int tipo, String origen, String destino, String diaSemana, String hora, String minutos, String horaLlegada, String minutosLlegada, String pasajeros, String desc) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.origen = origen;
        this.destino = destino;
        this.diaSemana = diaSemana;
        this.hora = hora;
        this.minutos = minutos;
        this.horaLlegada = horaLlegada;
        this.minutosLlegada = minutosLlegada;
        this.pasajeros = pasajeros;
        this.descuento = desc;
    }

    public vuelo() {
        this.codigo = null;
        this.tipo = 0;
        this.avionIda = null;
        this.avionRegreso = null;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescuento() {
        return descuento;
    }

    public void setDescuento(String descuento) {
        this.descuento = descuento;
    }

    public int getTipo() {
        return tipo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getMinutos() {
        return minutos;
    }

    public void setMinutos(String minutos) {
        this.minutos = minutos;
    }

    public String getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(String horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public String getMinutosLlegada() {
        return minutosLlegada;
    }

    public void setMinutosLlegada(String minutosLlegada) {
        this.minutosLlegada = minutosLlegada;
    }

    public String getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(String pasajeros) {
        this.pasajeros = pasajeros;
    }

    public String getAvionIda() {
        return avionIda;
    }

    public String getAvionRegreso() {
        return avionRegreso;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public void setAvionIda(String avionIda) {
        this.avionIda = avionIda;
    }

    public void setAvionRegreso(String avionRegreso) {
        this.avionRegreso = avionRegreso;
    }

    @Override
    public String toString() {
        return "vuelo{" + "codigo=" + codigo + ", tipo=" + tipo + ", avionIda=" + avionIda + ", avionRegreso=" + avionRegreso + ", origen=" + origen + ", destino=" + destino + ", diaSemana=" + diaSemana + ", hora=" + hora + ", minutos=" + minutos + ", horaLlegada=" + horaLlegada + ", minutosLlegada=" + minutosLlegada + ", pasajeros=" + pasajeros + ", descuento=" + descuento + '}';
    }

}

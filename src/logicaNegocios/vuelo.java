package logicaNegocios;

public class vuelo {

    String codigo;
    int tipo;
    String avionIda;
    String avionRegreso;
    String horarioRegreso;
    String horarioIda;

    public vuelo(String codigo, int tipo, String avionIda, String avionRegreso, String horarioRegreso, String horarioIda) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.avionIda = avionIda;
        this.avionRegreso = avionRegreso;
        this.horarioRegreso = horarioRegreso;
        this.horarioIda = horarioIda;
    }
    public vuelo() {
        this.codigo = null;
        this.tipo = 0;
        this.avionIda = null;
        this.avionRegreso = null;
        this.horarioRegreso = null;
        this.horarioIda = null;
    }

   

    public String getCodigo() {
        return codigo;
    }

    public int getTipo() {
        return tipo;
    }

    public String getAvionIda() {
        return avionIda;
    }

    public String getAvionRegreso() {
        return avionRegreso;
    }

    public String getHorarioRegreso() {
        return horarioRegreso;
    }

    public String getHorarioIda() {
        return horarioIda;
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

    public void setHorarioRegreso(String horarioRegreso) {
        this.horarioRegreso = horarioRegreso;
    }

    public void setHorarioIda(String horarioIda) {
        this.horarioIda = horarioIda;
    }

    

}

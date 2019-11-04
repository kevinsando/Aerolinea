package logicaNegocios;

public class avion {

    String ID;
   tipoAvion tipoAvion;

    public avion() {
        this.ID = null;
       this.tipoAvion=null;
    }

    public avion(String ID,tipoAvion tipAv) {
        this.ID = ID;
        this.tipoAvion=tipAv;
    }

    public String getID() {
        return ID;
    }
    public void setID(String id)
    {
        ID=id;
    }
    public tipoAvion getTipoAvion() {
        return tipoAvion;
    }

    public void setTipoAvion(tipoAvion tipoAvion) {
        this.tipoAvion = tipoAvion;
    }

   
    

}

package logicaNegocios;

public class avion {

    String ID;
   tipoAvion tipoAvion;
   boolean asientos[][];

    public avion() {
        this.ID = null;
       this.tipoAvion=null;
       this.asientos = new boolean[6][13];
       for(int i = 0; i < 6; i++){
           for(int j = 0; j < 13; j++){
               asientos[i][j] = true;
           }
       }
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
    
    public boolean getAsiento(int i, int j){
        return asientos[i][j];
    }

    public void setAsiento(int i, int j){
        asientos[i][j] = false;
    }
    

}

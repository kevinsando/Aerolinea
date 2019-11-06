package logicaNegocios;

public class avion {

    String ID; 
    String idHorario;
    String idRuta;
    String identificadorAv;
   boolean asientos[][];

    public avion() {
        this.ID = null;
        this.identificadorAv=null;
        this.idHorario=null;
        this.idRuta=null;
       this.asientos = new boolean[6][13];
       for(int i = 0; i < 6; i++){
           for(int j = 0; j < 13; j++){
               asientos[i][j] = true;
           }
       }
    }

    public avion(String ID, String idHorario, String idRuta, String identificadorAv) {
        this.ID = ID;
        this.idHorario = idHorario;
        this.idRuta = idRuta;
        this.identificadorAv = identificadorAv;
    }

    
    public String getIdentificadorAv() {
        return identificadorAv;
    }

    public void setIdentificadorAv(String identificadorAv) {
        this.identificadorAv = identificadorAv;
    }

    public String getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(String idHorario) {
        this.idHorario = idHorario;
    }

    public String getIdRuta() {
        return idRuta;
    }

    public void setIdRuta(String idRuta) {
        this.idRuta = idRuta;
    }



    public String getID() {
        return ID;
    }
    public void setID(String id)
    {
        ID=id;
    }

  
    
    public boolean getAsiento(int i, int j){
        return asientos[i][j];
    }

    public void setAsiento(int i, int j){
        asientos[i][j] = false;
    }
    

}

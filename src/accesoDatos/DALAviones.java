package accesoDatos;

import java.util.ArrayList;
import logicaNegocios.avion;

public class DALAviones {

    private static DALAviones mInstance;
    private ArrayList<avion> al;

    public static DALAviones getInstance() {
        if (mInstance == null) {
            mInstance = new DALAviones();
        }

        return mInstance;
    }

    public DALAviones() {
        al = new ArrayList<avion>();

    }

    public void insertar(avion a) {//Listo
        al.add(a);
    }

    public void eliminar(avion a) {
        al.remove(a);
    }

    public void actualizar(int pos, avion a) {
        al.set(pos, a);
    }
//    public int consultar(int v){
//      int pos=0;  
//      for(Integer value: al){
//        if(value.intValue()==v){
//          return pos;
//        }
//        pos++;
//      }
//      return pos;
//    }

    public int consultar(avion a) {
        return al.indexOf(a);
    }

    public avion consultar(int index) {
        return al.get(index);

    }

//    public avion consultaID(String id) {
//        avion a= null;
//        for (int i = 0; i < al.size(); i++) {
//            if (al.get(i).getId() == id) {
//                e = al.get(i);
//            }
//        }
//        return e;
//    }
    public ArrayList listar() {
        return al;
    }

    public void add(avion a) {
        al.add(a);
    }

}

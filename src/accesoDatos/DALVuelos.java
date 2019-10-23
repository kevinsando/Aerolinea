package accesoDatos;

import java.util.ArrayList;
import logicaNegocios.vuelo;

public class DALVuelos {
        private static DALVuelos mInstance;
    private ArrayList<vuelo> al;

    public static DALVuelos getInstance() {
        if (mInstance == null) {
            mInstance = new DALVuelos();
        }

        return mInstance;
    }

    public DALVuelos() {
        al = new ArrayList<vuelo>();

    }

    public void insertar(vuelo a) {//Listo
        al.add(a);
    }

    public void eliminar(vuelo a) {
        al.remove(a);
    }

    public void actualizar(int pos, vuelo a) {
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

    public int consultar(vuelo a) {
        return al.indexOf(a);
    }

    public vuelo consultar(int index) {
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

    public void add(vuelo a) {
        al.add(a);
    }
}

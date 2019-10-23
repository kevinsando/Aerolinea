package accesoDatos;

import java.util.ArrayList;
import logicaNegocios.ruta;

public class DALRutas {

    private static DALRutas mInstance;
    private ArrayList<ruta> al;

    public static DALRutas getInstance() {
        if (mInstance == null) {
            mInstance = new DALRutas();
        }

        return mInstance;
    }

    public DALRutas() {
        al = new ArrayList<ruta>();

    }

    public void insertar(ruta a) {//Listo
        al.add(a);
    }

    public void eliminar(ruta a) {
        al.remove(a);
    }

    public void actualizar(int pos, ruta a) {
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

    public int consultar(ruta a) {
        return al.indexOf(a);
    }

    public ruta consultar(int index) {
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

    public void add(ruta a) {
        al.add(a);
    }

}

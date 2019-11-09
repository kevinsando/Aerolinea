
package presentacion;
import Excepciones.GlobalException;
import Excepciones.NoDataException;
import control.controlador;
import logicaNegocios.modelo;
public class Aerolinea {

    public static void main(String[] args) throws GlobalException, NoDataException {
        publico inicio = new publico();
        usuarioA user = new usuarioA();
        administracion admin = new administracion();
        modelo model = new modelo();
        crearCuenta  cc = new crearCuenta();
        gestionRutas gr = new gestionRutas();
        gestionTipoAviones ga = new gestionTipoAviones();
        gestionHorarios gh = new gestionHorarios();
        gestionAvion gaa = new gestionAvion();
        gestionVuelos gv = new gestionVuelos();
        reservaAsientos ra = new reservaAsientos();
        controlador control = new controlador(user,inicio,model,cc,admin,gr,ga,gh);
        carrito car = new carrito();
        control.setReservaAsientos(ra);
        control.setGaa(gaa);
        control.setGv(gv);
        control.setCarrito(car);
        inicio.setLocationRelativeTo(null);
        inicio.setVisible(true);
    }
    
}

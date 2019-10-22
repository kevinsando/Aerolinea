
package presentacion;
import control.controlador;
import logicaNegocios.modelo;
public class Aerolinea {

    public static void main(String[] args) {
        publico inicio = new publico();
        usuario user = new usuario();
        modelo model = new modelo();
        crearCuenta  cc = new crearCuenta();
        controlador control = new controlador(user,inicio,model,cc);
        
        inicio.setVisible(true);
    }
    
}

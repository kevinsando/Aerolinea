package control;

import logicaNegocios.modelo;
import presentacion.crearCuenta;
import presentacion.publico;
import presentacion.usuario;

public class controlador {
    
    usuario user;
    publico inicio;
    modelo model;
    crearCuenta creaC;



    public controlador(usuario user, publico inicio, modelo model, crearCuenta cc) {
         this.user = user;
        this.inicio = inicio;
        this.model = model;
        this.creaC = cc;
        
        user.setModelo(model);
        user.setControl(this);
        inicio.setModel(model);
        inicio.setControl(this);
    }
   
    public void login() {
        user.setVisible(true);
        
    }
    
    public void newCuenta(){
        user.setVisible(false);
        creaC.setVisible(true);
    }
    
}

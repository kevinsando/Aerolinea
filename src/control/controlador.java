package control;

import logicaNegocios.modelo;
import presentacion.administracion;
import presentacion.crearCuenta;
import presentacion.publico;
import presentacion.usuario;

public class controlador {
    
    usuario user;
    publico inicio;
    modelo model;
    crearCuenta creaC;
    administracion admin;


    public controlador(usuario user, publico inicio, modelo model, crearCuenta cc,administracion a) {
         this.user = user;
        this.inicio = inicio;
        this.model = model;
        this.creaC = cc;
        this.admin =a;
        user.setModelo(model);
        user.setControl(this);
        inicio.setModel(model);
        inicio.setControl(this);
        admin.setControl(this);
    }
   
    public void login() {
        user.setVisible(true);
        
    }
    
    public void newCuenta(){
        user.setVisible(false);
        creaC.setVisible(true);
    }
    public void cargarAdmin(){
        admin.setVisible(true);
    }
    public void crearUsuario(usuario u) {
        model.crearUsuario(u);
    }
    public void buscarUsuario(String usuario, String password){
        model.buscarUsuario(usuario,password);
    }
    
}

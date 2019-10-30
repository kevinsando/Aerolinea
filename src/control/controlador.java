package control;

import Excepciones.GlobalException;
import Excepciones.NoDataException;
import java.sql.SQLException;
import java.util.ArrayList;
import logicaNegocios.modelo;
import logicaNegocios.usuario;
import presentacion.administracion;
import presentacion.crearCuenta;
import presentacion.publico;
import presentacion.usuarioA;

public class controlador {
    
    usuarioA user;
    publico inicio;
    modelo model;
    crearCuenta creaC;
    administracion admin;


    public controlador(usuarioA user, publico inicio, modelo model, crearCuenta cc,administracion a) {
         this.user = user;
        this.inicio = inicio;
        this.model = model;
        this.creaC = cc;
        this.admin =a;
        this.user.setModelo(model);
        this.user.setControl(this);
        this.inicio.setModel(model);
        this.inicio.setControl(this);
        this.admin.setControl(this);
        this.creaC.setModelo(model);
        this.creaC.setControl(this);
    }
   
    public void login() {
        user.setVisible(true);
        creaC.setVisible(false);
    }
    
    public void newCuenta(){
        user.setVisible(false);
        creaC.setVisible(true);
    }
    public void cargarAdmin(){
        admin.setVisible(true);
    }
    public void crearUsuario(usuario u) throws GlobalException, NoDataException {
        model.crearUsuario(u);
    }
    public usuario buscarUsuario(String usuario, String password) throws GlobalException, NoDataException, SQLException{
        return model.buscarUsuario(usuario,password);
    }
    public void iniciar(){
        inicio.setVisible(true);
        creaC.setVisible(false);
    }
    public void setUsuarioInicio(usuario u){
        inicio.setUsuario(u);
    }
    public ArrayList listarVuelos() throws GlobalException, NoDataException{
        return model.listarVuelo();
    }
    
}

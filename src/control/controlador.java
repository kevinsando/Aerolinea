package control;

import Excepciones.GlobalException;
import Excepciones.NoDataException;
import java.sql.SQLException;
import java.util.ArrayList;
import logicaNegocios.horario;
import logicaNegocios.modelo;
import logicaNegocios.ruta;
import logicaNegocios.usuario;
import presentacion.administracion;
import presentacion.crearCuenta;
import presentacion.gestionHorarios;
import presentacion.gestionRutas;
import presentacion.gestionTipoAviones;
import presentacion.publico;
import presentacion.usuarioA;

public class controlador {

    usuarioA user;
    publico inicio;
    modelo model;
    crearCuenta creaC;
    administracion admin;
    gestionRutas gr;
    gestionTipoAviones ga;
    gestionHorarios gh;

    public controlador(usuarioA user, publico inicio, modelo model, crearCuenta cc, administracion a, gestionRutas gr, gestionTipoAviones ga,gestionHorarios gh) {
        this.user = user;
        this.inicio = inicio;
        this.model = model;
        this.creaC = cc;
        this.admin = a;
        this.ga = ga;
        this.gh = gh;
        this.user.setModelo(model);
        this.user.setControl(this);
        this.inicio.setModel(model);
        this.inicio.setControl(this);
        this.admin.setControl(this);
        this.creaC.setModelo(model);
        this.creaC.setControl(this);
        this.gr = gr;
        this.ga.setControl(this);
        this.gh.setControl(this);
        gr.setControl(this);
    }

    public void login() {
        user.setVisible(true);
        creaC.setVisible(false);
    }

    public void newCuenta() {
        user.setVisible(false);
        creaC.setVisible(true);
    }

    public void gestionRutas() {
        gr.setVisible(true);
        admin.setVisible(false);
    }

    public void gestionAviones() {
        ga.setVisible(true);
        admin.setVisible(false);
    }
    public void gestionHorarios(){
        gh.setVisible(true);
        admin.setVisible(false);
    }

    public void cargarAdmin() {

        admin.setVisible(true);
        gr.setVisible(false);
    }

    public void crearUsuario(usuario u) throws GlobalException, NoDataException {
        model.crearUsuario(u);
    }

    public usuario buscarUsuario(String usuario, String password) throws GlobalException, NoDataException, SQLException {
        return model.buscarUsuario(usuario, password);
    }

    public void iniciar() {
        inicio.setVisible(true);
        creaC.setVisible(false);
    }

    public void setUsuarioInicio(usuario u) {
        inicio.setUsuario(u);
    }

    public void insertarTipoAvion(String id, Integer año, String modelo, String marca, Integer canPasajeros, 
            Integer canFilas, Integer asientosFila) throws GlobalException, NoDataException {
        model.insertarTipoAvion(id, año, modelo, marca, canPasajeros, canFilas, asientosFila);
    }

    public ArrayList listarTipoAvion() throws GlobalException, NoDataException {
        return model.listarTipoAvion();
    }

    public void modificarTipoAvion(String id, Integer año, String modelo, String marca, Integer canPasajeros, Integer canFilas, Integer asientosFila) throws GlobalException, NoDataException {
        model.modificarTipoAvion(id, año, modelo, marca, canPasajeros, canFilas, asientosFila);
    }

    public void eliminarEspTipo(String text) throws GlobalException, NoDataException {
        model.eliminarEspTipo(text);
    }

    public ArrayList listarVuelos() throws GlobalException, NoDataException {
        return model.listarVuelo();
    }

    public ArrayList listarRuta() throws GlobalException, NoDataException {
        return model.listarRuta();
    }

    public void insertarRuta(String id, String ori, String des, int dura) throws GlobalException, NoDataException {
        model.insertarRuta(id, ori, des, dura);
    }

    public void modificarRuta(String id, String ori, String des, int dura) throws GlobalException, NoDataException, SQLException {
        model.modificarRuta(id, ori, des, dura);
    }

    public void eliminarRutas() throws GlobalException, NoDataException {
        model.eliminarRutas();
    }

    public void eliminarEspRuta(String id) throws GlobalException, NoDataException {
        model.eliminarEspRuta(id);
    }

    public ruta consultarRuta(String id) throws GlobalException, NoDataException, SQLException {
        return model.consultarRuta(id);
    }
    
       public void insertarHorario(String id, String dia, int hora, int minutos, int precio, int descuento, String ruta) throws GlobalException, NoDataException{
        model.insertarHorario(id, dia,hora, minutos,precio,descuento,ruta);
    }
    public horario consultarHorario(String id){
        horario h=null;
        
        return h;
    }
    public void eliminarHorario(String id) throws GlobalException, NoDataException{
        model.eliminarHorario(id);
    }
    public ArrayList<horario> listarHorario() throws GlobalException, NoDataException{
        return model.listarHorario();
    }

}

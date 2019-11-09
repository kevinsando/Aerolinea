package control;

import Excepciones.GlobalException;
import Excepciones.NoDataException;
import accesoDatos.ServicioAerolinea;
import java.sql.SQLException;
import java.util.ArrayList;
import logicaNegocios.avion;
import logicaNegocios.horario;
import logicaNegocios.modelo;
import logicaNegocios.ruta;
import logicaNegocios.tiquete;
import logicaNegocios.usuario;
import logicaNegocios.vuelo;
import presentacion.administracion;
import presentacion.carrito;
import presentacion.crearCuenta;
import presentacion.gestionAvion;
import presentacion.gestionHorarios;
import presentacion.gestionRutas;
import presentacion.gestionTipoAviones;
import presentacion.gestionVuelos;
import presentacion.publico;
import presentacion.reservaAsientos;
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
    gestionVuelos gv;
    reservaAsientos ra;
    gestionAvion gaa;
    carrito carrito;

    public controlador(usuarioA user, publico inicio, modelo model, crearCuenta cc, administracion a, gestionRutas gr, gestionTipoAviones ga, gestionHorarios gh) {
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

    public void setReservaAsientos(reservaAsientos ra) {
        this.ra = ra;
        this.ra.setControl(this);
    }

    public void setGaa(gestionAvion gaa) {
        this.gaa = gaa;
        gaa.setControl(this);
        admin.setLocationRelativeTo(null);
        admin.setVisible(false);
    }

    public void setGv(gestionVuelos gv) {
        this.gv = gv;
        this.gv.setControl(this);
    }

    public void setCarrito(carrito carrito) {
        this.carrito = carrito;
        carrito.setControl(this);
    }
    

    public void login() {
        user.setLocationRelativeTo(null);
        user.setVisible(true);
        creaC.setVisible(false);
    }

    public void newCuenta() {
        creaC.setLocationRelativeTo(null);
        user.setVisible(false);
        creaC.setVisible(true);
    }

    public void gestionRutas() {
        gr.setLocationRelativeTo(null);
        gr.setVisible(true);
        admin.setVisible(false);
    }

    public void gestionTipoAviones() {
        ga.setLocationRelativeTo(null);
        ga.setVisible(true);
        admin.setVisible(false);
    }

    public void gestionAvion() {
        gaa.setLocationRelativeTo(null);
        gaa.setVisible(true);
        admin.setVisible(false);
    }

    public void gestionHorarios() {
        gh.setLocationRelativeTo(null);
        gh.setVisible(true);
        admin.setVisible(false);
    }

    public void gestionVuelos() {
        gv.setLocationRelativeTo(null);
        gv.setVisible(true);
    }

    public void cargarAdmin() {
        admin.setLocationRelativeTo(null);
        admin.setVisible(true);
        gr.setVisible(false);
        gh.setVisible(false);
        ga.setVisible(false);
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
        admin.setVisible(false);
    }

    public void setUsuarioInicio(usuario u) {
        inicio.setUsuario(u);
        ra.setUs(u.getUser());
        avion aa = new avion();
        vuelo vv = new vuelo();
        ra.setAv(aa);
        ra.setVu(vv.getCodigo(),u.getUser());
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

    public ArrayList<vuelo> listarVuelos() throws GlobalException, NoDataException {
        return model.listarVuelo();

    }
    public ArrayList<vuelo> listarVuelos2() throws GlobalException, NoDataException{
        return model.listarVuelo2();
    }

    public ArrayList listarRuta() throws GlobalException, NoDataException {
        return model.listarRuta();
    }

    public void insertarRuta(String id, String ori, String des, int duraH,int duraM) throws GlobalException, NoDataException {
        model.insertarRuta(id, ori, des, duraH,duraM);
    }

    public void modificarRuta(String id, String ori, String des, int duraH,int duraM) throws GlobalException, NoDataException, SQLException {
        model.modificarRuta(id, ori, des, duraH,duraM);
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

    public void insertarHorario(String id, String dia, int hora, int minutos,int horaLl,int minutosLl, int precio, int descuento, String ruta) throws GlobalException, NoDataException {
        model.insertarHorario(id, dia, hora, minutos,horaLl,minutosLl, precio, descuento, ruta);
    }

    public horario consultarHorario(String id) {
        horario h = null;

        return h;
    }

    public void eliminarHorario(String id) throws GlobalException, NoDataException {
        model.eliminarHorario(id);
    }

    public ArrayList<horario> listarHorario() throws GlobalException, NoDataException {
        return model.listarHorario();

    }

    public void modificarHorario(String id, String dia, int hora, int minutos,int horaLl,int minutosLl, int precio, int descuento, String ruta) throws NoDataException, GlobalException {
        model.modificarHorario(id, dia, hora, minutos,horaLl,minutosLl, precio, descuento, ruta);
    }

    public void reservarAsientos() {
        ra.setVisible(true);
        //inicio.setVisible(false);
    }

    public void llenarReservaAsientos(vuelo v,String u) {
        ra.setVu(v.getCodigo(),u);
        System.out.println("USUARIO: "+u);
    }

    public void ingresarAvion(String id, String horario, String ruta, String avion) throws GlobalException, NoDataException {
        avion aux;
        aux = model.insertarAvion(id, horario, ruta, avion);
        ra.setAv(aux);

    }

    public void modificarAvion(String id, String horario, String ruta, String avion) throws GlobalException, NoDataException {
        model.modificarAvion(id, horario, ruta, avion);
    }

    public void eliminarAvion(String id) throws GlobalException, NoDataException {
        model.eliminarAvion(id);
    }

    public ArrayList listarAviones() throws GlobalException, NoDataException {
        return model.listarAvion();
    }

    public void agregarVuelos(String ida, String regreso, String codigo, int tipo) throws GlobalException, NoDataException, SQLException {
        model.insertarVuelo(ida, regreso, codigo, tipo);
    }
    
    public void mostrarCarrito(tiquete t) {
        carrito.setTiquete(t);
        carrito.cargarDatos();
        carrito.setVisible(true);
        
    }
        public void insertarTiquete(int fila,int asiento,int numero,String vuelo,String usuario, int precio) throws GlobalException, NoDataException{
        model.insertarTiquete(fila, asiento, numero, vuelo, usuario, precio);
    }
    public void modificarTiquete(int fila,int asiento,int numero,String vuelo,String usuario, int precio) throws GlobalException, NoDataException, SQLException{
        model.insertarTiquete(fila, asiento, numero, vuelo, usuario, precio);
        
    }

}

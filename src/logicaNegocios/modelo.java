package logicaNegocios;

import accesoDatos.DALAviones;
import accesoDatos.DALRutas;
import accesoDatos.DALUsuarios;
import accesoDatos.DALVuelos;
import java.util.ArrayList;
import java.util.Observable;

public class modelo extends Observable {

    public static void crearUsuario(presentacion.usuario u) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    DALAviones aviones;
    DALRutas rutas;
    DALUsuarios usuarios;
    DALVuelos vuelos;

    avion avion;
    ruta ruta;
    usuario usuario;
    vuelo vuelo;

    public modelo() {
        aviones = new DALAviones();
        rutas = new DALRutas();
        usuarios = new DALUsuarios();
        vuelos = new DALVuelos();
        avion = new avion();
        ruta = new ruta();
        usuario = new usuario();
        vuelo = new vuelo();
    }

    public avion getAvion() {
        return avion;
    }

    public ruta getRuta() {
        return ruta;
    }

    public usuario getUsuario() {
        return usuario;
    }

    public vuelo getVuelo() {
        return vuelo;
    }

    @Override
    public void addObserver(java.util.Observer o) {
        super.addObserver(o);
        setChanged();
        notifyObservers(null);
    }

    public ArrayList listarAvion() {

        this.setChanged();
        this.notifyObservers(null);
        return aviones.getInstance().listar();
    }

    //--------------------------------------------------------------------------
    public void insertarAvion(avion a) {
        aviones.getInstance().insertar(a);
        this.setChanged();
        this.notifyObservers(null);
    }

    public void modificarAvion(int pos, String id, String nombre, String edad, char sex) {
        //int pos = DAL.getInstance().consultar(e);
        avion aa = new avion();
        aviones.getInstance().actualizar(pos, aa);
        this.setChanged();
        this.notifyObservers(null);
    }

    public void eliminarAvion() {
        aviones.getInstance().eliminar(getAvion());
        this.setChanged();
        this.notifyObservers(null);
    }

    public void eliminarEspAvion(int pos) {
        avion aa = (avion) aviones.getInstance().listar().get(pos);
        aviones.getInstance().eliminar(aa);
    }

    public int consultarAvion(avion a) {
        this.setChanged();
        this.notifyObservers(null);
        return aviones.getInstance().consultar(a);

    }

    public void agregarAvion(String id, String nombre, String edad, char sexo) {
        avion a1 = new avion();
        aviones.getInstance().insertar(a1);
        System.out.println(listarAvion().toString());
    }

    //--------------------------------------------------------------------------
    public ArrayList listarRuta() {

        this.setChanged();
        this.notifyObservers(null);
        return aviones.getInstance().listar();
    }

    public void insertarRuta(ruta r) {
        rutas.getInstance().insertar(r);
        this.setChanged();
        this.notifyObservers(null);
    }

    public void modificarRuta(int pos, String id, String nombre, String edad, char sex) {
        //int pos = DAL.getInstance().consultar(e);
        ruta rr = new ruta();
        rutas.getInstance().actualizar(pos, rr);
        this.setChanged();
        this.notifyObservers(null);
    }

    public void eliminarRuta() {
        rutas.getInstance().eliminar(getRuta());
        this.setChanged();
        this.notifyObservers(null);
    }

    public void eliminarEspRuta(int pos) {
        ruta rr = (ruta) rutas.getInstance().listar().get(pos);
        rutas.getInstance().eliminar(rr);
    }

    public int consultarRuta(ruta r) {
        this.setChanged();
        this.notifyObservers(null);
        return rutas.getInstance().consultar(r);

    }

    public void agregarRuta(String id, String nombre, String edad, char sexo) {
        ruta r1 = new ruta();
        rutas.getInstance().insertar(r1);
        System.out.println(listarRuta().toString());
    }

    //--------------------------------------------------------------------------
    public ArrayList listarUsuario() {

        this.setChanged();
        this.notifyObservers(null);
        return usuarios.getInstance().listar();
    }

    public void insertarUsuario(usuario u) {
        usuarios.getInstance().insertar(u);
        this.setChanged();
        this.notifyObservers(null);
    }

    public void modificarUsuario(int pos, String id, String nombre, String edad, char sex) {
        //int pos = DAL.getInstance().consultar(e);
        usuario uu = new usuario();
        usuarios.getInstance().actualizar(pos, uu);
        this.setChanged();
        this.notifyObservers(null);
    }

    public void eliminarUsuario() {
        usuarios.getInstance().eliminar(getUsuario());
        this.setChanged();
        this.notifyObservers(null);
    }

    public void eliminarEspUsuario(int pos) {
        usuario uu = (usuario) usuarios.getInstance().listar().get(pos);
        usuarios.getInstance().eliminar(uu);
    }

    public int consultarUsuario(usuario u) {
        this.setChanged();
        this.notifyObservers(null);
        return usuarios.getInstance().consultar(u);

    }

    public void agregarUsuario(String id, String nombre, String edad, char sexo) {
        usuario u1 = new usuario();
        usuarios.getInstance().insertar(u1);
        System.out.println(listarUsuario().toString());
    }
    //--------------------------------------------------------------------------
    public ArrayList listarVuelo() {

        this.setChanged();
        this.notifyObservers(null);
        return vuelos.getInstance().listar();
    }

    public void insertarVuelo(vuelo v) {
        vuelos.getInstance().insertar(v);
        this.setChanged();
        this.notifyObservers(null);
    }

    public void modificarVuelo(int pos, String id, String nombre, String edad, char sex) {
        //int pos = DAL.getInstance().consultar(e);
        vuelo vv = new vuelo();
        vuelos.getInstance().actualizar(pos,vv);
        this.setChanged();
        this.notifyObservers(null);
    }

    public void eliminarVuelo() {
        vuelos.getInstance().eliminar(getVuelo());
        this.setChanged();
        this.notifyObservers(null);
    }

    public void eliminarEspVuelo(int pos) {
        vuelo vv = (vuelo) vuelos.getInstance().listar().get(pos);
        vuelos.getInstance().eliminar(vv);
    }

    public int consultarVuelo(vuelo v) {
        this.setChanged();
        this.notifyObservers(null);
        return vuelos.getInstance().consultar(v);

    }

    public void agregarVuelo(String id, String nombre, String edad, char sexo) {
        vuelo v1 = new vuelo();
        vuelos.getInstance().insertar(v1);
        System.out.println(listarVuelo().toString());
    }
    
    public void crearUsuario(usuario u){
        
    }
    
    public void buscarUsuario(String usuario, String password){
        
    }
}

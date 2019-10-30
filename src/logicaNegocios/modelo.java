package logicaNegocios;

import Excepciones.GlobalException;
import Excepciones.NoDataException;
import java.util.ArrayList;
import java.util.Observable;
import accesoDatos.ServicioAerolinea;
import java.sql.SQLException;

public class modelo extends Observable {

    avion avion;
    ruta ruta;
    usuario usuario;
    vuelo vuelo;
    ServicioAerolinea sa;

    public modelo() {

        avion = new avion();
        ruta = new ruta();
        usuario = new usuario();
        vuelo = new vuelo();
        sa = new ServicioAerolinea();
    }

    public static void crearUsuario(presentacion.usuarioA u) {

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
        return null;
    }

    //--------------------------------------------------------------------------
    public void insertarAvion(avion a) {

        this.setChanged();
        this.notifyObservers(null);
    }

    public void modificarAvion(int pos, String id, String nombre, String edad, char sex) {
        //int pos = DAL.getInstance().consultar(e);
        avion aa = new avion();

        this.setChanged();
        this.notifyObservers(null);
    }

    public void eliminarAvion() {

        this.setChanged();
        this.notifyObservers(null);
    }

    public void eliminarEspAvion(int pos) {

    }

    public int consultarAvion(avion a) {
        this.setChanged();
        this.notifyObservers(null);
        return 0;

    }

    public void agregarAvion(String id, String nombre, String edad, char sexo) {
        avion a1 = new avion();

    }

    //--------------------------------------------------------------------------
    public ArrayList listarRuta() {
        return null;
    }

    public void insertarRuta(ruta r) {

    }

    public void modificarRuta(int pos, String id, String nombre, String edad, char sex) {

    }

    public void eliminarRuta() {

    }

    public void eliminarEspRuta(int pos) {

    }

    public int consultarRuta(ruta r) {
        this.setChanged();
        this.notifyObservers(null);

        return 0;
    }

    public void agregarRuta(String id, String nombre, String edad, char sexo) {

    }

    //--------------------------------------------------------------------------
    public ArrayList listarUsuario() {

        this.setChanged();
        this.notifyObservers(null);
        return null;

    }

    public void insertarUsuario(usuario u) {

        this.setChanged();
        this.notifyObservers(null);
    }

    public void modificarUsuario(int pos, String id, String nombre, String edad, char sex) {
        //int pos = DAL.getInstance().consultar(e);
        usuario uu = new usuario();

        this.setChanged();
        this.notifyObservers(null);
    }

    public void eliminarUsuario() {

        this.setChanged();
        this.notifyObservers(null);
    }

    public void eliminarEspUsuario(int pos) {

    }

    public void crearUsuario(usuario u) throws GlobalException, NoDataException {
        sa.insertarUsuario(u);
    }

    public usuario buscarUsuario(String usuario, String password) throws GlobalException, NoDataException, SQLException {
        usuario aux = null;
        aux = sa.MostrarUsuario(usuario, password);
        System.out.println(aux.toString());
        return aux;
    }

    public void agregarUsuario(String id, String nombre, String edad, char sexo) {

    }

    //--------------------------------------------------------------------------
    public ArrayList listarVuelo() throws GlobalException, NoDataException {

        this.setChanged();
        this.notifyObservers(null);
        return sa.listarVuelo();

    }

    public void insertarVuelo(vuelo v) {

        this.setChanged();
        this.notifyObservers(null);
    }

    public void modificarVuelo(int pos, String id, String nombre, String edad, char sex) {
        //int pos = DAL.getInstance().consultar(e);
        vuelo vv = new vuelo();

        this.setChanged();
        this.notifyObservers(null);
    }

    public void eliminarVuelo() {

        this.setChanged();
        this.notifyObservers(null);
    }

    public void eliminarEspVuelo(int pos) {

    }

    public int consultarVuelo(vuelo v) {
        this.setChanged();
        this.notifyObservers(null);
        return 0;

    }

    public void agregarVuelo(String id, String nombre, String edad, char sexo) {
        vuelo v1 = new vuelo();

    }

}

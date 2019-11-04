package logicaNegocios;

import Excepciones.GlobalException;
import Excepciones.NoDataException;
import java.util.ArrayList;
import java.util.Observable;
import accesoDatos.ServicioAerolinea;
import java.sql.SQLException;

public class modelo extends Observable {

    tipoAvion tipoAvion;
    avion avion;
    ruta ruta;
    usuario usuario;
    vuelo vuelo;
    ServicioAerolinea sa;

    public modelo() {
        tipoAvion = new tipoAvion();
        avion = new avion();
        ruta = new ruta();
        usuario = new usuario();
        vuelo = new vuelo();
        sa = new ServicioAerolinea();
    }

    @Override
    public void addObserver(java.util.Observer o) {
        super.addObserver(o);
        setChanged();
        notifyObservers(null);
    }
    //--------------------------USUARIO-----------------------------------------

    public usuario getUsuario() {
        return usuario;
    }

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
    //---------------------------Avion------------------------------------------

    public avion getAvion() {
        return avion;
    }

    public ArrayList listarAvion() {

        this.setChanged();
        this.notifyObservers(null);
        return null;
    }

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
    //--------------------------TIPO AVION--------------------------------------

    public void insertarTipoAvion(String id, Integer año, String modelo, String marca, Integer canPasajeros, 
            Integer canFilas, Integer asientosFila) throws GlobalException, NoDataException {
        tipoAvion t = new tipoAvion(id, año, modelo, marca, canPasajeros, canFilas, asientosFila);
        
        sa.insertarTipoAvion(t);
    }

    public ArrayList listarTipoAvion() throws GlobalException, NoDataException {
      return sa.listarTipoAviones();

    }

    public void modificarTipoAvion(String id, Integer año, String modelo, String marca, Integer canPasajeros, Integer canFilas, Integer asientosFila) throws GlobalException, NoDataException {
        tipoAvion t = new tipoAvion(id, año, modelo, marca, canPasajeros, canFilas, asientosFila);
        sa.modificarTipo(t);

    }

    public void eliminarEspTipo(String text) throws GlobalException, NoDataException {
        sa.eliminarTipo(text);
    }

    //----------------------------RUTA------------------------------------------
    public ruta getRuta() {
        return ruta;
    }

    public ArrayList listarRuta() throws GlobalException, NoDataException {
        return sa.listarRutas();
    }

    public void insertarRuta(String id, String ori, String des, int dura) throws GlobalException, NoDataException {
        ruta r = new ruta(id, ori, des, dura);
        sa.insertarRuta(r);
    }

    public void modificarRuta(String id, String ori, String des, int dura) throws GlobalException, NoDataException, SQLException {
        ruta r = new ruta(id, ori, des, dura);
        sa.modificarRuta(r);
    }

    public void eliminarRutas() throws GlobalException, NoDataException {
        sa.borrarRutas();
    }

    public void eliminarEspRuta(String id) throws GlobalException, NoDataException {
        sa.borrarRuta(id);
    }

    public ruta consultarRuta(String id) throws GlobalException, NoDataException, SQLException {
        this.setChanged();
        this.notifyObservers(null);
        return sa.consultarRuta(id);
    }

    //---------------------------VUELO------------------------------------------
    public ArrayList listarVuelo() throws GlobalException, NoDataException {

        this.setChanged();
        this.notifyObservers(null);
        return sa.listarVuelo();

    }

    public vuelo getVuelo() {
        return vuelo;
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
    //------------------------------HORARIO-------------------------------------
    public void insertarHorario(String id, String dia, int hora, int minutos, int precio, int descuento, String ruta) throws GlobalException, NoDataException{
        horario h = new horario(id, dia,hora, minutos,precio,descuento,ruta);
        sa.insertarHorario(h);
    }
    public horario consultarHorario(String id){
        horario h=null;
        
        return h;
    }
    public void eliminarHorario(String id) throws GlobalException, NoDataException{
        sa.eliminarHorario(id);
    }
    public ArrayList<horario> listarHorario() throws GlobalException, NoDataException{
        ArrayList<horario> hor = sa.listarHorario();
        
        return hor; 
    }
    public void modificarHorario(String id, String dia, int hora, int minutos, int precio, int descuento, String ruta) throws NoDataException, GlobalException{
        horario h = new horario(id, dia,hora, minutos,precio,descuento,ruta);
        sa.modificarHorario(h);
    }

}

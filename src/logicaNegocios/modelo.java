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

    public modelo() {
        tipoAvion = new tipoAvion();
        avion = new avion();
        ruta = new ruta();
        usuario = new usuario();
        vuelo = new vuelo();
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
        ServicioAerolinea.getInstance().insertarUsuario(u);
    }

    public usuario buscarUsuario(String usuario, String password) throws GlobalException, NoDataException, SQLException {
        usuario aux = null;
        aux = ServicioAerolinea.getInstance().MostrarUsuario(usuario, password);
        System.out.println(aux.toString());
        return aux;
    }

    public void agregarUsuario(String id, String nombre, String edad, char sexo) {

    }
    //---------------------------Avion------------------------------------------

    public avion getAvion() {
        return avion;
    }

    public ArrayList listarAvion() throws GlobalException, NoDataException {

        this.setChanged();
        this.notifyObservers(null);
        return ServicioAerolinea.getInstance().listarAviones();
    }

    public avion insertarAvion(String id, String horario, String ruta, String avion) throws GlobalException, NoDataException {
        avion elAvion = new avion(id, horario, ruta, avion);
        ServicioAerolinea.getInstance().insertarAvion(elAvion);
        this.setChanged();
        this.notifyObservers(null);
        return elAvion;
    }

    public void modificarAvion(String id, String horario, String ruta, String avion) throws GlobalException, NoDataException {
        //int pos = DAL.getInstance().consultar(e);
        avion aa = new avion(id, horario, ruta, avion);
        ServicioAerolinea.getInstance().modificarAvion(aa);
        this.setChanged();
        this.notifyObservers(null);
    }

    public void eliminarAvion(String id) throws GlobalException, NoDataException {
        ServicioAerolinea.getInstance().eliminarAvion(id);
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

    public void insertarTipoAvion(String id, int año, String modelo, String marca, int canPasajeros, int canFilas, int asientosFila) throws GlobalException, NoDataException {
        tipoAvion t = new tipoAvion(id, año, modelo, marca, canPasajeros, canFilas, asientosFila);

        ServicioAerolinea.getInstance().insertarTipoAvion(t);
    }

    public ArrayList listarTipoAvion() throws GlobalException, NoDataException {
        return ServicioAerolinea.getInstance().listarTipoAviones();

    }

    public void modificarTipoAvion(String id, Integer año, String modelo, String marca, Integer canPasajeros, Integer canFilas, Integer asientosFila) throws GlobalException, NoDataException {
        tipoAvion t = new tipoAvion(id, año, modelo, marca, canPasajeros, canFilas, asientosFila);
        ServicioAerolinea.getInstance().modificarTipo(t);

    }

    public void eliminarEspTipo(String text) throws GlobalException, NoDataException {
        ServicioAerolinea.getInstance().eliminarTipo(text);
    }

    //----------------------------RUTA------------------------------------------
    public ruta getRuta() {
        return ruta;
    }

    public ArrayList listarRuta() throws GlobalException, NoDataException {
        return ServicioAerolinea.getInstance().listarRutas();
    }

    public void insertarRuta(String id, String ori, String des, int dura) throws GlobalException, NoDataException {
        ruta r = new ruta(id, ori, des, dura);
        ServicioAerolinea.getInstance().insertarRuta(r);
    }

    public void modificarRuta(String id, String ori, String des, int dura) throws GlobalException, NoDataException, SQLException {
        ruta r = new ruta(id, ori, des, dura);
        ServicioAerolinea.getInstance().modificarRuta(r);
    }

    public void eliminarRutas() throws GlobalException, NoDataException {
        ServicioAerolinea.getInstance().borrarRutas();
    }

    public void eliminarEspRuta(String id) throws GlobalException, NoDataException {
        ServicioAerolinea.getInstance().borrarRuta(id);
    }

    public ruta consultarRuta(String id) throws GlobalException, NoDataException, SQLException {
        this.setChanged();
        this.notifyObservers(null);
        return ServicioAerolinea.getInstance().consultarRuta(id);
    }

    //---------------------------VUELO------------------------------------------
    public ArrayList listarVuelo() throws GlobalException, NoDataException {

        this.setChanged();
        this.notifyObservers(null);
        
        return ServicioAerolinea.getInstance().listarVuelo();

    }

    public vuelo getVuelo() {
        return vuelo;
    }

    public void insertarVuelo(String horario,String horarioR, String ida, String regreso,String codigo,int tipo) throws GlobalException, NoDataException, SQLException {

       vuelo v= new vuelo(codigo,tipo,ida,regreso,horarioR,horario);
        ServicioAerolinea.getInstance().insertarVuelo(v);
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

    public void crearVuelo() {

    }

    //------------------------------HORARIO-------------------------------------
    public void insertarHorario(String id, String dia, int hora, int minutos, int precio, int descuento, String ruta) throws GlobalException, NoDataException {
        horario h = new horario(id, dia, hora, minutos, precio, descuento, ruta);
        ServicioAerolinea.getInstance().insertarHorario(h);
    }

    public horario consultarHorario(String id) {
        horario h = null;

        return h;
    }

    public void eliminarHorario(String id) throws GlobalException, NoDataException {
        ServicioAerolinea.getInstance().eliminarHorario(id);
    }

    public ArrayList<horario> listarHorario() throws GlobalException, NoDataException {
        ArrayList<horario> hor = ServicioAerolinea.getInstance().listarHorario();

        return hor;
    }

    public void modificarHorario(String id, String dia, int hora, int minutos, int precio, int descuento, String ruta) throws NoDataException, GlobalException {
        horario h = new horario(id, dia, hora, minutos, precio, descuento, ruta);
        ServicioAerolinea.getInstance().modificarHorario(h);
    }

}

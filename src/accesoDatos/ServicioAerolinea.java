package accesoDatos;

import Excepciones.GlobalException;
import Excepciones.NoDataException;
import logicaNegocios.admin;
import logicaNegocios.avion;
import logicaNegocios.ruta;
import logicaNegocios.usuario;
import logicaNegocios.vuelo;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import logicaNegocios.horario;
import logicaNegocios.tipoAvion;
import logicaNegocios.tiquete;
import oracle.jdbc.internal.OracleTypes;

public class ServicioAerolinea extends Servicio {

    private static final String INSERTARUSUARIO = "{call insertarUsuario(?, ?, ?, ?, ?, ?, ?, ?, ?)}";
    private static final String CONSULTARUSUARIO = "{? = call CONSULTARUSUARIO(?,?)}";

    private static final String INSERTARRUTA = "{call insertarRuta (?, ?, ?, ?,?)}";
    private static final String LISTARRUTAS = "{?=call listarRutas()}";
    private static final String CONSULTARRUTA = "{? = call CONSULTARRUTA(?)}";
    private static final String MODIFICARRUTA = "{call modificarRuta(?,?,?,?,?)}";
    private static final String BORRARRUTAS = "{call borrarRutaG()}";
    private static final String BORRARRUTA = "{call borrarRuta(?)}";

    private static final String INSERTARTIPOAVION = "{call insertarTipoAviones (?,?,?,?,?,?,?)}";
    private static final String MODIFICARTIPO = "{call modificarTipo(?,?,?,?,?,?,?)}";
    private static final String LISTARTIPOS = "{?=call listarTipos()}";
    private static final String ELIMINARTIPO = "{call borrarTipo(?)}";

    private static final String INSERTARAVION = "{call insertarAvion (?,?,?,?)}";
    private static final String CONSULTARAVION = "{?=call consultarAvion(?)}";
    private static final String MODIFICARAVION = "{call modificarAvion(?,?,?,?)}";
    private static final String LISTARAVIONES = "{?=call listarAvion()}";
    private static final String ELIMINARAVION = "{call eliminarAvion(?)}";

    private static final String INSERTARHORARIO = "{call insertarHorario (?,?,?,?,?,?,?,?,?)}";
    private static final String MODIFICARHORARIO = "{call modificarHorario(?,?,?,?,?,?,?,?,?)}";
    private static final String LISTARHORARIO = "{?=call listarHorarios()}";
    private static final String ELIMINARHORARIO = "{call borrarHorario(?)}";
    private static final String CONSULTARHORARIO = "{?=call CONSULTARHORARIO(?)}";

    private static final String LISTARVUELOS = "{?=call listarVuelos()}";
    private static final String LISTARVUELOS2 = "{?=call listarVuelosPublico()}";
    
    private static final String INSERTARVUELOS = "{call insertarVuelo (?,?,?,?)}";
    //private static final String MODIFICARVUELOS = "{call modificarVuelos(?,?,?,?,?,?)}";

    
    private static final String INSERTARTIQUETE = "{call insertarTiquete (?,?,?,?)}";
    private static final String MODIFICARTIQUETE= "{call modificarVuelos(?,?,?,?,?,?)}";
    
    private static ServicioAerolinea mInstance;

    public static ServicioAerolinea getInstance() {
        if (mInstance == null) {
            mInstance = new ServicioAerolinea();
        }
        return mInstance;
    }

    public ServicioAerolinea() {

    }

    //--------------------AVION-----------------------------//
    public void insertarAvion(avion elAvion) throws GlobalException, NoDataException {
        try {
            conectar();
        } catch (ClassNotFoundException e) {
            throw new GlobalException("No se ha localizado el driver");
        } catch (SQLException e) {
            throw new NoDataException("La base de datos no se encuentra disponible");
        }
        CallableStatement pstmt = null;

        try {
            pstmt = conexion.prepareCall(INSERTARAVION);
            pstmt.setString(1, elAvion.getID());
            pstmt.setString(2, elAvion.getIdHorario());
            pstmt.setString(3, elAvion.getIdRuta());
            pstmt.setString(4, elAvion.getIdentificadorAv());
            System.out.println("Insertado con exito");
            boolean resultado = pstmt.execute();
            if (resultado == true) {
                throw new NoDataException("No se realizo la insercion");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException("Llave duplicada");
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                desconectar();
            } catch (SQLException e) {
                throw new GlobalException("Estatutos invalidos o nulos");
            }
        }
    }

    public avion consultarAvion(String id) throws GlobalException, NoDataException {
        try {
            conectar();
        } catch (ClassNotFoundException e) {
            throw new GlobalException("No se ha localizado el driver");
        } catch (SQLException e) {
            throw new NoDataException("La base de datos no se encuentra disponible");
        }
        ResultSet rs = null;
        CallableStatement pstmt = null;
        avion aux = null;

        try {
            pstmt = conexion.prepareCall(CONSULTARAVION);

            pstmt.registerOutParameter(1, OracleTypes.CURSOR);
            pstmt.setString(2, id);
            pstmt.execute();
            rs = (ResultSet) pstmt.getObject(1);

            while (rs.next()) {
                aux = new avion(rs.getString("identificadorAv"),
                        rs.getString("idHorario"),
                        rs.getString("IdRuta"),
                        rs.getString("identificador")
                );
            }
            if (aux == null) {
                throw new GlobalException("No existe un elemento con ese Codigo");
            }
            System.out.println(aux.toString());
        } catch (SQLException e) {
            e.printStackTrace();

            throw new GlobalException("Sentencia no valida");
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
                desconectar();
            } catch (SQLException e) {
                throw new GlobalException("Estatutos invalidos o nulos");
            }
        }
        return aux;
    }

    public void modificarAvion(avion elAvion) throws GlobalException, NoDataException {
        try {
            conectar();
        } catch (ClassNotFoundException e) {
            throw new GlobalException("No se ha localizado el driver");
        } catch (SQLException e) {
            throw new NoDataException("La base de datos no se encuentra disponible");
        }
        CallableStatement pstmt = null;

        try {
            pstmt = conexion.prepareCall(MODIFICARAVION);
            pstmt.setString(1, elAvion.getID());
            pstmt.setString(2, elAvion.getIdHorario());
            pstmt.setString(3, elAvion.getIdRuta());
            pstmt.setString(4, elAvion.getIdentificadorAv());
            System.out.println("Insertado con exito");
            boolean resultado = pstmt.execute();
            if (resultado == true) {
                throw new NoDataException("No se realizo la insercion");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException("Llave duplicada");
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                desconectar();
            } catch (SQLException e) {
                throw new GlobalException("Estatutos invalidos o nulos");
            }
        }
    }

    public ArrayList listarAviones() throws GlobalException, NoDataException {
        try {
            conectar();
        } catch (ClassNotFoundException ex) {
            throw new GlobalException("No se ha localizado el Driver");
        } catch (SQLException e) {
            throw new NoDataException("La base de datos no se encuentra disponible");
        }
        ResultSet rs = null;
        ArrayList<avion> coleccion = new ArrayList<>();
        avion elAvion = null;
        CallableStatement pstmt = null;
        try {
            pstmt = conexion.prepareCall(LISTARAVIONES);
            pstmt.registerOutParameter(1, OracleTypes.CURSOR);
            pstmt.execute();
            rs = (ResultSet) pstmt.getObject(1);
            while (rs.next()) {
                elAvion = new avion(rs.getString("identificadorAv"),
                        rs.getString("idHorario"),
                        rs.getString("IdRuta"),
                        rs.getString("identificador")
                );
                coleccion.add(elAvion);
            }
            for (avion t : coleccion) {
                System.out.println(t.toString());
            }
        } catch (SQLException e) {
            e.printStackTrace();

            throw new GlobalException("Sentencia no valida");
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
                desconectar();
            } catch (SQLException e) {
                throw new GlobalException("Estatutos invalidos o nulos");
            }
        }
        if (coleccion == null || coleccion.isEmpty()) {
            throw new NoDataException("No hay datos");
        }
        return coleccion;
    }

    public void eliminarAvion(String id) throws GlobalException, NoDataException {
        try {
            conectar();
        } catch (ClassNotFoundException e) {
            throw new GlobalException("No se ha localizado el driver");
        } catch (SQLException e) {
            throw new NoDataException("La base de datos no se encuentra disponible");
        }
        CallableStatement pstmt = null;

        try {
            pstmt = conexion.prepareCall(ELIMINARAVION);
            pstmt.setString(1, id);
            boolean resultado = pstmt.execute();
            System.out.println("Avion borrado");
            if (resultado == true) {
                throw new NoDataException("No se realizo la eliminacion");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException("Llave duplicada");
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                desconectar();
            } catch (SQLException e) {
                throw new GlobalException("Estatutos invalidos o nulos");
            }
        }
    }

    //--------------------USUARIO-----------------------------//
    public void insertarUsuario(usuario elUsuario) throws GlobalException, NoDataException {
        try {
            conectar();
        } catch (ClassNotFoundException e) {
            throw new GlobalException("No se ha localizado el driver");
        } catch (SQLException e) {
            throw new NoDataException("La base de datos no se encuentra disponible");
        }
        CallableStatement pstmt = null;

        try {
            pstmt = conexion.prepareCall(INSERTARUSUARIO);
            pstmt.setString(1, elUsuario.getUser());
            pstmt.setString(2, elUsuario.getContraseña());
            pstmt.setString(3, elUsuario.getNombre());
            pstmt.setString(4, elUsuario.getApellidos());
            pstmt.setString(5, elUsuario.getMail());
            pstmt.setString(6, elUsuario.getFnacimiento());
            pstmt.setString(7, elUsuario.getDireccion());
            pstmt.setInt(8, elUsuario.getTrabajoTel());
            pstmt.setInt(9, elUsuario.getCelular());
            System.out.println("Insertado con exito");
            boolean resultado = pstmt.execute();
            if (resultado == true) {
                throw new NoDataException("No se realizo la insercion");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException("Llave duplicada");
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                desconectar();
            } catch (SQLException e) {
                throw new GlobalException("Estatutos invalidos o nulos");
            }
        }
    }

    public usuario MostrarUsuario(String user, String pass) throws GlobalException, NoDataException, SQLException {
        try {
            conectar();
        } catch (ClassNotFoundException e) {
            throw new GlobalException("No se ha localizado el driver");
        } catch (SQLException e) {
            throw new NoDataException("La base de datos no se encuentra disponible");
        }
        ResultSet rs = null;
        CallableStatement pstmt = null;
        usuario aux = null;

        try {
            pstmt = conexion.prepareCall(CONSULTARUSUARIO);

            pstmt.registerOutParameter(1, OracleTypes.CURSOR);
            pstmt.setString(2, user);
            pstmt.setString(3, pass);
            pstmt.execute();
            rs = (ResultSet) pstmt.getObject(1);

            while (rs.next()) {
                aux = new usuario(rs.getString("usuario"), rs.getString("contrasena"), rs.getString("nombre"),
                        rs.getString("apellidos"), rs.getString("correo"), rs.getString("fechaNac"), rs.getString("direccion"), rs.getInt("telefonoTrab"), rs.getInt("celular"));
            }
            if (aux == null) {
                throw new GlobalException("No existe un elemento con ese Codigo");
            }
            System.out.println(aux.toString());
        } catch (SQLException e) {
            e.printStackTrace();

            throw new GlobalException("Sentencia no valida");
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
                desconectar();
            } catch (SQLException e) {
                throw new GlobalException("Estatutos invalidos o nulos");
            }
        }
        return aux;
    }

    //--------------------TIPO AVION-----------------------------//
    public void insertarTipoAvion(tipoAvion elTipo) throws GlobalException, NoDataException {
        try {
            conectar();
        } catch (ClassNotFoundException e) {
            throw new GlobalException("No se ha localizado el driver");
        } catch (SQLException e) {
            throw new NoDataException("La base de datos no se encuentra disponible");
        }
        CallableStatement pstmt = null;
        try {
            pstmt = conexion.prepareCall(INSERTARTIPOAVION);
            pstmt.setString(1, elTipo.getId());
            pstmt.setString(2, elTipo.getAnno().toString());
            pstmt.setString(3, elTipo.getModelo());
            pstmt.setString(4, elTipo.getMarca());
            pstmt.setInt(5, elTipo.getCanFilas());
            pstmt.setInt(6, elTipo.getAsientosFila());
            pstmt.setInt(7, elTipo.getCanPasajeros());
            System.out.println("Tipo avion insertado con exito");
            boolean resultado = pstmt.execute();
            if (resultado == true) {
                throw new NoDataException("No se realizo la insercion");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException("Llave duplicada");
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                desconectar();
            } catch (SQLException e) {
                throw new GlobalException("Estatutos invalidos o nulos");
            }
        }
    }

    public ArrayList listarTipoAviones() throws GlobalException, NoDataException {
        try {
            conectar();
        } catch (ClassNotFoundException ex) {
            throw new GlobalException("No se ha localizado el Driver");
        } catch (SQLException e) {
            throw new NoDataException("La base de datos no se encuentra disponible");
        }
        ResultSet rs = null;
        ArrayList<tipoAvion> coleccion = new ArrayList<tipoAvion>();
        tipoAvion elTipo = null;
        CallableStatement pstmt = null;
        try {
            pstmt = conexion.prepareCall(LISTARTIPOS);
            pstmt.registerOutParameter(1, OracleTypes.CURSOR);
            pstmt.execute();
            rs = (ResultSet) pstmt.getObject(1);
            while (rs.next()) {
                elTipo = new tipoAvion(rs.getString("identificador"),
                        Integer.parseInt(rs.getString("ano")),
                        rs.getString("modelo"),
                        rs.getString("marca"),
                        Integer.parseInt(rs.getString("filas")),
                        Integer.parseInt(rs.getString("asientosFilas")),
                        Integer.parseInt(rs.getString("pasajeros"))
                );
                coleccion.add(elTipo);
            }
            for (tipoAvion t : coleccion) {
                System.out.println(t.toString());
            }
        } catch (SQLException e) {
            e.printStackTrace();

            throw new GlobalException("Sentencia no valida");
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
                desconectar();
            } catch (SQLException e) {
                throw new GlobalException("Estatutos invalidos o nulos");
            }
        }
        if (coleccion == null || coleccion.isEmpty()) {
            throw new NoDataException("No hay datos");
        }
        return coleccion;
    }

    public void modificarTipo(tipoAvion elTipo) throws GlobalException, NoDataException {
        try {
            conectar();
        } catch (ClassNotFoundException e) {
            throw new GlobalException("No se ha localizado el driver");
        } catch (SQLException e) {
            throw new NoDataException("La base de datos no se encuentra disponible");
        }
        CallableStatement pstmt = null;
        try {
            pstmt = conexion.prepareCall(MODIFICARTIPO);
            pstmt.setString(1, elTipo.getId());
            pstmt.setString(2, elTipo.getAnno().toString());
            pstmt.setString(3, elTipo.getModelo());
            pstmt.setString(4, elTipo.getMarca());
            pstmt.setInt(5, elTipo.getCanPasajeros());
            pstmt.setInt(6, elTipo.getCanFilas());
            pstmt.setInt(7, elTipo.getAsientosFila());
            boolean resultado = pstmt.execute();
            if (resultado) {
                throw new NoDataException("No se realizo la actualización");
            } else {
                System.out.println("Actualizado con exito");

            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException("Llave duplicada");
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                desconectar();
            } catch (SQLException e) {
                throw new GlobalException("Estatutos invalidos o nulos");
            }
        }

    }

    public void eliminarTipo(String id) throws GlobalException, NoDataException {
        try {
            conectar();
        } catch (ClassNotFoundException e) {
            throw new GlobalException("No se ha localizado el driver");
        } catch (SQLException e) {
            throw new NoDataException("La base de datos no se encuentra disponible");
        }
        CallableStatement pstmt = null;

        try {
            pstmt = conexion.prepareCall(ELIMINARTIPO);
            pstmt.setString(1, id);
            boolean resultado = pstmt.execute();
            System.out.println("Ruta borrada");
            if (resultado == true) {
                throw new NoDataException("No se realizo la eliminacion");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException("Llave duplicada");
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                desconectar();
            } catch (SQLException e) {
                throw new GlobalException("Estatutos invalidos o nulos");
            }
        }
    }

    //--------------------HORARIO-----------------------------//
    public void insertarHorario(horario elHorario) throws GlobalException, NoDataException {
        try {
            conectar();
        } catch (ClassNotFoundException e) {
            throw new GlobalException("No se ha localizado el driver");
        } catch (SQLException e) {
            throw new NoDataException("La base de datos no se encuentra disponible");
        }
        CallableStatement pstmt = null;
        try {
            pstmt = conexion.prepareCall(INSERTARHORARIO);
            pstmt.setString(1, elHorario.getId());
            pstmt.setString(2, elHorario.getDia());
            pstmt.setInt(3, elHorario.getHora());
            pstmt.setInt(4, elHorario.getMinutos());
            pstmt.setInt(5, elHorario.getHoraLlegada());
            pstmt.setInt(6, elHorario.getMinutosLlegada());
            pstmt.setInt(7, elHorario.getPrecio());
            pstmt.setInt(8, elHorario.getDescuento());
            pstmt.setString(9, elHorario.getRuta());
            System.out.println("horario con exito");
            boolean resultado = pstmt.execute();
            if (resultado == true) {
                throw new NoDataException("No se realizo la insercion");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException("Llave duplicada");
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                desconectar();
            } catch (SQLException e) {
                throw new GlobalException("Estatutos invalidos o nulos");
            }
        }
    }

    public ArrayList listarHorario() throws GlobalException, NoDataException {
        try {
            conectar();
        } catch (ClassNotFoundException ex) {
            throw new GlobalException("No se ha localizado el Driver");
        } catch (SQLException e) {
            throw new NoDataException("La base de datos no se encuentra disponible");
        }
        ResultSet rs = null;
        ArrayList<horario> coleccion = new ArrayList<>();
        horario elHorario = null;
        CallableStatement pstmt = null;
        try {
            pstmt = conexion.prepareCall(LISTARHORARIO);
            pstmt.registerOutParameter(1, OracleTypes.CURSOR);
            pstmt.execute();
            rs = (ResultSet) pstmt.getObject(1);
            while (rs.next()) {
                elHorario = new horario(rs.getString("idHorario"),
                        rs.getString("diaSemana"),
                        rs.getInt("hora"),
                        rs.getInt("minutos"),
                        rs.getInt("horaLlegada"),
                        rs.getInt("minutosLlegada"),
                        rs.getInt("precio"),
                        rs.getInt("descuento"),
                        rs.getString("IdRuta")
                );
                coleccion.add(elHorario);
            }
            for (horario t : coleccion) {
                System.out.println(t.toString());
            }
        } catch (SQLException e) {
            e.printStackTrace();

            throw new GlobalException("Sentencia no valida");
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
                desconectar();
            } catch (SQLException e) {
                throw new GlobalException("Estatutos invalidos o nulos");
            }
        }
        if (coleccion == null || coleccion.isEmpty()) {
            throw new NoDataException("No hay datos");
        }
        return coleccion;
    }

    public void modificarHorario(horario elHorario) throws GlobalException, NoDataException {
        try {
            conectar();
        } catch (ClassNotFoundException e) {
            throw new GlobalException("No se ha localizado el driver");
        } catch (SQLException e) {
            throw new NoDataException("La base de datos no se encuentra disponible");
        }
        CallableStatement pstmt = null;
        try {
            pstmt = conexion.prepareCall(MODIFICARHORARIO);
            pstmt.setString(1, elHorario.getId());
            pstmt.setString(2, elHorario.getDia());
            pstmt.setInt(3, elHorario.getHora());
            pstmt.setInt(4, elHorario.getMinutos());
            pstmt.setInt(5, elHorario.getHoraLlegada());
            pstmt.setInt(6, elHorario.getMinutosLlegada());
            pstmt.setInt(7, elHorario.getPrecio());
            pstmt.setInt(8, elHorario.getDescuento());
            pstmt.setString(9, elHorario.getRuta());
            boolean resultado = pstmt.execute();
            if (resultado) {
                throw new NoDataException("No se realizo la actualización");
            } else {
                System.out.println("Actualizado con exito");

            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException("Llave duplicada");
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                desconectar();
            } catch (SQLException e) {
                throw new GlobalException("Estatutos invalidos o nulos");
            }
        }

    }

    public void eliminarHorario(String id) throws GlobalException, NoDataException {
        try {
            conectar();
        } catch (ClassNotFoundException e) {
            throw new GlobalException("No se ha localizado el driver");
        } catch (SQLException e) {
            throw new NoDataException("La base de datos no se encuentra disponible");
        }
        CallableStatement pstmt = null;

        try {
            pstmt = conexion.prepareCall(ELIMINARHORARIO);
            pstmt.setString(1, id);
            boolean resultado = pstmt.execute();
            System.out.println("Ruta borrada");
            if (resultado == true) {
                throw new NoDataException("No se realizo la eliminacion");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException("Llave duplicada");
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                desconectar();
            } catch (SQLException e) {
                throw new GlobalException("Estatutos invalidos o nulos");
            }
        }
    }

    public horario consultarHorario(String id) throws GlobalException, NoDataException, SQLException {
        try {
            conectar();
        } catch (ClassNotFoundException e) {
            throw new GlobalException("No se ha localizado el driver");
        } catch (SQLException e) {
            throw new NoDataException("La base de datos no se encuentra disponible");
        }
        ResultSet rs = null;
        CallableStatement pstmt = null;
        horario aux = null;

        try {
            pstmt = conexion.prepareCall(CONSULTARHORARIO);

            pstmt.registerOutParameter(1, OracleTypes.CURSOR);
            pstmt.setString(2, id);
            pstmt.execute();
            rs = (ResultSet) pstmt.getObject(1);
//String id, String dia, int hora, int minutos, int precio, int descuento, String ruta
            while (rs.next()) {
                aux = new horario(rs.getString("idHorario"),
                        rs.getString("diaSemana"),
                        rs.getInt("hora"),
                        rs.getInt("minutos"),
                        rs.getInt("horaLlegada"),
                        rs.getInt("minutosLlegada"),
                        rs.getInt("precio"),
                        rs.getInt("descuento"),
                        rs.getString("IdRuta")
                );
            }
            if (aux == null) {
                throw new GlobalException("No existe un elemento con ese Codigo");
            }
            System.out.println(aux.toString());
        } catch (SQLException e) {
            e.printStackTrace();

            throw new GlobalException("Sentencia no valida");
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
                desconectar();
            } catch (SQLException e) {
                throw new GlobalException("Estatutos invalidos o nulos");
            }
        }
        return aux;
    }

    //-----------------------------------RUTAS----------------------------------
    public void insertarRuta(ruta laRuta) throws GlobalException, NoDataException {
        try {
            conectar();
        } catch (ClassNotFoundException e) {
            throw new GlobalException("No se ha localizado el driver");
        } catch (SQLException e) {
            throw new NoDataException("La base de datos no se encuentra disponible");
        }
        CallableStatement pstmt = null;

        try {
            pstmt = conexion.prepareCall(INSERTARRUTA);
            pstmt.setString(1, laRuta.getID());
            pstmt.setString(2, laRuta.getOrigen());
            pstmt.setString(3, laRuta.getDestino());
            pstmt.setInt(4, laRuta.getDuracionH());
            pstmt.setInt(5, laRuta.getDuracionM());
            
            System.out.println("Insertado con exito");
            boolean resultado = pstmt.execute();
            if (resultado == true) {
                throw new NoDataException("No se realizo la insercion");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException("Llave duplicada");
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                desconectar();
            } catch (SQLException e) {
                throw new GlobalException("Estatutos invalidos o nulos");
            }
        }
    }

    public ArrayList listarRutas() throws GlobalException, NoDataException {
        try {
            conectar();
        } catch (ClassNotFoundException ex) {
            throw new GlobalException("No se ha localizado el Driver");
        } catch (SQLException e) {
            throw new NoDataException("La base de datos no se encuentra disponible");
        }

        ResultSet rs = null;
        ArrayList<ruta> coleccion = new ArrayList<ruta>();
        ruta laRuta = null;
        CallableStatement pstmt = null;
        try {
            pstmt = conexion.prepareCall(LISTARRUTAS);
            pstmt.registerOutParameter(1, OracleTypes.CURSOR);
            pstmt.execute();
            rs = (ResultSet) pstmt.getObject(1);
            while (rs.next()) {
                laRuta = new ruta(rs.getString("idRuta"),
                        rs.getString("origen"),
                        rs.getString("destino"),
                        rs.getInt("duracionH"),
                        rs.getInt("duracionM")
                );
                coleccion.add(laRuta);
            }
            for (ruta r : coleccion) {
                System.out.println(r.toString());
            }
        } catch (SQLException e) {
            e.printStackTrace();

            throw new GlobalException("Sentencia no valida");
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
                desconectar();
            } catch (SQLException e) {
                throw new GlobalException("Estatutos invalidos o nulos");
            }
        }
        if (coleccion == null || coleccion.isEmpty()) {
            throw new NoDataException("No hay datos");
        }
        return coleccion;
    }

    public ruta consultarRuta(String id) throws GlobalException, NoDataException, SQLException {
        try {
            conectar();
        } catch (ClassNotFoundException e) {
            throw new GlobalException("No se ha localizado el driver");
        } catch (SQLException e) {
            throw new NoDataException("La base de datos no se encuentra disponible");
        }
        ResultSet rs = null;
        CallableStatement pstmt = null;
        ruta aux = null;

        try {
            pstmt = conexion.prepareCall(CONSULTARRUTA);

            pstmt.registerOutParameter(1, OracleTypes.CURSOR);
            pstmt.setString(2, id);
            pstmt.execute();
            rs = (ResultSet) pstmt.getObject(1);

            while (rs.next()) {
                aux = new ruta(rs.getString("idRuta"),
                        rs.getString("origen"),
                        rs.getString("destino"),
                        rs.getInt("duracionH"),
                        rs.getInt("duracionM")
                );
            }
            if (aux == null) {
                throw new GlobalException("No existe un elemento con ese Codigo");
            }
            System.out.println(aux.toString());
        } catch (SQLException e) {
            e.printStackTrace();

            throw new GlobalException("Sentencia no valida");
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
                desconectar();
            } catch (SQLException e) {
                throw new GlobalException("Estatutos invalidos o nulos");
            }
        }
        return aux;
    }

    public void modificarRuta(ruta laRuta) throws GlobalException, NoDataException, SQLException {
        try {
            conectar();
        } catch (ClassNotFoundException e) {
            throw new GlobalException("No se ha localizado el driver");
        } catch (SQLException e) {
            throw new NoDataException("La base de datos no se encuentra disponible");
        }
        CallableStatement pstmt = null;

        try {
            pstmt = conexion.prepareCall(MODIFICARRUTA);
            pstmt.setString(1, laRuta.getID());
            pstmt.setString(2, laRuta.getOrigen());
            pstmt.setString(3, laRuta.getDestino());
            pstmt.setInt(4, laRuta.getDuracionH());
            pstmt.setInt(5, laRuta.getDuracionM());

            boolean resultado = pstmt.execute();
            System.out.println("Actualizado con exito");
            if (resultado == true) {
                throw new NoDataException("No se realizo la actualización");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException("Llave duplicada");
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                desconectar();
            } catch (SQLException e) {
                throw new GlobalException("Estatutos invalidos o nulos");
            }
        }
    }

    public void borrarRutas() throws GlobalException, NoDataException {
        try {
            conectar();
        } catch (ClassNotFoundException e) {
            throw new GlobalException("No se ha localizado el driver");
        } catch (SQLException e) {
            throw new NoDataException("La base de datos no se encuentra disponible");
        }
        CallableStatement pstmt = null;

        try {
            pstmt = conexion.prepareCall(BORRARRUTAS);
            boolean resultado = pstmt.execute();
            if (resultado == true) {
                throw new NoDataException("No se realizo la eliminacion");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException("Llave duplicada");
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                desconectar();
            } catch (SQLException e) {
                throw new GlobalException("Estatutos invalidos o nulos");
            }
        }
    }

    public void borrarRuta(String id) throws GlobalException, NoDataException {
        try {
            conectar();
        } catch (ClassNotFoundException e) {
            throw new GlobalException("No se ha localizado el driver");
        } catch (SQLException e) {
            throw new NoDataException("La base de datos no se encuentra disponible");
        }
        CallableStatement pstmt = null;

        try {
            pstmt = conexion.prepareCall(BORRARRUTA);
            pstmt.setString(1, id);
            boolean resultado = pstmt.execute();
            System.out.println("Ruta borrada");
            if (resultado == true) {
                throw new NoDataException("No se realizo la eliminacion");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException("Llave duplicada");
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                desconectar();
            } catch (SQLException e) {
                throw new GlobalException("Estatutos invalidos o nulos");
            }
        }
    }

    //------------------------------VUELOS------------------------------
    //codigo,tipo,ida,regreso,horarioR,horario
    public ArrayList listarVuelo() throws GlobalException, NoDataException {
        try {
            conectar();
        } catch (ClassNotFoundException ex) {
            throw new GlobalException("No se ha localizado el Driver");
        } catch (SQLException e) {
            throw new NoDataException("La base de datos no se encuentra disponible");
        }
        //String codigo, int tipo, String origen, String destino, String fechaIda, String fechaRegreso
        ResultSet rs = null;
        ArrayList<vuelo> coleccion = new ArrayList<vuelo>();
        vuelo elVuelo = null;
        CallableStatement pstmt = null;
        try {
            pstmt = conexion.prepareCall(LISTARVUELOS);
            pstmt.registerOutParameter(1, OracleTypes.CURSOR);//El objeto retornado es tipo Cursor
            pstmt.execute();
            rs = (ResultSet) pstmt.getObject(1);//El objeto que recibe es un cursor de todos los estudiantes
            while (rs.next()) {
                elVuelo = new vuelo(rs.getString("codigo"),
                        rs.getInt("tipo"),
                        rs.getString("identificadorAvIda"),
                        rs.getString("identificadorAvRegreso")
                );
                coleccion.add(elVuelo);
            }
            for (vuelo v : coleccion) {
                System.out.println(v.toString());
            }
        } catch (SQLException e) {
            e.printStackTrace();

            throw new GlobalException("Sentencia no valida");
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
                desconectar();
            } catch (SQLException e) {
                throw new GlobalException("Estatutos invalidos o nulos");
            }
        }
        if (coleccion == null || coleccion.isEmpty()) {
            throw new NoDataException("No hay datos");
        }
        return coleccion;
    }

    public ArrayList listarVuelo2() throws GlobalException, NoDataException {
         try {
            conectar();
        } catch (ClassNotFoundException ex) {
            throw new GlobalException("No se ha localizado el Driver");
        } catch (SQLException e) {
            throw new NoDataException("La base de datos no se encuentra disponible");
        }
        //String codigo, int tipo, String origen, String destino, String fechaIda, String fechaRegreso
        ResultSet rs = null;
        ArrayList<vuelo> coleccion = new ArrayList<vuelo>();
        vuelo elVuelo = null;
        CallableStatement pstmt = null;
        try {
            pstmt = conexion.prepareCall(LISTARVUELOS2);
            pstmt.registerOutParameter(1, OracleTypes.CURSOR);//El objeto retornado es tipo Cursor
            pstmt.execute();
            rs = (ResultSet) pstmt.getObject(1);//El objeto que recibe es un cursor de todos los estudiantes
            while (rs.next()) {
                elVuelo = new vuelo(rs.getString("codigo"),
                        rs.getInt("tipo"),
                        rs.getString("origen"),
                        rs.getString("destino"),
                        rs.getString("diaSemana"),
                        rs.getString("hora"),
                        rs.getString("minutos"),
                        rs.getString("horaLlegada"),
                        rs.getString("minutosLlegada"),
                        rs.getString("pasajeros"),
                        rs.getString("descuento")
                );
                coleccion.add(elVuelo);
            }
            for (vuelo v : coleccion) {
                System.out.println(v.toString());
            }
        } catch (SQLException e) {
            e.printStackTrace();

            throw new GlobalException("Sentencia no valida");
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
                desconectar();
            } catch (SQLException e) {
                throw new GlobalException("Estatutos invalidos o nulos");
            }
        }
        if (coleccion == null || coleccion.isEmpty()) {
            throw new NoDataException("No hay datos");
        }
        return coleccion;
       }


    public void insertarVuelo(vuelo elVuelo) throws GlobalException, NoDataException {

        try {
            conectar();
        } catch (ClassNotFoundException e) {
            throw new GlobalException("No se ha localizado el driver");
        } catch (SQLException e) {
            throw new NoDataException("La base de datos no se encuentra disponible");
        }
        CallableStatement pstmt = null;

        try {
            pstmt = conexion.prepareCall(INSERTARVUELOS);
            pstmt.setString(1, elVuelo.getCodigo());
            pstmt.setInt(2, elVuelo.getTipo());
            pstmt.setString(3, elVuelo.getAvionIda());
            pstmt.setString(4, elVuelo.getAvionRegreso());
            System.out.println("Insertado con exito");
            boolean resultado = pstmt.execute();
            if (resultado == true) {
                throw new NoDataException("No se realizo la insercion");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException("Llave duplicada");
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                desconectar();
            } catch (SQLException e) {
                throw new GlobalException("Estatutos invalidos o nulos");
            }
        }
    }
    
    public void insertarTiquete(tiquete elTiquete) throws GlobalException, NoDataException {

        try {
            conectar();
        } catch (ClassNotFoundException e) {
            throw new GlobalException("No se ha localizado el driver");
        } catch (SQLException e) {
            throw new NoDataException("La base de datos no se encuentra disponible");
        }
        CallableStatement pstmt = null;

        try {
            pstmt = conexion.prepareCall(INSERTARTIQUETE);
            pstmt.setString(1,Integer.toString(elTiquete.getNumero()));
            pstmt.setString(2, elTiquete.getVuel());
            pstmt.setString(3, elTiquete.getUsuario());
            pstmt.setString(4, elTiquete.getFila()+"/"+elTiquete.getAsiento());
            System.out.println("Insertado con exito");
            boolean resultado = pstmt.execute();
            if (resultado == true) {
                throw new NoDataException("No se realizo la insercion");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException("Llave duplicada");
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                desconectar();
            } catch (SQLException e) {
                throw new GlobalException("Estatutos invalidos o nulos");
            }
        }
    }
    public void modificarTiquete(tiquete elTiquete) throws GlobalException, NoDataException, SQLException {
        try {
            conectar();
        } catch (ClassNotFoundException e) {
            throw new GlobalException("No se ha localizado el driver");
        } catch (SQLException e) {
            throw new NoDataException("La base de datos no se encuentra disponible");
        }
        CallableStatement pstmt = null;

        try {
            pstmt = conexion.prepareCall(MODIFICARTIQUETE);
            pstmt.setString(1,Integer.toString(elTiquete.getNumero()));
            pstmt.setString(2, elTiquete.getVuel());
            pstmt.setString(3, elTiquete.getUsuario());
            pstmt.setString(4, elTiquete.getFila()+"/"+elTiquete.getAsiento());

            boolean resultado = pstmt.execute();
            System.out.println("Actualizado con exito");
            if (resultado == true) {
                throw new NoDataException("No se realizo la actualización");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException("Llave duplicada");
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                desconectar();
            } catch (SQLException e) {
                throw new GlobalException("Estatutos invalidos o nulos");
            }
        }
    }

}

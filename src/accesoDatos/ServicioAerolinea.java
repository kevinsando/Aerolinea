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
import oracle.jdbc.internal.OracleTypes;

public class ServicioAerolinea extends Servicio {
    private static final String INSERTARUSUARIO = "{call insertarUsuario(?, ?, ?, ?, ?, ?, ?, ?, ?)}";
    private static final String INSERTARRUTA = "{call insertarRuta (?, ?, ?, ?)}";
    private static final String CONSULTARUSUARIO = "{? = call CONSULTARUSUARIO(?,?)}";
    private static final String LISTARVUELOS = "{?=call listarVuelos()}";
    
    public ServicioAerolinea() {

    }
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
    public usuario MostrarUsuario (String user, String pass) throws GlobalException, NoDataException, SQLException {
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
                rs.getString("apellidos"),rs.getString("correo"),rs.getString("fechaNac"),rs.getString("direccion"),rs.getInt("telefonoTrab"),rs.getInt("celular"));
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
    public ArrayList listarVuelo() throws GlobalException, NoDataException {
        try {
            conectar();
        } catch (ClassNotFoundException ex) {
            throw new GlobalException("No se ha localizado el Driver");
        } catch (SQLException e) {
            throw new NoDataException("La base de datos no se encuentra disponible");
        }

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
                elVuelo = new vuelo(rs.getBoolean("codigo"),
                        rs.getBoolean("codigo"),
                        rs.getString("descripcion"),
                        rs.getString("descripcion"),
                        rs.getString("descripcion"),
                        rs.getString("descripcion")
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
            pstmt.setFloat(4, laRuta.getDuracion());
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
    
}

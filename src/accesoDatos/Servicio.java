package accesoDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Servicio {
    
    protected Connection conexion = null;

    public Servicio() {

    }

    protected void conectar() throws SQLException, ClassNotFoundException {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        conexion = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "admin");

    }

    protected void desconectar() throws SQLException {
        if (!conexion.isClosed()) {
            conexion.close();
        }
    }
}

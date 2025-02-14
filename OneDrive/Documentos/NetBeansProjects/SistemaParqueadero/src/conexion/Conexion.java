package conexion;

import java.sql.*;

public class Conexion {
// conexion local 
    public static Connection conectar() {
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_sistemaparqueadero", "root", "1234");
            return cn;
        } catch (SQLException e) {
            System.out.println("Error en la conexion local " + e);
        }
        return null;
    }

}

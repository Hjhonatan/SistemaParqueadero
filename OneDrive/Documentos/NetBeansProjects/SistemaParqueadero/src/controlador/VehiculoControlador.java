package controlador;

import com.mysql.jdbc.PreparedStatement;
import conexion.Conexion;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.Vehiculo;

/**
 *
 * @author jhona
 */
public class VehiculoControlador {

    public boolean guardar(Vehiculo vehiculo) {
        boolean respuesta = false;

        //Statement st;
        Connection cn = Conexion.conectar();

       try {
            PreparedStatement consulta = (PreparedStatement) cn.prepareStatement("INSERT INTO vehiculos VALUES (?, ?, ?, ?, ?, ?, ?, ?)");

            consulta.setInt(1, 0);
            consulta.setString(2, vehiculo.getPlaca());
            consulta.setString(3, vehiculo.getPropietario());
            consulta.setString(4, vehiculo.getTipoVehiculo());
            consulta.setString(5, vehiculo.getHoraEntrada());
            consulta.setString(6, vehiculo.getHoraSalida());
            consulta.setDouble(7, vehiculo.getValorPagado());
            consulta.setString(8, vehiculo.getEstado());
            
            if (consulta.executeUpdate() > 0){
                respuesta = true;
            }
                    

        } catch (SQLException e) {
            System.out.println("Error al guardar vehiculo " + e);
            JOptionPane.showMessageDialog(null, "Error al guardar vehiculo");
        }
        return respuesta;

    }

}

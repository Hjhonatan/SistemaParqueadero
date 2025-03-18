package controlador;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import conexion.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

        } catch (SQLException e) {
            System.out.println("Error al guardar vehiculo " + e);
            JOptionPane.showMessageDialog(null, "Error al guardar vehiculo");
        }
        return respuesta;

    }

    //metodo para consuktar vehiculo 
    public ArrayList<Vehiculo> listaVehiculo = new ArrayList<>();

    public ArrayList buscarVehiculosPlacasFecha(String placaPropietario, String fecha) throws SQLException {
        String sql = "";

        fecha = fecha.replace("/", "-");
        if (!placaPropietario.isEmpty() && !fecha.isEmpty()) {
            sql = "select * from vehiculos where placa LIKE '%" + placaPropietario
                    + "%' OR propietario LIKE '%" + placaPropietario + "%' AND hora_entrada LIKE '"
                    + fecha + "%';";
        } else if (!placaPropietario.isEmpty()) {
            sql = "select * from vehiculos where placa LIKE '%" + placaPropietario
                    + "%' OR propietario LIKE '%" + placaPropietario + "%';";
        } else if (!fecha.isEmpty()) {
            sql = "select * from vehiculos where hora_entrada LIKE '"
                    + fecha + "%';";

        }

        Statement st;
        try{
            Connection cn = Conexion.conectar();
            st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            Vehiculo vehiculo;
            while (rs.next()) {
                vehiculo = new Vehiculo();
                vehiculo.setIdVehiculo(rs.getInt("id_vehiculo"));
                vehiculo.setPlaca(rs.getString("placa"));
                vehiculo.setPropietario(rs.getString("propietario"));
                vehiculo.setTipoVehiculo(rs.getString("tipo_vehiculo"));
                vehiculo.setHoraEntrada(rs.getString("hora_entrada"));
                vehiculo.setHoraSalida(rs.getString("hora_salida"));
                vehiculo.setValorPagado(rs.getDouble("valor_pagado"));
                vehiculo.setEstado(rs.getString("estado"));
                
                listaVehiculo.add(vehiculo);
            }
                } catch (SQLException e) {
            System.out.println("Error al consultar los vehiculos " + e);
        }
        return listaVehiculo;
}
    }


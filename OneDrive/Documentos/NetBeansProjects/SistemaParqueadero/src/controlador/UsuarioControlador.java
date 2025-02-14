package controlador;

import conexion.Conexion;
import modelo.Usuario;
import java.sql.*;
import javax.swing.JOptionPane;

public class UsuarioControlador {

    public boolean login(Usuario usuario) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        String sql = "SELECT usuario, contraseña FROM tb_usuario WHERE usuario = '"
                + usuario.getUsuario() + "' AND contraseña = '" + usuario.getContraseña() + "'";

        Statement st;

        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                respuesta = true;

            }

        } catch (SQLException e) {
            System.out.println("Error al inicar sesion " + e);
            JOptionPane.showMessageDialog(null, "Error al inicar sesion");
        }
        return respuesta;

    }

}

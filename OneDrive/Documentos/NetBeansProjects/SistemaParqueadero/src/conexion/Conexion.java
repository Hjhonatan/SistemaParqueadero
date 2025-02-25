package conexion; // Define el paquete al que pertenece esta clase

import java.sql.*; // Importa las clases necesarias para la conexión a MySQL
import java.util.logging.Level;
import java.util.logging.Logger; // Importa las clases para manejar registros de eventos (logs)

public class Conexion {
    
    // Método para establecer la conexión con la base de datos MySQL local
    public static Connection conectar() {
        try {
            try { 
                // Carga el controlador de MySQL (versión antigua 5.x)
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                // Si el driver no se encuentra, se registra un error en la consola
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            // Establece la conexión con la base de datos "bd_sistemaparqueadero" en localhost
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_sistemaparqueadero", "root", "");
            
            // Retorna la conexión si fue exitosa
            return cn;
        } catch (SQLException e) {
            // Si hay un error en la conexión, se muestra en la consola
            System.out.println("Error en la conexión local " + e);
        }
        
        // Retorna null si no se pudo establecer la conexión
        return null;
    }

}

/*
    // Método para establecer la conexión con la base de datos
    public static Connection conectar() {
        // Declaramos las variables para la URL, usuario y contraseña
        String url = "jdbc:mysql://localhost:3306/bd_sistemaparqueadero"; // URL de la base de datos
        String usuario = "root"; // Usuario para la conexión
        String contraseña = ""; // Sin contraseña

        // Intentamos hacer la conexión
        try {
            // Cargar el driver de MySQL
            Class.forName("com.mysql.jdbc.Driver"); 

            // Establecemos la conexión usando DriverManager
            Connection cn = DriverManager.getConnection(url, usuario, contraseña);
            System.out.println("Conexión exitosa a la base de datos.");
            return cn; // Retornamos la conexión si fue exitosa
        } catch (ClassNotFoundException e) {
            // Si no se encuentra el driver, mostramos el error
            System.out.println("Error: No se encontró el driver de MySQL.");
            e.printStackTrace();
        } catch (SQLException e) {
            // Si ocurre un error de SQL, lo mostramos en consola
            System.out.println("Error en la conexión local: " + e.getMessage());
            e.printStackTrace();
        }

        return null; // Si la conexión falla, retornamos null
    }
*/


package ConnectionBD;

import java.sql.*;

public class PruebaConnectionBD {

    public static void main(String[] args) {
        // Crear una instancia de la clase ConnectionBD
        ConnectionBD claseConnectionBD = new ConnectionBD();

        // Obtener la conexión a la base de datos
        try {
            Connection conexion = ConnectionBD.obtenerConexion();

            // Verificar si la conexión es válida
            if (conexion != null) {
                System.out.println("La conexión a la base de datos es válida.");
                conexion.close(); // Cerrar la conexión después de su uso
            } else {
                System.out.println("La conexión a la base de datos no es válida.");
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener la conexión: " + e.getMessage());
        }
    }
}

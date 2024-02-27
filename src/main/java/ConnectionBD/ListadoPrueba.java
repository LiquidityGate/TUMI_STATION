package ConnectionBD;

import ConnectionBD.VistaRolesApp.Menu;
import java.sql.*;

public class ListadoPrueba {

    public static void main(String[] args) {
        Connection conexion = null;
        Statement stmt = null;
        ResultSet rs = null;

       try ( Connection connection = ConnectionBD.obtenerConexion()) {
            String sql = "SELECT Codigo_Rol, Descripcion_Rol FROM Tb_RolesApp";
            try ( PreparedStatement statement = connection.prepareStatement(sql);  ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    int codigo_Rol = resultSet.getInt("Codigo_Rol");
                    String nombreRol = resultSet.getString("Descripcion_Rol");

          
                     System.out.println("Menú: Código=" + codigo_Rol + ", Nombre=" + nombreRol);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar ResultSet, Statement y Connection
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conexion != null) {
                    ConnectionBD.cerrarConexion(conexion);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

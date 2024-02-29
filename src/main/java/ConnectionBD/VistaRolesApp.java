import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class VistaRolesApp {

    public static class Menu {

        private String nombreRol;
        private int codigoRol;

        public String getNombreRol() {
            return nombreRol;
        }

        public void setNombreRol(String nombreRol) {
            this.nombreRol = nombreRol;
        }

        public int getCodigoRol() {
            return codigoRol;
        }

        public void setCodigoRol(int codigoRol) {
            this.codigoRol = codigoRol;
        }
    }

    public List<Menu> getAllMenus() {
        List<Menu> menus = new ArrayList<>();

        // Nombre del procedimiento almacenado
        String storedProcedure = "ObtenerRolesParaTumiStation";

        try (Connection connection = ConnectionBD.ConnectionBD.obtenerConexion();
             // Llamada al procedimiento almacenado
             PreparedStatement statement = connection.prepareCall("{call " + storedProcedure + "}")) {

            // Ejecutar la llamada al procedimiento almacenado
            try (ResultSet resultSet = statement.executeQuery()) {

                while (resultSet.next()) {
                    
                    String nombreRol = resultSet.getString("Descripcion_Rol");

                    Menu menu = new Menu();
                   
                    menu.setNombreRol(nombreRol);

                    menus.add(menu);
                    System.out.println("  Nombre=" + nombreRol);
                }
            }

        } catch (SQLException e) {
            System.err.println("Error al obtener los menús: " + e.getMessage());
        }

        return menus;
    }
}

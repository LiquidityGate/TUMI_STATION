package com.tumistation.modelo;


import com.tumistation.controlador.ConnectionBD;
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

        String sql = "SELECT Codigo_Rol, Descripcion_Rol FROM Tb_RolesApp";

        try (Connection connection = ConnectionBD.obtenerConexion();
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                int codigoRol = resultSet.getInt("Codigo_Rol");
                String nombreRol = resultSet.getString("Descripcion_Rol");

                Menu menu = new Menu();
                menu.setCodigoRol(codigoRol);
                menu.setNombreRol(nombreRol);

                menus.add(menu);
                System.out.println("Menú: Código=" + codigoRol + ", Nombre=" + nombreRol);
            }

        } catch (SQLException e) {
            System.err.println("Error al obtener los menús: " + e.getMessage());
        }

        return menus;
    }
}
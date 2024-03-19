package com.tumistation.controlador;

import java.io.Serializable;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;

@Named(value = "filtro")
@ManagedBean
@SessionScoped
public class FiltraEspecialidad implements Serializable {

    private static final long serialVersionUID = 1L;
    private List<String> listaDatos;
    private String valorSeleccionado; // Nuevo atributo para almacenar la opción seleccionada en el filtro

    public FiltraEspecialidad() {
        cargarDatosDesdeSP();
    }

    private void cargarDatosDesdeSP() {
        listaDatos = new ArrayList<>();

        try (Connection connection = obtenerConexion()) {
            String sql = "{call ObtenerRolesParaTumiStation()}";
            try (CallableStatement statement = connection.prepareCall(sql); ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    String dato = resultSet.getString("Descripcion_Rol");
                    listaDatos.add(dato);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<String> getListaDatos() {
        return listaDatos;
    }

    public String getValorSeleccionado() {
        return valorSeleccionado;
    }

    public void setValorSeleccionado(String valorSeleccionado) {
        this.valorSeleccionado = valorSeleccionado;
    }

    // Método para obtener la conexión a la base de datos
    private Connection obtenerConexion() throws SQLException {
        // Configura tus credenciales y URL de conexión
        String url = "jdbc:sqlserver://192.168.1.38:1433;databaseName=ETUMI_BD";
        String usuario = "sa";
        String password = "@123PDR";

        // Intenta establecer la conexión
        Connection conn = DriverManager.getConnection(url, usuario, password);
        return conn;
    }
}

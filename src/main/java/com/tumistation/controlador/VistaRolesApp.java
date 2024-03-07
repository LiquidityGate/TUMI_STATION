package com.tumistation.controlador;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "VistaRolesApp")
@RequestScoped
public class VistaRolesApp implements Serializable {

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

    private List<Menu> listaMenus;
    private List<String> listaFiltroAsociados;
    private String filtroAsociadoSeleccionado;

    @PostConstruct
    public void init() {
        obtenerListaMenus();
        obtenerListaFiltroAsociados();
    }

    public List<String> buscarAsociados(String query) {
        List<String> resultados = new ArrayList<>();

        // Filtrar la lista de asociados según la consulta
        for (String asociado : listaFiltroAsociados) {
            if (asociado.toLowerCase().contains(query.toLowerCase())) {
                resultados.add(asociado);
            }
        }

        return resultados;
    }

    public void obtenerListaFiltroAsociados() {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            connection = ConnectionBD.obtenerConexion();
             String nombreRoles = obtenerNombreFiltroAsociado(filtroAsociadoSeleccionado);
            
                statement = connection.prepareStatement("EXEC [dbo].[SPTS_FiltrarAsociados_ByEspecialidad] @rol = ?");
                  statement.setString(1, nombreRoles); // Pasar la especialidad como parámetro
            resultSet = statement.executeQuery();

            listaFiltroAsociados = new ArrayList<>();

            while (resultSet.next()) {
                String nombre_Departamento = resultSet.getString("Nombre_Departamento");
                String nombre_Asociado = resultSet.getString("Nombres_Asociado");
                String apePaterno_Asociado = resultSet.getString("ApePaterno_Asociado");
                String apeMaterno_Asociado = resultSet.getString("ApeMaterno_Asociado");
                Date fecNacimiento = resultSet.getDate("FecNacimiento_Asociado");
                String descripcion_TIpoDocIdent = resultSet.getString("Descripcion_TipoDocIdent");
                String numDocIdent_Asociado = resultSet.getString("NumDocIdent_Asociado");
                String descripcion_Rol = resultSet.getString("Descripcion_Rol");
                String descripcion_Sexo = resultSet.getString("Descripcion_Sexo");
                String descripcion_EstadoCivil = resultSet.getString("Descripcion_EstadoCivil");
                String descripcion_TipoSangre = resultSet.getString("Descripcion_EstadoCivil");
                String nombre_Pais = resultSet.getString("Nombre_Pais");
                String nombre_Provincia = resultSet.getString("Nombre_provincia");
                String nombre_Distrito = resultSet.getString("Nombre_Distrito");
                String domicilio_Asociado = resultSet.getString("Domicilio_Asociado");
                String referenciaDomicilio_Asociado = resultSet.getString("ReferenciaDomicilio_Asociado");
                String numeroTelefono_Asociado = resultSet.getString("NumeroTelefono_Asociado");
                String correo_Asociado = resultSet.getString("Correo_Asociado");
                Date fecRegistro_Asociado = resultSet.getDate("FecRegistro_Asociado");
                int estadoActividad_Asociado = resultSet.getInt("EstadoActividad_Asociado");

                String asociadoInfo = String.format("Nombre_Departamento: %s, Nombres_Asociado: %s, ApePaterno_Asociado: %s, ApeMaterno_Asociado: %s, FecNacimiento_Asociado: %s, Descripcion_TipoDocIdent: %s, NumDocIdent_Asociado: %s, Descripcion_Rol: %s, Descripcion_Sexo: %s, Descripcion_EstadoCivil: %s, Descripcion_TipoSangre: %s, Nombre_Pais: %s, Nombre_provincia: %s, Nombre_Distrito: %s, Domicilio_Asociado: %s, ReferenciaDomicilio_Asociado: %s, NumeroTelefono_Asociado: %s, Correo_Asociado: %s, FecRegistro_Asociado: %s, EstadoActividad_Asociado: %s",
                        nombre_Departamento, nombre_Asociado, apePaterno_Asociado, apeMaterno_Asociado, fecNacimiento, descripcion_TIpoDocIdent, numDocIdent_Asociado, descripcion_Rol, descripcion_Sexo, descripcion_EstadoCivil, descripcion_TipoSangre, nombre_Pais, nombre_Provincia, nombre_Distrito, domicilio_Asociado, referenciaDomicilio_Asociado, numeroTelefono_Asociado, correo_Asociado, fecRegistro_Asociado, estadoActividad_Asociado);

                listaFiltroAsociados.add(asociadoInfo);
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener la lista de Filtro Asociados: " + e.getMessage());
        } finally {
            closeResources(resultSet, statement, connection);
        }
    }

    public void obtenerListaMenus() {
        listaMenus = new ArrayList<>();

        // Nombre del procedimiento almacenado
        String storedProcedure = "ObtenerRolesParaTumiStation";

        try (Connection connection = ConnectionBD.obtenerConexion();
             // Llamada al procedimiento almacenado
             PreparedStatement statement = connection.prepareCall("{call " + storedProcedure + "}")) {

            // Ejecutar la llamada al procedimiento almacenado
            try (ResultSet resultSet = statement.executeQuery()) {

                while (resultSet.next()) {
                    String nombreRol = resultSet.getString("Descripcion_Rol");

                    Menu menu = new Menu();
                    menu.setNombreRol(nombreRol);

                    listaMenus.add(menu);
                    System.out.println(" Nombre=" + nombreRol);
                }
            }

        } catch (SQLException e) {
            System.err.println("Error al obtener los menús: " + e.getMessage());
        }
    }

    public String obtenerNombreFiltroAsociado(String nombreFIltroAsociado) {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        String nombreFiltroAsociado = "";

        try {
            connection = ConnectionBD.obtenerConexion();
            statement = connection.prepareStatement("EXEC [dbo].[SP_ObtenerNombrePorFiltroAsociado_Nuevo] @nombreFiltroAsociado = ?");
            statement.setString(1, nombreFIltroAsociado);
            resultSet = statement.executeQuery();

            if (resultSet.next()) {
                nombreFiltroAsociado = resultSet.getString("Descripcion_Rol");
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener el nombre del filtro de asociado: " + e.getMessage());
        } finally {
            closeResources(resultSet, statement, connection);
        }

        return nombreFiltroAsociado;
    }

    public List<String> getListaFiltroAsociados() {
        return listaFiltroAsociados;
    }

    public List<Menu> getListaMenus() {
        return listaMenus;
    }

    public String getFiltroAsociadoSeleccionado() {
        return filtroAsociadoSeleccionado;
    }

    public void setListaFiltroAsociados(List<String> listaFiltroAsociados) {
        this.listaFiltroAsociados = listaFiltroAsociados;
    }

    public void setListaMenus(List<Menu> listaMenus) {
        this.listaMenus = listaMenus;
    }

    public void setFiltroAsociadoSeleccionado(String filtroAsociadoSeleccionado) {
        this.filtroAsociadoSeleccionado = filtroAsociadoSeleccionado;
    }

    private void closeResources(ResultSet resultSet, PreparedStatement statement, Connection connection) {
        try {
            if (resultSet != null) {
                resultSet.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            System.out.println("Error al cerrar los recursos: " + e.getMessage());
        }
    }
    public void mostrarNombreRolSeleccionado(String nombreRolSeleccionado) {
    System.out.println("Nombre de Rol Seleccionado: " + nombreRolSeleccionado);
}
}

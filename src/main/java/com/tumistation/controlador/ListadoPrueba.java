package com.tumistation.controlador;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ListadoPrueba {

    public static void main(String[] args) {
        try {
            List<String> listaFiltroAsociados = obtenerListaFiltroAsociados();

            for (String asociadoInfo : listaFiltroAsociados) {
                System.out.println(asociadoInfo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<String> obtenerListaFiltroAsociados() throws SQLException {
        List<String> listaFiltroAsociados = new ArrayList<>();

        try ( Connection connection = ConnectionBD.obtenerConexion()) {
            String nombreRoles = obtenerNombreFiltroAsociado("Licenciado en Enfermería");

            String sql = "EXEC [dbo].[SPTS_FiltrarAsociados_ByEspecialidad] @rol = ?";
            try ( PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, "Licenciado en Enfermería");
                try ( ResultSet resultSet = statement.executeQuery()) {
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
                }
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener la lista de Filtro Asociados: " + e.getMessage());
            throw e; // Relanzar la excepción para que se maneje en la capa superior
        }

        return listaFiltroAsociados;
    }

    public static String obtenerNombreFiltroAsociado(String filtroAsociadoSeleccionado) throws SQLException {
        // Implementa tu lógica para obtener el nombre del filtro asociado
        // Puedes utilizar una consulta similar a la que usas en obtenerListaFiltroAsociados
        return "Nombre del Filtro Asociado";
    }
}

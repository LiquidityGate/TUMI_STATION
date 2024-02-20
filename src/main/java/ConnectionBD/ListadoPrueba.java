package ConnectionBD;

import java.sql.*;

public class ListadoPrueba {

    public static void main(String[] args) {
        Connection conexion = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // Establecer conexión
            conexion = ConnectionBD.obtenerConexion();
            if (conexion != null) {
                // Crear la declaración
                stmt = conexion.createStatement();

                
                // Ejecutar la consulta
                String consultaSQL = "{call ObtenerDatosAsociados}"; // Reemplaza con tu procedimiento almacenado
                rs = stmt.executeQuery(consultaSQL);

                // Imprimir resultados por consola
                while (rs.next()) {
                    // Imprime cada columna que desees mostrar en la consola
                    System.out.println("Código Asociado: " + rs.getInt("Codigo_Asociado"));
                    System.out.println("Nombres: " + rs.getString("Nombres_Asociado"));
                    System.out.println("Apellido Paterno: " + rs.getString("ApePaterno_Asociado"));
                    System.out.println("Apellido Materno: " + rs.getString("ApeMaterno_Asociado"));
                    System.out.println("Fecha Nacimiento: " + rs.getDate("FecNacimiento_Asociado"));
                    System.out.println("Tipo de Documento: " + rs.getString("Descripcion_TipoDocIdent"));
                    System.out.println("Numero de Documento: " + rs.getString("NumDocIdent_Asociado"));
                    System.out.println("Especialidad: " + rs.getString("Descripcion_Rol"));
                    System.out.println("Genero: " + rs.getString("Descripcion_Sexo"));
                    System.out.println("Estado Civil: " + rs.getString("Descripcion_EstadoCivil"));
                    System.out.println("Tipo Sangre: " + rs.getString("Descripcion_TipoSangre"));
                    System.out.println("Pais: " + rs.getString("Nombre_Pais"));
                    System.out.println("Departamento: " + rs.getString("Nombre_Departamento"));
                    System.out.println("Provincia: " + rs.getString("Nombre_Provincia"));
                    System.out.println("Distrito: " + rs.getString("Nombre_Distrito"));
                    System.out.println("Domicilio: " + rs.getString("Domicilio_Asociado"));
                    System.out.println("Referencias: " + rs.getString("ReferenciaDomicilio_Asociado"));
                    System.out.println("Numero Telefono: " + rs.getString("NumeroTelefono_Asociado"));
                    System.out.println("Correo Electronico: " + rs.getString("Correo_Asociado"));
                    System.out.println("Fecha de Registro: " + rs.getDate("FecRegistro_Asociado"));
                    System.out.println("Actividad Asociado: " + rs.getByte("EstadoActividad_Asociado"));


                    // Agrega las demás columnas que deseas imprimir
                    // ...
                    System.out.println("--------------------------------------");
                }  
            }
/*
            String consultaSQL = "SELECT * FROM Mstr_Asociados where Codigo_Asociado = 1"; // Reemplaza con el nombre de tu tabla
            rs = stmt.executeQuery(consultaSQL);

            while (rs.next()) {
                // Imprimir cada columna en la consola
                System.out.println("Código Asociado: " + rs.getInt("Codigo_Asociado"));
                System.out.println("Rol: " + rs.getString("codRol"));
                System.out.println("Tipo de Documento: " + rs.getString("codTipoDocIdent"));
                System.out.println("Número de RUC: " + rs.getString("NumeroRuc_Asociado"));
                System.out.println("Número de Documento: " + rs.getString("NumDocIdent_Asociado"));
                System.out.println("Nombres: " + rs.getString("Nombres_Asociado"));
                System.out.println("Apellido Paterno: " + rs.getString("ApePaterno_Asociado"));
                System.out.println("Apellido Materno: " + rs.getString("ApeMaterno_Asociado"));
                System.out.println("Fecha de Nacimiento: " + rs.getDate("FecNacimiento_Asociado"));
                System.out.println("Género: " + rs.getString("codSexo"));
                System.out.println("Estado Civil: " + rs.getString("codEstadoCivil"));
                System.out.println("Tipo de Sangre: " + rs.getString("codTipoSangre"));
                System.out.println("País: " + rs.getString("codPais"));
                System.out.println("Departamento: " + rs.getString("codDepartamento"));
                System.out.println("Provincia: " + rs.getString("codProvincia"));
                System.out.println("Distrito: " + rs.getString("codDistrito"));
                System.out.println("Domicilio: " + rs.getString("Domicilio_Asociado"));
                System.out.println("Referencia Domicilio: " + rs.getString("ReferenciaDomicilio_Asociado"));
                System.out.println("Ubigeo: " + rs.getString("Ubigeo_Asociado"));
                System.out.println("Foto de Perfil: " + rs.getString("FotoPerfil_Asociado"));
                System.out.println("Número de Teléfono: " + rs.getString("NumeroTelefono_Asociado"));
                System.out.println("Correo Electrónico: " + rs.getString("Correo_Asociado"));
                System.out.println("Clave: " + rs.getString("Clave_Asociado"));
                System.out.println("Fecha de Registro: " + rs.getDate("FecRegistro_Asociado"));
                System.out.println("Situación de Acceso: " + rs.getString("codSituacionAccesoAsociado"));
                System.out.println("Fecha de Inicio de Suspensión: " + rs.getDate("FecInicioSuspension"));
                System.out.println("Fecha de Término de Suspensión: " + rs.getDate("FecTerminoSuspencion"));
                System.out.println("Estado de Actividad: " + rs.getByte("EstadoActividad_Asociado"));
                System.out.println("Acepto Términos: " + rs.getByte("AceptoTerminos"));
                System.out.println("Acepto Términos: " + rs.getInt("codBanco"));
                System.out.println("Acepto Términos: " + rs.getString("numeroCuentaBancaria_Asociado"));
            }
*/

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

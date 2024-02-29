
package com.tumistation.controlador;


import com.tumistation.controlador.ConnectionBD;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name = "validacionManagedBean")
@SessionScoped
public class ValidacionManagenBean implements Serializable {

    private String dni;
    private String contraseña;

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    // Método para validar el usuario en tu base de datos
    public boolean validarUsuario(String dni, String contraseña) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            // Obtiene la conexión a la base de datos desde la clase Conexion.
            connection = ConnectionBD.obtenerConexion();

            // Supongamos que tienes una tabla llamada 'Tb_Usuarios' con columnas 'dni' y 'contraseña'.
            String sql = "SELECT * FROM Tb_Usuarios WHERE dni = ? AND contraseña = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, dni);
            preparedStatement.setString(2, contraseña);

            resultSet = preparedStatement.executeQuery();

            // Si se encuentra un registro que coincide con el correo y la contraseña proporcionados,
            // significa que la validación es exitosa.
            return resultSet.next();
        } catch (SQLException e) {
            // Maneja cualquier excepción de la base de datos aquí.
            e.printStackTrace();
            return false;
        } finally {
            // Cierra los recursos (ResultSet, PreparedStatement y Connection).
            // Asegúrate de manejar adecuadamente las excepciones aquí.
            cerrarRecursos(resultSet, preparedStatement, connection);
        }
    }

    public String validarInicioSesion() {
        // Implementa la lógica de validación de inicio de sesión aquí.
        // Accede a los valores de correo y contraseña utilizando los getters correspondientes.

        // Ejemplo de validación ficticia
        if (validarUsuario(dni, contraseña)) {
            FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuarioi", dni);
            // Redirige al usuario a la página "menu.xhtml" después de la validación exitosa.
            return "dashboard.xhtml?faces-redirect=true";
        } else {
            // Autenticación fallida, muestra un mensaje de error
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error de inicio de sesión", "Correo o contraseña incorrectos"));
            return null; // Permanece en la misma página de inicio de sesión
        }
    }
    //Metodo para restablecer los valores
    public void resetFields() {
        dni = null;
        contraseña = null;
    }


    // Método para cerrar recursos
    private void cerrarRecursos(ResultSet resultSet, PreparedStatement preparedStatement, Connection connection) {
        try {
            if (resultSet != null) {
                resultSet.close();
            }
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            // Maneja las excepciones adecuadamente
            e.printStackTrace();
        }
    }
}


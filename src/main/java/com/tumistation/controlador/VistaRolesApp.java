
import com.tumistation.controlador.ConnectionBD;
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
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "VistaRolesApp")
@RequestScoped
public class VistaRolesApp implements Serializable {

    public static class Menu {

        private int numDocIdent_asociadol;
        private String numDocIdent_asociado;
        private String nombres;
        private String descripcion_rol;
        private Date fechaRegistro;
        private int estadoActividad;

        // Getters y Setters
        // ...
        // Getter y Setter para numDocIdent_asociadol
        public int getNumDocIdent_asociadol() {
            return numDocIdent_asociadol;
        }

        public void setNumDocIdent_asociadol(int numDocIdent_asociadol) {
            this.numDocIdent_asociadol = numDocIdent_asociadol;
        }

        // Getter y Setter para numDocIdent_asociado
        public String getNumDocIdent_asociado() {
            return numDocIdent_asociado;
        }

        public void setNumDocIdent_asociado(String numDocIdent_asociado) {
            this.numDocIdent_asociado = numDocIdent_asociado;
        }

        // Getter y Setter para nombres
        public String getNombres() {
            return nombres;
        }

        public void setNombres(String nombres) {
            this.nombres = nombres;
        }

        // Getter y Setter para descripcion_rol
        public String getDescripcion_rol() {
            return descripcion_rol;
        }

        public void setDescripcion_rol(String descripcion_rol) {
            this.descripcion_rol = descripcion_rol;
        }

        // Getter y Setter para fechaRegistro
        public Date getFechaRegistro() {
            return fechaRegistro;
        }

        public void setFechaRegistro(Date fechaRegistro) {
            this.fechaRegistro = fechaRegistro;
        }

        // Getter y Setter para estadoActividad
        public int getEstadoActividad() {
            return estadoActividad;
        }

        public void setEstadoActividad(int estadoActividad) {
            this.estadoActividad = estadoActividad;
        }

    }

    private List<Menu> listaMenus;
    private List<String> listaFiltroAsociados;
    private String filtroAsociadoSeleccionado;

    @PostConstruct
    public void init() {
        obtenerListaMenus();
    }

    public void obtenerListaMenus() {
        listaMenus = new ArrayList<>();

        String storedProcedure = "SP_ObtenerDatosAsociados";

        try ( Connection connection = ConnectionBD.obtenerConexion();  PreparedStatement statement = connection.prepareCall("{call " + storedProcedure + "}")) {

            try ( ResultSet resultSet = statement.executeQuery()) {

                while (resultSet.next()) {
                    int codigo_Asociado = resultSet.getInt("Codigo_Asociado");
                    String numDocIdent_asociado = resultSet.getString("NumDocIdent_Asociado");
                    String nombres = resultSet.getString("Nombres");
                    String descripcion_rol = resultSet.getString("Descripcion_Rol");
                    Date fechaRegistro = resultSet.getDate("FecRegistro_Asociado");
                    int estadoActividad = resultSet.getInt("EstadoActividad_Asociado");

                    Menu menu = new Menu();
                    menu.setNumDocIdent_asociadol(codigo_Asociado);
                    menu.setNumDocIdent_asociado(numDocIdent_asociado);
                    menu.setNombres(nombres);
                    menu.setDescripcion_rol(descripcion_rol);
                    menu.setFechaRegistro(fechaRegistro);
                    menu.setEstadoActividad(estadoActividad);

                    listaMenus.add(menu);
                    System.out.println(" Nombre=" + codigo_Asociado + "numeroDocumento"  + numDocIdent_asociado + " nombre" + nombres);
                }
            }

        } catch (SQLException e) {
            System.err.println("Error al obtener los menús: " + e.getMessage());
        }
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

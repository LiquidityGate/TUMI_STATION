package com.tumistation.controlador;


import com.tumistation.controlador.ConnectionBD;
import java.sql.Connection;
import com.tumistation.controlador.VistaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named(value = "DataAfiliados")
@RequestScoped
public class formPostulacionesAsociadosBean {

    private VistaData datavista;
    private List<VistaData> listavista;

    public formPostulacionesAsociadosBean() {
        datavista = new VistaData();
    }

    public void inicializar() {
        listavista = ListarDatos();
    }

    public VistaData getDatavista() {
        return datavista;
    }

    public void setDatavista(VistaData datavista) {
        this.datavista = datavista;
    }

    public List<VistaData> getListavista() {
        return listavista;
    }

    public void setListavista(List<VistaData> listavista) {
        this.listavista = listavista;
    }

    public List<VistaData> ListarDatos() {
        List<VistaData> data = new ArrayList<>();

        try ( Connection con = ConnectionBD.obtenerConexion();  Statement sql = con.createStatement();  ResultSet rs = sql.executeQuery("select * from Mstr_Asociados")) {

            while (rs.next()) {
                VistaData la = new VistaData();
                rs.getInt("Codigo_Asociado");
                rs.getInt("codRol");
                rs.getInt("codTipoDocIdent");
                rs.getString("NumeroRuc_Asociado");
                rs.getString("NumDocIdent_Asociado");
                rs.getString("Nombres_Asociado");
                rs.getString("ApePaterno_Asociado");
                rs.getString("ApeMaterno_Asociado");
                rs.getDate("FecNacimiento_Asociado");
                rs.getInt("codSexo");
                rs.getInt("codEstadoCivil");
                rs.getInt("codTipoSangre");
                rs.getInt("codPais");
                rs.getInt("codDepartamento");
                rs.getInt("codProvincia");
                rs.getInt("codDistrito");
                rs.getString("Domicilio_Asociado");
                rs.getString("ReferenciaDomicilio_Asociado");
                rs.getString("Ubigeo_Asociado");
                rs.getString("FotoPerfil_Asociado");
                rs.getString("NumeroTelefono_Asociado");
                rs.getString("Correo_Asociado");
                rs.getString("Clave_Asociado");
                rs.getDate("FecRegistro_Asociado");
                rs.getInt("codSituacionAccesoAsociado");
                rs.getDate("FecInicioSuspension");
                rs.getDate("FecTerminoSuspension");
                rs.getBoolean("EstadoActividad_Asociado");
                rs.getBoolean("AceptoTerminos");
                rs.getInt("codBanco");
                rs.getString("NumeroCuentaBancaria_Asociado");

                data.add(la);
            }

            Collections.sort(data, Comparator.comparingInt(VistaData::getCodigo_Asociado));

        } catch (SQLException e) {
            System.out.println("Error al traer los datos del registro: " + e.toString());
        }

        return data;
    }

    //TRAER LOS METODOS GETTERS Y SETTERS DE NUESTRA CLASE VISTA
    public List<VistaData> getListarDatos() {
        return listavista;
    }

    public void setListarDatos(ArrayList<VistaData> list) {
        this.listavista = list;
    }
}

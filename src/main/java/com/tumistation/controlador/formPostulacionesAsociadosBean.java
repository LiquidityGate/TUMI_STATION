package com.tumistation.controlador;

import com.tumistation.controlador.VistaData;
import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.Date;
import java.sql.ResultSet;
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

    public List<VistaData>ListarDatos() {
        List<VistaData> data = new ArrayList<>();

        try ( Connection con = ConnectionBD.obtenerConexion();  CallableStatement cstmt = con.prepareCall("{call SP_ObtenerDatosAsociados()}");  ResultSet rs = cstmt.executeQuery()) {

            while (rs.next()) {
                VistaData usuario = new VistaData(
                        rs.getInt("Codigo_Asociado"),
                        rs.getString("NumDocIdent_Asociado"),
                        rs.getString("Nombres"),
                        rs.getString("Descripcion_Rol"),
                        rs.getDate("FecRegistro_Asociado"),
                        rs.getByte("EstadoActividad_Asociado")
                );
            data.add(usuario);
            }

            Collections.sort(data, Comparator.comparingInt(VistaData::getCodigo_Asociado));

        } catch (Exception e) {
            e.printStackTrace();
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

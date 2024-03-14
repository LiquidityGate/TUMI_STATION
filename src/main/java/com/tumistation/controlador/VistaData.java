/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tumistation.controlador;

import java.sql.Date;

class VistaData {

    private int Codigo_Asociado;
    private String NumDocIdent_Asociado;
    private String Nombres;
    private String Descripcion_Rol;
    private Date FecRegistro_Asociado;
    private byte EstadoActividad_Asociado;

    public VistaData(int Codigo_Asociado, String NumDocIdent_Asociado, String Nombres, String Descripcion_Rol, Date FecRegistro_Asociado, byte EstadoActividad_Asociado) {
        this.Codigo_Asociado = Codigo_Asociado;
        this.NumDocIdent_Asociado = NumDocIdent_Asociado;
        this.Nombres = Nombres;
        this.Descripcion_Rol = Descripcion_Rol;
        this.FecRegistro_Asociado = FecRegistro_Asociado;
        this.EstadoActividad_Asociado = EstadoActividad_Asociado;
    }

    public VistaData() {
    }

    public int getCodigo_Asociado() {
        return Codigo_Asociado;
    }

    public void setCodigo_Asociado(int Codigo_Asociado) {
        this.Codigo_Asociado = Codigo_Asociado;
    }

    public String getNumDocIdent_Asociado() {
        return NumDocIdent_Asociado;
    }

    public void setNumDocIdent_Asociado(String NumDocIdent_Asociado) {
        this.NumDocIdent_Asociado = NumDocIdent_Asociado;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getDescripcion_Rol() {
        return Descripcion_Rol;
    }

    public void setDescripcion_Rol(String Descripcion_Rol) {
        this.Descripcion_Rol = Descripcion_Rol;
    }

    public Date getFecRegistro_Asociado() {
        return FecRegistro_Asociado;
    }

    public void setFecRegistro_Asociado(Date FecRegistro_Asociado) {
        this.FecRegistro_Asociado = FecRegistro_Asociado;
    }

    public byte getEstadoActividad_Asociado() {
        return EstadoActividad_Asociado;
    }

    public void setEstadoActividad_Asociado(byte EstadoActividad_Asociado) {
        this.EstadoActividad_Asociado = EstadoActividad_Asociado;
    }
}

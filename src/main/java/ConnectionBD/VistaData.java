package ConnectionBD;

import java.sql.Date;

public class VistaData {

    // Objetos
    
    private int codigo_Asociado;
    private int codRol;
    private int codTipoDocIdent;
    private String numeroRuc_Asociado;
    private String numDocIdent_Asociado;
    private String nombres_Asociado;
    private String apePaterno_Asociado;
    private String apeMaterno_Asociado;
    private Date fecNacimiento_Asociado;
    private int codSexo;
    private int codEstadoCivil;
    private int codTipoSangre;
    private int codPais;
    private int codDepartamento;
    private int codProvincia;
    private int codDistrito;
    private String domicilio_Asociado;
    private String referenciaDomicilio_Asociado;
    private String ubigeo_Asociado;
    private String fotoPerfil_Asociado;
    private String numeroTelefono_Asociado;
    private String correo_Asociado;
    private String clave_Asociado;
    private Date fecRegistro_Asociado;
    private int codSituacionAccesoAsociado;
    private Date fecInicioSuspension;
    private Date fecTerminoSuspension;
    private Boolean estadoActividad_Asociado;
    private Boolean aceptoTerminos;
    private int codBanco;
    private String numeroCuentaBancaria_Asociado;

    
    public VistaData(int codigo_Asociado, int codRol, int codTipoDocIdent, String numeroRuc_Asociado, String numDocIdent_Asociado, String nombres_Asociado, String apePaterno_Asociado, String apeMaterno_Asociado, Date fecNacimiento_Asociado, int codSexo, int codEstadoCivil, int codTipoSangre, int codPais, int codDepartamento, int codProvincia, int codDistrito, String domicilio_Asociado, String referenciaDomicilio_Asociado, String ubigeo_Asociado, String fotoPerfil_Asociado, String numeroTelefono_Asociado, String correo_Asociado, String clave_Asociado, Date fecRegistro_Asociado, int codSituacionAccesoAsociado, Date fecInicioSuspension, Date fecTerminoSuspension, Boolean estadoActividad_Asociado, Boolean aceptoTerminos, int codBanco, String numeroCuentaBancaria_Asociado) {
        this.codigo_Asociado = codigo_Asociado;
        this.codRol = codRol;
        this.codTipoDocIdent = codTipoDocIdent;
        this.numeroRuc_Asociado = numeroRuc_Asociado;
        this.numDocIdent_Asociado = numDocIdent_Asociado;
        this.nombres_Asociado = nombres_Asociado;
        this.apePaterno_Asociado = apePaterno_Asociado;
        this.apeMaterno_Asociado = apeMaterno_Asociado;
        this.fecNacimiento_Asociado = fecNacimiento_Asociado;
        this.codSexo = codSexo;
        this.codEstadoCivil = codEstadoCivil;
        this.codTipoSangre = codTipoSangre;
        this.codPais = codPais;
        this.codDepartamento = codDepartamento;
        this.codProvincia = codProvincia;
        this.codDistrito = codDistrito;
        this.domicilio_Asociado = domicilio_Asociado;
        this.referenciaDomicilio_Asociado = referenciaDomicilio_Asociado;
        this.ubigeo_Asociado = ubigeo_Asociado;
        this.fotoPerfil_Asociado = fotoPerfil_Asociado;
        this.numeroTelefono_Asociado = numeroTelefono_Asociado;
        this.correo_Asociado = correo_Asociado;
        this.clave_Asociado = clave_Asociado;
        this.fecRegistro_Asociado = fecRegistro_Asociado;
        this.codSituacionAccesoAsociado = codSituacionAccesoAsociado;
        this.fecInicioSuspension = fecInicioSuspension;
        this.fecTerminoSuspension = fecTerminoSuspension;
        this.estadoActividad_Asociado = estadoActividad_Asociado;
        this.aceptoTerminos = aceptoTerminos;
        this.codBanco = codBanco;
        this.numeroCuentaBancaria_Asociado = numeroCuentaBancaria_Asociado;
    }

    public VistaData() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getCodigo_Asociado() {
        return codigo_Asociado;
    }

    public void setCodigo_Asociado(int codigo_Asociado) {
        this.codigo_Asociado = codigo_Asociado;
    }

    public int getCodRol() {
        return codRol;
    }

    public void setCodRol(int codRol) {
        this.codRol = codRol;
    }

    public int getCodTipoDocIdent() {
        return codTipoDocIdent;
    }

    public void setCodTipoDocIdent(int codTipoDocIdent) {
        this.codTipoDocIdent = codTipoDocIdent;
    }

    public String getNumeroRuc_Asociado() {
        return numeroRuc_Asociado;
    }

    public void setNumeroRuc_Asociado(String numeroRuc_Asociado) {
        this.numeroRuc_Asociado = numeroRuc_Asociado;
    }

    public String getNumDocIdent_Asociado() {
        return numDocIdent_Asociado;
    }

    public void setNumDocIdent_Asociado(String numDocIdent_Asociado) {
        this.numDocIdent_Asociado = numDocIdent_Asociado;
    }

    public String getNombres_Asociado() {
        return nombres_Asociado;
    }

    public void setNombres_Asociado(String nombres_Asociado) {
        this.nombres_Asociado = nombres_Asociado;
    }

    public String getApePaterno_Asociado() {
        return apePaterno_Asociado;
    }

    public void setApePaterno_Asociado(String apePaterno_Asociado) {
        this.apePaterno_Asociado = apePaterno_Asociado;
    }

    public String getApeMaterno_Asociado() {
        return apeMaterno_Asociado;
    }

    public void setApeMaterno_Asociado(String apeMaterno_Asociado) {
        this.apeMaterno_Asociado = apeMaterno_Asociado;
    }

    public Date getFecNacimiento_Asociado() {
        return fecNacimiento_Asociado;
    }

    public void setFecNacimiento_Asociado(Date fecNacimiento_Asociado) {
        this.fecNacimiento_Asociado = fecNacimiento_Asociado;
    }

    public int getCodSexo() {
        return codSexo;
    }

    public void setCodSexo(int codSexo) {
        this.codSexo = codSexo;
    }

    public int getCodEstadoCivil() {
        return codEstadoCivil;
    }

    public void setCodEstadoCivil(int codEstadoCivil) {
        this.codEstadoCivil = codEstadoCivil;
    }

    public int getCodTipoSangre() {
        return codTipoSangre;
    }

    public void setCodTipoSangre(int codTipoSangre) {
        this.codTipoSangre = codTipoSangre;
    }

    public int getCodPais() {
        return codPais;
    }

    public void setCodPais(int codPais) {
        this.codPais = codPais;
    }

    public int getCodDepartamento() {
        return codDepartamento;
    }

    public void setCodDepartamento(int codDepartamento) {
        this.codDepartamento = codDepartamento;
    }

    public int getCodProvincia() {
        return codProvincia;
    }

    public void setCodProvincia(int codProvincia) {
        this.codProvincia = codProvincia;
    }

    public int getCodDistrito() {
        return codDistrito;
    }

    public void setCodDistrito(int codDistrito) {
        this.codDistrito = codDistrito;
    }

    public String getDomicilio_Asociado() {
        return domicilio_Asociado;
    }

    public void setDomicilio_Asociado(String domicilio_Asociado) {
        this.domicilio_Asociado = domicilio_Asociado;
    }

    public String getReferenciaDomicilio_Asociado() {
        return referenciaDomicilio_Asociado;
    }

    public void setReferenciaDomicilio_Asociado(String referenciaDomicilio_Asociado) {
        this.referenciaDomicilio_Asociado = referenciaDomicilio_Asociado;
    }

    public String getUbigeo_Asociado() {
        return ubigeo_Asociado;
    }

    public void setUbigeo_Asociado(String ubigeo_Asociado) {
        this.ubigeo_Asociado = ubigeo_Asociado;
    }

    public String getFotoPerfil_Asociado() {
        return fotoPerfil_Asociado;
    }

    public void setFotoPerfil_Asociado(String fotoPerfil_Asociado) {
        this.fotoPerfil_Asociado = fotoPerfil_Asociado;
    }

    public String getNumeroTelefono_Asociado() {
        return numeroTelefono_Asociado;
    }

    public void setNumeroTelefono_Asociado(String numeroTelefono_Asociado) {
        this.numeroTelefono_Asociado = numeroTelefono_Asociado;
    }

    public String getCorreo_Asociado() {
        return correo_Asociado;
    }

    public void setCorreo_Asociado(String correo_Asociado) {
        this.correo_Asociado = correo_Asociado;
    }

    public String getClave_Asociado() {
        return clave_Asociado;
    }

    public void setClave_Asociado(String clave_Asociado) {
        this.clave_Asociado = clave_Asociado;
    }

    public Date getFecRegistro_Asociado() {
        return fecRegistro_Asociado;
    }

    public void setFecRegistro_Asociado(Date fecRegistro_Asociado) {
        this.fecRegistro_Asociado = fecRegistro_Asociado;
    }

    public int getCodSituacionAccesoAsociado() {
        return codSituacionAccesoAsociado;
    }

    public void setCodSituacionAccesoAsociado(int codSituacionAccesoAsociado) {
        this.codSituacionAccesoAsociado = codSituacionAccesoAsociado;
    }

    public Date getFecInicioSuspension() {
        return fecInicioSuspension;
    }

    public void setFecInicioSuspension(Date fecInicioSuspension) {
        this.fecInicioSuspension = fecInicioSuspension;
    }

    public Date getFecTerminoSuspension() {
        return fecTerminoSuspension;
    }

    public void setFecTerminoSuspension(Date fecTerminoSuspension) {
        this.fecTerminoSuspension = fecTerminoSuspension;
    }

    public Boolean getEstadoActividad_Asociado() {
        return estadoActividad_Asociado;
    }

    public void setEstadoActividad_Asociado(Boolean estadoActividad_Asociado) {
        this.estadoActividad_Asociado = estadoActividad_Asociado;
    }

    public Boolean getAceptoTerminos() {
        return aceptoTerminos;
    }

    public void setAceptoTerminos(Boolean aceptoTerminos) {
        this.aceptoTerminos = aceptoTerminos;
    }

    public int getCodBanco() {
        return codBanco;
    }

    public void setCodBanco(int codBanco) {
        this.codBanco = codBanco;
    }

    public String getNumeroCuentaBancaria_Asociado() {
        return numeroCuentaBancaria_Asociado;
    }

    public void setNumeroCuentaBancaria_Asociado(String numeroCuentaBancaria_Asociado) {
        this.numeroCuentaBancaria_Asociado = numeroCuentaBancaria_Asociado;
    }

   



}

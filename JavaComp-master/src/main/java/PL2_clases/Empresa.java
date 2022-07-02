
package PL2_clases;

import java.io.Serializable;


public class Empresa implements Serializable, Comparable<Empresa>{
    
    private String empresa;    
    private String CIF;
    private String web;
    private String nombre;
    private String telefono;
    private String tarjetaCredito;   
    private String correo;
    private String clave;
    private String calle;
    private String numero;
    private String codigoPostal;
    private String ciudad;
    
    public Empresa(String empresa, String CIF, String web, String nombre, String telefono, String tarjetaCredito, String correo, String clave, String calle, String numero, String codigoPostal, String ciudad) {
        this.empresa = empresa;
        this.CIF = CIF;
        this.web = web;
        this.nombre = nombre;
        this.telefono = telefono;
        this.tarjetaCredito = tarjetaCredito;
        this.correo = correo;
        this.clave = clave;
        this.codigoPostal = codigoPostal;
        this.numero = numero;
        this.calle = calle;
        this.ciudad = ciudad;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getCIF() {
        return CIF;
    }

    public void setCIF(String CIF) {
        this.CIF = CIF;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTarjetaCredito() {
        return tarjetaCredito;
    }

    public void setTarjetaCredito(String tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }  

    @Override
    public int compareTo(Empresa o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

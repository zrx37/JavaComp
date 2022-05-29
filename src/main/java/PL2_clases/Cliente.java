package PL2_clases;

import java.io.Serializable;



public class Cliente implements Serializable, Comparable<Cliente>{
    private String cliente;
    private String nombre;
    private String telefono;
    private String tarjetaCredito;   
    private String correo;
    private String clave;
    private String DNI;
    private String calle;
    private String numero;
    private String codigoPostal;
    private String ciudad;
    
    //Contructor
    public Cliente(String cliente,String nombre, String telefono, String tarjetaCredito, String correo, String clave, String DNI, String calle, String codigoPostal, String numero, String ciudad) {
        this.nombre = nombre;
        this.cliente = cliente;
        this.nombre = nombre;
        this.telefono = telefono;
        this.tarjetaCredito = tarjetaCredito;
        this.correo = correo;
        this.clave = clave;
        this.DNI = DNI;
        this.codigoPostal = codigoPostal;
        this.numero = numero;
        this.calle = calle;
        this.ciudad = ciudad;
    }    

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
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

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
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
    public int compareTo(Cliente o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}    

   
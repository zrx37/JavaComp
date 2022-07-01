
package PL2_clases;

import java.io.Serializable;


public class Usuario implements Serializable{
    
    private String correoElectronico;
    
    private String clave;

    public Usuario(String correoElectronico, String clave) {
        this.correoElectronico = correoElectronico;
        this.clave = clave;
    }
    
    /**
     * Get the value of clave
     *
     * @return the value of clave
     */
    public String getClave() {
        return clave;
    }

    /**
     * Set the value of clave
     *
     * @param clave new value of clave
     */
    public void setClave(String clave) {
        this.clave = clave;
    }

    /**
     * Get the value of correoElectronico
     *
     * @return the value of correoElectronico
     */
    public String getCorreoElectronico() {
        return correoElectronico;
    }

    /**
     * Set the value of correoElectronico
     *
     * @param correoElectronico new value of correoElectronico
     */
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    @Override
    public String toString() {
        return "Usuario{" + "correoElectronico=" + correoElectronico + ", clave=" + clave + '}';
    }
    
}   

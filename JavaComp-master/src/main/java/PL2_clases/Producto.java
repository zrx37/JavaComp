
package PL2_clases;
import java.io.*;

import java.time.LocalDate;
import javax.swing.JComboBox;

public class Producto implements Serializable, Comparable<Producto>{

    private String titulo;
    private String caracteristicas;
    private JComboBox<String> categoria;
    private double precio;
    private LocalDate fechaEntrada;
    private long stock;
    private Opinion opinion;


    public Producto(String titulo, String caracteristicas, JComboBox<String> categoria, double precio, LocalDate fechaEntrada, long stock, Opinion opinion) {
        this.titulo = titulo;
        this.caracteristicas = caracteristicas;
        this.categoria = categoria;
        this.precio = precio;
        this.fechaEntrada = fechaEntrada;
        this.stock = stock;
        this.opinion = opinion;
        
    }

    
    public Producto(){
    
    }
    
    public String getTitulo() {
        return titulo;
    }

    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    
    public String getCaracteristicas() {
        return caracteristicas;
    }

    
    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    
    
    public JComboBox<String> getCategoria() {
        return categoria;
    }

    
    public void setCategoria(JComboBox<String> categoria) {
        this.categoria = categoria;
    }
  

    
    public double getPrecio() {
        return precio;
    }

    
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    
    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    

    public long getStock() {
        return stock;
    }

 
    public void setStock(long stock) {
        this.stock = stock;
    }

    public Opinion getOpinion() {
        return opinion;
    }

    public void setOpinion(Opinion opinion) {
        this.opinion = opinion;
    }

    @Override
    public String toString() {
        return "Producto{" + "titulo=" + titulo + ", caracteristicas=" + caracteristicas + ", categoria=" + categoria + ", precio=" + precio + ", fechaEntrada=" + fechaEntrada + ", stock=" + stock + ", opinion=" + opinion + '}';
    }

    
    
    @Override
    public int compareTo(Producto o) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
 
    
}

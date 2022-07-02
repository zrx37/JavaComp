
package PL2_clases;

import java.io.Serializable;
import java.time.LocalDate;


public class Opinion implements Serializable{
    
    private long calificacion;
    private String comentario;
    private LocalDate fechaOpinion;
    
    public Opinion(long calificacion, String comentario, LocalDate fechaOpinion) {
        this.calificacion = calificacion;
        this.comentario = comentario;
        this.fechaOpinion = fechaOpinion;
    }


    public long getCalificacion() {
        return calificacion;
    }


    public void setCalificacion(long calificacion) {
        this.calificacion = calificacion;
    }
    

    public String getComentario() {
        return comentario;
    }


    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public LocalDate getFechaOpinion() {
        return fechaOpinion;
    }


    public void setFechaOpinion(LocalDate fechaOpinion) {
        this.fechaOpinion = fechaOpinion;
    }

    @Override
    public String toString() {
        return "Opinion{" + "calificacion=" + calificacion + ", comentario=" + comentario + ", fechaOpinion=" + fechaOpinion + '}';
    }

    

}

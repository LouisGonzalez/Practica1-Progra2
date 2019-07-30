/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.clases;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Julio
 */
public class Prestamo implements Serializable{
    
    private Libro aPrestar;
    private Estudiante quePresta;
    private String codigo;
    private Date fecha;
    private Date fechaEntrega;
    /*
    agregar el metodo Buscador
    */
    public Prestamo(Libro aPrestar, Estudiante quePresta, Date fecha, Date fechaEntrega){
        this.aPrestar = aPrestar;
        this.quePresta = quePresta;
        this.fecha = fecha;
        this.fechaEntrega = fechaEntrega;
    }
    public Prestamo(Libro aPrestar, Estudiante quePresta){
        this.aPrestar = aPrestar;
        this.quePresta = quePresta;
      
         
    }

    public Date getfechaEntrega() {
        return fechaEntrega;
    }

    public void setAsdf(Date asdf) {
        this.fechaEntrega = asdf;
    }

   

    
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    public Libro getaPrestar() {
        return aPrestar;
    }

    public void setaPrestar(Libro aPrestar) {
        this.aPrestar = aPrestar;
    }

    public Estudiante getQuePresta() {
        return quePresta;
    }

    public void setQuePresta(Estudiante quePresta) {
        this.quePresta = quePresta;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    
}

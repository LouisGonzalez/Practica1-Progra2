/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.clases;

import java.io.Serializable;

/**
 *
 * @author Julio
 */
public class Prestamo implements Serializable{
    
    private Libro aPrestar;
    private Estudiante quePresta;
    private String codigo;

    /*
    agregar el metodo Buscador
    */
    
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

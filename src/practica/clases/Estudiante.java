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
public class Estudiante implements Serializable{
    
    private String nombre;
    private int carnet;
    private int codigoCarrera;
    private Date fechaNacimiento;
    private int librosPrestados;
    private String codigo;
    
    public Estudiante(String nombre, int carnet, int codigoCarrera, int librosPrestados) {
        this.nombre = nombre;
        this.carnet = carnet;
        this.codigoCarrera = codigoCarrera;
        this.librosPrestados = librosPrestados;
    }
     public Estudiante(String nombre, int carnet, String codigoCarrera) {
        this.nombre = nombre;
        this.carnet = carnet;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public int getCodigoCarrera() {
        return codigoCarrera;
    }

    public void setCodigoCarrera(int codigoCarrera) {
        this.codigoCarrera = codigoCarrera;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    
    
    /*
    agregar los metodos prestar pagar  y devolver
    
    */
    
    
}

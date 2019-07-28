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
    private String codigoCarrera;
    private Date fechaNacimiento;

    public Estudiante(String nombre, int carnet, String codigoCarrera) {
        this.nombre = nombre;
        this.carnet = carnet;
        this.codigoCarrera = codigoCarrera;
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

    public String getCodigoCarrera() {
        return codigoCarrera;
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

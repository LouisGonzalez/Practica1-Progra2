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
public class Libro implements Serializable{
   
    private String titulo;
    private String autor;
    private String codigo;
    private int    cantidad;
    private int    prestados;

    public Libro() {
    }
/**
 * 
 * @param titulo tipo string "nombre del libro"
 * @param autor  String 
 * @param codigo String identificado unico de cada libro
 */
    public Libro(String titulo, String autor, String codigo, int cantidad) {
        this.titulo = titulo;
        this.autor = autor;
        this.codigo = codigo;
        this.cantidad = cantidad;
    }

    public Libro(String titulo, String autor, String codigo, int cantidad, int prestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.prestados = prestados;
    }
    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrestados() {
        return prestados;
    }

    public void setPrestados(int prestados) {
        this.prestados = prestados;
    }
    
    
}

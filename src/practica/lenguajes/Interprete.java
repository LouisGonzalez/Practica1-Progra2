/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.lenguajes;

import practica.clases.Estudiante;
import practica.clases.Libro;
import practica.manejador.Salida;

/**
 *
 * @author Julio
 */
public class Interprete {
    private String [] tupla;
    private int contador;
    public Interprete() {
        this.contador=0;
        this.tupla = new String [5];
        for (int i = 0; i < 4; i++) {
            
            
        }
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
    public void formarArray(String palabra){
        
        for (int i = 0; i < tupla.length; i++) {
                if (tupla[i]==null) {
                    tupla[i]=palabra;
                }
                
            }
            
    }
    public void formarTupla(String palabra){
        if (tupla[0]==null) {
            tupla[0] = palabra;
        }else if (tupla[0].equals("LIBRO") ) {
            contador++;
            formarLibro(palabra);
            if (contador==4) {        //titulo   //autor   //codigo  //copias totales
                Libro libro = new Libro(tupla[1], tupla[2], tupla[3], Integer.parseInt(tupla[4]), 0);
                Salida deLibro = new Salida();
                deLibro.EscribirBin(libro, "", tupla[3], ".book");
                tupla = null;
                contador=0;
                 this.tupla = new String [5];
            }
            
        }else if (tupla[0].equals("ESTUDIANTE")) {
            contador++;
            formarEstudiante(palabra);
            if (contador==3) {
                System.out.println("Estudiante create");
                Estudiante nuevo = new Estudiante(tupla[2],Integer.parseInt(tupla[1]),  Integer.parseInt(tupla[3]));
                Salida student = new Salida();
                student.EscribirBin(nuevo, "", tupla[1], ".st");
                tupla = null;
                contador=0;
                 this.tupla = new String [5];
            }
            
        }else if (tupla[0].equals("PRESTAMO")){
            
            
        }else{
            System.out.println("Linea Con Error");
        }
    }
    public void formarPrestamo(String palabra){
        if (palabra.contains("CODIGOLIBRO")) {
            tupla[1]= palabra.replaceAll("CODIGOLIBRO:", "").trim();
        }else if (palabra.contains("NOMBRE")){
            tupla[2]= palabra.substring(7);
        }else if (palabra.contains("CARRERA")){
            tupla[3]= palabra.replaceAll("CARRERA:", "").trim();
        }else System.out.println("");
    }
    public void formarEstudiante(String palabra){
        if (palabra.contains("CARNET")) {
            tupla[1]= palabra.replaceAll("CARNET:", "").trim();
        }else if (palabra.contains("NOMBRE")){
            tupla[2]= palabra.substring(7);
        }else if (palabra.contains("CARRERA")){
            tupla[3]= palabra.replaceAll("CARRERA:", "").trim();
        }else System.out.println("");
    }
    public void formarLibro(String palabra){
        
        if (palabra.contains("TITULO")) {
            tupla[1] = palabra.substring(7);
           
        }else if (palabra.contains("AUTOR")) {
            tupla[2] = palabra.substring(6);
            
        }else if (palabra.contains("CODIGO")) {
            tupla[3] = palabra.substring(7);
        }else if (palabra.contains("CANTIDAD")) {
            tupla[4] = palabra.substring(9);
        }else {
            System.out.println("Error");
        }
    }
}

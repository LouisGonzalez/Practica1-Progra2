/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.lenguajes;


import java.awt.Color;
import java.io.File;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import practica.clases.Estudiante;
import practica.clases.Libro;
import practica.clases.Prestamo;
import practica.manejador.Entrada;
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
    public void formarTupla(String palabra, JTextArea errores, int cont){
        String palabraIn=palabra;
        System.out.println("palabra in"+palabraIn+"  "+palabra);
        if (/*(palabraIn.equalsIgnoreCase("LIBRO") || palabraIn.equalsIgnoreCase("PRESTAMO") || palabraIn.equalsIgnoreCase("ESTUDIANTE")) && */tupla[0]==null) {
            tupla[0] = palabra;
        }else if (tupla[0].equals("LIBRO") ) {
            contador++;
            formarLibro(palabra);
            if (contador==4) {        //titulo   //autor   //codigo  //copias totales          //prestados
                Libro libro = new Libro(tupla[1], tupla[2], tupla[3], Integer.parseInt(tupla[4]), 0);
                Salida<Libro> deLibro = new Salida();
                deLibro.EscribirBin(libro, MenuPrincipal.pathLibro, tupla[3], ".book");
                tupla = null;
                contador=0;
                 this.tupla = new String [5];
            }
            
        }else if (tupla[0].equals("ESTUDIANTE")) {
            contador++;
            formarEstudiante(palabra);
            if (contador==3) {
                System.out.println("Estudiante create");
                Estudiante nuevo = new Estudiante(tupla[2],Integer.parseInt(tupla[1]),  Integer.parseInt(tupla[3]), 0);
                Salida<Estudiante> student = new Salida<Estudiante>();
                student.EscribirBin(nuevo, MenuPrincipal.pathEstudiante, tupla[1], ".st");
                tupla = null;
                contador=0;
                 this.tupla = new String [5];
            }
            
        }/*else if (tupla[0].equals("PRESTAMO")){
             contador++;
            formarPrestamo(palabra);
            if (contador==3) {
                System.out.println("creando prestamo");
               Prestamo nuevo = new Prestamo(tupla[2], tupla[3], tupla[4]);
                
                File buscar = new File(MenuPrincipal.pathLibro+tupla[1]+".book");
                if (buscar.exists()) {
                    Entrada<Libro> nueva = new Entrada();
                    //Libro nuevo  = (Libro) nueva.leerBin("", tupla[1], ".book");
                    Libro recuperado = (Libro) nueva.leerBin(MenuPrincipal.pathLibro, tupla[1], ".book");
                    nuevo.setaPrestar(recuperado);
                    
                    buscar = null;
                    buscar = new File(MenuPrincipal.pathEstudiante+tupla[2]+".st");
                    if (buscar.exists() && recuperado.getPrestados()>0) {
                        Entrada<Estudiante> inStudent = new Entrada<Estudiante>();
                        
                        Estudiante quePresta = inStudent.leerBin(MenuPrincipal.pathEstudiante, tupla[2], ".st");
                        
                       
                       
                        if (quePresta.getLibrosPrestados()<3) {
                            
                            nuevo.setQuePresta(quePresta);
                            Salida<Prestamo> dePrestamo = new Salida();
                            dePrestamo.EscribirBin(nuevo, MenuPrincipal.pathPrestamo, tupla[1], ".pr");

                           recuperado.setPrestados(recuperado.getPrestados()-1);
                           Salida<Libro> deLibro = new Salida<>();
                           deLibro.EscribirBin(recuperado, MenuPrincipal.pathLibro, recuperado.getCodigo(), ".book");
                           
                           Salida<Estudiante>  binEstudent = new Salida<>();
                           binEstudent.EscribirBin(quePresta, MenuPrincipal.pathEstudiante, String.valueOf(quePresta.getCarnet()), ".st");
                           
                        }else{
                            errores.setText(errores.getText()+"Error Linea #"+cont +" Excedio el Limite de Prestamos");
                        }
                    }else {
                        
                        System.out.println("Error en prestamo, no se encontro estudiante");
                        errores.setText(errores.getText()+"Error Linea #"+cont +" No existe Estudiante "+"Prestamo Cancelado");
                        //JOptionPane.showMessageDialog(null, "Error no se encontro Al estudiante", "Error", JOptionPane.ERROR);
                    }
                }else{
                    
                    errores.setText(errores.getText()+"Error Linea #"+cont +" No existe Libro, Verifique Codigo "+"Prestamo Cancelado");
                    System.out.println("Error en prestamo, no se encontro Libro");
                }
                
                errores.setForeground(Color.red);
               
                tupla = null;
                contador=0;
                 this.tupla = new String [5];
            }
            
        }*/else{
             errores.setText(errores.getText()+"\nError Linea #"+cont +" IDentificador Invalido "+"Las Siguientes lineas se anularan hasta encontrar un IDENTIFICADOR VALIDO");
             errores.setForeground(Color.red);
             tupla[0] = null;
        }
    }
    public void formarPrestamo(String palabra){
        if (palabra.contains("CODIGOLIBRO")) {
            tupla[1]= palabra.replaceAll("CODIGOLIBRO:", "").trim();
        }else if (palabra.contains("CARNET")){
            tupla[2]= palabra.substring(7);
        }else if (palabra.contains("CARRERA")){
            tupla[3]= palabra.replaceAll("CARRERA:", "").trim();
        }else System.out.println("");
        System.out.println("test");
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

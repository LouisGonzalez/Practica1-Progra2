/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.manejador;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author Julio
 */
public class Salida <T>{
    
    
     /**
      * clase generica T sera el tipo de objeto a guardar en disco
      * @param t
      * @param ruta
      * @param nombre
      * @param extension 
      */
    public void EscribirBin(T t, String ruta,String nombre,String extension){
        try {

            ObjectOutputStream escribirObjeto = new ObjectOutputStream(new 
            FileOutputStream(ruta+nombre+extension));

            escribirObjeto.writeObject(t);
            escribirObjeto.close();
           
           
       } catch (IOException ioe) {
            System.out.println("Binarios Plantilla"+ruta);
           ioe.printStackTrace();
       }
    }
}

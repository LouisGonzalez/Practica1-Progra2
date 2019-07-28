/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.manejador;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import javax.swing.JTextArea;
import practica.lenguajes.Interprete;

/**
 *
 * @author Julio
 */
public class Entrada <T> {
    
    private String pathTxt;

    
    public String getPathTxt() {
        return pathTxt;
    }

    public void setPathTxt(String pathTxt) {
        this.pathTxt = pathTxt;
    }
    
    
    /**
     * 
     * @param path
     * @param nombre
     * @param extension
     * @return  T
     */
    public T leerBin(String path,String nombre, String extension){
        
        try {
            ObjectInputStream recibirObjeto = new ObjectInputStream(new 
            FileInputStream(path+nombre+extension));
             T parametro = (T) recibirObjeto.readObject();
           
           recibirObjeto.close();
           return parametro;
        } catch (IOException e) {
            System.out.println(extension);
            e.printStackTrace();
        }catch(ClassNotFoundException cnfe){
            System.out.println(extension);
            cnfe.printStackTrace();
            
        }
        
        return null;
    }
    /**
     * 
     * @throws FileNotFoundException
     * @throws ClassNotFoundException
     * @throws InterruptedException 
     * metodo que lee linea a linea de un txt para luego enviarlo a un interprete
     */
    public void leerTxt(JTextArea area,JTextArea errores)throws FileNotFoundException, ClassNotFoundException, InterruptedException{
    Interprete interprete = new Interprete();
        FileReader entrada; 
    try {
        entrada = new FileReader((pathTxt));
        BufferedReader bufferEntrada = new BufferedReader(entrada);
        
            String linea = "";
           
            int cont=0;
            int formato=0;
            while (linea != null){ 
                
                 linea = bufferEntrada.readLine();
                cont++;
                formato++;

                System.out.println("linea: "+cont);
                
                if(linea!=null ){
                    
                     interprete.formarTupla(linea,errores,cont);
                     
                     area.setText(area.getText()+"\n"+cont+". "+linea);
                }       
            }
        entrada.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
}
   
}

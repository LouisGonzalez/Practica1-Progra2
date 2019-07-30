package practica.lenguajes;

import java.io.*;
import javax.swing.JOptionPane;
import practica.clases.Dinero;

/**
 *
 * @author luisGonzalez
 */
public class ArchivosDinero implements Serializable {
    
    public void guardarPrestamos(Dinero dinero){
        try{
            String fichero = MenuPrincipal.pathDinero+"Ganancias.dat";
            File file = new File(fichero);
            if(!file.exists()){
                file.createNewFile();
                ObjectOutputStream objetoArchivo = new ObjectOutputStream(new FileOutputStream(file));
                objetoArchivo.writeObject(dinero);
                objetoArchivo.flush();
                objetoArchivo.close();
            } else {
            }
        } catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null, e);
        } catch(IOException ioe){
            
        }
    }
}

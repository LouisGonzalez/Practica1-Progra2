package practica.lenguajes;

import java.io.*;
import javax.swing.JOptionPane;
import practica.clases.Prestamo;
import practica.mensajes.Mensaje7;

/**
 *
 * @author luisGonzalez
 */
public class ArchivosPrestamos implements Serializable {
    
    public void guardarPrestamo(Prestamo prestamo){
        try{
            String fichero = MenuPrincipal.pathPrestamo+prestamo.getaPrestar().getCodigo()+"-"+prestamo.getQuePresta().getCarnet()+".dat";
            File file = new File(fichero);
            if(!file.exists()){
                file.createNewFile();
                ObjectOutputStream objetoArchivo = new ObjectOutputStream(new FileOutputStream(file));
                objetoArchivo.writeObject(prestamo);
                objetoArchivo.flush();
                objetoArchivo.close();       
            } else {
                new Mensaje7(null, true).setVisible(true);            
                JOptionPane.showMessageDialog(null, "Ya existe un prestamo con estos datos en el sistema");
            }
        } catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null, e);
        } catch(IOException ioe){
        }
    }
}

package practica.lenguajes;

import java.io.*;
import javax.swing.JOptionPane;
import practica.clases.Prestamo;

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
            } else {
                JOptionPane.showMessageDialog(null, "Ya existe un prestamos con estos datos en el sistema");
            }
            ObjectOutputStream objetoArchivo = new ObjectOutputStream(new FileOutputStream(file));
            objetoArchivo.writeObject(prestamo);
            objetoArchivo.flush();
            objetoArchivo.close();
        } catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null, e);
        } catch(IOException ioe){
        }
    }
}

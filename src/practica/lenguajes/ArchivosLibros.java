package practica.lenguajes;
import java.io.*;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import practica.clases.Libro;

/**
 *
 * @author luisGonzalez
 */
public class ArchivosLibros implements Serializable {
    
    public void guardarLibro(Libro libros){
        try{
            String fichero=MenuPrincipal.pathLibro+libros.getCodigo()+".dat";
            File file = new File(fichero);
            if(!file.exists()){
                file.createNewFile();
                ObjectOutputStream objetoArchivo = new ObjectOutputStream(new FileOutputStream(file));
            objetoArchivo.writeObject(libros);             
            objetoArchivo.flush();            
            objetoArchivo.close();
            } else {
                JOptionPane.showMessageDialog(null, "Ya existe un libro registrado con este codigo");
            }
        } catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null, e);
        } catch(IOException ioe){            
        }
    }
    
    
}
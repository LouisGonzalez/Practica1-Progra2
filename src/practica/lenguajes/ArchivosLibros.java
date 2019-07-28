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
    
    public void guardarLibro(Libro libros, ListaLibros<Libro> misLibros){
        try{
            String fichero=MenuPrincipal.pathLibro+libros.getCodigo()+".dat";
            File file = new File(fichero);
            if(!file.exists()){
                file.createNewFile();
            } else {
                JOptionPane.showMessageDialog(null, "Ya existe un estudiante registrado con esta matricula");
            }
            ObjectOutputStream objetoArchivo = new ObjectOutputStream(new FileOutputStream(file));
            objetoArchivo.writeObject(libros);   
            misLibros.insertarContenido(libros);
            objetoArchivo.flush();            
            objetoArchivo.close();
        } catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null, e);
        } catch(IOException ioe){            
        }
    }
    
    
}
package practica.lenguajes;
import java.io.*;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import practica.clases.Libro;
import practica.mensajes.Mensaje10;
import practica.mensajes.Mensaje14;

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
                new Mensaje14(null, true).setVisible(true);                  
                //JOptionPane.showMessageDialog(null, "Ya existe un libro registrado con este codigo");
            }
        } catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null, e);
        } catch(IOException ioe){            
        }
    }
    
    
}
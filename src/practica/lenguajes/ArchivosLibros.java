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
            String fichero="src/practica/Datos/Libros/"+libros.getCodigo()+".dat";
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
    
    public void leerLibro(ListaLibros<Libro> libro, Libro libros){
        
        try{
            try(ObjectInputStream salidaArchivo = new ObjectInputStream(new FileInputStream("src/practica/Datos/Libros/"+libros.getCodigo()+".dat"))){
                libros = (Libro) salidaArchivo.readObject();
            }
        } catch(ClassNotFoundException ex){
            ex.printStackTrace();
        } catch(IOException ioe){
            JOptionPane.showMessageDialog(null, "No hay archivos por el momento");
        }
   
    }
    
    
    public void leer(JLabel codigo){
        try{
            ObjectInputStream file = new ObjectInputStream(new FileInputStream("src/practica/Datos/Libros/"+codigo.getText()+".dat"));
            Libro libros = (Libro) file.readObject();
            file.close();
        } catch(ClassNotFoundException ex){
            ex.printStackTrace();
        } catch(IOException ioe){
            JOptionPane.showMessageDialog(null, "No hay archivos por el momento");
        }
    }
}
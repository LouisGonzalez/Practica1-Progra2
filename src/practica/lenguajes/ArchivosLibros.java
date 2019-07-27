package practica.lenguajes;
import java.io.*;
import javax.swing.JOptionPane;
import practica.clases.Libro;

/**
 *
 * @author luisGonzalez
 */
public class ArchivosLibros implements Serializable {
    
    public void guardarLibro(Libro libros){
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
            objetoArchivo.flush();
            objetoArchivo.close();
        } catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null, e);
        } catch(IOException ioe){            
        }
    }
    
    public Libro leerLibro(String titulo, String autor, String codigo){
        Libro nuevo = new Libro(titulo, autor, codigo);
        try{
            try(ObjectInputStream salidaArchivo = new ObjectInputStream(new FileInputStream(nuevo.getCodigo()+".dat"))){
                nuevo = (Libro) salidaArchivo.readObject();
            }
        } catch(ClassNotFoundException ex){
            ex.printStackTrace();
        } catch(IOException ioe){
            JOptionPane.showMessageDialog(null, "No hay archivos por el momento");
        }
        return nuevo;
    }
}
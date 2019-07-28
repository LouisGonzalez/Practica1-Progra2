package practica.lenguajes;
import java.io.*;
import javax.swing.JOptionPane;
import practica.clases.Estudiante;

/**
 *
 * @author luisGonzalez
 */
public class ArchivosEstudiantes implements Serializable {
   
    public void guardarEstudiante(Estudiante estudiante){
        try{        
            
            String fichero = "src/practica/Datos/Estudiantes/"+estudiante.getCarnet()+".dat";    
            File file = new File(fichero);        
            if(!file.exists()){
                file.createNewFile();
            } else {
                JOptionPane.showMessageDialog(null, "Ya existe un estudiante registrado con esta matricula");
            }
            ObjectOutputStream objetoArchivo = new ObjectOutputStream(new FileOutputStream(file));
            objetoArchivo.writeObject(estudiante);
            objetoArchivo.flush();
            objetoArchivo.close();
        } catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null, e);
        } catch(IOException ioe){
        }
    }
    
    public Estudiante leerEstudiante(String nombre, int carnetEs, String codigo){
        Estudiante nuevo = new Estudiante(nombre, carnetEs, codigo);
        try{
            try(ObjectInputStream salidaArchivo = new ObjectInputStream(new FileInputStream(nuevo.getCarnet()+".dat"))){
                nuevo = (Estudiante) salidaArchivo.readObject();
            }
        } catch(ClassNotFoundException ex){
            ex.printStackTrace();
        } catch(IOException ioe){
            JOptionPane.showMessageDialog(null, "No hay archivos por el momento");
        }
        return nuevo;
    }
    
    
    
}

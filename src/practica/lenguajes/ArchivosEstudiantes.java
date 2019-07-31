package practica.lenguajes;
import java.io.*;
import javax.swing.JOptionPane;
import practica.clases.Estudiante;
import practica.mensajes.Mensaje15;

/**
 *
 * @author luisGonzalez
 */
public class ArchivosEstudiantes implements Serializable {
   
    public void guardarEstudiante(Estudiante estudiante){
        try{                    
            String fichero = MenuPrincipal.pathEstudiante+estudiante.getCarnet()+".dat";    
            File file = new File(fichero);        
            if(!file.exists()){
                file.createNewFile();
                    ObjectOutputStream objetoArchivo = new ObjectOutputStream(new FileOutputStream(file));
            objetoArchivo.writeObject(estudiante);
            objetoArchivo.flush();
            objetoArchivo.close();
        
            } else {
                new Mensaje15(null, true).setVisible(true);               
                //JOptionPane.showMessageDialog(null, "Ya existe un estudiante registrado con esta matricula");
            }
        } catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null, e);
        } catch(IOException ioe){
        }
    }
    
    
    
    
    
}

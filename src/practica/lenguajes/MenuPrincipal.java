package practica.lenguajes;

import java.io.File;
import practica.manejador.Salida;

/**
 *
 * @author luisGonzalez
 */
public class MenuPrincipal {
public static String pathLibro;
public static String pathEstudiante;
public static String pathPrestamo;
        public static void main(String[] args) {
           
            Salida deCarpetas = new Salida();
            pathEstudiante =  deCarpetas.crearCarpeta("Estudiante")+File.separatorChar;
            pathLibro = deCarpetas.crearCarpeta("Libro")+File.separatorChar;
            pathPrestamo = deCarpetas.crearCarpeta("Prestamo")+File.separatorChar;
            System.out.println("Hola mundo");
            FrmBiblioteca biblioteca = new FrmBiblioteca();
            biblioteca.setVisible(true);
            
            System.out.println(pathEstudiante);
            System.out.println(pathLibro);
            System.out.println(pathPrestamo);
    }
}

    

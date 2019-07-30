package practica.lenguajes;

import java.io.File;
import practica.clases.Dinero;
import practica.manejador.Entrada;
import practica.manejador.Salida;

/**
 *
 * @author luisGonzalez
 */
    public class MenuPrincipal {
    public static String pathLibro;
    public static String pathEstudiante;
    public static String pathPrestamo;
    public static String pathDinero;
    public static ArchivosDinero archivos = new ArchivosDinero();
    public static int valorInicial = 0;
        
    public static void main(String[] args) {
        Dinero dinero = new Dinero(valorInicial);
        Salida deCarpetas = new Salida();
         Entrada<Dinero> cantidad = new Entrada<>();       
        pathEstudiante =  deCarpetas.crearCarpeta("Estudiante")+File.separatorChar;
        pathLibro = deCarpetas.crearCarpeta("Libro")+File.separatorChar;
        pathPrestamo = deCarpetas.crearCarpeta("Prestamo")+File.separatorChar;
        pathDinero = deCarpetas.crearCarpeta("Dinero")+File.separatorChar;
        System.out.println(pathEstudiante);
        System.out.println(pathLibro);
        System.out.println(pathPrestamo);
        System.out.println(pathDinero);
        archivos.guardarPrestamos(dinero);
        Dinero aMostrar = cantidad.leerBin(MenuPrincipal.pathDinero, "Ganancias", ".dat");
        FrmBiblioteca biblioteca = new FrmBiblioteca(aMostrar);
        biblioteca.setVisible(true);
        
        
        
    }
}

    

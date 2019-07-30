package practica.clases;
import java.io.Serializable;

/**
 *
 * @author luisGonzalez
 */
public class Dinero implements Serializable{
    
    private int ganancias;
    
    public Dinero(int ganancias){
        this.ganancias = ganancias;
    }

    public int getGanancias() {
        return ganancias;
    }

    public void setGanancias(int ganancias) {
        this.ganancias = ganancias;
    }
    
    
}

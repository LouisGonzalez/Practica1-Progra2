package practica.lenguajes;

import java.io.Serializable;

/**
 *
 * @author luisGonzalez
 * @param <T>
 */
public class ListaLibros<T> implements Serializable {
    private Nodo<T> primerElemento;
    private Nodo<T> ultimoElemento;
    private int cantidadElementos;
    
    public Nodo obtenerElemento(int posicion) throws Exception{
        if(esVacia() || posicion >= cantidadElementos){
            throw new Exception("No se encuentra el indice "+posicion+" en la lista");
        }
        if(posicion == cantidadElementos - 1){
            return ultimoElemento;
        } else if (posicion == 0){
            return primerElemento;
        } else {
            Nodo<T> elementoEnCuestion = primerElemento;
            for(int i = 0; i < posicion; i++){
                elementoEnCuestion = elementoEnCuestion.obtenerSiguiente();
            }
            return elementoEnCuestion;
        }
    }
    
    public void insertarContenido(T contenido){
        if(esVacia()){
            insertarPrimerElemento(contenido);
        } else {
            Nodo<T> nuevoElemento = new Nodo<T>(contenido);
            ultimoElemento.especificarSiguiente(nuevoElemento);
            ultimoElemento = nuevoElemento;
            cantidadElementos++;
        }
    }
    
    public void insertarContenido(int posicion, T contenido) throws Exception{
        Nodo<T> aReemplazar = obtenerElemento(posicion);
        Nodo<T> anterior = obtenerElemento(posicion - 1);
        Nodo<T> nuevo = new Nodo<>(contenido);
        anterior.especificarSiguiente(nuevo);
        nuevo.especificarSiguiente(aReemplazar);
        cantidadElementos++;
    }
    
    public Nodo obtenerPrimerElemento(){
        return primerElemento;
    }
    
    public Nodo obtenerUltimoElemento(){
        return ultimoElemento;
    }
    
    public int obtenerCantidadElementos(){
        return cantidadElementos;
    }
    
    public boolean esVacia(){
        return cantidadElementos == 0;
    }
    
    private void insertarPrimerElemento(T contenido){
        Nodo<T> nuevo = new Nodo<>(contenido);
        primerElemento = nuevo;
        ultimoElemento = nuevo;
        cantidadElementos++;
    }
}

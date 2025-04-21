/**
 * Interfaz para el iterador que permitirá recorrer el árbol.
 * @param <T> Tipo de datos almacenados en el árbol
 */
public interface Iterador<T> {
    /**
     * Verifica si hay más elementos para recorrer.
     * @return true si hay más elementos, false en caso contrario
     */
    boolean hasNext();
    
    /**
     * Devuelve el siguiente elemento en el recorrido.
     * @return Siguiente elemento
     */
    T next();
}
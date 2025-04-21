import java.util.Stack;
import java.util.NoSuchElementException;

/**
 * Implementación del iterador para recorrido pre-orden.
 * @param <T> Tipo de datos almacenado en el árbol
 */
public class IteradorPreOrden<T extends Comparable<T>> implements Iterador<T> {
    private Stack<Nodo<T>> pila;
    
    /**
     * Constructor para crear un iterador pre-orden a partir de un nodo raíz.
     * @param raiz Raíz del árbol a recorrer
     */
    public IteradorPreOrden(Nodo<T> raiz) {
        pila = new Stack<>();
        if (raiz != null) {
            pila.push(raiz);
        }
    }
    

    /**
     * Verifica si hay más elementos por recorrer en el árbol.
     * @return 'true' si quedan elementos por recorrer, 'false' en caso contrario
     */
    @Override
    public boolean hasNext() {
        return !pila.isEmpty();
    }
    
    /**
     * Devuelve el siguiente elemento en el recorrido postorden.
     * @return El siguiente elemento en el recorrido postorden
     * @throws NoSuchElementException si no hay más elementos para recorrer
     */
    @Override
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException("No hay más elementos en el recorrido");
        }
        // Aqui va su codigo
    }
}
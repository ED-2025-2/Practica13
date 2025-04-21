/**
 * Clase que representa un nodo en el árbol AVL.
 * @param <T> Tipo de datos almacenado en el nodo
 */
public class Nodo<T extends Comparable<T>> {
    T dato;
    Nodo<T> izquierdo;
    Nodo<T> derecho;
    int altura;
    
    /**
     * Constructor para crear un nuevo nodo.
     * @param dato Dato a almacenar en el nodo
     */
    public Nodo(T dato) {
        this.dato = dato;
        this.izquierdo = null;
        this.derecho = null;
        this.altura = 1; // Altura inicial de un nodo hoja
    }
}
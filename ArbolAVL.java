/**
 * Interfaz que define las operaciones basicas de un arbol AVL.
 * @param <T> Tipo de datos que almacenara el arbol (debe ser comparable)
 */
public interface ArbolAVL<T extends Comparable<T>> {
    /**
     * Inserta un elemento en el arbol. Si el elemento ya existe, lo elimina.
     * @param elemento Elemento a insertar
     */
    void insertar(T elemento);
    
    /**
     * Busca un elemento en el arbol.
     * @param elemento Elemento a buscar
     * @return true si el elemento existe, false en caso contrario
     */
    boolean buscar(T elemento);
    
    /**
     * Elimina un elemento del arbol.
     * @param elemento Elemento a eliminar
     */
    void eliminar(T elemento);
    
    /**
     * Verifica si el arbol está vacio.
     * @return true si el arbol esta vacio, false en caso contrario
     */
    boolean estaVacio();
    
    /**
     * Calcula la altura del arbol.
     * @return Altura del arbol (-1 si esta vacio)
     */
    int altura();
    
    /**
     * Obtiene un iterador para recorrer el arbol en pre-orden.
     * @return Iterador en pre-orden
     */
    Iterador<T> iteradorPreOrden();
    
    /**
     * Obtiene un iterador para recorrer el arbol en post-orden.
     * @return Iterador en post-orden
     */
    Iterador<T> iteradorPostOrden();
}
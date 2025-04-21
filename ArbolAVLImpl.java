/**
 * Implementacion del arbol AVL.
 * @param <T> Tipo de datos almacenado en el arbol
 */
public class ArbolAVLImpl<T extends Comparable<T>> implements ArbolAVL<T> {
    private Nodo<T> raiz;
    
    /**
     * Constructor para crear un arbol vacio.
     */
    public ArbolAVLImpl() {
        this.raiz = null;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public boolean estaVacio() {
        return raiz == null;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public int altura() {
        return getAltura(raiz);
    }
    
    /**
     * Obtiene la altura de un nodo.
     * @param nodo Nodo del que se quiere conocer la altura
     * @return Altura del nodo (-1 si es null)
     */
    private int getAltura(Nodo<T> nodo) {
        if (nodo == null) {
            return 0;
        }
        return nodo.altura;
    }
    
    /**
     * Calcula el factor de balanceo de un nodo.
     * @param nodo Nodo del que se quiere calcular el factor de balanceo
     * @return Factor de balanceo (diferencia de altura entre subárboles)
     */
    private int getFactorBalanceo(Nodo<T> nodo) {
        if (nodo == null) {
            return 0;
        }
        return getAltura(nodo.izquierdo) - getAltura(nodo.derecho);
    }
    
    /**
     * Actualiza la altura de un nodo.
     * @param nodo Nodo del que se quiere actualizar la altura
     */
    private void actualizarAltura(Nodo<T> nodo) {
        if (nodo != null) {
            // Aqui va su codigo
        }
    }
    
    /**
     * Realiza una rotacion simple a la derecha.
     * @param y Nodo desbalanceado
     * @return Nueva raiz del subarbol despues de la rotacion
     */
    private Nodo<T> rotacionDerecha(Nodo<T> y) {
        // Aqui va su codigo
    }
    
    /**
     * Realiza una rotacion simple a la izquierda.
     * @param x Nodo desbalanceado
     * @return Nueva raiz del subarbol despues de la rotacion
     */
    private Nodo<T> rotacionIzquierda(Nodo<T> x) {
        // Aqui va su codigo
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public void insertar(T elemento) {
        // Si el elemento ya existe, lo eliminamos en lugar de insertarlo
        if (buscar(elemento)) {
            return;
        }
        
        // Si no existe, procedemos con la inserción normal
        raiz = insertarRecursivo(raiz, elemento);
    }
    
    /**
     * Inserta un elemento de forma recursiva y mantiene el árbol balanceado.
     * @param nodo Nodo actual en la recursión
     * @param elemento Elemento a insertar
     * @return Nueva raíz del subárbol después de la inserción
     */
    private Nodo<T> insertarRecursivo(Nodo<T> nodo, T elemento) {
        if (nodo == null) {
            return new Nodo<>(elemento);
        }
        // Aqui va su codigo
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public boolean buscar(T elemento) {
        return buscarRecursivo(raiz, elemento);
    }
    
    /**
     * Busca un elemento de forma recursiva.
     * @param nodo Nodo actual en la recursión
     * @param elemento Elemento a buscar
     * @return true si el elemento existe, false en caso contrario
     */
    private boolean buscarRecursivo(Nodo<T> nodo, T elemento) {
        if (nodo == null) {
            return false;
        }
        // Aqui va su codigo
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public void eliminar(T elemento) {
        raiz = eliminarRecursivo(raiz, elemento);
    }
    
    /**
     * Elimina un elemento de forma recursiva y mantiene el árbol balanceado.
     * @param nodo Nodo actual en la recursión
     * @param elemento Elemento a eliminar
     * @return Nueva raíz del subárbol después de la eliminación
     */
    private Nodo<T> eliminarRecursivo(Nodo<T> nodo, T elemento) {
        if (nodo == null) {
            return null;
        }
        // Aqui va su codigo
    }
    
    /**
     * Encuentra el valor mínimo en un subárbol.
     * @param nodo Raíz del subárbol
     * @return Valor mínimo en el subárbol
     */
    private T encontrarMinimo(Nodo<T> nodo) {
        T minimo = nodo.dato;
        while (nodo.izquierdo != null) {
            minimo = nodo.izquierdo.dato;
            nodo = nodo.izquierdo;
        }
        return minimo;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public Iterador<T> iteradorPreOrden() {
        return new IteradorPreOrden<>(raiz);
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public Iterador<T> iteradorPostOrden() {
        return new IteradorPostOrden<>(raiz);
    }
    
    /**
     * Visualiza el árbol AVL de forma gráfica en la consola.
     */
    public void visualizarArbol() {
        if (estaVacio()) {
            System.out.println("Árbol vacío");
            return;
        }
        System.out.println("------------------------");
        visualizarRecursivo(raiz, "", true);
        System.out.println("------------------------");
    }

    /**
     * Método auxiliar para visualizar el árbol de forma recursiva.
     * @param nodo Nodo actual en la recursión
     * @param prefijo Prefijo para la línea actual
     * @param esUltimo Indica si es el último hijo del nodo padre
     */
    private void visualizarRecursivo(Nodo<T> nodo, String prefijo, boolean esUltimo) {
        if (nodo == null) {
            return;
        }
        
        System.out.println(prefijo + (esUltimo ? "|__ " : "|-- ") + nodo.dato);
        
        // Construir el prefijo para los hijos
        String nuevoPrefijo = prefijo + (esUltimo ? "    " : "|   ");
        
        // Primero procesamos el hijo derecho y luego el izquierdo para que visualmente
        // el árbol se vea con la raíz arriba, izquierda a la izquierda y derecha a la derecha
        if (nodo.derecho != null || nodo.izquierdo != null) {
            visualizarRecursivo(nodo.derecho, nuevoPrefijo, nodo.izquierdo == null);
            visualizarRecursivo(nodo.izquierdo, nuevoPrefijo, true);
        }
    }
}
/**
 * Clase principal para probar la implementación del árbol AVL.
 */
public class Main {
    public static void main(String[] args) {
        // Crear un árbol AVL de enteros
        ArbolAVL<Integer> arbol = new ArbolAVLImpl<>();
        
        System.out.println("Insertando elementos en el árbol AVL...");
        arbol.insertar(10);
        arbol.insertar(20);
        arbol.insertar(30);
        arbol.insertar(40);
        arbol.insertar(50);
        arbol.insertar(25);
        arbol.insertar(15);

        System.out.println("\nVisualización del árbol:");
        ((ArbolAVLImpl<Integer>) arbol).visualizarArbol();
        

        System.out.println("Altura del árbol: " + arbol.altura());
        
        System.out.println("\nBúsqueda de elementos:");
        System.out.println("¿Existe el elemento 30? " + arbol.buscar(30));
        System.out.println("¿Existe el elemento 35? " + arbol.buscar(35));
        
        System.out.println("\nRecorrido Pre-orden:");
        Iterador<Integer> iteradorPre = arbol.iteradorPreOrden();
        while (iteradorPre.hasNext()) {
            System.out.print(iteradorPre.next() + " ");
        }
        
        System.out.println("\n\nRecorrido Post-orden:");
        Iterador<Integer> iteradorPost = arbol.iteradorPostOrden();
        while (iteradorPost.hasNext()) {
            System.out.print(iteradorPost.next() + " ");
        }
        
        System.out.println("\n\nProbando inserción de un elemento duplicado (30):");
        System.out.println("Antes de insertar duplicado, ¿existe 30? " + arbol.buscar(30));
        arbol.insertar(30);
        System.out.println("\nVisualización del árbol despues de intentar insertar duplicado:");
        ((ArbolAVLImpl<Integer>) arbol).visualizarArbol();
        
        System.out.println("\nEliminando el elemento 20...");
        arbol.eliminar(20);

        System.out.println("\nVisualización del árbol despues de eliminar un elemento:");
        ((ArbolAVLImpl<Integer>) arbol).visualizarArbol();
        
        System.out.println("Recorrido Pre-orden después de eliminar 20:");
        iteradorPre = arbol.iteradorPreOrden();
        while (iteradorPre.hasNext()) {
            System.out.print(iteradorPre.next() + " ");
        }
        
        System.out.println("\n\nAltura del árbol después de las operaciones: " + arbol.altura());
    }
}
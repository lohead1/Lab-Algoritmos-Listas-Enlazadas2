package LinkedList;

public class ListaEnlazada <E extends Comparable<E>> implements Lista<E> {
    
    /**
     * Atributos
     * first -> Referencia al primer elemento de la lista
     */
    
    private Node first;
    
    //Constructor
    public ListaEnlazada(){
        this.first = null;
    }

    //-----Implementacion de los metodos de la interfaz
    /**
     * Verifica si la lista está vacía.
     * Si la referencia al primer nodo es nula, significa que no hay elementos en la lista.
     *
     * @return true si la lista no tiene ningún elemento, false en caso contrario.
     */
    @Override
    public boolean isEmptyList(){
        return this.first == null;
    }

    /**
     * Calcula el tamaño de la lista.
     * Se recorre desde el primer nodo y se cuenta cada nodo hasta llegar a uno nulo,
     * indicando el final de la lista.
     *
     * @return cantidad de elementos en la lista.
     */
    @Override
    public int length(){
        int size = 0;
        Node nodoActual = this.first;
        
        while(nodoActual != null){
            nodoActual = nodoActual.next;
            size++;
        }

        return size;
    }

    /**
     * Elimina todos los elementos de la lista,
     * estableciendo la referencia al primer nodo como nula.
     */
    @Override
    public void destroyList(){
        this.first = null;
    }

    /**
     * Busca un elemento en la lista y devuelve su posición.
     *
     * @param data el elemento que se desea buscar.
     * @return el índice donde se encuentra el elemento, o -1 si no se encuentra en la lista.
     */
    @Override
    public int search(E data) {
        if (this.isEmptyList()) return -1;
    
        int index = 0;
        Node actual = this.first;
    
        while (actual != null) {
            if (actual.data.compareTo(data) == 0) {
                return index;
            }
            actual = actual.next;
            index++;
        }
    
        return -1; // Si no se encuentra el elemento
    }

    /**
     * Clase interna que representa un nodo de la lista.
     * Cada nodo almacena un dato genérico @param <E> y una referencia al siguiente nodo.
     *
     */
    private class Node {
        /** Valor genérico a guardar en el nodo. */
        private E data;

        /** Referencia al siguiente nodo en la lista. */
        private Node next;

        /**
         * Crea un nuevo nodo con el dato especificado.
         * La referencia al siguiente nodo se inicializa como null.
         *
         * @param data el dato que se almacenará en el nodo.
         */
        public Node(E data) {
            this.data = data;
            this.next = null;
        }
    }

}

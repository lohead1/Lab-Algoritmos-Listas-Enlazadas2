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

package LinkedList;

public class ListaEnlazada <E extends Comparable<E>> implements Lista<E> {
    



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

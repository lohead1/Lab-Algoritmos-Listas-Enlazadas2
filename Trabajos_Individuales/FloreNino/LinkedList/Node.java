package LinkedList;

public class Node <E> {
    /** Valor genérico a guardar en el nodo. */
    protected E data;

    /** Referencia al siguiente nodo en la lista. */
    protected Node <E> next;

    
    
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

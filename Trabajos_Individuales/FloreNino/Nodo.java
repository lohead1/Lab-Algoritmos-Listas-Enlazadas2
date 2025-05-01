public class Nodo <E> {
    /** Valor genérico a guardar en el nodo. */
    private E data;

    /** Referencia al siguiente nodo en la lista. */
    private Nodo <E> next;

    /**
     * Crea un nuevo nodo con el dato especificado.
     * La referencia al siguiente nodo se inicializa como null.
     *
     * @param data el dato que se almacenará en el nodo.
     */
    public Nodo(E data) {
        this.data = data;
        this.next = null;
    }
}

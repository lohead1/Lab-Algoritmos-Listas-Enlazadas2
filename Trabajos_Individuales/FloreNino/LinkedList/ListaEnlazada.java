package LinkedList;
import java.util.Iterator;

public class ListaEnlazada <E extends Comparable<E>> implements Lista<E> {
    
    //Atributos
    private Node first; //Referencia al Primer Nodo
    
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
     * Inserta un nuevo elemento al inicio de la lista.
     * Si la lista está vacía, el nuevo nodo se convierte en el primer nodo.
     * Si no, el nuevo nodo apunta al primer nodo actual, y luego se actualiza la referencia
     * para que 'first' apunte al nuevo nodo.
     *
     * @param data el elemento a insertar al inicio de la lista.
     */
    @Override
    public void insertFirst(E data){

        Node nodo = new Node(data);

        if(this.isEmptyList()){
            this.first = nodo;
        }else{
            nodo.next = this.first;
            this.first = nodo;
        }
    }

    /**
     * Inserta un nuevo elemento al final de la lista.
     * Si la lista está vacía, el nuevo nodo se convierte en el primer nodo.
     * De lo contrario, se recorre la lista hasta el último nodo y se enlaza el nuevo nodo
     * como siguiente, convirtiéndolo en el nuevo último nodo.
     *
     * @param data el elemento a insertar al final de la lista.
     */
    @Override
    public void insertLast(E data){
        Node nodo = new Node(data);

        if(this.isEmptyList()){
            this.first = nodo;
        }else{
            Node actual = this.first;

            while(actual.next != null){
                actual = actual.next;
            }

            actual.next = nodo;
        }
    }

    /**
     * Elimina el primer nodo que contiene el elemento especificado.
     * Si el elemento no existe o la lista está vacía, retorna false.
     * Si el elemento es encontrado y eliminado, reorganiza los enlaces
     * para mantener la continuidad de la lista.
     *
     * @param data el elemento a eliminar
     * @return true si se eliminó correctamente, false en caso contrario
     */
    @Override
    public boolean remove(E data){
        //if(data == null) throw new IllegalArgumentException();
        
        //Condiciones Iniciales
        if(this.isEmptyList()) return false;

        if(this.first.data.compareTo(data) == 0){
            this.first = this.first.next;
            return true;
        }

        //Buscar el nodo a remover
        Node nodoA = this.first; //Nodo Actual

        while(nodoA.next != null && nodoA.next.data.compareTo(data) != 0){
            nodoA = nodoA.next;
        }

        if(nodoA.next == null) return false;

        nodoA.next = nodoA.next.next;
        return true;

    }

    /**
     * Verifica si un elemento específico existe en la lista.
     *
     * @param obj el elemento a buscar en la lista.
     * @return true si el elemento está presente en la lista; false en caso contrario.
     */
    @Override
    public boolean contains(E obj) {
        /* ----Otra implementación
        Node actual = this.first;

        while (actual != null) {
            if (actual.data.compareTo(obj) == 0) {
                return true;
            }
            actual = actual.next;
        }

        return false;
        */

        return (this.search(obj) != -1);
    }

    /**
     * Retorna el elemento máximo de la lista, según el orden natural definido por {@code compareTo}.
     *
     * @return el elemento de mayor valor en la lista, o {@code null} si la lista está vacía.
     */
    @Override
    public E getMax() {

        if(this.isEmptyList()) return null;

        Node actual = this.first;
        E max = this.first.data;

        while(actual != null) {
            
            if(actual.data.compareTo(max) > 0) {
                max = actual.data;
            }

            actual = actual.next;
        }

        return max;
    }


    /**
     * Invierte el orden de los elementos en la lista sin usar una variable 'previous'.
     * Inserta cada nodo al inicio de una nueva lista construida en el proceso.
     */
    @Override
    public void reverse() {
        if (this.isEmptyList()) return;

        Node nuevo = null;

        while (this.first != null) {
            Node temp = this.first;
            this.first = this.first.next;

            temp.next = nuevo;
            nuevo = temp;
        }

        this.first = nuevo;
    }

    /**
     * Retorna un iterador para recorrer esta lista usando un bucle for-each.
     *
     * Este método es requerido por la interfaz Iterable, lo cual permite
     * recorrer los elementos de la lista.
     *
     * @return un objeto Iterator que recorre los elementos de la lista.
     */
    @Override
    public Iterator<E> iterator() {
        return new IteradorLista();
        
    }

    /**
     * Clase interna que representa un nodo de la lista.
     * Cada nodo almacena un dato genérico @param E y una referencia al siguiente nodo.
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

    // Clase interna que actúa como iterador
    private class IteradorLista implements Iterator<E> {
        private Node actual;

        //Constructor
        public IteradorLista() {this.actual = first;}


        /**
         * Indica si hay un siguiente elemento en la lista.
         *
         * @return true si hay otro nodo por recorrer, false si se llegó al final.
         */
        @Override
        public boolean hasNext() {
            return actual != null;
        }

        /**
         * Retorna el siguiente elemento de la lista y avanza al siguiente nodo.
         *
         * @return El dato almacenado en el nodo actual.
         */
        @Override
        public E next() {
            E dato = actual.data;
            actual = actual.next;
            return dato;
        }
    }

}

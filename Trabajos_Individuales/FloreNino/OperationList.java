import LinkedList.*;

/**
 * Clase que proporciona operaciones sobre listas enlazadas, como búsqueda, inversión,
 * inserción, conteo, comparación, concatenación e impresión de elementos.
 *
 * @param <T> Tipo de datos de los elementos, debe implementar Comparable.
 * @see ListaEnlazada
 * @see Node
 */
public class OperationList {

    /**
     * Busca un elemento en una lista enlazada.
     *
     * @param lista Lista enlazada en la que se realiza la búsqueda.
     * @param obj Elemento a buscar.
     * @return true si el elemento está en la lista, false en caso contrario.
     */
    public static <T extends Comparable<T>> boolean searchElement(ListaEnlazada<T> lista, T obj) {
        return lista.contains(obj);
    }

    /**
     * Crea una nueva lista enlazada con los elementos de la lista dada en orden inverso.
     *
     * @param lista Lista enlazada a invertir.
     * @return Nueva lista enlazada con los elementos en orden inverso.
     * @throws IllegalArgumentException Si la lista está vacía.
     */
    public static <T extends Comparable<T>> ListaEnlazada<T> reverseList(ListaEnlazada<T> lista) {
        if (lista.isEmptyList()) {
            throw new IllegalArgumentException("Error: Lista Vacía");
        }

        ListaEnlazada<T> auxList = new ListaEnlazada<>();
        for (T element : lista) {
            auxList.insertFirst(element);
        }

        return auxList;
    }

    /**
     * Inserta un valor al final de una lista enlazada representada por su nodo inicial.
     *
     * @param head Nodo inicial de la lista.
     * @param valor Valor a insertar al final.
     * @throws IllegalArgumentException Si el nodo inicial es null.
     */
    public static <T extends Comparable<T>> void insertLast(Node<T> head, T valor) {
        if (head == null) {
            throw new IllegalArgumentException("Argumento inválido: Nodo Nulo");
        }

        Node<T> actual = head;
        while (actual.getNext() != null) {
            actual = actual.getNext();
        }

        actual.setNext(new Node<T>(valor));
    }

    /**
     * Cuenta el número de nodos en una lista enlazada representada por su nodo inicial.
     *
     * @param head Nodo inicial de la lista.
     * @return Número de nodos en la lista.
     * @throws IllegalArgumentException Si el nodo inicial es null.
     */
    public static <T extends Comparable<T>> int countNode(Node<T> head) {
        if (head == null) {
            throw new IllegalArgumentException("Argumento inválido: Nodo Nulo");
        }

        int countNodes = 0;
        Node<T> actual = head;
        while (actual != null) {
            actual = actual.getNext();
            countNodes++;
        }

        return countNodes;
    }

    /**
     * Compara dos listas enlazadas para determinar si son iguales (mismos elementos en el mismo orden).
     *
     * @param lista1 Nodo inicial de la primera lista.
     * @param lista2 Nodo inicial de la segunda lista.
     * @return true si las listas son iguales, false en caso contrario.
     */
    public static <T extends Comparable<T>> boolean areEqual(Node<T> lista1, Node<T> lista2) {
        if (lista1 == null && lista2 == null) {
            return true;
        }
        if (lista1 == null || lista2 == null) {
            return false;
        }

        Node<T> actual1 = lista1;
        Node<T> actual2 = lista2;

        while (actual1 != null && actual2 != null) {
            if (!actual1.getData().equals(actual2.getData())) {
                return false;
            }
            actual1 = actual1.getNext();
            actual2 = actual2.getNext();
        }

        return actual1 == null && actual2 == null;
    }

    /**
     * Concatena dos listas enlazadas representadas por sus nodos iniciales, creando una nueva lista
     * que contiene todos los elementos de la primera lista seguidos de los elementos de la segunda lista.
     * La operación preserva el orden original de los elementos en ambas listas.
     *
     * @param lista1 Nodo inicial de la primera lista. Puede ser null (lista vacía).
     * @param lista2 Nodo inicial de la segunda lista. Puede ser null (lista vacía).
     * @return Una nueva ListaEnlazada que contiene los elementos de lista1 seguidos de los de lista2.
     *         Si ambas listas son null, se devuelve una lista vacía.
     */
    public static <T extends Comparable<T>> ListaEnlazada<T> concatenateLists(Node<T> lista1, Node<T> lista2) {
        // Caso especial: ambas listas son nulas
        if (lista1 == null && lista2 == null) {
            return new ListaEnlazada<>();
        }

        // Crear una nueva lista enlazada para el resultado
        ListaEnlazada<T> resultList = new ListaEnlazada<>();
        
        // Puntero al último nodo de resultList para inserciones eficientes
        Node<T> lastNode = null;

        // Copiar los elementos de lista1
        Node<T> actual = lista1;
        while (actual != null) {
            Node<T> nuevoNode = new Node<>(actual.getData());
            if (resultList.isEmptyList()) {
                resultList.insertFirst(actual.getData()); // Establecer el primer nodo
                lastNode = resultList.getFirst();
            } else {
                lastNode.setNext(nuevoNode); // Conectar el nuevo nodo al último
                lastNode = nuevoNode; // Actualizar el puntero al último nodo
            }
            actual = actual.getNext();
        }

        // Copiar los elementos de lista2
        actual = lista2;
        while (actual != null) {
            Node<T> nuevoNode = new Node<>(actual.getData());
            if (resultList.isEmptyList()) {
                resultList.insertFirst(actual.getData()); // Establecer el primer nodo
                lastNode = resultList.getFirst();
            } else {
                lastNode.setNext(nuevoNode); // Conectar el nuevo nodo al último
                lastNode = nuevoNode; // Actualizar el puntero al último nodo
            }
            actual = actual.getNext();
        }

        return resultList; // Retorna la lista concatenada
    }

    /**
     * Imprime los elementos de una lista enlazada en la consola, separados por espacios.
     *
     * @param lista Lista enlazada a imprimir.
     */
    public static <T extends Comparable<T>> void printList(ListaEnlazada<T> lista) {
        Node<T> actual = lista.getFirst();
        while (actual != null) {
            System.out.print(actual.getData() + " ");
            actual = actual.getNext();
        }
        System.out.println();
    }
}
package sesion5;

public class ListaEnlazada <T> {
    private Node<T> first;

    @SuppressWarnings("hiding")
	private class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
    public ListaEnlazada() {
        first = null;
    }

    public void agregarAlFinal(T data) {
        Node<T> nuevo = new Node<>(data);
        if (first == null) {
            first = nuevo;
        } else {
            Node<T> actual = first;
            while (actual.next != null) {
                actual = actual.next;
            }
            actual.next = nuevo;
        }
    }

    public boolean eliminar(T data) {
        if (first == null) {
            return false;
        }
        if (first.data.equals(data)) {
            first = first.next;
            return true;
        }
        Node<T> actual = first;
        while (actual.next != null) {
            if (actual.next.data.equals(data)) {
                actual.next = actual.next.next;
                return true;
            }
            actual = actual.next;
        }
        return false;
    }

    public boolean contiene(T data) {
        Node<T> actual = first;
        while (actual != null) {
            if (actual.data.equals(data)) {
                return true;
            }
            actual = actual.next;
        }
        return false;
    }

    public void imprimir() {
        Node<T> actual = first;
        while (actual != null) {
            System.out.println(actual.data);
            actual = actual.next;
        }
    }

    public int contar() {
        int contador = 0;
        Node<T> actual = first;
        while (actual != null) {
            contador++;
            actual = actual.next;
        }
        return contador;
    }

    public void invertir() {
        Node<T> prev = null;
        Node<T> actual = first;
        Node<T> siguiente;
        while (actual != null) {
            siguiente = actual.next;
            actual.next = prev;
            prev = actual;
            actual = siguiente;
        }
        first = prev;
    }

    public T obtenerPrimerElemento() {
        if (first != null) {
            return first.data;
        }
        return null;
    }

    public boolean estaVacia() {
        return first == null;
    }

    public void transferirPrimerElementoA(ListaEnlazada<T> otraLista) {
        if (first != null) {
            T dato = first.data;
            first = first.next;
            otraLista.agregarAlFinal(dato);
        }
    }
}

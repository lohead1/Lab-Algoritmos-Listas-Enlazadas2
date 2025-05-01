import LinkedList.*;

public class OperationList {
    public static <T extends Comparable<T>> boolean searchElement(ListaEnlazada<T> lista, T obj) {
        return lista.contains(obj);
    }

    public static <T extends Comparable<T>> ListaEnlazada<T> reverseList(ListaEnlazada<T> lista) {
        
        ListaEnlazada<T> auxList = new ListaEnlazada<>();

        for (T element : lista) {
            auxList.insertFirst(element);
        }

        Nodo<T> = lista.getFirst();

        return auxList;
    }

    public static <T extends Comparable<T>> ListaEnlazada<T> insertLast(Nodo)

}

package LinkedList;

/**
 * Interfaz que define las operaciones básicas para una lista genérica.
 * Proporciona métodos para verificar si la lista está vacía, obtener su tamaño,
 * destruir la lista, buscar, insertar, eliminar, entre otras.
 *
 * @param E el tipo de elementos que almacena la lista, que debe ser comparable.
 */

public interface Lista <E extends Comparable<E>> extends Iterable<E> {
    public boolean isEmptyList();
    public int length();
    public void destroyList();
    public int search(E obj);
    public void insertFirst(E obj);
    public void insertLast(E obj);
    public boolean remove(E obj);
    public void reverse(); 
    public boolean contains(E obj);
    public E getMax(E obj);
}
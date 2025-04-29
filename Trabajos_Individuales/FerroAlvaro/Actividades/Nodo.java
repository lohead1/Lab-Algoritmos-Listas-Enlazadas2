package b;

/**
 * Clase Nodo generica
 * @param <T>
 */
public class Nodo<T> {
	T dato;
	Nodo<T> next; 
	/**
	 * Constructor del dato  
	 * @param dato el dato se almacenara en este nodo
	 */
	public Nodo(T dato) {
		this.dato=dato; // se guarda el dato proporcionado
		this.next=null;  // se inicializa el next con null porque no hay nodo
	}
}
/**
 * se crea una lista enlazada genérica.
 */
class ListaEnlazada<T extends Comparable<T>>{
	private Nodo<T> first;  // es la referencia al primer nodo de la lista
		
	public ListaEnlazada(){
		this.first=null;  // la primera referencia se inicializa con null porque no hay nodos
	}
	
	/**
	 * se verifica que la lista esta vacia 
	 * @return true si no hay nodos, false si hay nodos
	 */
	public boolean isEmptylist() {
		return(first==null); // si hace referencia al null, quiere decir que la lista esta vacia
	}
	/**
	 * se encarga de saber cuantos nodos tienen
	 * @return cantidad de nodos
	 */
	public int length() {
		int conta=0;  // se inicializa un contador de nodos
		Nodo<T> NC=first; // se crea una referencia temporal que apunte al primer nodo
		while(NC!=null) { // se va a recorre todo los nodos mientras no llegue al final
			conta++;      // el contador va aumentando por cada nodo
			NC=NC.next;   // avanza al siguiente nodo
		}
		return conta;     // cantidad de nodos
	}
	/**
	 *  se crear un metodo para destruir los nodos de la lista 
	 */
	public void destroylist() {
		first=null; // se iguala la primera referencia a null lo cual es cero
	}
	/**
	 * Metodo para buscar un dato
	 * @param data dato que se va a buscar
	 * @return la posición (índice) del dato si se encuentra, o -1 si no está
	 */
	public int search(T dato) {
		if(!isEmptylist()) {  // verifica si esta vacio 
			Nodo<T> NC=first; // crea un referencia que apunte al primer elemento
			int index=0;	 // se crea el index
			while(NC!=null) { // se va a recorre todo los nodos mientras no llegue al final
				if(NC.dato.compareTo(dato)==0) { // verifica si se encuntra el dato del nodo con el nodo a buscar 
					return index;      // se retorna su indice
				}
			index++;	
			NC=NC.next;	// Avanza al siguiente nodo
			}
		}
		return -1; // Si no lo encuentra
	}
	public boolean contiene(T dato) {
    	if(this.isEmptylist()) {
    		return false;
    	}else { 
    		Nodo<T> actual=first; 
    		while(actual!=null) {
    			if(actual.dato.compareTo(dato)==0) {
    				return true;
    			}
    			actual=actual.next;
    		}
    		return false; 
    	}
    }
	/**
	 * Se crea la funcion para insertar primero
	 * @param data el dato a insertar
	 */
	public void insertfirst(T dato) {
		if(isEmptylist()) { // verifica si esta vacia la lista 
			 first = new Nodo<>(dato); // si esta vacia se crea un nuevo nodo 
		}else {
			Nodo<T> nuevoN= new Nodo<>(dato);  // en caso no este vacia tmb se crea un nuevo nodo
			nuevoN.next=first;                 // nuevo nodo va a apuntar al actual primer nodo
			first=nuevoN;					   //  Ahora el nuevo nodo es el primero
			
		}
	}
	/**
	 * Se crea la funcion para insertar al final
	 * @param data el dato a insertar
	 */
	public void insertend(T dato) {
		if(isEmptylist()) {    // verifica si esta vacia la lista 
			 first = new Nodo<>(dato);  // si esta vacia se crea un nuevo nodo 
		}else {
			Nodo<T> NC=first;   //crea un referencia que apunte al primer elemento
			while(NC.next!=null) { // se va a recorre todo los nodos mientras no llegue al final
				NC=NC.next; // Mueve NC al siguiente nodo
			}
			Nodo<T> nuevoN= new Nodo<>(dato);  // Crea un nuevo nodo con el dato proporcionado
			NC.next=nuevoN;    // Enlaza el último nodo con el nuevo nodo
		}
	}
	/**
	 * Elimina el primer nodo que contiene el dato proporcionado
	 * @param data el dato que se desea eliminar
	 */
		public void remove(T dato) {
			if(!isEmptylist()) {  // Verifica si la lista no está vacía
				Nodo<T> NC=first; // Nodo actual	
				if(NC.dato.compareTo(dato)==0) {    // Si el primer nodo contiene el dato a eliminar
					first = first.next;  // Se actualiza el primer nodo para que apunte al siguiente nodo
				}
			}else {   // Si el dato no está en el primer nodo, recorremos la lista
				Nodo<T> NC=first;
				while(NC.next!=null && NC.next.dato.compareTo(dato) != 0) {
					NC=NC.next; // Avanza al siguiente nodo
				}
				if(NC.next==null) {  // Si llegamos al final y no encontramos el dato
				}else {
					NC.next=NC.next.next; 
				}
			}
		}
		public boolean borrar(T dato) {
			if(first==null) {
				return false;
			}if(first.dato.equals(dato)) {
				first=first.next;
				return true;
			}
			Nodo<T> NC=first;
			 while (NC.next != null && !NC.next.dato.equals(dato)) {
				 NC=NC.next;
			 }
			 if(NC.next==null) {  // Si llegamos al final y no encontramos el dato
				}else {
					NC.next=NC.next.next; 
					return true;
		}
		return false; 
	}
		public void imprimir() {
	        Nodo<T> NC = first; // Nodo actual para recorrer desde el principio
	        while ( NC != null) { // Mientras existan nodos
	            System.out.println("- " + NC.dato); // Imprimimos el dato
	            NC = NC.next; // Avanzamos al siguiente nodo
	        }
}
}
	


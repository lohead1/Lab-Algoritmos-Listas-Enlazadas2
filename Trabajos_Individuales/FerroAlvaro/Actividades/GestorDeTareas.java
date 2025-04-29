package b;

import java.util.ArrayList;
class GestorDeTareas<T extends Comparable<T>> {
	private ListaEnlazada tareaspendientes; 
	private ArrayList<T> tareascompletadas; 
	
	  public GestorDeTareas() {
	        this.tareaspendientes = new ListaEnlazada<>(); // Inicializamos la lista enlazada vacía
	        this.tareascompletadas = new ArrayList<>(); // Inicializamos el ArrayList vacío
	    }
	  public void agregarTarea(T tarea) {
	        tareaspendientes.insertend(tarea); // Insertamos la tarea al final de la lista
	    }
	  public boolean borrar(T tarea) {
		  return tareaspendientes.borrar(tarea); 
	  }
	  public boolean contiene(T tarea) {
		  return tareaspendientes.contiene(tarea); 
	  }
	  public void imprimir() {
		  System.out.println("--- TAREAS PENDIENTES ---");
		  tareaspendientes.imprimir(); 
	  }
	  public int contar() {
		  return tareaspendientes.length(); 
	  }
	  
	  public void completarT(T tarea) {
		  if(tareaspendientes.borrar(tarea)) {
			  tareascompletadas.add(tarea);
		  }else {
			  System.out.println("No se encontró la tarea: " + tarea);
		  }
	  }
	  public void mostrarTareaC(){
		  System.out.println("\n--- TAREAS COMPLETADAS ---");
		  for(T tarea:tareascompletadas) {
			  System.out.println("- " + tarea);
		  }
	  }
}

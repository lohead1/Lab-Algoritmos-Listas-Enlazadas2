import LinkedList.*;

class GestorTareas<T extends Comparable<T>> {
	
    private ListaEnlazada<T> pendientes; 
    private ListaEnlazada<T> completadas; 
	
    //Constructor
	public GestorTareas() {
	    this.pendientes = new ListaEnlazada<>(); // Inicializamos la lista enlazada vacía
        this.completadas = new ListaEnlazada<>();
    }
    
    /**
     * Agrega una tarea a la lista de pendientes.
     * 
     * @param tarea la tarea que se agrega.
     */
    public void agregarTarea(T tarea) {
        this.pendientes.insertLast(tarea);
	}
	
    /**
     * Elimina una tarea de la lista de pendientes.
     * 
     * @param tarea la tarea que se eliminará.
     * @return true si la tarea fue eliminada, false si no se encontró.
     */
    public boolean eliminarTarea(T tarea) {
        return this.pendientes.remove(tarea);
	}

    /**
     * Verifica si una tarea existe en la lista de pendientes.
     * 
     * @param tarea la tarea que se busca.
     * @return true si la tarea está en la lista, false si no.
     */
    public boolean contieneTarea(T tarea) {
        return this.pendientes.contains(tarea);
	}
	
    /**
     * Imprime todas las tareas pendientes.
     */
    public void imprimirTareas() {
        System.out.println("--- TAREAS PENDIENTES ---");
		
        for (T tarea : this.pendientes) {
            System.out.println(tarea);
        }

	}

    /**
     * Imprime todas las tareas Completadas.
     */
    public void imprimirTareasCompletadas() {
        System.out.println("\n--- TAREAS COMPLETADAS ---");
		
        for (T tarea : this.completadas) {
            System.out.println(tarea);
        }
    }

        /**
     * Cuenta cuántas tareas hay en la lista de tareas pendientes.
     * 
     * @return el número de tareas pendientes.
     */
	public int contarTareas() {
		return this.pendientes.length(); 
	}
	
        /**
     * Marca una tarea como completada.
     * 
     * @param tarea la tarea que se completará.
     */
	public void completarTarea(T tarea) {
        if (this.pendientes.remove(tarea)) {  // Verificar que la tarea esté en la lista pendiente
            this.completadas.insertLast(tarea);
            System.out.println("Tarea completada: " + tarea);
        } else {
            System.out.println("La tarea no se encuentra en las tareas pendientes.");
        }
	}

    /**
     * Obtiene la tarea con mayor prioridad.
     * 
     * @return la tarea con mayor prioridad.
     */
    public T obtenerTareaMasPrioritaria(){
        return this.pendientes.getMax();
    }

    /**
     * Invierte el orden de las tareas pendientes.
     */
    public void invertirTareas() {
        this.pendientes.reverse();
        System.out.println("Lista de Tareas Invertida con exito");
    }

}


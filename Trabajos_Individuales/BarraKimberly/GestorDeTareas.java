package sesion5;

public class GestorDeTareas <T> {
    private ListaEnlazada<T> tareasPendientes;
    private ListaEnlazada<T> tareasCompletadas;

    public GestorDeTareas() {
        tareasPendientes = new ListaEnlazada<>();
        tareasCompletadas = new ListaEnlazada<>();
    }

    public void agregarTarea(T tarea) {
        tareasPendientes.agregarAlFinal(tarea);
    }

    public boolean eliminarTarea(T tarea) {
        return tareasPendientes.eliminar(tarea);
    }

    public boolean contieneTarea(T tarea) {
        return tareasPendientes.contiene(tarea);
    }

    public void imprimirTareas() {
        System.out.println("======TAREAS PENDIENTES=======");
        tareasPendientes.imprimir();
    }

    public int contarTareas() {
        return tareasPendientes.contar();
    }

    public T obtenerTareaMasPrioritaria() {
        return tareasPendientes.obtenerPrimerElemento();
    }

    public void invertirTareas() {
        tareasPendientes.invertir();
    }

    public void completarTarea(T tarea) {
        if (tareasPendientes.eliminar(tarea)) {
            tareasCompletadas.agregarAlFinal(tarea);
        }
    }

    public void imprimirTareasCompletadas() {
        System.out.println("====TAREAS COMPLETADAS======:");
        tareasCompletadas.imprimir();
    }
}
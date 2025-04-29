public class Main {
    public static void main(String[] args) {
        // 1. Crear instancia del gestor
        GestorTareas<Tarea> gestor = new GestorTareas<>();

        // 2. Agregar tareas
        gestor.agregarTarea(new Tarea("Estudiar", 3));
        gestor.agregarTarea(new Tarea("Ejercicios", 2));
        gestor.agregarTarea(new Tarea("Comprar víveres", 1));

        // 3. Eliminar alguna tarea
        gestor.eliminarTarea(new Tarea("Comprar víveres", 2)); // solo importa el nombre en equals()

        // 4. Imprimir todas las tareas actuales
        System.out.println("Tareas actuales:");
        gestor.imprimirTareas();

        // 5. Verificar si existe una tarea
        Tarea tareaBuscar = new Tarea("Hacer ejercicio", 0);
        System.out.println("\n¿Contiene '" + tareaBuscar.getTitulo() + "'? " + gestor.contieneTarea(tareaBuscar));

        // 6. Invertir la lista de tareas
        gestor.invertirTareas();

        // 7. Transferir tarea a lista de completadas
        
        Tarea tareaCompletada = new Tarea("Hacer ejercicio", 0);
        gestor.completarTarea(tareaCompletada);

        // 8. Mostrar ambas listas
        gestor.imprimirTareas();
        gestor.imprimirTareasCompletadas();
        
    }
}

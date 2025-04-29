package sesion5;

public class Main {
    public static void main(String[] args) {
    	 GestorDeTareas<Tarea> gestor = new GestorDeTareas<>();

         // 1. Agregar tareas
         gestor.agregarTarea(new Tarea("Hacer reporte", 2));
         gestor.agregarTarea(new Tarea("Enviar correo", 5));
         gestor.agregarTarea(new Tarea("Revisar código", 1));

         // 2. Eliminar una tarea
         gestor.eliminarTarea(new Tarea("Enviar correo", 5));

         // 3. Imprimir tareas actuales
         gestor.imprimirTareas();

         // 4. Verificar si existe una tarea
         System.out.println("¿Existe 'Hacer reporte'? " + gestor.contieneTarea(new Tarea("Hacer reporte", 2)));
         System.out.println("¿Existe 'Enviar correo'? " + gestor.contieneTarea(new Tarea("Enviar correo", 5)));

         // 5. Invertir lista de tareas
         gestor.invertirTareas();
         gestor.imprimirTareas();

         // 6. Completar una tarea
         gestor.completarTarea(new Tarea("Revisar código", 1));

         // 7. Mostrar tareas pendientes y completadas
         gestor.imprimirTareas();
         gestor.imprimirTareasCompletadas();
     }
}

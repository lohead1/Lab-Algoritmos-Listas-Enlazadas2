package sesion5;

public class Main {
    public static void main(String[] args) {
        GestorDeTareas<String> gestor = new GestorDeTareas<>();

        //Agregar tareas
        gestor.agregarTarea("hacer reporte");
        gestor.agregarTarea("enviar correo");
        gestor.agregarTarea("eevisar código");

        //Eliminar una tarea
        gestor.eliminarTarea("enviar correo");

        //Imprimir tareas actuales
        gestor.imprimirTareas();

        //Verificar si existe una tarea
        System.out.println("Existe 'Hacer reporte'? " + gestor.contieneTarea("Hacer reporte"));
        System.out.println("Existe 'Enviar correo'? " + gestor.contieneTarea("Enviar correo"));

        //Invertir lista de tareas
        gestor.invertirTareas();
        gestor.imprimirTareas();

        //Completar una tarea
        gestor.completarTarea("Revisar codigo");

        //Mostrar tareas pendientes y completadas
        gestor.imprimirTareas();
        gestor.imprimirTareasCompletadas();
    }
}

package sesion5;

public class Main {
    public static void main(String[] args) {
    	 GestorDeTareas<Tarea> gestor = new GestorDeTareas<>();

         gestor.agregarTarea(new Tarea("Hacer reporte", 2));
         gestor.agregarTarea(new Tarea("Enviar correo", 5));
         gestor.agregarTarea(new Tarea("Revisar código", 1));

         gestor.eliminarTarea(new Tarea("Enviar correo", 5));

         gestor.imprimirTareas();

         System.out.println("¿Existe 'Hacer reporte'? " + gestor.contieneTarea(new Tarea("Hacer reporte", 2)));
         System.out.println("¿Existe 'Enviar correo'? " + gestor.contieneTarea(new Tarea("Enviar correo", 5)));

         gestor.invertirTareas();
         gestor.imprimirTareas();

         gestor.completarTarea(new Tarea("Revisar código", 1));

         gestor.imprimirTareas();
         gestor.imprimirTareasCompletadas();
     }
}

package b;

public class Main {
    public static void main(String[] args) {
        GestorDeTareas<Tarea> gestor = new GestorDeTareas<>();

        Tarea t1 = new Tarea("Estudiar ", 2);
        Tarea t2 = new Tarea("Hacer ejercicio ", 1);
        Tarea t3 = new Tarea("Leer ", 3);

        gestor.agregarTarea(t1);
        gestor.agregarTarea(t2);
        gestor.agregarTarea(t3);

        System.out.println("\nEstado inicial:");
        gestor.imprimir();
        
        System.out.println("\nEliminando tarea: " + t2);
        gestor.borrar(t2);
        gestor.imprimir();
        
        System.out.println("\n¿Existe 'Llamar al médico'? " +
                gestor.contiene(t3));
        
        System.out.println("\nCompletando tarea: " + t2);
        gestor.completarT(t2); // Marca "Hacer ejercicio" como completada
        

        gestor.imprimir();
        gestor.mostrarTareaC(); // Muestra completadas
    }
}

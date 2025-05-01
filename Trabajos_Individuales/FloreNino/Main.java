import LinkedList.ListaEnlazada;

public class Main {
    public static void main(String[] args) {
        // 1. Crear instancia del gestor
        GestorTareas<Tarea> gestor = new GestorTareas<>();

        // 2. Agregar tareas
        gestor.agregarTarea(new Tarea("Estudiar", 3));
        gestor.agregarTarea(new Tarea("Ejercicios", 2));
        gestor.agregarTarea(new Tarea("Comprar víveres", 1));

        // 3. Eliminar alguna tarea
        System.out.println("Se pudo eliminar la Tarea: " + 
        gestor.eliminarTarea(new Tarea("Comprar víveres", 2)));
        
        
        // 4. Imprimir todas las tareas actuales
        System.out.println("Tareas actuales:");
        gestor.imprimirTareas();

        // 5. Verificar si existe una tarea
        Tarea tareaBuscar = new Tarea("Hacer ejercicio", 0);
        System.out.println("\n¿Contiene '" + tareaBuscar.getTitulo() + "'? " + gestor.contieneTarea(tareaBuscar));

        // 6. Invertir la lista de tareas
        gestor.invertirTareas();

        // 7. Transferir tarea a lista de completadas
        
        Tarea tareaCompletada = new Tarea("Ejercicios", 2);
        gestor.completarTarea(tareaCompletada);

        // 8. Mostrar ambas listas
        gestor.imprimirTareas();
        gestor.imprimirTareasCompletadas();

        //--------------------EJERCICIOS
        // Crear dos listas enlazadas
        ListaEnlazada<Integer> lista1 = new ListaEnlazada<>();
        ListaEnlazada<Integer> lista2 = new ListaEnlazada<>();
        
        // Insertar elementos en lista1
        lista1.insertFirst(10);
        lista1.insertLast(50);
        lista1.insertLast(150);
        
        // Insertar elementos en lista2
        lista2.insertFirst(1);
        lista2.insertLast(25);
        lista2.insertLast(310);

        // Imprimir las listas
        System.out.println("Lista 1:");
        OperationList.printList(lista1);
        System.out.println("Lista 2:");
        OperationList.printList(lista2);

        // Verificar si las listas son iguales
        boolean areEqual = OperationList.areEqual(lista1.getFirst(), lista2.getFirst());
        System.out.println("¿Son iguales las listas? " + areEqual);

        // Contar los nodos de lista1
        int count1 = OperationList.countNode(lista1.getFirst());
        System.out.println("Número de nodos en Lista 1: " + count1);

        // Contar los nodos de lista2
        int count2 = OperationList.countNode(lista2.getFirst());
        System.out.println("Número de nodos en Lista 2: " + count2);

        // Concatenar las dos listas
        ListaEnlazada<Integer> listaConcatenada = OperationList.concatenateLists(lista1.getFirst(), lista2.getFirst());
        System.out.println("Lista concatenada:");
        OperationList.printList(listaConcatenada);
        
        // Invertir lista1
        ListaEnlazada<Integer> listaInvertida = OperationList.reverseList(lista1);
        System.out.println("Lista 1 invertida:");
        OperationList.printList(listaInvertida);
        
    }

}

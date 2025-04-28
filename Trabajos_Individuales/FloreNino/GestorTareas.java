import LinkedList.ListaEnlazada;

public class GestorTareas <T extends Comparable<T>> {
    
    private ListaEnlazada<T> listTareas;
    private int numTareas;

    public GestorTareas(){
        this.listTareas = new ListaEnlazada<>();
        this.numTareas = 0;
    }

    

}

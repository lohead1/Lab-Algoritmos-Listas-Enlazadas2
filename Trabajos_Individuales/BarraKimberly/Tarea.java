package sesion5;

public class Tarea {
    private String nombre;    
    private int prioridad;

    public Tarea(String nombre, int prioridad) {
        this.nombre = nombre;
        this.prioridad = prioridad;
    }
    
    public String getNombre() {
        return nombre;
    }
   
    public int getPrioridad() {
        return prioridad;
    }
   
    @Override
    public String toString() {
        return "Tarea: " + nombre + " (Prioridad: " + prioridad + ")";
    }

    /*
     * Método que compara esta tarea con otro objeto para determinar si son iguales.
     * Se considera que dos tareas son iguales si tienen el mismo nombre, sin importar la prioridad.
     * @param obj el objeto a comparar
     * @return true si las tareas tienen el mismo nombre, false en caso contrario
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) 
        	return true; 
        if (obj == null || getClass() != obj.getClass()) 
        	return false; 
        Tarea tarea = (Tarea) obj;
        return nombre.equals(tarea.nombre); 
    }
}
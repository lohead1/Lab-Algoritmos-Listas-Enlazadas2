public class Tarea implements Comparable<Tarea> {

    //Atributos
    private String titulo;
    private int prioridad;

    //Constructor
    public Tarea(String titulo, int prioridad){
        this.titulo = titulo;
        this.prioridad = prioridad;
    }

    //Setters y getters
    public void setTitulo(String titulo){this.titulo = titulo;}
    public String getTitulo(){return this.titulo;}

    public void setPrioridad(int prioridad){this.prioridad = prioridad;}
    public int getPrioridad(){return this.prioridad;}

    //Sobrescritura de Metodos
    /**
     * @return Representacion del objeto tarea en formato String
     */
    @Override
    public String toString(){
        return "Tarea[ Titulo: " + this.titulo 
            + ", Prioridad: " + this.prioridad + " ]";
    }

    /**
     * Compara dos tareas por su prioridad.
     * 
     * @param otra la tarea con la cual se compara el objeto actual.
     * @return 0 si las prioridades de ambas tareas son iguales,
     *         un valor negativo si la prioridad de esta tarea es menor,
     *         o un valor positivo si la prioridad de esta tarea es mayor.
     */
    @Override
    public int compareTo(Tarea otra){
        if (this.prioridad < otra.prioridad) return -1;
        if (this.prioridad > otra.prioridad) return 1;

        return 0;
    }

    /**
     * Compara esta tarea con otra para determinar si son iguales.
     * Dos tareas se consideran iguales si tienen el mismo título y la misma prioridad.
     *
     * @param otra el objeto con el que se compara esta tarea.
     * @return true si ambos objetos son tareas con el mismo título y prioridad, false en caso contrario.
     */
    @Override
    public boolean equals(Object otra){
        if(this == otra) return true;

        if(otra == null || this.getClass() != otra.getClass()) return false;

        //Cast
        Tarea tarea = (Tarea) otra;

        return this.titulo.equals(tarea.titulo) && this.prioridad == tarea.prioridad;
    }

    //Sobreescribir hashCode()

}

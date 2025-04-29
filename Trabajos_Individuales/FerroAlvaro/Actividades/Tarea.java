package b;
import java.util.ArrayList;
import java.util.List;


public class Tarea implements Comparable<Tarea>{
	private String titulo; 
	private int prioridad; 
	
	public Tarea(String titulo,int prioridad) {
		this.titulo=titulo;
		this.prioridad=prioridad; 
	}
	
	public String getTitulo() {
		return titulo;
	}
	public int getPrioridad() {
		return prioridad;
	}
	
	@Override 
	public String toString() {
		return titulo+"titulo"+prioridad+"prioridad"; 
	}
	@Override 
	public int compareTo(Tarea otra) {
		return Integer.compare(this.prioridad,otra.prioridad); 
	}
	public boolean equals(Tarea otra) {
		if(otra==null) {
			return false;
		}else {
			return this.titulo.equals(otra.titulo) && this.prioridad == otra.prioridad;
		}
	}
}


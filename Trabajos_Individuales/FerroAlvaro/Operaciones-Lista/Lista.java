package a;

public class Lista<T extends Comparable<T>> {
	private Nodo<T> first; 
	public Lista() {
		first=null;
	}
	public static class Nodo<T>{
		public T data; 
		public Nodo<T> next;  
		
	public Nodo(T data) {
		this.data=data;
		this.next=null; 
	}
}
	
	public boolean isEmptylist() {
		return(first==null); 
	}
	public int length() {
		int conta=0;
		Nodo<T> NC=first;
		while(NC!=null) {
			conta++;
			NC=NC.next; 	
		}
		return conta;
	}
	public void destroylist() {
			first=null;
		}

	public int search(T data) {
		if(!isEmptylist()) {
			Nodo<T> NC=first;
			int index=0;
			while(NC!=null) {
				if(NC.data.compareTo(data)==0) {
					return index; 
				}
			index++;
			NC=NC.next;
			}
		}
		return -1;
	}
	public void insertfirst(T data) {
		if(isEmptylist()) {
			 first = new Nodo<>(data);
		}else {
			Nodo<T> nuevoN= new Nodo<>(data); 
			nuevoN.next=first;
			first=nuevoN;
			
		}
	}
	public void insertend(T data) {
		if(isEmptylist()) {
			 first = new Nodo<>(data);
		}else {
			Nodo<T> NC=first;
			while(NC.next!=null) {
				NC=NC.next;
			}
			Nodo<T> nuevoN= new Nodo<>(data); 
			NC.next=nuevoN;
		}
	}
	public void remove(T data) {
		if(!isEmptylist()) {
			Nodo<T> NC=first;	
			if(NC.data.compareTo(data)==0) {
				first = first.next;
			}
		}else {
			Nodo<T> NC=first;
			while(NC.next!=null && NC.next.data.compareTo(data) != 0) {
				NC=NC.next;
			}
			if(NC.next==null) {
			}else {
				NC.next=NC.next.next; 
			}
		}
	}
}


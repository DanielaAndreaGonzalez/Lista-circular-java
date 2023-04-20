package Logica;

/**
 * 
 * @author GonzalezHDanielaA
 *
 */
public class Nodo {
	
	private int dato;
	private Nodo anterior;
	private Nodo siguiente;
	
	public Nodo()
	{
		this.dato = 0;
		this.anterior = null;
		this.siguiente = null;
	}
	
	
	
	public int getDato() {
		return dato;
	}
	public void setDato(int dato) {
		this.dato = dato;
	}
	public Nodo getAnterior() {
		return anterior;
	}
	public void setAnterior(Nodo anterior) {
		this.anterior = anterior;
	}
	public Nodo getSiguiente() {
		return siguiente;
	}
	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}
	
	

}

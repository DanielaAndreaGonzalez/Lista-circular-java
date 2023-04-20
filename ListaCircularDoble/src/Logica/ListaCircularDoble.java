package Logica;
import java.util.Scanner;
/**
 * 
 * @author GonzalezHDanielaA
 *
 */
public class ListaCircularDoble {
	
	Scanner teclado = new Scanner(System.in);
	Nodo primero;
	Nodo ultimo;
	
	public ListaCircularDoble()
	{
		this.primero = null;
		this.ultimo = null;
	}
	//primero =  36;
	//ultimo = 57;
	
	//x = 62
	
	// <-62 <- 36 <-57 ->  <-62 ->36
	
	
// x = 30
	
	//  ->12<-->30
	
	public void ingresarNodo(int dato)
	{
		Nodo nuevo = new Nodo();
		nuevo.setDato(dato);
		if(primero == null)
		{
			primero = nuevo;
			primero.setSiguiente(primero);
			nuevo.setAnterior(ultimo);
			ultimo = nuevo;
		}else {
			ultimo.setSiguiente(nuevo);
			nuevo.setSiguiente(primero);
			nuevo.setAnterior(ultimo);
			ultimo = nuevo;
			primero.setAnterior(ultimo);
		}
	}
	
	//primero = 34
	// ultimo = 12
	
	// 12 <- 34 -><- 56 -><-67 -><-12->34
	public void buscarNodo(int dato)
	{
		Nodo actual = new Nodo();
		actual = ultimo;
		boolean encontrado = false;
		do {	
			if(actual.getDato() == dato)
			{
				encontrado = true;
			}
			actual = actual.getAnterior();
		}while(actual!= ultimo && encontrado!= true);
		
		if(encontrado == true)
		{
			System.out.println("\n NODO ENCONTRADO");
		}else {
			System.out.println("\n NODO NO ENCONTRADO");
		}
	}
	
	//primero = 14
	// ultimo = 54
	
	// x = 34
	// por  - 15
	
	// 54 <-14 -> <- 76 -> <- 11 -> <- 34 -> <-54 ->14
	public void modificarNodo(int dato)
	{
		Nodo actual = new Nodo();
		actual = primero;
		do {
			if(actual.getDato() == dato)
			{
				 System.out.println(" Ingrese un nuevo valor para el nodo  ");
				 actual.setDato(teclado.nextInt());
				 
			}
			actual = actual.getSiguiente();
		}while(actual!= primero);	
	}

	
	//primero = 12
	// ultimo = 43
	
	//actual = 12
	//anterior= 43
	
	//x = 27
	
	//43 <-12-><- 31 -> <- 27 -><- 67 -> <- 43 ->12
	public void eliminarNodo(int dato)
	{
		Nodo actual = new Nodo();
		Nodo anterior = new Nodo();
		actual = primero;
		anterior = ultimo;
		boolean encontrado = false;
		do {
			
			if(actual.getDato() == dato)
			{
				if(actual == primero)
				{
					primero = primero.getSiguiente();
					ultimo.setSiguiente(primero);
					primero.setAnterior(ultimo);
				}else if(actual == ultimo)
				{
					ultimo = anterior;
					primero.setAnterior(ultimo);
					ultimo.setSiguiente(primero);
				}else {
					anterior.setSiguiente(actual.getSiguiente());
					actual.getSiguiente().setAnterior(anterior);
				}
				encontrado = true;
			}
			//Antes de actualizarlo guardar la referencia que él llevaba
			anterior = actual;
			actual = actual.getSiguiente();	
		}while(actual != primero && encontrado ==false);
	}
	
	
	//62 <- 36  -> <- 57 -> <-62 ->36
	
	public void desplegar()
	{
		Nodo actual = new Nodo();
		actual = primero;
		do {
			System.out.println(actual.getDato());
			actual = actual.getSiguiente();
		}while(actual!= primero);
	}
	
	
	

}

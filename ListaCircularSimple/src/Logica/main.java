/**
 * 
 */
package Logica;

/**
 * @author GonzalezHDanielaA
 *
 */
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		
		ListaCircular listaCircular = new ListaCircular();
		
		listaCircular.agregarAlFinal(12);
		listaCircular.agregarAlFinal(15);
		listaCircular.agregarAlFinal(9);
		
		listaCircular.agregarAlinicio(41);
		listaCircular.agregarAlinicio(6);
		
		System.out.println("<<-- Lista Circular -->>");
		listaCircular.listar();
		
		System.out.print( "\n\n<<-- Tamaño -->");
		System.out.println(listaCircular.getTamanio());
		
		System.out.println("\n <<--Obtener el valor del nodo en la posición 3");
		System.out.println(listaCircular.getValor(3));

		System.out.println("\n Inserta un nodo con valor 16 despues del 15");
		listaCircular.insertarPorReferencia(15, 16);
		listaCircular.listar();
		System.out.print("| Tamaño: ");
		System.out.println(listaCircular.getTamanio());
		
		System.out.println("\n \n Inserta un nodo con valor 44 en la posición 5");
		listaCircular.insrtarPorPosicion(5, 44);
		listaCircular.listar();
		System.out.print(" | Tamaño: ");
		System.out.println(listaCircular.getTamanio());
		
		System.out.println("\nActualiza el valor nodo en la posición 0");
		listaCircular.editarPorPosicion(0, 17);
		listaCircular.listar();
		System.out.print(" | Tamaño: ");
		System.out.println(listaCircular.getTamanio());
		
		System.out.println("\nElimina el nodo con el valor 41");
		listaCircular.removerPorPosicion(4);
		listaCircular.listar();
		System.out.print(" | Tamaño: ");
		System.out.println(listaCircular.buscar(30));
		
		System.out.println("\n Consulta la posicion del valor 17");
		System.out.println(listaCircular.getPosicion(17));
		
		System.out.println("Elimina la lista");
		listaCircular.eliminar();
		
		System.out.println("\n Consulta si la lista está vacia");
		System.out.println(listaCircular.esVacia());
		
		System.out.println("\n\n <<--Fin de ejemplo lista simple -->>");
		
		
	
	}

}

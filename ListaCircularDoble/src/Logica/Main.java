/**
 * 
 */
package Logica;
import java.util.Scanner;
/**
 * @author GonzalezHDanielaA
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ListaCircularDoble listaCD = new ListaCircularDoble();
		Scanner teclado = new Scanner(System.in);
		int opcion = 0;
		
		do {
			System.out.println("\n\nLISTAS CIRCULAR DOBLE");
			System.out.println(" 1. Ingresar nodo");
			System.out.println(" 2. Buscar nodo");
			System.out.println(" 3. Modificar nodo");
			System.out.println(" 4. Eliminar nodo");
			System.out.println(" 5. Desplegar lista");
			System.out.println(" 6. Salir programa");
			System.out.println(" Elige una opción");
			
			opcion = teclado.nextInt();
			
			switch(opcion) {
				
			case 1: 
				System.out.println("\n INGRESAR NODO");
				System.out.println("Ingrese el dato del nodo:");
				int dato = teclado.nextInt();
				listaCD.ingresarNodo(dato);
				break;
			case 2:
				System.out.println("\n BUSCAR NODO");
				System.out.println("Ingrese el dato del nodo a modificar:");
				 dato = teclado.nextInt();
				listaCD.buscarNodo(dato);
				break;
			case 3:
				System.out.println("\n MODIFICAR NODO");
				System.out.println("Ingrese el dato del nodo:");
				dato = teclado.nextInt();
				listaCD.modificarNodo(dato);
				break;
			case 4:
				System.out.println("\n ELIMINAR NODO");
				System.out.println("Ingrese el dato del nodo a eliminar:");
				dato = teclado.nextInt();
				listaCD.eliminarNodo(dato);
				break;
			case 5:
				System.out.println("\n LISTA DE NODOS");
				listaCD.desplegar();;
				break;
			case 6:
				System.out.println("\n\n PROGRAMA FINALIZADO");
				break;
			default:
				System.out.println("\n OPCION INCORRECTA ...");
			}
			
		}while(opcion != 6);
		
		

	}

}


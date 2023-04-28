/*2. Escriba un método de clase que dado un número n devuelva un nuevo arreglo de tamaño 
 * n con los n primeros múltiplos enteros de n mayores o iguales que 1. 
 * Ejemplo: f(5) = [5; 10; 15; 20; 25]; f(k) = {nk/k : 1..k} Agregue al programa la posibilidad 
 * de probar con distintos valores de n ingresándolos por teclado, mediante el uso de System.in. 
 *  La clase Scanner permite leer de forma sencilla valores de entrada.*/


package tp02.ejercicio1;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Imprimir sucesion;
		ListaDeEnteros lista;
		try (Scanner s = new Scanner(System.in)) {
			int num;	
			
			sucesion = new Imprimir();
			lista = new ListaDeEnterosEnlazada();
			System.out.println("Ingrese un numero, e ingrese 0 (cero) para finalizar");
			num = s.nextInt();
			lista = sucesion.sucesion(num,lista);
			while(!lista.fin()) {
				System.out.print(lista.proximo());
			}
		}
	}
}


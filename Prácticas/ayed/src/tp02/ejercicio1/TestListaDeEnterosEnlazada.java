/*1.3. Escriba una clase llamada TestListaDeEnterosEnlazada que reciba en su método main 
	   una secuencia de números, los agregue a un objeto de tipo ListaDeEnterosEnlazada 
	   y luego imprima los elementos de dicha lista.*/

package tp02.ejercicio1;

import java.util.Scanner;

public class TestListaDeEnterosEnlazada {

	public static void main(String[] args) {
		ListaDeEnteros lista = new ListaDeEnterosEnlazada();
		boolean ok = true;
		Scanner s = new Scanner(System.in);
		int num;	
		Imprimir imprime;
		
		while(ok) {
			System.out.println("Ingrese un numero, e ingrese 0 (cero) para finalizar");
			num = s. nextInt();
			if(num != 0) {
				lista.agregarFinal(num);
			}
			else
				ok = false;
		}
		lista.comenzar();
		while(!lista.fin()) {
			System.out.println(lista.proximo());
		}
		/*1.5 Escriba un método recursivo que imprima los elementos de una lista en 
		sentido inverso. La lista la recibe por parámetro.*/
		lista.comenzar();
		imprime = new Imprimir();
		imprime.impRecursivo(lista);
		
		imprime = new Imprimir();
		System.out.println("Ingrese un valor entero");
		num = s.nextInt();
		imprime.sucesion(num);
		s.close();
	}
}
/*1.2. Escriba una clase llamada TestListaDeEnterosConArreglos que reciba en su
 * 	   método main una secuencia de números, los agregue a un objeto de tipo 
 *     ListaDeEnterosConArreglos y luego imprima los elementos de dicha lista.
*/
package tp02.ejercicio1;

public class TestListaDeEnterosConArreglos {
	
	public static void main(String[] args) {
		
		ListaDeEnteros lista = new ListaDeEnterosConArreglos();
		
		lista.agregarInicio(1);
		lista.agregarInicio(2);
		lista.agregarInicio(3);
		lista.agregarFinal(4);
		while(!lista.fin()) {
			System.out.print(lista.proximo());
		}
	}
}
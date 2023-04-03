/*1.6. se aplica la siguiente función de forma recursiva a partir de un número 
      n positivo se obtiene un sucesión que termina en 1:
      Por ejemplo, para n= 6, se obtiene la siguiente sucesión:
1. f(6) = 6/2 = 3
2. f(3) = 3*3 + 1 = 10
3. f(10) = 10/2 = 5
4. ….
Es decir, la sucesión 6, 3, 10, 5, 16, 8, 4, 2, 1. Para cualquier n con el que
 se arranque siempre se llegará al 1.
*/
package tp02.ejercicio1;

public class Imprimir {

	
	public Imprimir() {
		
	}
	
	public void impRecursivo(ListaDeEnteros lista) {
		if(!lista.fin()) {
			System.out.println(lista.proximo());
			impRecursivo(lista);
		}	
		
	}	
	public void sucesion(int n) {
		System.out.println(n);
		if(n != 1) {
			if(n % 2 == 0) {
				n = n/2;
				sucesion(n);
			}
			else{
				n = (n*3)+1;
				sucesion(n);
			}
		}
	}
}
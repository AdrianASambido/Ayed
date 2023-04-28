/*dado unstrin de forma  (),[],{} decir si está balanceado*/

package tp02.ejercicio4;

import java.util.List;
import java.util.Scanner;

import tp02.ejercicio3.PilaGenerica;

public class TestBalanceo {
	public static boolean esBalanceado (String palabra) {
	
	List<Character> openings = List.of('{', '[', '(');
	List<Character> closings = List.of('}', ']', ')');
	PilaGenerica<Character> pila = new PilaGenerica<Character>();
	
	/*public boolean esBalanceado(String s) {*/
	Character anterior, actual;
	for(int i = 0; i < palabra.length(); i++) {
		anterior = palabra.charAt(i);  //tomo el caracter de la posición i
		if(openings.contains(anterior)) {
			pila.apilar(anterior);
		}
		else
			if (closings.contains(anterior) & !pila.esVacia()) {
				actual = pila.desapilar();
				if(!(anterior.equals('(')) & (actual.equals(')') || (anterior.equals('[') & actual.equals(']'))
						|| (anterior.equals('{') & (actual.equals('}'))))){
					return false;
				}
			}
			else
				return false;
		
	}
	
	if(!pila.esVacia()) 
		return false;
	return true;
	}	

	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese los caracteres ()[]{} en el orden que desee : ");
		String palabra = s.next();
		s.close();
		
		if(esBalanceado(palabra)) 
			System.out.println("Esta balanceado");
			else
				System.out.println("No esta balanceado");
	}
}	
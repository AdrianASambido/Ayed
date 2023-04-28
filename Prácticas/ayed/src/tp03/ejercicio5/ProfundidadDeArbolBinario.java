/*Implemente una clase Java llamada ProfundidadDeArbolBinario que tiene como variable de instancia 
 * un árbol binario de números enteros y un método de instancia sumaElementosProfundidad(int p):int 
 * el cuál devuelve la suma de todos los nodos del árbol que se encuentren a la profundidad pasada como argumento.*/

package tp03.ejercicio5;

import tp02.ejercicio3.ColaGenerica;
import tp03.Practica_3.src.main.java.ar.edu.inlp.info.oo1.Practica_3.ArbolBinario;

public class ProfundidadDeArbolBinario<T> {
	
	private ArbolBinario<Integer> arbol = new ArbolBinario<>();
	
	
	public int sumaElementosProfundidad(int n) {
		
		ColaGenerica<ArbolBinario<Integer>> cola = new ColaGenerica<ArbolBinario<Integer>>();
		
		cola.encolar(arbol);
		cola.encolar(null);
		int nivel= 0;
		int total = 0;
		while((!cola.vacia()) & (nivel != n)) {
			arbol = cola.desencolar();
			if(arbol != null) {
				if(nivel == n)
					total = total + arbol.getDato(); 
				if(arbol.tieneHijoIzquierdo())
					cola.encolar(arbol.getHijoIzquierdo()); 
				if(arbol.tieneHijoDerecho())
					cola.encolar(arbol.getHijoDerecho());                      
			else 
				if(!cola.vacia());
					cola.encolar(null);
					nivel++;
		}	
		}
		return total;
	}	
}

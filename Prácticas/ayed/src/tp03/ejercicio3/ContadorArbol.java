/*Ejercicio 3
* Defina una clase Java denominada ContadorArbol cuya función principal es proveer métodos de validación 
* sobre árboles binarios de enteros. Para ello la clase tiene como variable de instancia un ArbolBinario<Integer>. 
* Implemente en dicha clase un método denominado numerosPares() que devuelve en una estructura adecuada
* (sin ningún criterio de orden) todos los elementos pares del árbol (divisibles por 2). Defina la clase 
* dentro del paquete tp03.ejercicio3
*  a) Implemente el método realizando un recorrido InOrden.
*  b) Implemente el método realizando un recorrido PostOrden.*/

package tp03.Ejercicio3;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp03.Practica_3.src.main.java.ar.edu.inlp.info.oo1.Practica_3.ArbolBinario;

public class ContadorArbol {

	private ArbolBinario<Integer> arbol;
	
	private ContadorArbol(ArbolBinario<Integer> unArbol) {
		this.arbol = unArbol;
	}
	
	public ListaGenerica<Integer> numerosParesInOrden(ArbolBinario<Integer> ab){
		ListaGenerica<Integer> lista = new ListaEnlazadaGenerica<>();
				
		if(!ab.esVacio())
			if (ab.tieneHijoIzquierdo())
				this.numerosParesInOrden(ab.getHijoIzquierdo());	
		
		if (ab.getDato() + 2 == 0)
				lista.agregarFinal(ab.getDato());	
		
			if (ab.tieneHijoDerecho())
				this.numerosParesInOrden(ab.getHijoDerecho());;
		return lista;	
	}	
	
	
	public ListaGenerica<Integer> numerosParesPosOrden(ArbolBinario<Integer> ab){
		ListaGenerica<Integer> lista = new ListaEnlazadaGenerica<>();
		
		if(!ab.esVacio())
			if (ab.tieneHijoIzquierdo())				
				this.numerosParesPosOrden(ab.getHijoIzquierdo());					
			if (ab.tieneHijoDerecho())						
				this.numerosParesPosOrden(ab.getHijoDerecho());			
			if(ab.getDato() % 2 ==0) 
				lista.agregarFinal(ab.getDato());			
		return lista;	
		}	
}
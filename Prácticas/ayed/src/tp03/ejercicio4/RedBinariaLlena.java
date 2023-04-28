/*Una red binaria es una red que posee una topología de árbol binario lleno. Por ejemplo:
 * Los nodos que conforman una red binaria llena tiene la particularidad de que todos 
 * ellos conocen cuál es su retardo de reenvío. El retardo de reenvío se define como el 
 * período comprendido entre que un nodo recibe un mensaje y lo reenvía a sus dos hijos.
	Su tarea es calcular el mayor retardo posible, en el camino que realiza un mensaje desde 
		la raíz hasta llegar a las hojas en una red binaria llena.
	Nota: asuma que cada nodo tiene el dato de retardo de reenvío expresado en cantidad de segundos.
a) Indique qué estrategia (recorrido en profundidad o por niveles) utilizará para resolver el problema.
b) Cree una clase Java llamada RedBinariaLlena (dentro del paquete tp03.ejercicio4) 
donde implementará lo solicitado en el método retardoReenvio():int*/
package tp03.ejercicio4;

import tp03.Practica_3.src.main.java.ar.edu.inlp.info.oo1.Practica_3.ArbolBinario;

public class RedBinariaLlena {
	
	private ArbolBinario<Integer> arbol;

	
	public RedBinariaLlena(ArbolBinario<Integer> unaRed) {
		this.arbol = unaRed;
	}
	
	public int retardoReenvio() {
		
		return this.retardoReenvio(arbol);	
	}
	private int retardoReenvio(ArbolBinario<Integer> arbol) {
		
		if(this.arbol.esVacio())
			return -1;
		int cantidad = -1;
		if(this.arbol.esHoja())
			return this.arbol.getDato();
		cantidad =  arbol.getDato() + Math.max(retardoReenvio(arbol.getHijoDerecho()),retardoReenvio(arbol.getHijoIzquierdo()));
		return cantidad; 
	}
}	
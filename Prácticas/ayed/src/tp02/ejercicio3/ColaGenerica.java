package tp02.ejercicio3;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;

public class ColaGenerica<T> {
	
	private ListaGenerica<T> cola;

	/* Constructor*/
	public ColaGenerica() {
		new ListaEnlazadaGenerica<>();
	}
			
	/* Agrega el elemento a la cola */
	public void encolar (T elem ) {
		cola.agregarFinal(elem);
	}
	
	/* Elimina y devuelve el primer elemento de la cola */
	public T desencolar() {
		T elem; 
		elem = cola.elemento(1);
		cola.eliminarEn(1);
		return elem;
	}
	
	/* devuelve el elemento en el tope de la cola  sin eliminarlo*/
	public T tope() {
		T elem; 
		elem = cola.elemento(1);
		return elem;
		
	}
	/*Retorna true si la cola esta vacia, false en caso contrario */
	public boolean vacia() {
		return cola.esVacia();
	}

}

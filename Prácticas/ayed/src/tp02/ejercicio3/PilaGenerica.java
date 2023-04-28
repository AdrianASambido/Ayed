package tp02.ejercicio3;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;

public class PilaGenerica<T> {
	
	private ListaGenerica<T> pila; 

	/* constructor*/
	public PilaGenerica() {
		new ListaEnlazadaGenerica<>();
	}
	
	/* Agrega el elemento en la pila */
	public void apilar (T elem ) {
		pila.agregarInicio(elem);
	}
	
	/* Elimina y devuelve el elemento en el tope de la pila*/
	public T desapilar() {
		T elem; 
		elem = pila.elemento(1);
		pila.eliminarEn(1);
		return elem;
	}
	
	/* devuelve el elemento del tope de la pila sin eliminarlo*/
	public T tope() {
		return pila.elemento(1);
	}
	
	/*Retorna true si la pila esta vacia, false en caso contrario */
	public boolean esVacia() {
		return pila.esVacia();
	}

}

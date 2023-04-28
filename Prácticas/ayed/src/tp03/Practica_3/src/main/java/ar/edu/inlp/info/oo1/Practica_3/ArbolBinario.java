package tp03.Practica_3.src.main.java.ar.edu.inlp.info.oo1.Practica_3;

import tp02.ejercicio3.ColaGenerica;

public class ArbolBinario<T> {
	private T dato;
	private ArbolBinario<T> hijoIzquierdo;   
	private ArbolBinario<T> hijoDerecho; 

	
	public ArbolBinario() {
		super();
	}

	public ArbolBinario(T dato) {
		this.dato = dato;
	}

	/*
	 * getters y setters
	 * 
	 */
	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}
	
	/**
	 * Preguntar antes de invocar si tiene HijoIzquierdo()
	 * @return
	 */
	public ArbolBinario<T> getHijoIzquierdo() {
		return this.hijoIzquierdo;
	}

	public ArbolBinario<T> getHijoDerecho() {
		return this.hijoDerecho;

	}

	public void agregarHijoIzquierdo(ArbolBinario<T> hijo) {
		this.hijoIzquierdo = hijo;
	}

	public void agregarHijoDerecho(ArbolBinario<T> hijo) {
		this.hijoDerecho = hijo;
	}

	public void eliminarHijoIzquierdo() {
		this.hijoIzquierdo = null;
	}

	public void eliminarHijoDerecho() {
		this.hijoDerecho = null;
	}

	public boolean esVacio() {
		return this.getDato() == null && !this.tieneHijoIzquierdo() && !this.tieneHijoDerecho();
	}

	public boolean esHoja() {
		return (!this.tieneHijoIzquierdo() && !this.tieneHijoDerecho());

	}

	@Override
	public String toString() {
		return this.getDato().toString();
	}

	 
	public boolean tieneHijoIzquierdo() {
		return this.hijoIzquierdo!=null;
	}

	 
	public boolean tieneHijoDerecho() {
		return this.hijoDerecho!=null;
	}

	
	/* cuenta la cantidad de hojas de un arbol */
	public int contarHojas() {
		int cantidad = 0;
		
		if(this.esHoja())
			return 1;
		if (this.tieneHijoIzquierdo());
			cantidad += this.getHijoIzquierdo().contarHojas();
		if (this.tieneHijoDerecho())
			cantidad += this.getHijoDerecho().contarHojas();
		
		return cantidad;
	}
	/* devuelve el espejo de un arbol binario */
	public ArbolBinario<T> espejo() {
    	/* creamos un arbol y le pasamos nuestro propio dato*/
		ArbolBinario<T> espejito = new ArbolBinario<>(this.getDato());
		/* si tiene hijo derecho */
		if (this.tieneHijoDerecho())
			espejito.agregarHijoIzquierdo(hijoDerecho.espejo());
		if (this.tieneHijoIzquierdo())
			espejito.agregarHijoDerecho(hijoIzquierdo.espejo());

		return espejito;
	}
    
    
	public void entreNiveles(int n, int m) {
		/* esta instruccion crea una cadena de caracteres que se puede modificar 
		 * a diferencia de los String los cuales son inmutables */
		StringBuilder sb = new StringBuilder();
		ColaGenerica<ArbolBinario<T>> cola = new ColaGenerica<>();
		cola.encolar(this);
		cola.encolar(null);

		int nivel = 0;
		while (!cola.vacia()) {
			ArbolBinario<T> actual;
			while (!cola.vacia() && (actual = cola.desencolar()) != null) {
				if (nivel >= n)
					sb.append(String.format("%s, ", actual.getDato()));
				if (actual.tieneHijoIzquierdo())
					cola.encolar(actual.getHijoIzquierdo());
				if (actual.tieneHijoDerecho())
					cola.encolar(actual.getHijoDerecho());
			}
			if (sb.length() >= 2)
				sb.delete(sb.length() - 2, sb.length());

			if (!cola.vacia()) {
				if (++nivel > m)
					break;
				if (!sb.isEmpty())
					sb.append('\n');
				cola.encolar(null);
			}
		}

		System.out.println(sb.toString());
	}
	
	
}

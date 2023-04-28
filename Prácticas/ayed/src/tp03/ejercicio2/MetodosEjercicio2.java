package tp03.ejercicio2;

import tp03.Practica_3.src.main.java.ar.edu.inlp.info.oo1.Practica_3.ArbolBinario;

public class MetodosEjercicio2<T> {
	
	private ArbolBinario<T> arbol;
	
	
	public MetodosEjercicio2(){
	}
	
	/* cuenta la cantidad de hojas de un arbol */
	public int contarHojas() {
		int cantidad = 0;
		
		if(this.arbol.esHoja())
			return 1;
		if (this.arbol.tieneHijoIzquierdo());
			cantidad += this.arbol.getHijoIzquierdo().contarHojas();
		if (this.arbol.tieneHijoDerecho())
			cantidad += this.arbol.getHijoDerecho().contarHojas();
		
		return cantidad;
	}
	/* devuelve el espejo de un arbol binario */
	public ArbolBinario<T> espejo() {
    	/* creamos un arbol y le pasamos nuestro propio dato*/
		ArbolBinario<T> espejito = new ArbolBinario<>(this.arbol.getDato());
		/* si tiene hijo derecho */
		if (this.arbol.tieneHijoDerecho())
			espejito.agregarHijoIzquierdo(this.arbol.getHijoIzquierdo().espejo());
		if (this.arbol.tieneHijoIzquierdo())
			espejito.agregarHijoDerecho(this.arbol.getHijoDerecho().espejo());

		return espejito;
	}

}

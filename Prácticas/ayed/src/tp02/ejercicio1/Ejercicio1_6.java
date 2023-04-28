package tp02.ejercicio1;

public class Ejercicio1_6 {
	
	
	public Ejercicio1_6() {
		
	}
	
	public ListaDeEnteros calcularSucesion(int n) {
		ListaDeEnteros lista = new ListaDeEnterosEnlazada();
		
		lista.agregarFinal(n);
		if(n != 1) {
			if(n % 2 == 0) {
				n = n/2;
				calcularSucesion(n);
			}
			else
			{
				n = (n*3)+1;
				calcularSucesion(n);
			}
		}
		return lista;
	}
}
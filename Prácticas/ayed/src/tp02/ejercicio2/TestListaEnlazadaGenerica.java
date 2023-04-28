package tp02.ejercicio2;

/*2.3. Escriba una clase llamada TestListaEnlazadaGenerica que cree 4 objetos 

	   de tipo Estudiante (implementado en el TP01B) y los agregue a un objeto 
	   de tipo ListaEnlazadaGenerica usando los diferentes métodos de la lista 
	   y luego, imprima los elementos de dicha lista usando el método tusDatos().*/

import tp02.ejercicio1.Estudiante;

public class TestListaEnlazadaGenerica {	
	
	public static void main(String[] args) {
	
	ListaGenerica<Estudiante> lista = new ListaEnlazadaGenerica<>();
	
	Estudiante estudiante  = new Estudiante("Pedro"   ,"Picapiedra", "Aj2", "volcan@explocion", "45 y 22");
	Estudiante estudiante2 = new Estudiante("Angelito", "volador"  , "Aj3", "nube@dealgodon"  , "piso 99" );
	Estudiante estudiante3 = new Estudiante("timoteo" , "moron"    , "Bj1", "moron@moroso"    , "camino1 y 32");
	Estudiante estudiante4 = new Estudiante("loan"    , "Perez"    , "Bj2", "sultanato@arabe" , "piramide 42");
	
	lista.agregarInicio(estudiante);
	lista.agregarInicio(estudiante2);
	lista.agregarInicio(estudiante3);
	lista.agregarInicio(estudiante4);
	lista.comenzar();
	while(!lista.esVacia()) {
		System.out.println(lista.proximo().tusDatos());
	
	}
	}
}

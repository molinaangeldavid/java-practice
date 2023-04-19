package main;

import entidad.Arreglo;

public class mainArreglo {

	public static void main(String[] args) {

		float arreglo1[] = new float[50];
		float arreglo2[] = new float[20];
		
		Arreglo a1 = new Arreglo(arreglo1,arreglo2);
		a1.inicializarA();
		a1.inicializarB();
		a1.ordenar(arreglo2);
		a1.ordenar(arreglo1);
		a1.mostrar(arreglo1);
		a1.mostrar(arreglo2);
		
		
		
	}

}

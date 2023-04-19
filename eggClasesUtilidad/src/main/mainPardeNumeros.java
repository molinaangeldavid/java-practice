package main;

import java.util.Scanner;
import entidad.PardeNumeros;

public class mainPardeNumeros {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese el primer numero: ");
		float num1 = scan.nextFloat();
		System.out.println("Ingrese el segundo numero: ");
		float num2 = scan.nextFloat();
		PardeNumeros p = new PardeNumeros(num1,num2);
		p.mostrarValores();
		p.calcularPotencia();
		p.calcularRaiz();
		
	}

}

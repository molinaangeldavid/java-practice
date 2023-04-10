package Ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
//		En centro de salud se registran mensualmente el total de las consultas atendidas en cada uno de
//		los 10 consultorios con los que cuenta. Los consultorios están numerados en forma consecutiva del
//		1 al 10. Donde los primeros 5 (número de consultorio del 1 al 5) atienden médicos clínicos y los
//		últimos 5 (del 6 al 10) atienden consultas traumatológicas.
//		Se solicita desarrollar un programa donde el usuario pueda ingresar al finalizar el mes, el total de
//		pacientes atendidos en cada consultorio y almacene los datos en un vector de 10 posiciones.
//		Una vez finalizada la carga mostrar al usuario un menú de opciones para que pueda consultar:
//			1) Total, de consultas realizadas en consultorios de traumatología
//			2) Mostrar todos los números de consultorios cuya cantidad de consultas sea superior 15.
//		
//		Para ello, utilice y desarrolle las siguientes funciones:
//		Funciones:
//			Prototipo: int total_consultas_traumatologia (int[] consultorios);
//			Descripción: Función que recibe parámetros de entrada y retorna un entero con total de 
// 			consultas realizadas en consultorios de traumatología.
//		
//			Prototipo: void consultorios_cantidad_mayor_quince(int[] consultorios);
//			Descripción: Función que recibe el vector por parámetro y no retorna datos, muestra
//			todos los números de consultorios, que hayan atendido más consultas que 15.
		
		Scanner scan = new Scanner(System.in);
		int consultorios[] = cargarDatos(scan);
		boolean estado = true;
		int opcion;
		while (estado) {
			System.out.println("1. Consultas realizadas en consultorios de traumatología");
			System.out.println("2. Mostrar todos los números de consultorios cuya cantidad de consultas sea superior 15");
			System.out.println("3. Salir");
			System.out.print("Ingrese opcion: ");
			opcion = scan.nextInt();
			switch(opcion) {
				case 1:
					System.out.println("Consultas traumatologia: " + total_consultas_traumatologia(consultorios));
					break;
				case 2:
					consultorios_cantidad_mayor_quince(consultorios);
					break;
				default:
					estado = false;
					break;
			}
		}
		
			
	}
	static void consultorios_cantidad_mayor_quince(int[] consultorios) {
		for (int i = 0 ; i < consultorios.length ; i++) {
			if (consultorios[i] > 15) {
				System.out.println("Consultorios con mas de 15 consultas: " + (i+1));
			}
		}
	}
	
	static int total_consultas_traumatologia(int[] consultorios) {
		int suma = 0;
		for(int i = 0 ; i < consultorios.length ; i++) {
			if (i > 4) {
				suma += consultorios[i];
			}
		}
		return suma;
	}
	
	
	static int[] cargarDatos(Scanner scan) {
		int ingresoConsultorio[] = new int[10];
		System.out.println("Ingrese los pacientes atendidos x consultorio");

		for (int i = 0 ;i < ingresoConsultorio.length ; i++) {
			
			System.out.print("Consultorio " + (i + 1) + ": ");
			ingresoConsultorio[i] = scan.nextInt();
			System.out.println("");
			
		}
			
		return ingresoConsultorio;
	}
	
	
	

}

package estacionamientos;

import java.util.*;

public class Principal {

	public static void main(String[] args) {

		Estacionamiento estacionamiento = new Estacionamiento();
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese nombre del estacionamiento");
		estacionamiento.setNombre(scan.nextLine());
		System.out.println("Ingrese el precio de la hora");
		estacionamiento.setPrecio_hora(scan.nextInt());
		System.out.println("Ingrese la cantidad de lugares");
		int lugares_totales = scan.nextInt();
		for (int i = 0 ; i < lugares_totales; i++) {
			estacionamiento.getLugares().add(new Lugar());
			estacionamiento.getLugares().get(i).setNumero(i+1);
		}
		
		int opcion = 0;
		while (opcion != 4) {
			System.out.println("1. Estacionar vehiculo");
			System.out.println("2. Liberar lugar");
			System.out.println("3. Mostrar Informacion");
			System.out.println("4. Salir");
			
			
			
			System.out.println("Ingrese opcion");
			opcion = validar_opcion();
			
			
			switch(opcion) {
			case 1:
				System.out.println("Ingrese lugar para estacionar");
				int lugar_estacionar = scan.nextInt();
				if (estacionamiento.estacionar(lugar_estacionar)) {
					System.out.println("Lugar estacionado con exito...");
				}else {
					System.out.println("El lugar no existe o ya se encontraba ocupado");
				}
				break;
			case 2:
				System.out.println("Ingrese lugar para liberar");
				int lugar_liberar = scan.nextInt();
				if (estacionamiento.liberar(lugar_liberar)) {
					System.out.println("Lugar liberado con exito");
				}else {
					System.out.println("El lugar no existe o ya se encontraba liberado");
				}
				break;
			default:
				estacionamiento.mostrar_info();
				break;
			}
		}
		
		
	}

	static int validar_opcion() {
		Scanner scan = new Scanner(System.in);
		int opcion = scan.nextInt();
		while (opcion < 1 || opcion > 4) {
			System.out.println("Ingreso invalido!!");
			opcion = scan.nextInt();
		}
		return opcion;
	}
}

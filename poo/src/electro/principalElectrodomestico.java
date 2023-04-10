package electro;

import classes.Electrodomestico;
import java.util.Scanner;
public class principalElectrodomestico {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Electrodomestico elec = new Electrodomestico();
		
		System.out.print("Ingrese Nombre del electrodomestico1: ");
		elec.setNombre(scan.nextLine());
		System.out.print("Ingrese nombre del electrodomestico2: ");
		String nombre2 = scan.nextLine();
		System.out.print("Ingrese peso del electrodomestico2: ");
		int peso2 = scan.nextInt();
		System.out.print("Ingrese precio del electrodomestico2: ");
		int precio2 = scan.nextInt();
		Electrodomestico elec2 = new Electrodomestico(precio2,peso2,nombre2);
		
		System.out.print("Ingrese nombre del electrodomestico3: ");
		String nombre3 = scan.nextLine();
		System.out.print("Ingrese peso del electrodomestico3: ");
		int peso3 = scan.nextInt();
		System.out.print("Ingrese consumo energetico del electrodomestico3: ");
		char consumo3 = scan.next().charAt(0);		
		System.out.print("Ingrese precio base del electrodomestico3: ");
		int precioBase3 = scan.nextInt();
		System.out.print("Ingrese color del electrodomestico3: ");
		String color3 = scan.nextLine();
		
		Electrodomestico elec3 = new Electrodomestico(precioBase3,nombre3,color3,consumo3,peso3);
		
		
		System.out.println("Precio final del electrodomestico" + elec.getNombre() + " es: " + elec.precioFinal());
		System.out.println("Precio final del electrodomestico" + elec2.getNombre() + " es: " + elec2.precioFinal());
		System.out.println("Precio final del electrodomestico" + elec3.getNombre() + " es: " + elec3.precioFinal());
		
	}

}

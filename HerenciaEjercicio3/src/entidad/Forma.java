package entidad;

import java.util.Scanner;
import interfaceEjercicio3.*;

public class Forma implements CalculosFormas{
	
	
	@Override
	public void area(String tipo, double... params ) {
		Scanner scan = new Scanner(System.in).useDelimiter("\n");
		if(tipo.equalsIgnoreCase("circulo")) {
			System.out.println("Area del circulo: " + PI  * Math.pow(params[0], 2));
		}else {
			System.out.println("Area del rectangulo: " +  params[0] * params[1]);
		}
	}

	@Override
	public void perimetro(String tipo, double... params) {
		Scanner scan = new Scanner(System.in).useDelimiter("\n");
		if(tipo.equalsIgnoreCase("circulo")) {
			System.out.println("Perimetro del circulo: " + PI * params[1]);
		}else{
			System.out.println("Perimetro del rectangulo: " + (params[0] * params[1]) * 2);
		}
	}
}

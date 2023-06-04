package mainApp;

import entidad.Forma;
import java.util.Scanner;

public class MainEjercicio3Herencia{
	
	public static void main(String[] args) {
		Forma forma = new Forma();
		Scanner scan = new Scanner(System.in);
		System.out.println("Datos circulo: ");
		System.out.println("Ingrese el diametro: ");
		double diametro = scan.nextDouble();
		System.out.println("Ingrese el radio: ");
		double radio = scan.nextDouble();
		forma.area("circulo",radio,diametro);
		forma.perimetro("circulo", diametro, radio);
		System.out.println("Ingrese la base: ");
		double base = scan.nextDouble();
		System.out.println("Ingrese la altura");
		double altura = scan.nextDouble();
		forma.area("rectangulo", base, altura);
		forma.perimetro("rectangulo", base,altura);
		
	}

	
	
}

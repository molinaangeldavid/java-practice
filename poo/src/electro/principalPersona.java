package electro;


import classes.Persona;
import java.util.Scanner;

public class principalPersona {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Ingrese nombre de la persona: ");
		String nombre = scan.next();
		System.out.print("Ingrese edad: ");
		int edad = scan.nextInt();
		System.out.print("Ingrese el sexo: ");
		char sexo = scan.next().charAt(0);
		System.out.print("Ingrese el peso: ");
		double peso = scan.nextDouble();
		System.out.print("Ingrese la altura: ");
		float altura = scan.nextFloat();
		System.out.println("Ingrese el dni: ");
		int dni = scan.nextInt();
		
		Persona person1 = new Persona(nombre,edad,dni,sexo,peso,altura);
		Persona person2 = new Persona();
		person2.setNombre("Guillermo");
		person2.setEdad(46);
		person2.setDni(88392834);
		person2.setPeso(97.3);
		person2.setAltura(196);
		
		Persona person3 = new Persona("Pedro",29,'F');
		person3.setDni(92783934);
		person3.setPeso(50.4);
		person3.setAltura(1.54);
		
		int imc1 = person1.calcularIMC();
		int imc2 = person1.calcularIMC();
		int imc3 = person1.calcularIMC();
		System.out.println(person1.getNombre() + " tiene el IMC: " + mensaje(imc1));
		System.out.println(person2.getNombre() + " tiene el IMC: " + mensaje(imc2));
		System.out.println(person3.getNombre() + " tiene el IMC: " + mensaje(imc3));
		System.out.println("");
		System.out.println(person1.getNombre() + ": " + mayorEdad(person1));
		System.out.println(person2.getNombre() + ": " + mayorEdad(person2));
		System.out.println(person3.getNombre() + ": " + mayorEdad(person3));
		
	}
	
	static String mensaje(int imc) {
		String resultado = "";
		if (imc == 1) {
			resultado = "Sobrepeso";
		}else {
			if (imc == 0) {
				resultado = "Normal";
			}else {
				if (imc == -1) {
					resultado = "Anorexico";
				}
			}
		}
		return resultado;
	}
	
	static String mayorEdad(Persona p) {
		if(p.esMayorDeEdad()) {
			return "Es mayor de edad";
		}else {
			return "No es mayor de edad";
		}
	}
	
	
}

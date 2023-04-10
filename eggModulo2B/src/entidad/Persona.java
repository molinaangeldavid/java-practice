package entidad;

import java.util.Scanner;

public class Persona {

	private String nombre;
	private int edad;
	private char sexo;
	private int peso;
	private double altura;
	
	public Persona() {
		
	}
	
	public Persona(String nom,int ed,char sexo,int peso, double alt) {
		this.nombre = nom;
		this.edad = ed;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = alt;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo.charAt(0);
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public boolean esMayorDeEdad() {
		if(this.edad>=18) {
			return true;
		}else{
			return false;
		}
	}
	
	private char validarInputSexo() {
		Scanner scan = new Scanner(System.in).useDelimiter("\n");
		boolean noPasa = false;
		do {
			char sexo;
			sexo = scan.next().charAt(0);
			if (sexo != 'm' && sexo != 'h' && sexo != 'o') {
				noPasa = true;
			}else{
				noPasa = false;
			}
		} while (noPasa);
		return sexo;
	}
	
	public void crearPersona() {
		Scanner scan = new Scanner(System.in).useDelimiter("\n");
		System.out.println("Ingrese el nombre de la persona: ");
		this.nombre = scan.next();
		System.out.println("Ingrese la edad: ");
		this.edad = scan.nextInt();
		System.out.println("Ingrese el sexo de la persona: <M,H,O>: ");
		this.sexo = this.validarInputSexo();
		System.out.println("Ingrese el peso: ");
		this.peso = scan.nextInt();
		System.out.println("Ingrese la altura: ");
		this.altura = scan.nextDouble();
	}
	
	public int calcularIMC() {
		float pesoIdeal = (float) (this.peso / Math.pow(this.altura, 2));
		System.out.println(pesoIdeal);
		if (pesoIdeal < 20) {
			return -1;
		}else {
			if (pesoIdeal <= 25) {
				return 0;
			}else {
				return 1;
			}
		}
	}
	
}

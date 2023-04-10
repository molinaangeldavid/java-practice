package classes;

public class Persona {

	private String nombre;
	private int edad;
	private int dni;
	private char sexo;
	private double peso;
	private double altura;
	
	public Persona() {
	}
	
	public Persona(String nombre,int edad,char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = comprobarSexo(sexo);
	}
	
	public Persona(String n,int e,int d,char s, double p, double a) {
		this.nombre = n;
		this.edad = e;
		this.dni = d;
		this.sexo = comprobarSexo(s);
		this.peso = p;
		this.altura = a;
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

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int calcularIMC(){
		double resultado = (this.peso/(this.altura * this.altura));
		if (resultado < 20) {
			return -1;
		}else {
			if (resultado < 26) {
				return 0;
			}else {
				return 1;
			}
		}
	}
	public boolean esMayorDeEdad() {
		if (this.edad > 17) {
			return true;
		}else {
			return false;
		}
	}
	public char comprobarSexo(char sexo) {
		if(sexo == 'H' || sexo == 'M') {
			return sexo;
		}else {
			return 'H';
		}
	}
	public String toString() {
		StringBuilder info = new StringBuilder();
		info.append("Nombre: " + this.nombre + "\n");
		info.append("Edad: " + this.edad + "\n");
		info.append("DNI: " + this.dni + "\n");
		info.append("Sexo: " + this.sexo + "\n");
		info.append("Altura: " + this.altura + "\n");
		info.append("Peso: " + this.peso + "\n");
		return info.toString();
	}

}

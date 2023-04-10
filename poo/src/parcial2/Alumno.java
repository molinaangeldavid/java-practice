package parcial2;

import java.util.*;
public class Alumno extends Persona{

	private int nota1;
	private int nota2;
	
	public Alumno() {
		
	}
	
	public Alumno(String n, String a, int leg) {
		super(n,a,leg);
	}
	
	public void rendirExamen() {
		Random random = new Random();
		this.nota1 = random.nextInt(10);
		this.nota2 = random.nextInt(10);
	}

	public int getNota1() {
		return nota1;
	}

	public void setNota1(int nota1) {
		this.nota1 = nota1;
	}

	public int getNota2() {
		return nota2;
	}

	public void setNota2(int nota2) {
		this.nota2 = nota2;
	}
	

}

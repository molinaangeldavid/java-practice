package entidad;

import java.util.Scanner;

public class Carta {

	private int numero;
	private String palo;
	
	public Carta() {
		
	}
	
	public Carta(int numero, String palo) {
		this.numero = numero;
		this.palo = palo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if(numero == 8 || numero == 9) {
			Scanner scan = new Scanner(System.in);
			while(numero == 8 || numero ==9) {
				System.out.println("El 8 y el 9 no debe existir. Ingrese otro numero: ");
				numero = scan.nextInt();
			}
		}
		this.numero = numero;
	}

	public String getPalo() {
		return palo;
	}

	public void setPalo(String palo) {
		this.palo = palo;
	}

	@Override
	public String toString() {
		return "Carta [numero=" + numero + ", palo=" + palo + "]";
	}
	
	
	
	
	
}

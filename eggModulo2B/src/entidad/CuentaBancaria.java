package entidad;

import java.util.Scanner;

public class CuentaBancaria {
	private int numeroCuenta;
	private long dniCliente;
	private float saldoActual;
	
	public CuentaBancaria() {
		
	}
	
	public CuentaBancaria(int nCuenta, long dni, float saldo) {
		this.numeroCuenta = nCuenta;
		this.dniCliente = dni;
		this.saldoActual = saldo;
	}

	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public long getDniCliente() {
		return dniCliente;
	}

	public void setDniCliente(long dniCliente) {
		this.dniCliente = dniCliente;
	}

	public float getSaldoActual() {
		return saldoActual;
	}

	public void setSaldoActual(int saldoActual) {
		this.saldoActual = saldoActual;
	}
	
	public void crearCuenta() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese numero de cuenta: ");
		this.numeroCuenta = scan.nextInt();
		System.out.println("Ingrese el dni del cliente: ");
		this.dniCliente = scan.nextLong();
		System.out.println("Ingrese el saldo: ");
		this.saldoActual = scan.nextFloat();
	}
	
	public void ingresar(float cantidad) {
		this.saldoActual += cantidad;
	}
	
	public void retirar(float cantidad) {
		if (cantidad >= this.saldoActual) {
			this.saldoActual -= this.saldoActual;
		}else {
			this.saldoActual -= cantidad;
		}
	}
	
	
	public void extraccionRapida() {
		float el20porCiento = this.saldoActual * 20 / 100;
		this.saldoActual -= el20porCiento;
	}
	
	public void consultarSaldo() {
		System.out.println("Saldo: " + this.saldoActual);
	}
	
	public String toString() {
		String print = "Numero de cuenta: " + this.numeroCuenta + "\n";
		print += "DNI cliente: " + this.dniCliente;
		return print;
	}
	
}

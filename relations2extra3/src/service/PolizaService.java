package service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import entidad.Poliza;
import entidad.Cliente;
import entidad.Vehiculo;
import enumeradores.TipoCobertura;
import enumeradores.TipoVehiculo;

public class PolizaService {

	public Poliza crearPoliza(ArrayList<Poliza> polizas) {
		Cliente c = this.crearCliente(polizas);
		Vehiculo v = this.crearVehiculo(polizas);
		Scanner scan = new Scanner(System.in).useDelimiter("\n");
		int numPoliza;
		if(polizas.size() == 0) {
			numPoliza = 1000;
		}
		numPoliza = polizas.size() + 1000;
		String fechaInicio = this.fecha("Inicio");
		String fechaFin = this.fecha("Fin");
		System.out.println("Ingrese la cantidad de cuotas: ");
		int cantidadCuotas = scan.nextInt();
		System.out.println("Ingrese el monto total: ");
		double montoTotal = scan.nextDouble();
		System.out.println("Incluye granizo: <si/no>");
		String granizo = scan.next();
		Boolean granizoboolean;
		if(granizo.equalsIgnoreCase("si")) {
			granizoboolean = true;
		}else {
			granizoboolean = false;
		}
		double montoTotalGranizo;
		if(granizo.equalsIgnoreCase(granizo)) {
			System.out.println("Ingrese el monto total de granizo: ");
			montoTotalGranizo = scan.nextDouble();
		}else {
			montoTotalGranizo = 0;
		}
		int contador = 1;
		HashMap<Integer, TipoCobertura> tipocobertura = new HashMap<Integer,TipoCobertura>();
		for(TipoCobertura tipo: TipoCobertura.values()) {
			tipocobertura.put(contador, tipo);
		}
		System.out.println("Ingrese el tipo de cobertura: ");
		int opt = scan.nextInt();
		
		return new Poliza(numPoliza,fechaInicio,fechaFin,cantidadCuotas,montoTotal,granizoboolean,montoTotalGranizo,tipocobertura.get(opt),c,v);
	}
	private String fecha(String f) {
		Scanner scan = new Scanner(System.in).useDelimiter("\n");
		System.out.println("Fecha de "+ f +": ");
		System.out.println("Ingrese el dia: ");
		int dia = scan.nextInt();
		System.out.println("Ingrese la fecha");
		int mes = scan.nextInt();
		System.out.println("Ingrese el anio: ");
		int anio = scan.nextInt();
		return String.format("%d/%d/%d", dia,mes,anio);
	}
	
	private Cliente crearCliente(ArrayList<Poliza> polizas) {
		Scanner scan = new Scanner(System.in).useDelimiter("\n");
		System.out.println("Ingrese el nombre del cliente: ");
		String nombre = scan.next();
		System.out.println("Ingrese el apellido del cliente: ");
		String apellido = scan.next();
		System.out.println("Ingrese el documento del cliente: ");
		String documento = scan.next();
		System.out.println("Ingrese el mail del cliente: ");
		String mail = scan.next();
		System.out.println("Ingrese el domicilio del cliente: ");
		String domicilio = scan.next();
		System.out.println("Ingrese el telefono del cliente: ");
		String telefono = scan.next();
		return new Cliente(nombre,apellido,documento,mail,domicilio,telefono);
	}
	
	private Vehiculo crearVehiculo(ArrayList<Poliza> polizas) {
		Scanner scan = new Scanner(System.in).useDelimiter("\n");
		System.out.println("Ingrese la marca del vehiculo: ");
		String marca = scan.next();
		System.out.println("Ingrese el modelo del vehiculo: ");
		String modelo = scan.next();
		System.out.println("Ingrese el anio del vehiculo: ");
		String anio = scan.next();
		String numeroMotor;
		boolean iguales = false;
		do {
			System.out.println("Ingrese el numero de motor del chasis");
			numeroMotor = scan.next();
			for(Poliza poliza: polizas) {
				if(poliza.getVehiculo().getChasis().equalsIgnoreCase(numeroMotor)) {
					iguales = true;
					break;
				}
			}
		} while (!iguales);
		if(iguales == false) {
			
		}
		System.out.println("Ingrese el color del vehiculo: ");
		String color = scan.next();
		System.out.println("Ingrese el tipo de vehiculo");
		int contador = 1;
		HashMap<Integer, TipoVehiculo> tipoVehiculo = new HashMap<Integer,TipoVehiculo>();
		for(TipoVehiculo tipo: TipoVehiculo.values()) {
			tipoVehiculo.put(contador, tipo);
		}
		System.out.println("Ingrese el tipo de cobertura: ");
		int opt = scan.nextInt();
//		return new Vehiculo(marca,modelo,anio,numeroMotor,color,tipoVehiculo.get(opt));
		return new Vehiculo();
	}
	
	
}

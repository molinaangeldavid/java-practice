package service;

import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.LocalDate;
import entidad.Alquiler;
import entidad.Barco;
import entidad.BarcoMotor;
import entidad.Velero;
import entidad.Yate;
import entidad.Puerto;

public class ServicePuerto {
	
	public Puerto crearPuerto() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese el nombre del puerto: ");
		String nombre = scan.next();
		return new Puerto(nombre);
	}

	public void crearAlquiler(Puerto p) {
		Scanner scan = new Scanner(System.in).useDelimiter("\n");
		System.out.println("Ingrese nombre del cliente: ");
		String nombre = scan.next();
		System.out.println("Ingrese el documento del cliente: ");
		String documento = scan.next();
		LocalDate fechaAlquiler = date("alquiler");
		LocalDate fechaDevolucion = date("devolucion");
		System.out.println("Ingrese la posicion de amarrre");
		String[] posicion = {"proa","babor","estribor","popa"}; 
		for(int i = 0 ; i < 4 ; i++) {
			System.out.println((i+1) + ": " + posicion[i]);
		}
		String posicionAmarre = null;
		int opcamarre = scan.nextInt();
		switch(opcamarre) {
			case 1: 
				posicionAmarre = posicion[0];
				break;
			case 2: 
				posicionAmarre = posicion[1];
				break;
			case 3:
				posicionAmarre = posicion[2];
				break;
			case 4: 
				posicionAmarre = posicion[3];
				break;
		}
		
		System.out.println("Ingrese tipo de barco");
		String[] tipobarco = {"velero","barco motor","yate"}; 
		for(int i = 0 ; i < 3 ; i++) {
			System.out.println((i+1) + ": " + tipobarco[i]);
		}
		int opcbarco = scan.nextInt();
		String matricula;
		Double eslora;
		String anioFabricacion;
		double potenciacv;
		int cantCamarotes;
		int cantMastiles;
		System.out.println("Ingrese la matricula del barco: ");
		matricula = scan.next();
		System.out.println("Ingrese la altura de la eslora en metros: ");
		eslora = scan.nextDouble();
		System.out.println("Ingrese el anio de fabricacion: ");
		anioFabricacion = scan.next();
		Barco barco = null;
		switch(opcbarco) {
			case 1: 
				System.out.println("Ingrese la cantidad de mastiles que tiene el velero: ");
				cantMastiles = scan.nextInt();
				barco = new Velero(matricula,eslora,anioFabricacion,cantMastiles);
				break;
			case 2:
				System.out.println("Ingrese la potencia en caballos a vapor: ");
				potenciacv = scan.nextDouble();
				barco = new BarcoMotor(matricula,eslora,anioFabricacion,potenciacv);
				break;
			case 3:
				System.out.println("Ingrese la potencia en caballos a vapor: ");
				potenciacv = scan.nextDouble();
				System.out.println("Ingrese la cantidad de camarotes: ");
				cantCamarotes = scan.nextInt();
				barco = new Yate(matricula,eslora,anioFabricacion,potenciacv,cantCamarotes);
				break;
		}
		p.getBarcos().add(barco);
		p.getAlquileres().add(new Alquiler(nombre,documento,fechaAlquiler,fechaDevolucion,posicionAmarre,barco));
	}
	
	public double precioAlquiler(Alquiler a) {
		double precioFinal = 0;
		long days = ChronoUnit.DAYS.between(a.getFechaAlquiler(), a.getFechaDevolucion());
		precioFinal += (a.getBarco().getEslora() * 10) * days;
		if(a.getBarco() instanceof Velero) {
			Velero v = (Velero) a.getBarco();
			precioFinal += v.getCantidadMastiles();
		}else if(a.getBarco() instanceof BarcoMotor){
			BarcoMotor bm= (BarcoMotor) a.getBarco();
			precioFinal += bm.getPotenciacv();
		}else if(a.getBarco() instanceof Yate) {
			Yate y = (Yate) a.getBarco();
			precioFinal += y.getPotenciacv() + y.getCantidadCamarotes();
		}
		
		return precioFinal;
	}
	
	private LocalDate date(String tipo) {
		Scanner scan = new Scanner(System.in);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Ingrese la fecha de " + tipo + " dd/mm/yyyy");
	    String firstInput = scan.next();
	    LocalDate date = LocalDate.parse(firstInput, formatter);
	    return date;
		
	}
}

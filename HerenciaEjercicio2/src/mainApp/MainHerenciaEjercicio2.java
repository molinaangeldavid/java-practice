package mainApp;

import entidad.*;
import java.util.ArrayList;

public class MainHerenciaEjercicio2 {

	public static void main(String[] args) {
		
		ArrayList<Electrodomestico> electrodomesticos = new ArrayList<Electrodomestico>();
		
		Lavarropa lavarropa = new Lavarropa();
		lavarropa.crearLavarropa();
		lavarropa.precioFinal();
		electrodomesticos.add(lavarropa);
		Televisor televisor = new Televisor();
		televisor.crearTelevision();
		televisor.precioFInal();
		electrodomesticos.add(televisor);
		Televisor televisor2 = new Televisor();
		televisor2.crearTelevision();
		televisor2.precioFInal();
		electrodomesticos.add(televisor2);
		Lavarropa lavadora2 = new Lavarropa();
		lavadora2.crearLavarropa();
		lavadora2.precioFinal();
		electrodomesticos.add(lavadora2);
		
		double total = 0;
		for(int i = 0 ; i < electrodomesticos.size() ; i++) {
			System.out.println(electrodomesticos.get(i).toString());
			total += electrodomesticos.get(i).getPrecio();
		}
		
		System.out.println("El total de electrodomesticos vendidos es de: $" + total);
		
		
		
	}

}

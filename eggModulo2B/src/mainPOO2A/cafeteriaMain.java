package mainPOO2A;

import entidad.Cafetera;

public class cafeteriaMain {

	public static void main(String[] args) {

		Cafetera caf1 = new Cafetera();
		caf1.agregarCafe(10);
		System.out.println(caf1.getCantidadActual());
		caf1.servirTaza(28);
		System.out.println(caf1.getCantidadActual());
		caf1.servirTaza(3.4);
		System.out.println(caf1.getCantidadActual());
	}

}

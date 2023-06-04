package mainApp;

import service.ServicePuerto;
import entidad.Puerto;

public class MainEjercicioExtra1 {

	public static void main(String[] args) {
		
		ServicePuerto sp = new ServicePuerto();
		Puerto p = sp.crearPuerto();
		sp.crearAlquiler(p);
		p.getAlquileres().get(0).getDocumento();
		System.out.println("hola puto");
		System.out.println(sp.precioAlquiler(p.getAlquileres().get(0)));
	}
	
}

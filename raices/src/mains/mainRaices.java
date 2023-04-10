package mains;

import servicios.*;
import entidad.*;

public class mainRaices {

	public static void main(String[] args) {

		RaicesServicios s = new RaicesServicios();
		Raices r = s.crearEcuacion();
		s.calcular(r);
		
		
	}

}

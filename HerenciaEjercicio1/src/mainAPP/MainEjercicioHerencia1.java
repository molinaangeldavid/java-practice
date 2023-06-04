package mainAPP;

import entidad.*;

public class MainEjercicioHerencia1 {

	public static void main(String[] args ) {
		
	Animal perro1 = new Perro("jose", "Asado", 12, "Gran danes");
    perro1.alimentarse();
    Animal gato1 = new Gato("pichichi", "croquetas" ,10,"gato blanco");
    gato1.alimentarse();
    Animal caballo1 = new Caballo("pato", "pasto" ,10,"Caballo criollo");
    gato1.alimentarse();
    
	}

}

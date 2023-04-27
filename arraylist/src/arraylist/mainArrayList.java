package arraylist;

import arraylist.ArrayListEjemplo;

public class mainArrayList {

	public static void main(String[] args) {

		ArrayListEjemplo a1 = new ArrayListEjemplo();
		for(int i = 0; i < 4 ; i++) {
			a1.agregarElementos();			
		}
		a1.leerElementos();
		a1.eliminarElemento();
		a1.leerElementos();
		
	}

}

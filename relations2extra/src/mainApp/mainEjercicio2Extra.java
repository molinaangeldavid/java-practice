package mainApp;

import service.ServiceCine;
import entidad.Cine;
import entidad.Cliente;

import java.util.ArrayList;

public class mainEjercicio2Extra {

	public static void main(String[] args) {

		ServiceCine sc = new ServiceCine();
		Cine c1 = sc.crearCine();
		ArrayList<Cliente> clientes = sc.crearClientes();
		sc.crearEspectadoresAleatoriamente(c1, clientes);
		c1.mostrarAsientos();
		
	}

}

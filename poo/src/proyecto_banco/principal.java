package proyecto_banco;

public class principal {

	public static void main(String[] args) {

//		Persona p = new Persona("David","Molina",29,37760822);
//		System.out.println(p.mostrar_informacion());
		
//		Empleado e = new Empleado("David","Molina",29,37760822,239589,"Picker",2,200000);
//		e.mostrar_informacion();
		
		Cliente c = new Cliente("David","Molina",-29,360822,7483,767,true);
		c.mostrar_infomarcion();
		c.depositar(3000);
		c.mostrar_infomarcion();
		c.retirar(6000);
		c.mostrar_infomarcion();
	}

}

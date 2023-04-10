package examen;

public class Principal {

	public static void main(String[] args) {
		Tienda ti = new Tienda("Pepe");
		Computadora pc1 = new Computadora(4738,300,5);
		ti.Agregar_computadora(pc1);
		ti.Agregar_computadora(pc1);
		ti.Vender_computadora(4738);
		System.out.println(ti.Obtener_facturacion());
		System.out.println(ti.Obtener_ganancia());
		System.out.println(ti.Obtener_unidades_vendidas());
		ti.Mostrar_info();

		pc1.mostrar_info();
	}

}

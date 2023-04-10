package servicios;

import entidad.Raices;
import java.util.*;

public class RaicesServicios {
	
	private double discriminante;
	
	public Raices crearEcuacion() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese coeficiente a: ");
		int a = scan.nextInt();
		System.out.println("Ingrese coeficiente b: ");
		int b = scan.nextInt();
		System.out.println("Ingrese coeficiente c: ");
		int c = scan.nextInt();
		return new Raices(a,b,c);
	}
	
	public double getDiscriminante(Raices r1) {
		this.discriminante = Math.pow(r1.getB(),2)-(4*r1.getA()*r1.getC());
		return discriminante;
	}
	
	public boolean tieneRaices(Raices r1) {
		if (getDiscriminante(r1) > 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean tieneRaiz(Raices r1) {
		if (getDiscriminante(r1) == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public void obtenerRaices(Raices r1) {
		double raiz1,raiz2;
		if(tieneRaices(r1)) {
			raiz1 = (-r1.getB() + Math.sqrt(Math.pow(r1.getB(),2)-(4*r1.getA()*r1.getC()))) / 2 * r1.getA();
            raiz2 = (-r1.getB() - Math.sqrt(Math.pow(r1.getB(),2)-(4*r1.getA()*r1.getC()))) / 2 * r1.getA();
            System.out.println("Raiz 1 = " + raiz1);
            System.out.println("Raiz 2 = " + raiz2);
		}
	}
	
	public void obtenerRaiz(Raices r1) {
		double raiz;
		if(tieneRaiz(r1)) {
			raiz = (-r1.getB() + Math.sqrt(Math.pow(r1.getB(),2)-(4*r1.getA()*r1.getC()))) / 2 * r1.getA();
            System.out.println("Raiz = " + raiz);
		}
	}
	
	public void calcular(Raices r1) {
		if (tieneRaices(r1)) {
			obtenerRaices(r1);
		}else {
			if (tieneRaiz(r1)) {
				obtenerRaiz(r1);
			}else {
				System.out.println("No existe solucion.");
			}
		}
	}
	
}

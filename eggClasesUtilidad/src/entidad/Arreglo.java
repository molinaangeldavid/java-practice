package entidad;

import java.util.Arrays;
import java.util.Random;

public class Arreglo {
	private int len;
	private float arr1[];
	private float arr2[];
	
	public Arreglo() {
		
	}
	public Arreglo(float[] arr1,float[] arr2) {
		this.arr1 = arr1;
		this.arr2 = arr2;
	}
	
	public float[] inicializarA(float[] arr) {
		Random r = new Random();
		for(int i = 0; i < arr.length;i++) {
			arr[i] = r.nextFloat() * 10;
		}
		return arr;
	}
	
	public void mostrar(float[] arr) {
		System.out.println(Arrays.toString(arr));
	}
	
	public float[] ordenar(float[] arr) {
		float arr2[] = new float[arr.length];
		Arrays.sort(arr);
		for(int i = arr.length; i>=0 ; i--) {
			arr2[i] = arr[i];
		}
		return arr2;
	}
	
	public float[] inicializarB() {
		
	}
	
	public static String toString(float[] arr){
		String arr = "";
		for(int i = 0;i < arr.length);)
	}
	
}

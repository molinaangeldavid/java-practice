package entidad;

import java.util.Arrays;
import java.util.Random;

public class Arreglo {
	private float arr1[];
	private float arr2[];
	
	public Arreglo() {
		
	}
	public Arreglo(float[] arr1,float[] arr2) {
		this.arr1 = arr1;
		this.arr2 = arr2;
	}
	
	public void inicializarA() {
		Random r = new Random();
		for(int i = 0; i < this.arr1.length;i++) {
			this.arr1[i] = r.nextFloat() * 100;
		}
	}
	
	public void mostrar(float[] arr) {
		System.out.println(Arrays.toString(arr));
	}
	
	public float[] ordenar(float[] arr) {
		float arr2[] = new float[arr.length];
		Arrays.sort(arr);
		for(int i = arr.length - 1; i>=0 ; i--) {
			arr2[i] = arr[i];
		}
		return arr2;
	}
	
	public void inicializarB() {
		for(int i = 0 ; i < this.arr2.length ; i++) {
			if (i < 10 ){
				this.arr2[i] = this.arr1[i];
			}else {
				this.arr2[i] = (float) 0.5;
			}
		}
	}
	
	
}

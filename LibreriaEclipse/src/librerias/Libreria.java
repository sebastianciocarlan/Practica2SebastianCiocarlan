package librerias;

import java.util.Scanner;

public class Libreria {
	public static void escribirNombre(String nombre) {
		System.out.println("Hola mi nombre es : "+nombre);
	}
	public static void factorial(int num) {
		int valor = 1;
		for(int i = 0; i<=num;i++) {
			valor = valor *i;
		}
		System.out.println("El factorial es :"+valor);
	}
	public static void listaNumeros(int n, Scanner sc) {
		int[] array = new int[n];
		
		for(int i = 0; i<n;i++) {
			System.out.println("Introduce el numero "+i+1);
			array[i] = sc.nextInt();
		}
		int max = array[0];
		for (int i =0; i<n;i++) {
			if (array[i]>max) {
				max = array[i];
			}
			
		}
		System.out.println("El mayor es: "+max);
	}
}

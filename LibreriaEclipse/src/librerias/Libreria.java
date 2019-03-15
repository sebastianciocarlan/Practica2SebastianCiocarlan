package librerias;

import java.util.Scanner;

public class Libreria {
	public static void escribirNombre(String nombre) {
		Console.Out.WriteLine("Hola mi nombre es : "+nombre);
	}
	public static void factorial(int num) {
		int valor = 1;
		for(int i = 0; i<=num;i++) {
			valor = valor *i;
		}
		Console.Out.WriteLine("El factorial es :"+valor);
	}
	public static void listaNumeros(int n, Scanner sc) {
		int[] array = new int[n];
		
		for(int i = 0; i<n;i++) {
			Console.Out.WriteLine("Introduce el numero "+i+1);
			array[i] = Console.In.Read();
		}
		int max = array[0];
		for (int i =0; i<n;i++) {
			if (array[i]>max) {
				max = array[i];
			}
			
		}
		Console.Out.WriteLine("El mayor es: "+max);
	}
}

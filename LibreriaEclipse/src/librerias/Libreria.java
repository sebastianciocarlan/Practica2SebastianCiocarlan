package librerias;

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
	
}

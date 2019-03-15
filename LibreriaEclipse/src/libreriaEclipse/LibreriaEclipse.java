package libreriaEclipse;

import java.util.Scanner;

import librerias.Libreria;

public class LibreriaEclipse {

	public static void main(String[] args) {
		Scanner sc  =new Scanner(System.in);
		int entrada;
		do {

			System.out.println("------------------------------------------");
			System.out.println("1- Factorial de un numero");
			System.out.println("2- Tu nombre");
			System.out.println("3- Valor maximo");
			System.out.println("4- Salir ");
			System.out.println("------------------------------------------");
			entrada = sc.nextInt();
			switch (entrada) {
			case 1:
				System.out.println("Escribe el numero del que sacaremos el factorial.");
				Libreria.factorial(sc.nextInt());			
				sc.nextLine();
				break;
			case 2:
				System.out.println("Introduce tu nombre");
				Libreria.escribirNombre(sc.nextLine());
				break;
			case 3:
				System.out.println("Introduce el numero de numeros a evaluar");
				Libreria.listaNumeros(sc.nextInt(), sc);
				sc.nextLine();
				break;
			case 4:
				break;
			default:
				System.out.println("Introduce un valor valido");
				break;
			}
		}while(entrada!=4);
		sc.close();
	}

}

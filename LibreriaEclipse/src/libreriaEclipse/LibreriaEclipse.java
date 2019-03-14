package libreriaEclipse;

import java.util.Scanner;

import librerias.Libreria;

public class LibreriaEclipse {

	public static void main(String[] args) {

		int entrada;
		do {

			Console.Out.WriteLine("------------------------------------------");
			Console.Out.WriteLine("1- Factorial de un numero");
			Console.Out.WriteLine("2- Tu nombre");
			Console.Out.WriteLine("3- Valor maximo");
			Console.Out.WriteLine("4- Salir ");
			Console.Out.WriteLine("------------------------------------------");
			Console.Read() = entrada 
			switch (entrada) {
			case 1:
				Console.Out.WriteLine("Escribe el numero del que sacaremos el factorial.");
				Libreria.factorial(sc.nextInt());			
				break;
			case 2:
				Console.Out.WriteLine("Introduce tu nombre");
				Libreria.escribirNombre(sc.nextLine());
				break;
			case 3:
				Console.Out.WriteLine("Introduce el numero de numeros a evaluar");
				Libreria.listaNumeros(sc.nextInt(), sc);
				break;
			case 4:
				break;
			default:
				Console.Out.WriteLine("Introduce un valor valido");
				break;
			}
		}while(entrada!=4);
	}

}

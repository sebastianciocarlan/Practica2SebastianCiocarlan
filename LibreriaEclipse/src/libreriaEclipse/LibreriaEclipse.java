package libreriaEclipse;

import java.util.Scanner;

public class LibreriaEclipse {

	public static void main(String[] args) {
		Scanner sc  =new Scanner(System.in);
		int entrada;
		do {
			System.out.println("------------------------------------------");
			System.out.println("1- ");
			System.out.println("2- ");
			System.out.println("3- ");
			System.out.println("4- ");
			System.out.println("------------------------------------------");
			entrada = sc.nextInt();

		}while(entrada!=4);
		sc.close();
	}

}

package code;

import java.util.Scanner;

public class clase1 {
	
	public static void cuadrado(int val) {
		for (int i = 0; i < val; i++) {
			for (int j = 0; j < val; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void triangulo(int val) {
		for (int i = 0; i < val; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
		
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingres su valor: ");
		int valor = scanner.nextInt();
		System.out.println();
		cuadrado(valor);
		System.out.println();
		triangulo(valor);
		scanner.close();
	}	
}

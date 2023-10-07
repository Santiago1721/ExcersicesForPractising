package Practicas;

import java.util.Scanner;

public class ejercicio5 {
	public static void main(String [] args) {
		
		Scanner lector = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Introduce un numero por teclado");
		
		numero = lector.nextInt();
		
		while(numero != 0) {
			
		System.out.println("\n el numero que me haz introducido es: " + numero);
		
		System.out.println("\n digiteme otros numeros y le dire cuando me digite un cero");
		
		numero = lector.nextInt();
		
		while(numero == 0) {
			
			System.out.println("tu numero es cero, por lo que se termina tu bucle");
			
			break;
		}
			
		}
	}
}



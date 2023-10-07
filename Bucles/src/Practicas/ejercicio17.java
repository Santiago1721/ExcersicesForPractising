package Practicas;

import java.util.Scanner;

public class ejercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Introduce un numero y te dire si es primo");
		
		int numero = lector.nextInt();
		
		while(numero > 0) {
			
			if(numero % 1 == 0) {
				
				System.out.println("Tu numero es primo");
			}
			
			else if(numero % numero != 0) {
				System.out.println("tu numero no es primo");
			}
			
			else {
				System.out.println("Me has introducido valores incorrectos");
			}
			
		}

	}

}

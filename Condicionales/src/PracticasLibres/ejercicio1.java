package PracticasLibres;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner lector = new Scanner(System.in);
		
		System.out.println("digitame un numero");
		
		int numero = lector.nextInt();
		
		
		if(numero > 5) {
			System.out.println("tu numeros es mayor a cinco");
		}
		else {
			System.out.println("tu numero es inferior a 5");
		}

	}

}

package Practicas;

import java.util.Scanner;

public class ejercicio4 {
	public static void main(String [] args) {
		
		//crea un programa que lea un numero y muestre su cuadrado y que repita este proceso hasta que se introduzca un numero
		//negativo
		
		double numero;
		double cuadrado;
		
		
		Scanner lector = new Scanner(System.in);
		
		System.out.println("digitame un numero y te mostrare su cuadrado, parare cuando me introduzcas un numero negativo");
		
		numero = lector.nextDouble();
		
		while(numero >= 0) {
			
			cuadrado = Math.pow(numero, 2);
			
			System.out.println(cuadrado);
			
			System.out.println("digiteme otro numero y cumplire las mismas condiciones que las de arriba");
			
			numero = lector.nextDouble();
			
		}
		
	}

}

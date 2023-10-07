package Practicas;

import java.util.Scanner;

public class ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//juego de los 100 numeros, si aciertas el mismo numero aleatorio ganas
		
		int numero,contador = 2,aleatorio;
		
		try (Scanner lector = new Scanner(System.in)) {
			System.out.println("digitame un numero para ver si es el mismo que te da aleatoriamente el programa");
			
			numero = lector.nextInt();
			
			aleatorio = (int) (Math.random()*100);
			
			while(numero != aleatorio) {
				contador++;
				
				if(numero == aleatorio) {
					
					System.out.println("Haz acertado el numero correcto");
					
				}
				else if(numero > aleatorio) {
					System.out.println("Tu numero es mayor al correcto");
					
					System.out.println("Tu sigue introduciendo numeros anda");
					
					numero = lector.nextInt();
				}
				else if(numero < aleatorio) {
					System.out.println("Tu numero es menor al correcto");
					
			        System.out.println("Tu sigue introduciendo numeros anda");
					
					numero = lector.nextInt();
					
				}else {
					System.out.println("Haz introducido un numero que se sale del rango de 1 a 10");
				}
				
				System.out.println("tu numero de intentos a sido " + contador);
			}
			
			System.out.println("el numero es " + aleatorio);
		}
		
	
	}

}

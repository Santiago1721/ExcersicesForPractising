package Practicas;

import java.util.Scanner;

public class ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//programa en el cual introducimos varios numeros positivos o ceros, cuando introduzcamos un numero negativo el programa se detendra y nos 
		//mostrara el promedio de los numeros positivos que hayamos introducido
		
		Scanner lector = new Scanner(System.in);
		
		int numero ,numeros = 0,suma = 0;
		float promedio;
		
		System.out.println("introduce varios numeros y los sumare hasta que me des un numero negativo");
		
		numero = lector.nextInt();
		
		while(numero >= 0) {
			suma+=numero;
			numeros++;
			
			System.out.println("introduce mas numeros anda");
			
			numero = lector.nextInt();	
			
		}
		
		if(numeros == 0) {
			System.out.println("no puedo dividir el resultado de la suma si es cero, ya que no es divisible");
			
			
		}
		
		else if(numeros > 0) {
			
			promedio = (float) suma/numeros;
			System.out.println("el promedio de los positivos que has introducido es " +promedio);
			
		}
		
		else {
			System.out.println("me has introducido datos incorrectos");
		}

	}

}

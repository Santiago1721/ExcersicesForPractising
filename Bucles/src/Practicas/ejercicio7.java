package Practicas;

import java.util.Scanner;

public class ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero,contador = 0;
		
		Scanner lector = new Scanner(System.in);
		
		System.out.println("introduceme varios numeros y cuando me digites un negativo terminara el bucle");
	
		do {
			
			numero = lector.nextInt();
			
			contador++;
			
			if(numero <= 0) {
				System.out.println("tu numero es negativo, por lo cual el bucle ha terminado");

			}
			
			System.out.println(contador);
		}
		
		while(numero >= 0);
	

	}
}



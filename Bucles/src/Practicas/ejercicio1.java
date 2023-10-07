package Practicas;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 1;
		int contador;
		
		Scanner lector = new Scanner(System.in);
		System.out.println("digite cuantos numeros quiere en pantalla");
		
		contador = lector.nextInt();
		
		while(i <= contador){
			System.out.println(i);
			
			i+= 5;
		}
		
	}

}

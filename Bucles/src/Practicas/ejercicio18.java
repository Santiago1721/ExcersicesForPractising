package Practicas;

import java.util.Scanner;

public class ejercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Scanner lector = new Scanner(System.in);
		
		int numero1;
		int numero2;
		
		do {
			
			System.out.println("introduceme el primer numero");
			
			numero1 = lector.nextInt();
			
			System.out.println("introduceme el segundo numero");
			
			numero2 = lector.nextInt();
			
			break;
			
		}
		while(numero1 > 0 && numero2 > 0);
			
		
		
		if(numero1 > numero2) {
			
			System.out.println("el mayor de los numeros que has escrito es  " + numero1);
		}
		
		else if(numero2 > numero1) {
			
			System.out.println("el mayor de los dos numeros que has escrito es " + numero2);
		}
		
		else {
			System.out.println("me has introducido valores incorrectos");
		}
		

	}

}

	


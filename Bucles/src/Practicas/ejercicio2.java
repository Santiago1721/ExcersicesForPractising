package Practicas;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 0;
		int contador = 0;
		
		Scanner lector = new Scanner(System.in);
		
		System.out.println("indiqueme hasta que numero quiere repetir la secuencia de tres en tres empezando desde 0");
		
		contador = lector.nextInt();
		
		do {
			System.out.println(i);
			i+=3;
		}while(i <= contador);
		
		

	}

}

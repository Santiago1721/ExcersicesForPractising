package Practicas;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int contador;
		
		Scanner lector = new Scanner(System.in);
		
		System.out.println("introduce hasta que numero quieres ver la secuencia de dos en dos");
		
		contador = lector.nextInt();
		
		for(int i = 0; i <=contador; i+=2){
		
		System.out.println(i);
		
	}

}
}

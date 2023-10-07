package Practicas;

import java.util.Scanner;

public class ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// este ejercicio sigue la misma linea que el ejercicio anterior
		
		Scanner lector = new Scanner(System.in);
		
		System.out.println("introduce el numero del que quieras partir de 7 en 7 hasta llegar a 0");
		
		int partida = lector.nextInt();
		
		for(int i = partida; i >= 0; i-=7) {
		
		System.out.println(i);
	
		

	}

}
}

package Practicas;

import java.util.Scanner;

public class ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Pedir numeros hasta que se teclee un cero, mostrar la suma de todos los numeros introducidos
		
		Scanner lector = new Scanner(System.in);
		
		int numero;
		int suma = 0;
		
		do {
			
		System.out.println("Introduceme varios numeros");
		
		numero = lector.nextInt();
		
		suma+=numero;
		

	}
		while(numero != 0);

		System.out.println("La suma de tus numeros es" + suma);

}
}

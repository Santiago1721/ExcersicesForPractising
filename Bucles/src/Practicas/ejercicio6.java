package Practicas;

import java.util.Scanner;
public class ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Introduce un numero entero y yo te dire si es par o impar, si es cero se termina el bucle");
	
		numero = lector.nextInt();
		while(numero != 0) {
			if (numero %2 == 0) {
		
			System.out.println("tu numero es par");
			
			System.out.println("Sigue introduciendo numeros");
			
			numero = lector.nextInt();
			
		    }
			
			else if(numero % 2 != 0){
				System.out.println("tu numero es impar");
				
				System.out.println("Sigue introduciendo numeros");
				
				numero = lector.nextInt();
				
			}
				
				else if(numero == 0) {
					System.out.println("tu numero es cero");
				break;
			}
			}
	
}
}


	




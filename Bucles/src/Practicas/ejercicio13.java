package Practicas;

import java.util.Scanner;

public class ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Introducir diez numeros, sumar los positivos, los negativos y hallar la media de cada grupo respectivamente, tambien mostrar el numero de 
		//ceros introducidos
		
		// NECESITA REVISION!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		
		
		Scanner lector = new Scanner(System.in);
			
			
			int numeros;
			
			int contador = 0;
			
			int conteo_positivos = 0;
			
			int conteo_negativos = 0;
			
			int suma_positivos = 0;
			
			int suma_negativos = 0;
			
			int conteo_ceros = 0;
		
			do {
				
				System.out.println("sigue digitandome numeros hasta llegar a 10 numeros digitados");
			
				numeros = lector.nextInt();
				
				contador++;
				
			}
			
			while(contador < 10);
			
			
			if(numeros > 0) {
				
				contador+=conteo_positivos;
				conteo_positivos++;
				
			}
			
			else if(numeros < 0) {
				
				contador+=conteo_negativos;
				conteo_negativos++;
			}
			
			else if(numeros == 0) {
			    contador+=conteo_ceros;
			    conteo_ceros++;
			}
			
			else {
				System.out.println("me estas introduciendo datos incorrectos");
			}
		
			
			System.out.println("el total de tus numeros positivos,negativos, y ceros es: ");
			
			System.out.println("Positivos " +conteo_positivos);
			
			System.out.println("Negativos " +conteo_negativos);
			
			System.out.println("Ceros " + conteo_ceros);
			
		
	}
		

	
}






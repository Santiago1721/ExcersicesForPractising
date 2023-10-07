package Practicas;

import java.util.Scanner;

public class ejercicio11 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		//Con este bucle podemos ver una secuencia numerica definida en el i+=(valorsecuencia) hasta el numero que
		//introduzcamos por teclado, ese numero introducido por teclado sera el tope
		
		Scanner lector= new Scanner(System.in);
		
		System.out.println("Introduce un numero");
		
		int numero = lector.nextInt();
		
		for(int i = 0; i <= numero; i+=5) {
	
		System.out.println(i);
		
	}

}
}
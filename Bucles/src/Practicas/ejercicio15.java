package Practicas;

import java.util.Scanner;

public class ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Pide un numero que debe de estar entre 1 y 15 y mostrar la tabla de multiplicar de dicho numero
		
		//En cualquier momento se puede editar hasta que numero quieres ver la multiplicacion del numero introducido
		
		//editando el valor maximo por el que se multiplica 
		
		Scanner lector = new Scanner(System.in);
		
		 System.out.print("Introduce un numero: ");
		  int num1 = lector.nextInt();
		   
		  for (int i=0; i < 15; i++){
		   System.out.println(num1 + " x " + (i+1) + " = " + 
		     (num1 * (i+1)));
		  }
		 }
}
		

	
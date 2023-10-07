package Practicas;


import java.util.Scanner;

public class ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);
		
		int sueldos = 0;
		
		int contador = 0;
		
	
		System.out.println("introduceme los sueldos de los 10 empleados de la empresa");  
		
		while(contador < 5) {
			
			sueldos += lector.nextInt();
			 
			 System.out.println("Sigueme introduciendo sueldos");
			     
			 contador++;
		}
		
	
		if(sueldos >= 1000) {
			System.out.println("los sueldos mas altos de tu empresa son " + sueldos);
			
		}
		
		else {
			System.out.println("al parecer tu empresa no tiene sueldos altos");
		}
		
		System.out.println("la suma de los sueldos de tu empresa son " + sueldos);

	}

}

package Practicas;

import java.util.Scanner;

public class ejercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Dadas 6 notas por teclado, mostrar el numero de alumnos aprobados, a recuperaciom, osea que su nota sea
		//igual a 5 y suspendidos osea menor o igual a 4
		
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Deme la nota de los 6 estudiantes del curso");
		
		int nota;
		
		int aprobados = 0;
		
		int recuperacion = 0;
		
		int reprobados = 0;
		
		for(int i = 1; i <= 6; i++) {
			
			do {
			
			 nota = lector.nextInt();
			
			}
		
		while(nota < 0 || nota > 10);
			
		
			
			if(nota >= 6) {
				aprobados++;
			}
			else if(nota == 5) {
				recuperacion++;
				
			}
			else if(nota <= 4) {
				 reprobados++;
			}
			else {
				System.out.println("me has introducido una nota incorrecta");
			}
			
			System.out.println("aprobados" + aprobados);
			System.out.println("recuperar" + recuperacion);
			System.out.println("reprobados"+ reprobados);
		}

}
}



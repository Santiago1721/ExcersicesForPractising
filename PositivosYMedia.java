import java.util.Scanner;

public class SoloPositivosYMedia {

	public static void main(String[] args) {         //Este programa solo cuenta numeros si son positivos y luego da la media de la suma de estos
		
		Scanner lector = new Scanner(System.in);
		
		int num= 0,suma = 0,cantidadNumeros = 0;  //declaramos tres variables enteras y una decimal
		
		double media = 0;  //la media puede ser un valor decimal, por eso se pone double
		 System.out.println("Introduce un numero positivo");
		 
		 num = lector.nextInt(); //5
		 while(num > 0) {  //condicion para decir que solo se admiten positivos
			 
			 suma = suma + num;   //la suma de los numeros es igual a la misma variable mas los numeros introducidos
			 cantidadNumeros++;   //aqui el contador cuenta la cantidad de valores introducidos
			 System.out.println("Introduzca otro numero");
			 num = lector.nextInt();  //numero almacenado en el escaner
		 }
		 
		 if(cantidadNumeros == 0) {   //si no se introducen numeros no se hace media
			 System.out.println("No se puede calcular la media");
		 }
		 else {
			 media = suma/cantidadNumeros;               //la media es la suma de todos los numeros dividido por la cantidad de valores introducidos , un ejemplo, si son 5 numeros introducidos se dividira la suma de estos
			 System.out.println("La media es "+ media);  //por cinco, si son 6 se dividira por 6 y asi
		 }

	}

}

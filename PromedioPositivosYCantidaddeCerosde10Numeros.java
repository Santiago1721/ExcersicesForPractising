import java.util.Scanner;

public class Captura10NumerosYObtienePromediodePositivosyCantidaddeCeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num= 0,cantidad_negativos = 0,cantidad_positivos = 0;  //separamos las variables enteras para no perdernos, y las iniciamos desde 0
		
		int sumaNegativos = 0,sumaPositivos = 0,cantidadCeros = 0;
		
		double promedioPositivos = 0,promedioNegativos = 0;
		
		int k= 0;
		Scanner lector = new Scanner(System.in);
		while(k < 10)
		{
			System.out.println("Introduce un numero:");
			num = lector.nextInt();
			
			if(num ==0)cantidadCeros++;
			else if(num > 0) {
				cantidad_positivos++;
				sumaPositivos=sumaPositivos+num;
			}
			else {
		
		
		    cantidad_negativos++;
		    sumaNegativos = sumaNegativos+num;

	}
			k++; 

}
		if(cantidad_positivos == 0) {
			System.out.println("no se puede realizar el promedio de los positivos");
		
		
} else {
	
	promedioPositivos=sumaPositivos/cantidad_positivos;
	System.out.println("El promedio de los positivos es "+ promedioPositivos);
	}
if(cantidad_negativos == 0) {
	System.out.println("No se puede realizar el promedio de los negativos");
}
else {
	promedioNegativos = sumaNegativos/cantidad_negativos;
	System.out.println("El promedio de los negativos es "+promedioNegativos);
}
System.out.println("La cantidad de ceros son: "+cantidadCeros);
}
}

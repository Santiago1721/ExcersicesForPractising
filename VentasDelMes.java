
import java.util.Scanner;

public class Ventas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner lector = new Scanner(System.in);

		double[] ventas = new double[30];  //aqui declaramos el espacio del array ventas
	
		
		System.out.println("digiteme las ventas de los ultimos 10 dias");
		
		for(int i = 0; i < ventas.length; i++) //aqui creamos un bucle for para que lea datos de venta segun el tamaño de array, es este caso 30
		{
		System.out.println("Venta "+(i + 1));  //esto es lo que imprimira cada vez que metamos un nuevo dato de venta
		ventas[i] = lector.nextDouble();    // aqui usamos el scanner para agrupar los datos de venta con el alias i del bucle for
		
	}
		
		int k = 0;      //esta k la usaremos para almacenar las veces que metemos datos
		
		int total = 0;
		
		while(k < 30){  //usamos un bucle while para delimitar cuantas veces sera el maximo de veces que introduciremos datos de venta
			if (ventas[k] >= 2000) {  //y aqui le ponemos un condicional para que solo imprima los datos de venta que sean mayores o ioguales a 2000 euros
		
		System.out.println("Las ventas que fueron mayores a 2000 euros fueron las siguientes");
		System.out.println(ventas[k]); //aqui imprimimos la variable
		total++;
	}
	
	k++;
		}
	}
}
		
	

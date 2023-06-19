import java.util.Scanner;

public class CuentaHastaCero {
	public static void main(String[] args) {
		
		int num =0, suma = 0;
		Scanner lector = new Scanner(System.in);  //en este ejercicio vamos a sumar todos los numeros introducidos por teclado hasta que se introduzca un valor preterminado
                                              //en este caso un cero
		
		do
		{
		
			System.out.println("Introduce un numero");  //aqui introducumos un numero
			num = lector.nextInt();
			
			suma = suma+num;  //aqui la variable suma, como dice su nombre, suma todos los numeros que le introduzcamos hasta que se incumpla la condicion del while
		
	}while(num!=0);        //mientras el numero que introducimos sea diferente a cero, el do seguira leyendo lo que le introduzcamos por teclado
		System.out.println("la suma de los numeros da como resultado : " +suma);
		

}
}

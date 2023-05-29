import java.util.Scanner;

public class Mayor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int array[] = new int[5];
        int mayor = array[0];
        
        Scanner lector = new Scanner(System.in);
          System.out.println("Ingresa los 5 numeros");
          
          for(int i = 0 ; i<array.length; i++) {
        	  
        	  array[i] = lector.nextInt();
        	  
        	  if (array[i] >mayor) {
        		  
        		  mayor = array[i];
        	  }
          }
          
          System.out.println("el numero mayor es " +mayor);
	}       

}

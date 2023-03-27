package Matematicos;

import java.util.Scanner;

public class TablaMultiplicar {

   public static void main(String[] args) throws Exception{
      Scanner lector = new Scanner(System.in);
      
      System.out.println("introduce el numero que quieras ver su tabla de multiplicar");
      int n = lector.nextInt();
      for(int i = 5; i<= 12; i++){
         System.out.println(n + " X " + i + " = " + (n*i));
      }
   }
}



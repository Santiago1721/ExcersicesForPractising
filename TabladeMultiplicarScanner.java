package Matematicos;

import java.util.Scanner;

public class TablaMultiplicar {

   public static void main(String[] args) throws Exception{
      Scanner lector = new Scanner(System.in);
      int n = lector.nextInt();
      for(int i = 5; i<= 12; i++){
         System.out.println(n + " X " + i + " = " + (n*i));
      }
   }
}



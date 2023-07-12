package PracticasLibres;

import javax.swing.JOptionPane;

public class ejercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creamos un programa que nos reciba dos numeros enteros y nos diga si alguno de los dos es divisor del otro
		
		int numero1, numero2;
		
		numero1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Dame el primer numero"));
		
		numero2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Dame el segundo numero"));
		
		
		if(numero1 % numero2 == 0) {
			JOptionPane.showMessageDialog(null, "el numero 1:" + numero1 + " es divisor del numero 2: " + numero2);
		}else if(numero2 % numero1 == 0) {
			JOptionPane.showMessageDialog(null, "el numero 2: " + numero2 + " es divisor del numero 1: " + numero1);
		}else {
			JOptionPane.showMessageDialog(null, "Ninguno de los numeros es divisor del otro");
		}
		
		
		

	}

}

package PracticasLibres;

import javax.swing.JOptionPane;

public class ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero1, numero2;
		
		numero1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Dame el primer numero entero"));
		
		numero2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Dame el segundo numero entero"));
		
		if(numero1 > numero2) {
			JOptionPane.showMessageDialog(null,"El numero 1: " + numero1 + "es mayor al numero 2:" + numero2);
			
		}else if(numero1 == numero2){
			JOptionPane.showMessageDialog(null, "El numero 2: " + numero2 + "es igual al numero 1: " + numero1);
		}else {
			JOptionPane.showMessageDialog(null, "El numero 1: " +numero1 + "es menor al numero 2:" + numero2);
		}
		
		

	}

}

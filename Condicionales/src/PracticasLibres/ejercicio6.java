package PracticasLibres;

import javax.swing.JOptionPane;

public class ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Dame un numero entero"));
		
		if(numero%2 == 0) {
			JOptionPane.showMessageDialog(null,"tu numero es par");
		}else {
			JOptionPane.showMessageDialog(null, "tu numero es impar");
		}
		
	}

}

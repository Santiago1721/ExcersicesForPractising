package PracticasLibres;

import javax.swing.JOptionPane;

public class ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Dame un numero entero"));
		
		
		if(numero > 0) {
			JOptionPane.showMessageDialog(null, "Tu numero es positivo");
		}
			else if(numero == 0) {
				JOptionPane.showMessageDialog(null, "tu numero es cero");
			
		}else {
			JOptionPane.showMessageDialog(null, "Tu numero es negativo");
		}

	}

}

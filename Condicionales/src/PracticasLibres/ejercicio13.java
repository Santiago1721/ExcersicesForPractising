package PracticasLibres;

import javax.swing.JOptionPane;

public class ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero1, numero2;
		char operacion;
		
		numero1 = Integer.parseInt(JOptionPane.showInputDialog(null,"inserta el primer numero"));
		
		numero2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Inserte el segundo numero"));
		
		operacion = JOptionPane.showInputDialog(null,"insertame que tipo de operacion quieres realizar").charAt(0);
		
		if((operacion == 'S') || (operacion == 's')){
			JOptionPane.showMessageDialog(null,"el resultado de tu suma es " + (numero1 + numero2));
		}
		else if((operacion == 'R') || (operacion == 'r')){
			JOptionPane.showMessageDialog(null,"el resultado de tu resta es " + (numero1 - numero2));
		}else if((operacion == 'M') || (operacion == 'm')) {
			JOptionPane.showMessageDialog(null, "el resultado de tu multiplicacion es " + (numero1 * numero2));
		}else if((operacion == 'D') || (operacion == 'd')) {
			JOptionPane.showMessageDialog(null, "el resultado de tu division es " + (numero1 / numero2));
		}else {
			JOptionPane.showMessageDialog(null, "no me has dado ningun valor valido");
		}

	}

}

package PracticasLibres;

import javax.swing.JOptionPane;

public class ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero1, numero2, numero3;
		
		numero1 = Integer.parseInt(JOptionPane.showInputDialog(null,"dame el primer numero"));
		
		numero2 = Integer.parseInt(JOptionPane.showInputDialog(null,"dame el segundo numero"));
		
		numero3 = Integer.parseInt(JOptionPane.showInputDialog(null,"dame el tercer numero"));
		
		if((numero1 > numero2) && (numero1 > numero3)){
			JOptionPane.showMessageDialog(null, "el numero mayor es el numero 1 : "+ numero1);
			
		}else if((numero2 > numero1) && (numero2 > numero3)){
			
			JOptionPane.showMessageDialog(null, "el numero mayor es el numero 2 : "+ numero2);
			
		}else {
			JOptionPane.showMessageDialog(null, "el numero mayor es el numero 3 : " +numero3);
		}

	}

}

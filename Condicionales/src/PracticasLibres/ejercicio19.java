package PracticasLibres;

import javax.swing.JOptionPane;

public class ejercicio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero1,numero2,numero3;
		
		
		numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "digite el primer numero"));
		
		numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "digite el segundo numero"));
		
		numero3 = Integer.parseInt(JOptionPane.showInputDialog(null, "digite el tercer numero"));
		
		if((numero1 < numero2) && (numero2 < numero3)) {
			JOptionPane.showMessageDialog(null, "Los numeros estan en orden ascendente");
		}else if
			((numero1 > numero2) && (numero2 > numero3)){
				JOptionPane.showMessageDialog(null, "los numeros estan en orden descendente");
			}else {
				JOptionPane.showMessageDialog(null, "los numeros introducidos no siguen un patron claro");
			
		}
		
		

	}

}

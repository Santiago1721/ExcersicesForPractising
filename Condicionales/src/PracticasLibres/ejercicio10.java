package PracticasLibres;

import javax.swing.JOptionPane;

public class ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// introducimos un numero entre 1 y 100 y decimos si es primo o no
		
		int numero;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Dame un numero entre 1 y 100 y te digo si es primo o no"));
		
		if((numero%numero == 0) && (numero > 1 && numero < 100)) {
			JOptionPane.showMessageDialog(null, "enhorabuena tu numero es primo y esta entre 1 y 100");
		}else {
			JOptionPane.showMessageDialog(null, "tu numero ni es primo ni esta entre 100");    //NECESITA REVISARSE
		}

	}

}

package PracticasLibres;

import javax.swing.JOptionPane;

public class ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dia,mes,año;
		
		dia = Integer.parseInt(JOptionPane.showInputDialog(null,"Dame un dia de un mes de 30 "));
		
		mes = Integer.parseInt(JOptionPane.showInputDialog(null,"Dame un mes del año"));
		
		año = Integer.parseInt(JOptionPane.showInputDialog(null,"Dame un año"));
		
		if((dia >= 1 && dia <= 30) && (mes >= 1 && mes <= 12) && (año != 0)) {
			JOptionPane.showMessageDialog(null, "tu fecha es correcta");
		}else {
			JOptionPane.showMessageDialog(null, "tu fecha es incorrecta");
		}

	}

}

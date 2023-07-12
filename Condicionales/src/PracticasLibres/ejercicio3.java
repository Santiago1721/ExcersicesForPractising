package PracticasLibres;

import javax.swing.JOptionPane;

public class ejercicio3 {
	public static void main(String [] args) {
		
		int horas;
		double salariobase,salarioextra,salarioextrafinal;
		
		horas = Integer.parseInt(JOptionPane.showInputDialog(null,"Dame el numero de horas que has laburado"));
		
		salariobase = horas * 16;
		
		salarioextra = (horas * 20);
		
		salarioextrafinal = (40*16) + ((horas-40)*20);
		
		if(horas <= 40) {
		
		JOptionPane.showMessageDialog(null, "Tus horas de trabajo son 40 o menos, por lo que tu salario es " +salariobase);
		
		}else {
			JOptionPane.showMessageDialog(null, "Has cumplido tu horario de trabajo y ademas has hecho algunas horas extra, por lo"
					+ "que tu pago final es de " + salarioextrafinal);
		}
		
}
}

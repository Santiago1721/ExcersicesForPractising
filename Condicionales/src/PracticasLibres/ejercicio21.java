package PracticasLibres;

import javax.swing.JOptionPane;

public class ejercicio21 {

	public static void main(String[] args) {
				// TODO Auto-generated method stub
		
		
		
		//este programa convierte un valor dado por teclado de pulgadas, yardas y millas, a milimetros, metros y kilometros, vamos que convierte
		//medidas del sistema imperial (el que solo se usa en Estados unidos y Birmania, al sistema metrico (usado en el resto del mundo), por favor
		//ni siquiera reino unido, que fue quien creo el sistema imperial lo usa ya
		
		double pulgadas = 0.0;
		double yardas = 0.0;
		double millas = 0.0;
	
		JOptionPane.showMessageDialog(null, "Bienvenido al conversor de sistema imperial a sistema metrico");
		
		pulgadas = Double.parseDouble(JOptionPane.showInputDialog(null,"Dame las pulgadas que quieras convertir a milimetros"));
		
		JOptionPane.showMessageDialog(null, "Tus pulgadas son " + (pulgadas * 25.40) + " Milimetros");
		
		yardas = Double.parseDouble(JOptionPane.showInputDialog(null,"Dame las yardas que quieras convertir a metros"));
		
		JOptionPane.showMessageDialog(null, "Tus Yardas son " + (yardas * 0.91) + "Metros");
		
		millas = Double.parseDouble(JOptionPane.showInputDialog(null,"Dame las millas que queiras convertir a Kilometros"));
		
		JOptionPane.showMessageDialog(null, "Tus Millas son " + (millas * 1.60) + "Kilometros");
		
		
		

	}

}

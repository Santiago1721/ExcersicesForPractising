package PracticasLibres;

import javax.swing.*;

public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int compra;
		double descuento;
		
		compra = Integer.parseInt(JOptionPane.showInputDialog(null,"Digitame el valor de tu compra"));
		
		descuento = compra * 0.80;
		
		if(compra >= 300) {
			JOptionPane.showMessageDialog(null, "tu compra ha sido mayor a 300 euros por lo que se te da un descuento del 20% y tu pago"
					+ "final seria de: " +descuento);
		} else {
			JOptionPane.showMessageDialog(null, "tu compra ha sido menor a 300, por lo que no se te concede descuento y tu precio final es :"
					+ compra);
		}
		
		
		

	}
}



package PracticasLibres;

import javax.swing.JOptionPane;

public class ejercicio20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int compra;
		
		JOptionPane.showMessageDialog(null, "Tienda Ultramarinos el Viejo Amargado \n Productos: \n Pescado \n Cianuro \n Introduce el valor de tu"
				+ " compra, y de acuerdo a cuanto compres se te dara un descuento");
		
		
		compra = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el valor de tu compra"));
		
		if(compra < 800) {
			JOptionPane.showMessageDialog(null,"tu compra de " + compra + " es de menos de 800 euros, por lo que no tienes descuento por compra y tu total a pagar"
					+ " es de " +compra + " euros");
		}
		else if(compra >= 800 && compra <= 1500) {
			JOptionPane.showMessageDialog(null,"tu compra de " + compra + " esta entre los 800 y 1500 euros, por lo que tienes descuento por compra del 10% y tu total a pagar"
					+ " es de " + (compra - (compra * 0.10)) + " euros");
		}else if(compra > 1500 && compra <= 5000) {
			JOptionPane.showMessageDialog(null, "tu compra de " + compra + " esta entre los 1501 y los 5000 euros, por lo que tienes un descuento por compra del 15"
					+ "% y tu total a pagar es de " + (compra - (compra * 0.15)) + " euros");
		}else if(compra > 5000) {
			JOptionPane.showMessageDialog(null, "tu compra de " + compra + "es mayor a 5000 euros, por lo que tienes un descuento del 20% y tu total a pagar"
					+ "es de " + (compra - (compra * 0.20)) + " euros");
		
		}else {
			JOptionPane.showMessageDialog(null,"no me has introducido valores correctos");
		}
		

	}

}

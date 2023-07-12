package PracticasLibres;

import javax.swing.JOptionPane;

public class ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//indicamos un numero entero entre 0 y 99.999 y creamos un codigo que nos diga cuantas cifras tiene
		
		int numero;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Dame un numero entre 0 y 99.999 y te dire cuantas "
				+ "cifras tiene"));
		
		if(numero >= 0 && numero <= 9) {
			JOptionPane.showMessageDialog(null, "tu numero "+numero +" tiene una cifra");
		}else if(numero >= 10 && numero <= 99){
			JOptionPane.showMessageDialog(null, "tu numero "+numero +" tiene dos cifras");
		}else if(numero >= 100 && numero <= 999){
			JOptionPane.showMessageDialog(null, "tu numero "+numero +" tiene tres cifras");
		}else if(numero >= 1000 && numero <= 9999){
			JOptionPane.showMessageDialog(null, "tu numero "+numero +" tiene cuatro cifras");
		}else {
			JOptionPane.showMessageDialog(null, "tu numero "+numero +" tiene 5 o mas cifras :O");
		}

	}

}

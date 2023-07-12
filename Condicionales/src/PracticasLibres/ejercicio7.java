package PracticasLibres;

import javax.swing.JOptionPane;

public class ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double area,altura,base;
	
		
		base = Double.parseDouble(JOptionPane.showInputDialog(null,"dame la base de tu triangulo"));
		
		altura = Double.parseDouble(JOptionPane.showInputDialog(null,"dame la altura de tu triangulo"));
		
		area = base * altura;
		
		JOptionPane.showMessageDialog(null, "el area de tu triangulo es " + area);
			
		}

	}



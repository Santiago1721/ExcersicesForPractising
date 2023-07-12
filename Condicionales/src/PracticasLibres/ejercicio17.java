package PracticasLibres;

import javax.swing.JOptionPane;

public class ejercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int salario;
		
		JOptionPane.showMessageDialog(null, "Bienvenido a este programa de verificacion de aumento de sueldo, \n aqui pondras tu salario trimestral y"
				+ "segun cuanto hayas ganado se te dara un auxilio en forma de aumento salarial");
		
		
		salario = Integer.parseInt(JOptionPane.showInputDialog(null,"Digiteme el salario que gano este trimestre"));
		
		if(salario < 18000) {
			JOptionPane.showMessageDialog(null, "tu aumento segun tu salario recibido es del 15%, lo que tu salario final es de : "
					 + (salario += (salario * 0.15)));
		}
			else if((salario >= 18000) && (salario <= 30000)){
				JOptionPane.showMessageDialog(null, "tu aumento segun tu salario recibido es del 10%, por lo que tu salario final es de : "
					+ (salario += (salario * 0.10)));
			
		}else if((salario >= 30000) && (salario <= 50000)){
			JOptionPane.showMessageDialog(null, "tu aumento segun tu salario recibido es del 7%, por lo que tu salario final es de : "
					+ (salario += (salario * 0.07))); 
			
		}else if(salario > 50000) {
			JOptionPane.showMessageDialog(null, "tu aumento segun tu salario recibido es del 5%, por lo que tu salario final es de : "
				    + (salario += (salario * 0.05)));
			
		}
		
		else {
			JOptionPane.showMessageDialog(null, "no me has puesto datos correctos");
		}

	}
}



package PracticasLibres;

import javax.swing.JOptionPane;

public class ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//usando un switch case, le indicaremos por teclado un numero y el 
		//programa nos dira el dia correspondiente a ese numero
		
		int numerodeldia = 1;
		
		String diadelasemana = "";
		
		numerodeldia = Integer.parseInt(JOptionPane.showInputDialog(null,"Dame un numero de dia de la semana"));
		
		switch(numerodeldia) {
		
		case 1 :
			diadelasemana = "Lunes";
			break;
			
		case 2 :
			diadelasemana = "Martes";
			break;
			
		case 3 :
			diadelasemana = "Miercoles";
			break;
		case 4 :
			diadelasemana = "Jueves";
			break;
			
		case 5 :
			diadelasemana = "Viernes";
			break;
			
		case 6 :
			diadelasemana = "Sabado";
			break;
			
		case 7 :
			diadelasemana = "Domingo";
			break;
			
			default:
			JOptionPane.showMessageDialog(null, "No me has dado un numero de dia correcto illo");
			
			break;
		}
		
		JOptionPane.showMessageDialog(null, "el dia de la semana que has elejido es " +diadelasemana);

	}

}

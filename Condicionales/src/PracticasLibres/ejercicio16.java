package PracticasLibres;

import javax.swing.JOptionPane;

public class ejercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    String cadena;
	    
	    cadena = JOptionPane.showInputDialog(null,"introduce una cadena de texto cualquiera");
	    
	    if(cadena.contains("Millaray")) {
	    	JOptionPane.showMessageDialog(null, "tu cadena de texto contiene digitos");
	    }else {
	    	
	    	JOptionPane.showMessageDialog(null," tu cadena de texto no contiene digitos");
	    }

	}

}

package PracticasLibres;

import javax.swing.JOptionPane;

public class ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//programa para convertir de un numero de kilogramso a cualquier otra medida
		
		char opcion;
		int kilogramos;
		
		JOptionPane.showMessageDialog(null, "Hola, bienvenido al programa de conversion de kilogramos a cualquier medida inferior en cuanto a kilos");
		
		kilogramos = Integer.parseInt(JOptionPane.showInputDialog(null,"Dame el numero de kilogramos que tienes"));
		
		opcion = JOptionPane.showInputDialog(null, "Elige la unida de medida a la que quieres convertir esos kilogramos, aqui te doy las siguientes opciones : \n 1 : Hectogramos "
				+ " \n 2 : Decagramos \n 3 : Gramos \n 4 : Decigramos \n 5 : Centigramos \n 6 : Miligramos").charAt(0);

	
	
	if(opcion == '1') {
		JOptionPane.showMessageDialog(null,"has elegido la opcion de hectogramos por lo que tus kilogramos convertidos a hectogramos son " + (kilogramos * 10));
	}else if(opcion == '2') {
		JOptionPane.showMessageDialog(null,"has elegido la opcion de decagramos, por lo que tus kilogramos convertidos a decagramos son " + (kilogramos * 100));
	}else if(opcion == '3') {
		JOptionPane.showMessageDialog(null, "Has elegido la opcion de gramos, por lo que tus kilogramos convertidos a gramos son " + (kilogramos * 1000));
	}else if(opcion == '4') {
		JOptionPane.showMessageDialog(null, "Has elegido la opcion de gramos, por lo que tus kilogramos convertidos a gramos son " + (kilogramos * 10000));
	}else if(opcion == '5') {
		JOptionPane.showMessageDialog(null, "Has elegido la opcion de gramos, por lo que tus kilogramos convertidos a gramos son " + (kilogramos * 100000));
	}else if(opcion == '6') {
		JOptionPane.showMessageDialog(null, "Has elegido la opcion de gramos, por lo que tus kilogramos convertidos a gramos son " + (kilogramos * 1000000));
	}else {
		
		JOptionPane.showMessageDialog(null, "No has elegido ningun valor de medida existente");

}
}
}

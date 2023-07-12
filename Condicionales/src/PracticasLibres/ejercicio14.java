package PracticasLibres;
import javax.swing.JOptionPane;

public class ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int saldoinicial = 1000;
		int ingresar;
		int retirar;
		char operacion;
		
		JOptionPane.showMessageDialog(null, "Bienvenido al cajero de Unicaja :v, tu saldo actual es de " + saldoinicial + "Euros");
		
		operacion = JOptionPane.showInputDialog(null, "Ingresame el tipo de operacion que quieras realizar, | Presiona 1 | para ingresar dinero"
				+ "| Presiona 2 | para retirar dinero, | Presiona 3 | para salir del sistema").charAt(0);
		
		if(operacion == '1') {
			ingresar = Integer.parseInt(JOptionPane.showInputDialog("Cuanto quieres ingresar en tu cuenta?"));
			JOptionPane.showMessageDialog(null, "Tu saldo Actual es " + (ingresar + saldoinicial));
			
		}else if(operacion == '2') {
			retirar = Integer.parseInt(JOptionPane.showInputDialog("Cuanto quieres retirar de tu cuenta?"));
			if(retirar > saldoinicial) {
				JOptionPane.showMessageDialog(null,"No puedes retirar mas de lo que tienes en la cuenta, imbecil");
			}else if(retirar <= saldoinicial) {
			
			JOptionPane.showMessageDialog(null, "Tu saldo Actual es " + (saldoinicial - retirar));
			
		}
		else if(operacion == '3') {
			JOptionPane.showMessageDialog(null,"Has salido del Sistema, Hasta luego");
		}else {
			JOptionPane.showMessageDialog(null, "Me has introducido de manera incorrecta las opciones");
		}
		

	}

}
}

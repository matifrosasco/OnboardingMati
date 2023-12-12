import javax.swing.JOptionPane;
import java.util.Scanner;
public class Ejercicios {

	public static void main(String[] args) {
		Vocales vocal=new Vocales();
		Operaciones op1=new Operaciones();
		Turismo viaje=new Turismo();
		
		Scanner e=new Scanner(System.in);
		JOptionPane.showMessageDialog(null, "Ejercicio 1, introduce una vocal en la consola");
		System.out.println("Introduce una vocal");
		char voc=e.next().charAt(0);
		vocal.DameVocal(voc);
		JOptionPane.showMessageDialog(null, "Pasamos al ejercicio 2");
		int numero1=Integer.parseInt(JOptionPane.showInputDialog("Ingresar el monto"));
		int numero2=Integer.parseInt(JOptionPane.showInputDialog("Ingresar otro monto"));
		op1.sumar(numero1, numero2);
		op1.resultado();
		op1.esPar();
		JOptionPane.showMessageDialog(null, "Pasamos al ejercicio 3");
		viaje.dondeViajar(Integer.parseInt(JOptionPane.showInputDialog("Introduce tus ahorros en pesos")));
	}
}


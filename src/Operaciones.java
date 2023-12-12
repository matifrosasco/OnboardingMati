import javax.swing.JOptionPane;

public class Operaciones {
		int suma;
		int resta;
		int division;
		int multiplicacion;
		int total;	
	public void sumar(int num1, int num2) {
		if(num2==0) {
			System.out.println("No se puede dividir entre 0");
			return;
		}
		total=(num1+num2)+(num1-num2)+(num1/num2)+(num1*num2);
	}
	public void resultado(){
		System.out.println("El resultado es: " + total);	
	}
	public void esPar() {
		if(total%2==0) {
			System.out.println("El numero es par");
		}else {
			System.out.println("El numero es impar");
		}
	}	
}

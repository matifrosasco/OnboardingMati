/*Desarrollar un método que reciba por parámetro una vocal e indique que número de orden (del 1 al 5)
  le corresponde a dicha vocal. En caso de recibir algún dato que no sea String retornar null.*/

public class Vocales {
		public void DameVocal(char vocal){
			char vocalMinuscula = Character.toLowerCase(vocal);
			
		switch (vocalMinuscula) {
			case 'a':
				System.out.println("Esta en la posicion 1");
				break;
			case 'e':
				System.out.println("Esta en la posicion 2");
				break;
			case 'i':
				System.out.println("Esta en la posicion 3");
				break;
			case 'o':
				System.out.println("Esta en la posicion 4");
				break;
			case 'u':
				System.out.println("Esta en la posicion 5");
				break;	
			default:
	            System.out.println("No es una vocal válida.");
	            break;
			}	
		}
	}

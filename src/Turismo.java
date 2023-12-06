
public class Turismo {
		
	final int dolar=950;
	final int real=200;	
	public void dondeViajar(int ahorro) {
		int ahorroDolares=ahorro/dolar;
		int ahorroReales=ahorro/real;
		if(ahorroDolares==600 || ahorroReales==800 ) {
			System.out.println("Puede viajar a Suiza");	
		}else if(ahorroDolares >=1000) {
			System.out.println("Puede viajar a EEUU");	
		}else if(ahorroDolares==200 & ahorroReales==2000 ) {
			System.out.println("Puede viajar a Brasil");	
		}else if(ahorroDolares <200 || ahorroReales<500 ) {
			System.out.println("Vaya al rio nomas");
		}else {
			System.out.println("Busca opciones mas economicas");
		}
		
	}
}

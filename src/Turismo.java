public class Turismo {
		
	final int dolar=950;
	final int real=200;	
	public void dondeViajar(int ahorro) {
		int ahorroDolares=ahorro/dolar;
		int ahorroReales=ahorro/real;
		
		System.out.println("\nCon $" + ahorro + " tiene " + ahorroDolares + " USD y " + ahorroReales
				+ " R$, por lo tanto: " );
		if(ahorroDolares>=600 || ahorroReales>=800 ) {
			System.out.println("\n-Puede viajar a Suiza");
			
		}if(ahorroDolares >=1000) {
			System.out.println("-Puede viajar a EEUU");	
			
		}if(ahorroDolares>=200 & ahorroReales>=2000 ) {
			System.out.println("-Puede viajar a Brasil");
			
		}else {
			System.out.println("-Busca opciones más económicas");
		}	
	}
}

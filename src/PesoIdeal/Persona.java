package PesoIdeal;

public class Persona {
	private String nombre = "";
	private int edad = 0;
	private int dni;
	private String sexo = "masculino";
	private double peso = 1;
	private double altura = 1;
	double peso_ideal;

	// constructor por defecto
	public Persona() {
		this("prueba", 0,"masculino",1,1);
	}

	// constructor con 2 parametros, el resto por defecto
	public Persona(String nombre, int edad, String sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}

	// constructor con todos los atributos por parametro
	public Persona(String nombre, int edad, String sexo, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}

	public String calcularIMC() {
		peso_ideal = peso / (Math.pow(altura, 2));
		if (peso_ideal < 20) {
			return "Esta por debajo del peso ideal.";
		}
		if (peso_ideal > 25) {
			return "Esta con sobrepeso.";
		} else {
			return "Esta en un peso ideal.";
		}
	}

	public String esMayorDeEdad() {
		if (edad >= 18) {
			return "Es mayor de edad";
		} else {
			return "No es mayor de edad";
		}
	}

	public void generaDni() { // Metodo SET
		dni = (int) (Math.random() * 100000000);
	}

	public String tuDni() { // Metodo GET
		return "Su numero de dni es: " + dni;
	}

	public String datosGenerales() { // Metodo GET
		return "Su nombre es " + nombre + " y tiene " + edad + " años." + " Es de sexo " + sexo + " pesa " + peso
				+ " kg y mide " + altura;
	}

	public void tuNombre(String nom) { // Metodo SET
		nombre = nom;
	}

	public void tuEdad(int edad) { // Metodo SET
		this.edad = edad;
	}

	public void tuSexo(String sexo) { // Metodo SET
		this.sexo = sexo;
	}

	public void tuPeso(double peso) { // Metodo SET
		this.peso = peso;
	}

	public void tuAltura(double altura) { // Metodo SET
		this.altura = altura;
	}

}

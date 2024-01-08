package PesoIdeal;

import java.util.Scanner;

public class TuPeso {

	public static void main(String[] args) {

		/*
		 * Persona persona1=new Persona("Sofia",35,"Mujer",62,1.76); Persona
		 * persona2=new Persona("Juan",17,"Hombre"); Persona persona3=new Persona();
		 * persona3.tuNombre("Maria"); persona3.tuEdad(28); persona3.tuSexo("Femenino");
		 * persona3.tuPeso(85); persona3.tuAltura(1.80); persona1.generaDni();
		 * persona2.generaDni(); persona3.generaDni();
		 * System.out.println("Informacion persona 1: " + persona1.datosGenerales());
		 * System.out.println(persona1.calcularIMC());
		 * System.out.println(persona1.esMayorDeEdad());
		 * System.out.println("Informacion persona 2: " + persona2.datosGenerales());
		 * System.out.println(persona2.calcularIMC());
		 * System.out.println(persona2.esMayorDeEdad());
		 * System.out.println("Informacion persona 3: " + persona3.datosGenerales());
		 * System.out.println(persona3.calcularIMC());
		 * System.out.println(persona3.esMayorDeEdad());
		 */

		Persona[] misPersonas = new Persona[3];
		
		misPersonas[0] = new Persona("Sofia", 35, "femenino", 62, 1.76);
		misPersonas[1] = new Persona("Juan", 17, "masculino");
		misPersonas[2] = new Persona();
	
		misPersonas[2].tuNombre("Lucas");
		misPersonas[2].tuEdad(30);
		misPersonas[2].tuSexo("femenino");
		misPersonas[2].tuPeso(86);
		misPersonas[2].tuAltura(1.67);

		for (Persona e: misPersonas) {
				e.generaDni();
		}
		int i=0;
		for (Persona d: misPersonas) {
			
			int j=i+1;
			System.out.println(
					"Persona "  + j++ +  ": " + d.datosGenerales() + '\n' + "-" + d.calcularIMC()
							+ '\n' + "-" + d.esMayorDeEdad() + '\n' + "-" + d.tuDni());
			System.out.println();
		}
	}
}

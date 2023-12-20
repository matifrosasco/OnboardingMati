import javax.swing.*;
public class apto_fisico {
	
	    int edad;
	    boolean estudios;
	    public static void main(String[] args) {
	    	apto_fisico persona1=new apto_fisico();
	        persona1.requisitos(Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu edad")),(JOptionPane.showInputDialog("Completaste tus estudios? Si o no")));
	        System.out.println(persona1.resultado());
	    }  
	    public void  requisitos(int edad, String estudios){
	        this.edad=edad;
	        this.estudios = estudios.equalsIgnoreCase("si");
	    }
	    public String resultado(){
	        if (edad >= 18 && estudios) {
	            return "Está apto";
	        } else if (edad < 18 && estudios) {
	            return "Sólo puedes competir con un adulto acompañante";
	        } else {
	            return "No apto";
	         }
	    } 
	}


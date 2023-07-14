package proyectoFinalDSlll;

import java.util.List;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class paraProbarClases {
	
	public static void main(String[] args) {
	    	
		//Variables de la Clase Pasajero
    	String nombre;
    	int identificacion;
    	String nacionalidad;
    	
    	//Variables de la Clase Viaje
    	String identificador;
    	String ciudadOrigen;
    	String ciudadDestino;
    	double precio;
    	int numMaxPasajeros;
    	int numActualPasajeros;
    	
    	//Variables de la Clase Compañia
    	int numViaje = 0;
    	
    	//Variables de la Clase Terminal
    	String ciudad;
    	String departamento;
    	int numCompañia;
    	
    	//Variables de la Clase TerminalPrivado
    	int numEmpresa;
    	
    	//Variables de la Clase TerminalPublico
    	double recursosPublicos;
	    
    	
    	identificador = JOptionPane.showInputDialog("Ingrese indentificación: ");
    	ciudadOrigen = JOptionPane.showInputDialog("Ingrese indentificación: ");
    	ciudadDestino = JOptionPane.showInputDialog("Ingrese indentificación: ");
    	precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese indentificación: "));
    	numMaxPasajeros = Integer.parseInt(JOptionPane.showInputDialog("Ingrese precio del Viaje: "));
    	numActualPasajeros = Integer.parseInt(JOptionPane.showInputDialog("Ingrese precio del Viaje: "));
    	
    	
    	Viaje viajes = new Viaje(identificador, ciudadOrigen, ciudadDestino, precio, numMaxPasajeros, numActualPasajeros, null);
    	
    	viajes.getIdentificador();
    	viajes.insertarPasajero(null);
    	
    	
    	
	    }
}

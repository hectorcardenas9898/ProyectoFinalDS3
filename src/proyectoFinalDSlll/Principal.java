package proyectoFinalDSlll;

import java.util.List;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Principal {
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
    	
    	
    	nombre = JOptionPane.showInputDialog("Ingrese Nombre");
    	identificacion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese identificación: "));
    	nacionalidad = JOptionPane.showInputDialog("Ingrese Nacionalidad: ");
    	
    	Pasajero pasajeros = new Pasajero(nombre, identificacion ,nacionalidad);
    	
    	pasajeros.getNombre();
    	pasajeros.getNacionalidad();
    	pasajeros.getNacionalidad();
    	
    	
    	
   
    }
}
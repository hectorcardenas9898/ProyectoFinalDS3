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
		ArrayList<Pasajero> listaPasajeros;
		
		//Variables de la Clase Compañia
		int numViaje = 0;
		String nombreC;
		ArrayList<Viaje> listaViajes;
		
		//Variables de la Clase Terminal
		String nombreT;
		String ciudad;
		String departamento;
		int numCompañia;
		ArrayList<Compañia> listaCompañias;
	
		//Variables de la Clase TerminalPrivado
		int numEmpresa;
		ArrayList<String> empresas;
		
		//Variables de la Clase TerminalPublico
		double recursosPublicos;
		
		//Otras Variables
		int opmenu;
		int opA;

//--------------------------------------------------------	
		
		listaPasajeros = new ArrayList<Pasajero>();
		listaViajes = new ArrayList<Viaje>();
		listaCompañias = new ArrayList<Compañia>() ;
		empresas = new ArrayList<String>();
		
		
		ArrayList<Terminal> listaTerminales = new ArrayList<Terminal>();
		
		listaTerminales.add(new Terminal("Terminal de Transportes de Pereira", "Pereira", "Risaralda"));
		listaTerminales.add(new Terminal("Terminal de Transportes de Armenia", "Armenia", "Quindio"));
		
		
		
		
		opmenu =Integer.parseInt(JOptionPane.showInputDialog( "Bienvenido a la Terminal de Pereira"+"\nSeleccione una Opción: "+
			"\n 1. Consultar Terminales de Destino"+
			"\n 2. Empresas que patrocinan terminales "+
			"\n 3. Compañias para viajan desde el terminal de Pereira"+
			"\n 4. Consultar Viajes por Origen/Destino"));
	
		switch(opmenu){
			case 1:{
				opA = Integer.parseInt(JOptionPane.showInputDialog("Consultar Terminales de Destino"+"\n Seleccione: "+"\n 1.Para Privados"+"\n 2.Para Publicos"));
				switch(opA) {
					case 1:{
						JOptionPane.showMessageDialog(null,"--- Terminales Privados ---");
							for(int i=0;i<listaTerminales.size();i++) {
								JOptionPane.showMessageDialog(null, listaTerminales.get(i).mostrarDatosTerminales());
							}
					}
				}
				
			}
		}
	}  
}
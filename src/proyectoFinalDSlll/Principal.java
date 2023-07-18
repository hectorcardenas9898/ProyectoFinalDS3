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

<<<<<<< Updated upstream
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
=======
		// Clase Pasajero
		nombre = JOptionPane.showInputDialog(null, " Nombre completo del Pasajero ");

		JOptionPane.showMessageDialog(null, " Indica tu tipo de documento ");
		JOptionPane.showMessageDialog(null, " 1. Cedula " + "\n 2. Pasaporte " + " \n 3. Tarjeta de identidad ");

		int opc = Integer.parseInt(JOptionPane.showInputDialog(null, " ¿ Que opcion deseas elegir ? "));

		switch (opc) {
			case 1:

				identificacion = Integer.parseInt(JOptionPane.showInputDialog(null, " Escribe tu numero de cedula"));

				break;
			case 2:

				identificacion = Integer
						.parseInt(JOptionPane.showInputDialog(null, " Escribe tu numero de Pasaporte "));

				break;
			case 3:
				identificacion = Integer.parseInt(JOptionPane.showInputDialog(null, " Escribe tu numero de Tarjeta de identidad "));

				break;

		}
		nacionalidad = JOptionPane.showInputDialog(null, " Escribe la nacionalidad del pasajero ");
		Pasajero infoPasajeros = new Pasajero(nombre, identificacion, nacionalidad);

		// clase Viaje
		Viaje classViaje = new Viaje(identificador, "Pereira", ciudadDestino, precio, numMaxPasajeros,numActualPasajeros);
		
		identificador = JOptionPane.showInputDialog(null," Estimada asesora Indica el numero de de ticket correspondiente ");
		numMaxPasajeros = Integer.parseInt(JOptionPane.showInputDialog(" Indica el número maximo de pasajeros "));
		numActualPasajeros = Integer.parseInt(JOptionPane.showInputDialog(" Cantidad de pasajeros actuales para el viaje  "));
		JOptionPane.showInternalMessageDialog(null, "La ciudad de origen es: " + classViaje.getCiudadOrigen());
		JOptionPane.showMessageDialog(null, " Indica tu ciudad Destino ");
		JOptionPane.showMessageDialog(null, " 1. Medellin " + "\n 2. Cali " + " \n 3. Bogota " + " \n 4. Manizales"+ " \n 5. Cartagena " + "\n 6. Bucaramanga ");
		int opc2 = Integer.parseInt(JOptionPane.showInputDialog(null, " ¿ Cuál es tu destiono a elegir holaaaa ? "));
	}
}
>>>>>>> Stashed changes

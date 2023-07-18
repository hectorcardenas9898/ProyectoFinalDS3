package proyectoFinalDSlll;

import java.util.List;
import java.util.ArrayList;

public class Principal {
<<<<<<< Updated upstream
    public static void main(String[] args) {
       
    	String nombre;
    	String identificacion;
    	String nacionalidad;
    	String identificador;
    	String ciudadOrigen;
    	String ciudadDestino;
    	double precio;
    	int numMaxPasajeros;
    	int numActualPasajeros;
    	int numViaje = 0;
    	String ciudad;
    	String departamento;
    	int numCompañia;
    	int numEmpresa;
    	double recursosPublicos;
    	
    	
    	
    	
    	//Inicializar arraylist de Pasajeros, viaje, empresa, compañia
    }
=======
	private List<Terminal> terminales;

	// Variables de la Clase Pasajero
	String nombre;
	int identificacion;
	String nacionalidad;

	// Variables de la Clase Viaje
	String identificador;
	String ciudadOrigen;
	static String ciudadDestino;
	static double precio = 0;
	static int numMaxPasajeros = 0;
	static int numActualPasajeros = 0;

	// Variables de la Clase Compañia
	int numViaje = 0;
	String nombreC = "";

	// Variables de la Clase Terminal
	String nombreT;
	String ciudad;
	String departamento;
	int numCompañia;

	// Variables de la Clase TerminalPrivado

	// Variables de la Clase TerminalPublico

	public static void main(String[] args) {
		String nombre;
		String identificacion = " ";
		String nacionalidad;
		int opcTerminales;

		// Terminales y compañia

		ArrayList<TerminalPublico> terminalesPublicos = Util.obtenerTerminalesPublicos();
		ArrayList<TerminalPrivado> terminalesPrivados = Util.obtenerTerminalesPrivados();

		String nMenu;

		nMenu = JOptionPane.showInputDialog("Bienvenido al programa, que desea hacer"
				+ "\n1 Ver terminales \nVer recursos de las terminales \n3Ver compañias de las terminales \n4 Ver los viajes por compañia \n5 Que compñia hacer cada viaje");

		int indicador, inumero;
		switch (nMenu) {
			case "1":
				JOptionPane.showMessageDialog(null, "---------------\n Publicos \n"
						+ "--------------------------\n" +
						"1." + terminalesPublicos.get(0).getNombre() + " , " + terminalesPublicos.get(0).getCiudad()
						+ " , Valle del cauca "
						+ "\n2." + terminalesPublicos.get(1).getNombre() + "," + terminalesPublicos.get(1).getCiudad()
						+ ", Antioquia"
						+ "\n3."
						+ terminalesPublicos.get(2).getNombre() + ", " + terminalesPublicos.get(2).getCiudad()
						+ " , Cundinamarca"
						+ "\n--------------------------\n" + "Privadas \n"
						+ "\n--------------------------\n"
						+ "4" + terminalesPrivados.get(0).getNombre() + "," + terminalesPrivados.get(0).getCiudad()
						+ ", Valle del Cauca"
						+ "\n5." + terminalesPrivados.get(1).getNombre() + " , " + terminalesPrivados.get(1).getCiudad()
						+ ", Antioquia"
						+ "\n6."
						+ terminalesPrivados.get(2)
								.getNombre()
						+ ", " + terminalesPrivados.get(2).getCiudad() + ", Cundinamarca");
				break; // case1
			case "2":
				JOptionPane.showMessageDialog(null, "---------------\n Publicos \n"
						+ "--------------------------\n" +
						"1." + terminalesPublicos.get(0).getNombre()
						+ "\n2." + terminalesPublicos.get(1).getNombre()
						+ "\n3."
						+ terminalesPublicos.get(2).getNombre()
						+ "\n--------------------------\n" + "Privadas \n"
						+ "\n--------------------------\n"
						+ "4" + terminalesPrivados.get(0).getNombre()
						+ "\n5." + terminalesPrivados.get(1).getNombre()
						+ "\n6."
						+ terminalesPrivados.get(2)
								.getNombre());
				indicador = Integer.parseInt(JOptionPane.showInputDialog("De cual terminal desea ver los recursos: "));
				if (indicador == 1 || indicador == 2 || indicador == 3) {
					inumero = indicador - 1;
					JOptionPane.showMessageDialog(null, terminalesPublicos.get(inumero).getNombre()
							+ " Y sus recursos son " + terminalesPublicos.get(inumero).getRecursosPublicos());
				} else {
					if (indicador == 4 || indicador == 5 || indicador == 6) {
						inumero = indicador - 4;
						JOptionPane.showMessageDialog(null, terminalesPrivados.get(inumero).getNombre()
								+ " Y lo patrocinan:  " + terminalesPrivados.get(inumero).getEmpresas());

					}

				} // if123

				break;// case 2
			case "3":
				JOptionPane.showMessageDialog(null,
						" ************************* \n" + " Destinos Disponibles \n" +
								"************************* \n");

				JOptionPane.showMessageDialog(null, " Elegi la terminal que deseas \n" +
						"--------------------------\n"
						+ " Publicas \n"
						+ "--------------------------\n" +
						"A." + terminalesPublicos.get(0).getNombre() + "\nB." +
						terminalesPublicos.get(1).getNombre() + "\nC."
						+ terminalesPublicos.get(2).getNombre() + "\n--------------------------\n" +
						"Privadas \n"
						+ "\n--------------------------\n" + "D" +
						terminalesPrivados.get(0).getNombre()
						+ "\nE." + terminalesPrivados.get(1).getNombre() + "\n F." +
						terminalesPrivados.get(2).getNombre());
				ciudadDestino = JOptionPane.showInputDialog(" Elige tu destino ");

				switch (ciudadDestino) {
					case "A":
						JOptionPane.showMessageDialog(null,
								" *************************************\n" +
										" Bienvenido a tu destino Cali \n"
										+ " *************************************\n");
						JOptionPane.showMessageDialog(null,
								" Que Compañia deseas \n " + "PÚBLICAS\n" + "A."
										+ terminalesPublicos.get(0).getCompañia(0).getNombreC()
										+ "\n " + "B."
										+ terminalesPublicos.get(0).getCompañia(1).getNombreC());
						JOptionPane.showMessageDialog(null,
								" Que Compañia deseas \n " + "PRIVADAS\n" + "A." +
										terminalesPrivados.get(0).getCompañia(3));

						break;
					case "B":
						JOptionPane.showMessageDialog(null,
								" *************************************\n" +
										" Bienvenido a tu destino Medellín \n"
										+ " *************************************\n");
						JOptionPane.showMessageDialog(null,
								" Que Compañia deseas \n " + "A." +
										terminalesPublicos.get(1).getCompañia(0).getNombreC()
										+ "\n " + "B.\n"
										+ terminalesPublicos.get(1).getCompañia(1).getNombreC());

						break;
					case "C":
						JOptionPane.showMessageDialog(null,
								" *************************************\n" +
										" Bienvenido a tu destino Bogotá \n"
										+ " *************************************\n");
						JOptionPane.showMessageDialog(null,
								" Que Compañia deseas \n " + "A.\n" +
										terminalesPublicos.get(2).getCompañia(0).getNombreC()
										+ "\n " + "B.\n"
										+ terminalesPublicos.get(2).getCompañia(1).getNombreC());

						break;
					default:
						JOptionPane.showMessageDialog(null, "No existe");
						break;
				}

				break;// case 3
			default:
				JOptionPane.showMessageDialog(null, "No existe");
				break;
		}// MenuPrincipal

		/*
		 * JOptionPane.showMessageDialog(null,
		 * " ************************* \n" + " Destinos Disponibles \n" +
		 * "************************* \n");
		 * 
		 * /*
		 * JOptionPane.showMessageDialog(null, " Elegi la terminal que deseas \n" +
		 * "--------------------------\n"
		 * + " Publicas \n"
		 * + "--------------------------\n" +
		 * "A." + terminalesPublicos.get(0).getNombre() + "\nB." +
		 * terminalesPublicos.get(1).getNombre() + "\nC."
		 * + terminalesPublicos.get(2).getNombre() + "\n--------------------------\n" +
		 * "Privadas \n"
		 * + "\n--------------------------\n" + "D" +
		 * terminalesPrivados.get(0).getNombre()
		 * + "\nE." + terminalesPrivados.get(1).getNombre() + "\n F." +
		 * terminalesPrivados.get(2).getNombre());
		 * ciudadDestino = JOptionPane.showInputDialog(" Elige tu destino ");
		 * 
		 * switch (ciudadDestino) {
		 * case "A":
		 * JOptionPane.showMessageDialog(null,
		 * " *************************************\n" +
		 * " Bienvenido a tu destino Cali \n"
		 * + " *************************************\n");
		 * JOptionPane.showMessageDialog(null,
		 * " Que Compañia deseas \n " + "PÚBLICAS\n" + "A."
		 * + terminalesPublicos.get(0).getCompañia(0).getNombreC()
		 * + "\n " + "B."
		 * + terminalesPublicos.get(0).getCompañia(1).getNombreC());
		 * JOptionPane.showMessageDialog(null,
		 * " Que Compañia deseas \n " + "PRIVADAS\n" + "A." +
		 * terminalesPrivados.get(0).getCompañia(3));
		 * 
		 * break;
		 * case "B":
		 * JOptionPane.showMessageDialog(null,
		 * " *************************************\n" +
		 * " Bienvenido a tu destino Medellín \n"
		 * + " *************************************\n");
		 * JOptionPane.showMessageDialog(null,
		 * " Que Compañia deseas \n " + "A." +
		 * terminalesPublicos.get(1).getCompañia(0).getNombreC()
		 * + "\n " + "B.\n"
		 * + terminalesPublicos.get(1).getCompañia(1).getNombreC());
		 * 
		 * break;
		 * case "C":
		 * JOptionPane.showMessageDialog(null,
		 * " *************************************\n" +
		 * " Bienvenido a tu destino Bogotá \n"
		 * + " *************************************\n");
		 * JOptionPane.showMessageDialog(null,
		 * " Que Compañia deseas \n " + "A.\n" +
		 * terminalesPublicos.get(2).getCompañia(0).getNombreC()
		 * + "\n " + "B.\n"
		 * + terminalesPublicos.get(2).getCompañia(1).getNombreC());
		 * 
		 * break;
		 * 
		 * }
		 * 
		 * // Datos del
		 * //
		 * pasajero---------------------------------------------------------------------
		 * ---
		 * ArrayList<Pasajero> listaPasajeros = new ArrayList<Pasajero>();
		 * 
		 * nombre = JOptionPane.showInputDialog(null, " Nombre completo del Pasajero ");
		 * 
		 * JOptionPane.showMessageDialog(null, " Indica tu tipo de documento ");
		 * JOptionPane.showMessageDialog(null, " 1. Cedula " + "\n 2. Pasaporte " +
		 * " \n 3. Tarjeta de identidad ");
		 * 
		 * int opc = Integer.parseInt(JOptionPane.showInputDialog(null,
		 * " ¿ Que opcion deseas elegir ? "));
		 * 
		 * switch (opc) {
		 * case 1:
		 * 
		 * identificacion = JOptionPane.showInputDialog(null,
		 * " Escribe tu numero de cedula");
		 * 
		 * break;
		 * case 2:
		 * 
		 * identificacion = JOptionPane.showInputDialog(null,
		 * " Escribe tu numero de Pasaporte ");
		 * 
		 * break;
		 * case 3:
		 * 
		 * identificacion = JOptionPane.showInputDialog(null,
		 * " Escribe tu numero de Tarjeta de identidad ");
		 * 
		 * break;
		 * 
		 * }
		 * 
		 * nacionalidad = JOptionPane.showInputDialog(null,
		 * " Escribe la nacionalidad del pasajero ");
		 * 
		 * Pasajero datPasajero = new Pasajero(nombre, identificacion, nacionalidad);
		 * 
		 * listaPasajeros.add(datPasajero);
		 * 
		 * for (int i = 0; i < listaPasajeros.size(); i++) {
		 * JOptionPane.showMessageDialog(null,
		 * " El nombre completo del pasajero es: " + listaPasajeros.get(i).getNombre());
		 * 
		 * JOptionPane.showMessageDialog(null, " LA identtificacion del pasajero es: " +
		 * listaPasajeros.get(i).getIdentificacion());
		 * JOptionPane.showMessageDialog(null,
		 * " La Nacionalidad del pasajero es : " +
		 * listaPasajeros.get(i).getNacionalidad());
		 * 
		 * }
		 * 
		 * // hasta aca llega la
		 * //
		 * prueba-----------------------------------------------------------------------
		 * -------
		 * 
		 * numMaxPasajeros = Integer.parseInt(JOptionPane.
		 * showInputDialog(" Indica el número maximo de pasajeros "));
		 * 
		 * numActualPasajeros = Integer
		 * .parseInt(JOptionPane.
		 * showInputDialog(" Cantidad de pasajeros actuales para el viaje  "));
		 * // Mostrar mensaje de si hay sillas disponibles o no //Pendiente
		 * /* JOptionPane.showMessageDialog(null, " "+insertarPasajero());
		 */

	}

>>>>>>> Stashed changes
}
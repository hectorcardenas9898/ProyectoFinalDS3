package proyectoFinalDSlll;

import java.util.List;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Principal {
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
	int numEmpresa;

	// Variables de la Clase TerminalPublico

	public static void main(String[] args) {
		String nombre;
		String identificacion = " ";
		String nacionalidad;
		int opcTerminales;

		// Terminales y compañia

		ArrayList<TerminalPublico> terminalesPublicos = Util.obtenerTerminalesPublicos();

		// terminalesPublicos.get(1).getCompañia(0).getNombreC();

		JOptionPane.showMessageDialog(null,
				" ************************* \n" + " Destinos Disponibles \n" + "************************* \n");

		JOptionPane.showMessageDialog(null, " Elegi la terminal que deseas \n" +
				"A." + terminalesPublicos.get(0).getNombre() + "\nB." + terminalesPublicos.get(1).getNombre() + "\nC."
				+ terminalesPublicos.get(2).getNombre());
		ciudadDestino = JOptionPane.showInputDialog(" Elige tu destino ");

		switch (ciudadDestino) {
			case "A":
				JOptionPane.showMessageDialog(null,
						" *************************************\n" + " Bienvenido a tu destino Cali \n"
								+ " *************************************\n");
				JOptionPane.showMessageDialog(null,
						" Que Compañia deseas \n " + "A." + terminalesPublicos.get(0).getCompañia(0).getNombreC()
								+ "\n " + "B."
								+ terminalesPublicos.get(0).getCompañia(1).getNombreC());

				break;
			case "B":
				JOptionPane.showMessageDialog(null,
						" *************************************\n" + " Bienvenido a tu destino Medellín \n"
								+ " *************************************\n");
				JOptionPane.showMessageDialog(null,
						" Que Compañia deseas \n " + "A." + terminalesPublicos.get(1).getCompañia(0).getNombreC()
								+ "\n " + "B.\n"
								+ terminalesPublicos.get(1).getCompañia(1).getNombreC());

				break;
			case "C":
				JOptionPane.showMessageDialog(null,
						" *************************************\n" + " Bienvenido a tu destino Bogotá \n"
								+ " *************************************\n");
				JOptionPane.showMessageDialog(null,
						" Que Compañia deseas \n " + "A.\n" + terminalesPublicos.get(2).getCompañia(0).getNombreC()
								+ "\n " + "B.\n"
								+ terminalesPublicos.get(2).getCompañia(1).getNombreC());

				break;

		}

		// Datos del
		// pasajero------------------------------------------------------------------------
		ArrayList<Pasajero> listaPasajeros = new ArrayList<Pasajero>();

		nombre = JOptionPane.showInputDialog(null, " Nombre completo del Pasajero ");

		JOptionPane.showMessageDialog(null, " Indica tu tipo de documento ");
		JOptionPane.showMessageDialog(null, " 1. Cedula " + "\n 2. Pasaporte " + " \n 3. Tarjeta de identidad ");

		int opc = Integer.parseInt(JOptionPane.showInputDialog(null, " ¿ Que opcion deseas elegir ? "));

		switch (opc) {
			case 1:

				identificacion = JOptionPane.showInputDialog(null, " Escribe tu numero de cedula");

				break;
			case 2:

				identificacion = JOptionPane.showInputDialog(null, " Escribe tu numero de Pasaporte ");

				break;
			case 3:

				identificacion = JOptionPane.showInputDialog(null, " Escribe tu numero de Tarjeta de identidad ");

				break;

		}

		nacionalidad = JOptionPane.showInputDialog(null, " Escribe la nacionalidad del pasajero ");

		Pasajero datPasajero = new Pasajero(nombre, identificacion, nacionalidad);

		listaPasajeros.add(datPasajero);

		for (int i = 0; i < listaPasajeros.size(); i++) {
			JOptionPane.showMessageDialog(null,
					" El nombre completo del pasajero es: " + listaPasajeros.get(i).getNombre());

			JOptionPane.showMessageDialog(null, " LA identtificacion del pasajero es: " +
					listaPasajeros.get(i).getIdentificacion());
			JOptionPane.showMessageDialog(null,
					" La Nacionalidad del pasajero es : " + listaPasajeros.get(i).getNacionalidad());

		}
		// hasta aca llega la
		// prueba------------------------------------------------------------------------------

		numMaxPasajeros = Integer.parseInt(JOptionPane.showInputDialog(" Indica el número maximo de pasajeros "));

		numActualPasajeros = Integer
				.parseInt(JOptionPane.showInputDialog(" Cantidad de pasajeros actuales para el viaje  "));
		// Mostrar mensaje de si hay sillas disponibles o no //Pendiente
		/* JOptionPane.showMessageDialog(null, " "+insertarPasajero()); */

	}

}
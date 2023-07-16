package proyectoFinalDSlll;

import java.util.List;

import javax.swing.JOptionPane;

import java.util.ArrayList;

public class Principal {
	public static void main(String[] args) {

		String nombre;
		int identificacion = 0;
		String nacionalidad;

		String identificador;
		String ciudadOrigen;
		String ciudadDestino;
		double precio = 0;
		int numMaxPasajeros = 0;
		int numActualPasajeros = 0;
		int numViaje = 0;
		String ciudad;
		String departamento;
		int numCompañia;
		int numEmpresa;
		double recursosPublicos;

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

				identificacion = Integer
						.parseInt(JOptionPane.showInputDialog(null, " Escribe tu numero de Tarjeta de identidad "));

				break;

		}

		nacionalidad = JOptionPane.showInputDialog(null, " Escribe la nacionalidad del pasajero ");

		Pasajero infoPasajeros = new Pasajero(nombre, identificacion, nacionalidad);

		// clase Viaje

		Viaje classViaje = new Viaje(identificador, "Pereira", ciudadDestino, precio, numMaxPasajeros,
				numActualPasajeros);

		identificador = JOptionPane.showInputDialog(null,
				" Estimada asesora Indica el numero de de ticket correspondiente ");

		numMaxPasajeros = Integer.parseInt(JOptionPane.showInputDialog(" Indica el número maximo de pasajeros "));

		numActualPasajeros = Integer
				.parseInt(JOptionPane.showInputDialog(" Cantidad de pasajeros actuales para el viaje  "));

		JOptionPane.showInternalMessageDialog(null, "La ciudad de origen es: " + classViaje.getCiudadOrigen());

		JOptionPane.showMessageDialog(null, " Indica tu ciudad Destino ");

		JOptionPane.showMessageDialog(null, " 1. Medellin " + "\n 2. Cali " + " \n 3. Bogota " + " \n 4. Manizales"
				+ " \n 5. Cartagena " + "\n 6. Bucaramanga ");

		int opc2 = Integer.parseInt(JOptionPane.showInputDialog(null, " ¿ Cuál es tu destiono a elegir ? "));

	}
}
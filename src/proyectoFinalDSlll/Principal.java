package proyectoFinalDSlll;

import java.util.List;

import javax.swing.JOptionPane;

import java.util.ArrayList;

public class Principal {
	private static String ciudadDestino;

	public static void main(String[] args) {
		// Pasajero
		String nombre;
		String identificacion = "";
		String nacionalidad;
		// Viaje
		String ciudadOrigen;
		double precio = 0;
		int numMaxPasajeros = 0;
		int numActualPasajeros = 0;
		int numViaje = 0;
		Viaje listaViajes[]; // Instancia arreglo lista Viajes
		// Pasajero listaPasajeros[];
		int opc2;
		// clase terminal
		String ciudad;
		String departamento;
		int numCompañia;
		int numEmpresa;
		double recursosPublicos;

		// Clase Pasajero
		// List<Pasajero> listaPasajeros = new ArrayList<>();
		List<String> listaPasajeros = new ArrayList<String>();
		int resp = 0;

		do {
			JOptionPane.showMessageDialog(null, " Ingresa los datos ");

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

				// listaPasajeros.add(Pasajero);

			}
			nacionalidad = JOptionPane.showInputDialog(null, " Escribe la nacionalidad del pasajero ");

			listaPasajeros.add(nombre);
			listaPasajeros.add(identificacion);
			listaPasajeros.add(nacionalidad);

			Pasajero infoPasajeros = new Pasajero(nombre, identificacion, nacionalidad);

			resp = Integer.parseInt(
					JOptionPane.showInputDialog(null, " Deseas seguir llenando datos del pasajero 1.Si / 2.No "));

		} while (resp == 1);

		// ------------------------------------------------------------------------------------------------------------------
		// clase Viaje
		numMaxPasajeros = Integer.parseInt(JOptionPane.showInputDialog(" Indica el número maximo de pasajeros "));

		numActualPasajeros = Integer
				.parseInt(JOptionPane.showInputDialog(" Cantidad de pasajeros actuales para el viaje  "));

		opc2 = Integer.parseInt(JOptionPane.showInputDialog(null, " ¿ Cuantos destinos quieres visitar   ? "));

		listaViajes = new Viaje[opc2];

		for (int i = 0; i < opc2; i++) {
			JOptionPane.showMessageDialog(null, " Indica tu ciudad Destino ");

			JOptionPane.showMessageDialog(null, " A. Medellin " + "\n B. Cali " + " \n C. Bogota " + " \n D. Manizales"
					+ " \n E. Cartagena " + "\n F. Bucaramanga ");

			String ciudadDestino = JOptionPane.showInputDialog(null, " ¿ Cuál es tu destiono a elegir  ? ");

			switch (ciudadDestino) {
				case "A":
					JOptionPane.showMessageDialog(null, " Haz elegido MEDELLÍN ");
					JOptionPane.showMessageDialog(null, " Precios ");
					JOptionPane.showMessageDialog(null, " 1. 65.000 " + "\n 85.000 ");
					/* getprecio */ precio = Integer
							.parseInt(JOptionPane.showInputDialog(null, " ¿ Que precio deseas elegir "));

					break;
				case "B":
					JOptionPane.showMessageDialog(null, " Haz elegido CALI ");
					JOptionPane.showMessageDialog(null, " Precios ");
					JOptionPane.showMessageDialog(null, " 1. 65.000 " + "\n 85.000 ");
					/* getprecio */ precio = Integer
							.parseInt(JOptionPane.showInputDialog(null, " ¿ Que precio deseas elegir "));

					break;
				case "C":
					JOptionPane.showMessageDialog(null, " Haz elegido BOGOTA ");
					JOptionPane.showMessageDialog(null, " Precios ");
					JOptionPane.showMessageDialog(null, " 1. 65.000 " + "\n 85.000 ");
					/* getprecio */ precio = Integer
							.parseInt(JOptionPane.showInputDialog(null, " ¿ Que precio deseas elegir "));

					break;
				case "D":
					JOptionPane.showMessageDialog(null, " Haz elegido MANIZALES ");
					JOptionPane.showMessageDialog(null, " Precios ");
					JOptionPane.showMessageDialog(null, " 1. 65.000 " + "\n 85.000 ");
					/* getprecio */ precio = Integer
							.parseInt(JOptionPane.showInputDialog(null, " ¿ Que precio deseas elegir "));

					break;
				case "E":
					JOptionPane.showMessageDialog(null, " Haz elegido CARTAGENA ");
					JOptionPane.showMessageDialog(null, " Precios ");
					JOptionPane.showMessageDialog(null, " 1. 65.000 " + "\n 85.000 ");
					/* getprecio */ precio = Integer
							.parseInt(JOptionPane.showInputDialog(null, " ¿ Que precio deseas elegir "));
					break;
				case "F":
					JOptionPane.showMessageDialog(null, " Haz elegido BUCARAMANGA ");
					JOptionPane.showMessageDialog(null, " Precios ");
					JOptionPane.showMessageDialog(null, " 1. 65.000 " + "\n 85.000 ");
					/* getprecio */ precio = Integer
							.parseInt(JOptionPane.showInputDialog(null, " ¿ Que precio deseas elegir "));
					break;

			}

		}

		String identificador = JOptionPane.showInputDialog(null,
				" Estimada asesora Indica el numero de de ticket correspondiente ");

		Viaje classViaje = new Viaje(identificador, "Pereira", ciudadDestino, precio, numMaxPasajeros,
				numActualPasajeros);

	}
}

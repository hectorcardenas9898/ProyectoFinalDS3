package proyectoFinalDSlll;

import java.util.List;

import javax.print.attribute.standard.JobHoldUntil;
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

		String opcTerminales, opcPrincipal, opcPrincipal1, patrocinios;
		int RepMenu;

		Viaje preciosViaje[] = new Viaje[10];

		preciosViaje[0] = new Viaje(12098, "Pereira", "Cali", 60000, 2, 1);

		preciosViaje[1] = new Viaje(12098, "Pereira", "Cali", 90000, 2, 1);

		preciosViaje[2] = new Viaje(12098, "Pereira", "Medellin", 65000, 2, 1);

		preciosViaje[3] = new Viaje(12098, "Pereira", "Medellin", 60000, 2, 1);

		preciosViaje[4] = new Viaje(12098, "Pereira", "Bogota", 90000, 2, 1);
		preciosViaje[5] = new Viaje(12098, "Pereira", "Bogota", 120000, 2, 1);
		preciosViaje[6] = new Viaje(12098, "Pereira ", "Cali", 80000, 2, 1);
		preciosViaje[7] = new Viaje(12098, "Pereira", "Medellin", 90000, 2, 1);
		preciosViaje[8] = new Viaje(12098, "Pereira", "Bogotá", 140000, 2, 1);

		// Es para llamar los datos del utilitario de estas terminales.
		ArrayList<TerminalPublico> terminalesPublicos = Util.obtenerTerminalesPublicos();
		ArrayList<TerminalPrivado> terminalesPrivados = Util.obtenerTerminalesPrivados();

		terminalesPublicos.get(0).getCompañia(0).insertarViaje(preciosViaje[0]);
		terminalesPublicos.get(0).getCompañia(1).insertarViaje(preciosViaje[1]);
		terminalesPublicos.get(1).getCompañia(0).insertarViaje(preciosViaje[2]);
		terminalesPublicos.get(1).getCompañia(1).insertarViaje(preciosViaje[3]);
		terminalesPublicos.get(2).getCompañia(0).insertarViaje(preciosViaje[4]);
		terminalesPublicos.get(2).getCompañia(1).insertarViaje(preciosViaje[5]);

		do {

			opcPrincipal = JOptionPane.showInputDialog(" Elige la opcion que deseas visualizar \n" +
					" ********************************** \n" + "A. DESTINOS DISPONIBLES \n"
					+ "B. TERMINALES GESTIONADAS" + "\nC. PATROCINIOS TP\n"
					+ "********************************** \n");

			switch (opcPrincipal) {
				case "A":

					JOptionPane.showMessageDialog(null,
							" Elegi la terminal que deseas \n" + "--------------------------\n"
									+ "PUBLICAS\n"
									+ "--------------------------\n" +
									"A." + terminalesPublicos.get(0).getNombre() + "\nB."
									+ terminalesPublicos.get(1).getNombre()
									+ "\nC."
									+ terminalesPublicos.get(2).getNombre()
									+ "\n--------------------------\n"
									+ "PRIVADAS\n" + "\n--------------------------\n" + "D."
									+ terminalesPrivados.get(0).getNombre() + "\nE."
									+ terminalesPrivados.get(1).getNombre() + "\nF."
									+ terminalesPrivados.get(2).getNombre());

					ciudadDestino = JOptionPane.showInputDialog(" Elige tu destino ");
					JOptionPane.showMessageDialog(null, " Viajes disponibles ");

					switch (ciudadDestino) {
						case "A":
							JOptionPane.showMessageDialog(null,
									" *************************************\n" + " Bienvenido a tu destino Cali \n"
											+ " *************************************\n");
							JOptionPane.showMessageDialog(null,
									" Que Compañia deseas \n " + "PÚBLICAS\n" + "A."
											+ terminalesPublicos.get(0).getCompañia(0).getNombreC()
											+ "\n " + "B."
											+ terminalesPublicos.get(0).getCompañia(1).getNombreC());
							opcTerminales = JOptionPane.showInputDialog(null, " ¿Con cual compañia deseas viajar ? ");
							switch (opcTerminales) {
								case "A":
									JOptionPane.showMessageDialog(null,
											" Haz elegido la compañia "
													+ terminalesPublicos.get(0).getCompañia(0).getNombreC());
									break;

								case "B":
									JOptionPane.showMessageDialog(null,
											" Haz elegido la compañia "
													+ terminalesPublicos.get(0).getCompañia(1).getNombreC());
									break;

							}
							JOptionPane.showMessageDialog(null,
									"Viajes disponibles de PerCal\n" + "A." + " Precio " + preciosViaje[0].Precio()
											+ "\n" + //
											"B." +
											"Precio " + preciosViaje[1].Precio());
							opcTerminales = JOptionPane.showInputDialog("¿Que valor deseas?");
							switch (opcTerminales) {
								case "A":
									JOptionPane.showMessageDialog(null,
											" Para finalizar con la compra Completa los siguientes datos ");
									terminalesPublicos.get(0).getCompañia(0).getViaje(0).insertarPasajero();
									break;

								case "B":
									JOptionPane.showMessageDialog(null,
											" Para finalizar con la compra Completa los siguientes datos ");
									terminalesPublicos.get(0).getCompañia(1).getViaje(0).insertarPasajero();
									break;

							}

							break;
						case "B":
							JOptionPane.showMessageDialog(null,
									" *************************************\n" + " Bienvenido a tu destino Medellín \n"
											+ " *************************************\n");
							JOptionPane.showMessageDialog(null,
									" Que Compañia deseas \n " + "A."
											+ terminalesPublicos.get(1).getCompañia(0).getNombreC()
											+ "\n " + "B."
											+ terminalesPublicos.get(1).getCompañia(1).getNombreC());
							opcTerminales = JOptionPane.showInputDialog(null, " ¿Con cual compañia deseas viajar ? ");
							switch (opcTerminales) {
								case "A":
									JOptionPane.showMessageDialog(null,
											" Haz elegido la compañia "
													+ terminalesPublicos.get(1).getCompañia(0).getNombreC());
									break;

								case "B":
									JOptionPane.showMessageDialog(null,
											" Haz elegido la compañia "
													+ terminalesPublicos.get(1).getCompañia(1).getNombreC());
									break;

							}
							JOptionPane.showMessageDialog(null,
									"Viajes disponibles de PerMed\n" + "A." + " Precio " + preciosViaje[2].Precio()
											+ "\n" + //
											"B." +
											"Precio " + preciosViaje[3].Precio());
							opcTerminales = JOptionPane.showInputDialog("¿Que valor deseas?");
							switch (opcTerminales) {
								case "A":
									JOptionPane.showMessageDialog(null,
											" Para finalizar con la compra Completa los siguientes datos ");
									terminalesPublicos.get(1).getCompañia(0).getViaje(0).insertarPasajero();
									break;

								case "B":
									JOptionPane.showMessageDialog(null,
											" Para finalizar con la compra Completa los siguientes datos ");

									terminalesPublicos.get(1).getCompañia(1).getViaje(0).insertarPasajero();
									break;

							}

							break;
						case "C":
							JOptionPane.showMessageDialog(null,
									" *************************************\n" + " Bienvenido a tu destino Bogotá \n"
											+ " *************************************\n");
							JOptionPane.showMessageDialog(null,
									" Que Compañia deseas \n " + "A.\n"
											+ terminalesPublicos.get(2).getCompañia(0).getNombreC()
											+ "\n " + "B.\n"
											+ terminalesPublicos.get(2).getCompañia(1).getNombreC());
							opcTerminales = JOptionPane.showInputDialog(null, " ¿Con cual compañia deseas viajar ? ");
							switch (opcTerminales) {
								case "A":
									JOptionPane.showMessageDialog(null,
											" Haz elegido la compañia "
													+ terminalesPublicos.get(2).getCompañia(0).getNombreC());
									break;

								case "B":
									JOptionPane.showMessageDialog(null,
											" Haz elegido la compañia "
													+ terminalesPublicos.get(2).getCompañia(1).getNombreC());
									break;

							}
							JOptionPane.showMessageDialog(null,
									"Viajes disponibles de PerBog \n" + "A." + " Precio " + preciosViaje[4].Precio()
											+ "\n"
											+ //
											"B." +
											"Precio " + preciosViaje[5].Precio());
							opcTerminales = JOptionPane.showInputDialog("¿Que valor deseas?");
							switch (opcTerminales) {
								case "A":
									JOptionPane.showMessageDialog(null,
											" Para finalizar con la compra Completa los siguientes datos ");
									terminalesPublicos.get(2).getCompañia(0).getViaje(0).insertarPasajero();
									break;

								case "B":
									JOptionPane.showMessageDialog(null,
											" Para finalizar con la compra Completa los siguientes datos ");
									terminalesPublicos.get(2).getCompañia(1).getViaje(0).insertarPasajero();
									break;

							}

							break;

						// TERMINALES PRIVADAS
						case "D":
							JOptionPane.showMessageDialog(null,
									" *****************************************\n"
											+ " Bienvenido a tu Terminal Privada de Calí \n"
											+ " ****************************************\n");
							JOptionPane.showMessageDialog(null,
									" COMPAÑIA DISPONIBLE: \n " + "A."
											+ terminalesPrivados.get(0).getCompañia(0).getNombreC());
							JOptionPane.showMessageDialog(null,
									" Haz elegido la compañia "
											+ terminalesPrivados.get(0).getCompañia(0).getNombreC() + "con un valor de "
											+ preciosViaje[6].Precio());
							JOptionPane.showMessageDialog(null,
									" Para finalizar con la compra Completa los siguientes datos ");
							terminalesPublicos.get(2).getCompañia(0).getViaje(0).insertarPasajero();

							break;

						case "E":
							JOptionPane.showMessageDialog(null,
									" ****************************************\n"
											+ " Bienvenido a tu Terminal Privada de Medellín \n"
											+ " ****************************************\n");
							JOptionPane.showMessageDialog(null,
									" COMPAÑIA DISPONIBLE: \n " + "A."
											+ terminalesPrivados.get(1).getCompañia(0).getNombreC());
							JOptionPane.showMessageDialog(null,
									" Haz elegido la compañia "
											+ terminalesPrivados.get(1).getCompañia(0).getNombreC() + "con un valor de "
											+ preciosViaje[7].Precio());
							JOptionPane.showMessageDialog(null,
									" Para finalizar con la compra Completa los siguientes datos ");
							terminalesPublicos.get(2).getCompañia(0).getViaje(0).insertarPasajero();

							break;

						case "F":
							JOptionPane.showMessageDialog(null,
									" ****************************************\n"
											+ " Bienvenido a tu Terminal Privada de Bogotá \n"
											+ " ****************************************\n");
							JOptionPane.showMessageDialog(null,
									" COMPAÑIA DISPONIBLE: \n " + "A."
											+ terminalesPrivados.get(2).getCompañia(0).getNombreC());
							JOptionPane.showMessageDialog(null,
									" Haz elegido la compañia "
											+ terminalesPrivados.get(2).getCompañia(0).getNombreC() + "con un valor de "
											+ preciosViaje[8].Precio());
							JOptionPane.showMessageDialog(null,
									" Para finalizar con la compra Completa los siguientes datos ");
							terminalesPublicos.get(2).getCompañia(0).getViaje(0).insertarPasajero();
							break;

					}
					break;
				// fin del case A
				// case para GESTION DE TERMINALES
				case "B":
					opcPrincipal1 = JOptionPane.showInputDialog(
							" Marca la opcion de la terminal que deseas para conocer sus recursos publicos y el numero de viaje \n"
									+
									"Terminales gestionados \n" + "\n Terminales Publicas \n" + "\n1."
									+ terminalesPublicos.get(0).getNombre() + "\nUbicada en la ciudad de: "
									+ terminalesPublicos.get(0).getCiudad() + "\nEn el pais de -> "
									+ terminalesPublicos.get(0).getPais() + "\n2."
									+ terminalesPublicos.get(1).getNombre() + "\nUbicada en la ciudad de: "
									+ terminalesPublicos.get(1).getCiudad() + "\nEn el pais de -> "
									+ terminalesPublicos.get(1).getPais() + "\n3."
									+ terminalesPublicos.get(2).getNombre() + "\nUbicada en la ciudad de: "
									+ terminalesPublicos.get(2).getCiudad() + "\nEn el pais de -> "
									+ terminalesPublicos.get(2).getPais());

					switch (opcPrincipal1) {
						case "1":
							JOptionPane.showMessageDialog(null,
									" La terminal de Cali Ve!! cuenta con los siguientes recuros publicos "
											+ terminalesPublicos.get(0).getRecursosPublicos()
											+ " Y su respectivo numero de viaje corresponde a -> "
											+ terminalesPublicos.get(0).getNumeroCompañia());
							break;

						case "2":
							JOptionPane.showMessageDialog(null,
									" La terminal de Medellin cuenta con los siguientes recuros publicos "
											+ terminalesPublicos.get(1).getRecursosPublicos()
											+ " Y su respectivo numero de viaje corresponde a -> "
											+ terminalesPublicos.get(1).getNumeroCompañia());
							break;

						case "3":
							JOptionPane.showMessageDialog(null,
									" La terminal de Medellin cuenta con los siguientes recuros publicos "
											+ terminalesPublicos.get(2).getRecursosPublicos()
											+ " Y su respectivo numero de viaje corresponde a -> "
											+ terminalesPublicos.get(2).getNumeroCompañia());
							break;
					}

					break;

				case "C":
					patrocinios = JOptionPane
							.showInputDialog(" Seleccione el terminal del cual desea ver el patrocinio " +
									"\n Terminales privadas\n" + "\n1." + terminalesPrivados.get(0).getNombre() + "\n2."
									+ terminalesPrivados.get(1).getNombre() + "\n3."
									+ terminalesPrivados.get(2).getNombre());
					switch (patrocinios) {
						case "1":
							JOptionPane.showMessageDialog(null,
									"PATROCINIOS DE LA TERMINAL" + terminalesPrivados.get(0).getCompañia(0));

							break;
						case "2":
							break;
						case "3":
							break;
					}

					break;

			}

			RepMenu = Integer.parseInt(JOptionPane.showInputDialog(" Si deseas regresar al menú anterior marca 1"));
			if (RepMenu != 1) {
				System.exit(0);
			}

		} while (RepMenu == 1);
	}

}
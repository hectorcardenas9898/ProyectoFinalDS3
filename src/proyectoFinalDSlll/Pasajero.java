package proyectoFinalDSlll;

import javax.swing.JOptionPane;

public class Pasajero {

	private String nombre;
	private int identificacion;
	private String nacionalidad;

	public Pasajero(String n, int p, String nacio) {

		this.nombre = n;
		this.identificacion = p;
		this.nacionalidad = nacio;
	}

	public String getNombre() {
		nombre = JOptionPane.showInputDialog(null, " Nombre completo del Pasajero ");

		return nombre;

	}

	public int getIdentificacion() {

		identificacion = Integer.parseInt(JOptionPane.showInputDialog(null, " ¿ Que opcion deseas elegir ? "));
		JOptionPane.showMessageDialog(null, " 1. Cedula ");
		JOptionPane.showMessageDialog(null, " 2. Pasaporte ");
		JOptionPane.showMessageDialog(null, " 3. Tarjeta de identidad ");

		switch (identificacion) {
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
		return identificacion;

	}

	public String getNacionalidad() {
		nacionalidad = JOptionPane.showInputDialog(null, " Escribe la nacionalidad del pasajero ");
		return nacionalidad;
	}

}

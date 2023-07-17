package proyectoFinalDSlll;

import javax.swing.JOptionPane;

public class Pasajero {

	private String nombre;
	private String identificacion;
	private String nacionalidad;

	public Pasajero(String nombre, String identificacion, String nacionalidad) {

		this.nombre = nombre;
		this.identificacion = identificacion;
		this.nacionalidad = nacionalidad;
	}

	public String Nombre() {
		return nombre;

	}

	public String Identificacion() {
		return identificacion;

	}

	public String Nacionalidad() {
		return nacionalidad;
	}

}

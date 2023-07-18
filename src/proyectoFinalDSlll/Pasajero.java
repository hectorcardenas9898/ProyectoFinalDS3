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

	public String getNombre() {
		return nombre;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

}

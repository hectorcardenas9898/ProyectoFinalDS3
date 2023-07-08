package proyectoFinalDSlll;

public class Pasajero {

	private String nombre;
	private String identificacion;
	private String nacionalidad;
	
	public Pasajero(String n, String p, String nacio) {
	
		this.nombre = n;
		this.identificacion = p;
		this.nacionalidad = nacio;
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

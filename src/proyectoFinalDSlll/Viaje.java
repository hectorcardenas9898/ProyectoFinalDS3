package proyectoFinalDSlll;

public class Viaje {

	private String identificador;
	private String ciudadOrigen;
	private String ciudadDestino;
	private double precio;
	private int numMaxPasajeros;
	private int numActualPasajeros;
	Pasajero listaPasajeros[];

	public Viaje(String id, String ciudadO, String ciudadD, double precio, int numMaxPasajeros,
			int numActualPasajeros) {

		this.identificador = id;
		this.ciudadOrigen = ciudadO;
		this.ciudadDestino = ciudadD;
		this.precio = precio;
		this.numMaxPasajeros = numMaxPasajeros;
		this.numActualPasajeros = numActualPasajeros;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void insertarPasajero(){
		pasajero = p;
	}

	public String getCiudadOrigen() {
		return ciudadOrigen;
	}

	public String getCiudadDestino() {
		return ciudadDestino;
	}

	public double getPrecio() {
		return precio;
	}

	public int getNumMaxPasajeros() {
		return numMaxPasajeros;
	}

	public int getNumActualPasajeros() {
		return numActualPasajeros;
	}

	public int getPasajero(){
		pasajero = i;
		return pasajero; 
	}

	public String getPasajero(){
		pasajero = pasaporte;
		return pasajero;

	}


	
	
	
	
}

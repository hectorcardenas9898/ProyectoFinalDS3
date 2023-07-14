package proyectoFinalDSlll;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Viaje {

    private String identificador;
    private String ciudadOrigen;
    private String ciudadDestino;
    private double precio;
    private int numMaxPasajeros;
    private int numActualPasajeros;
    private List<Pasajero> listaPasajeros;

    public Viaje(String identificador, String ciudadOrigen, String ciudadDestino, double precio, int numMaxPasajeros, int numActualPasajeros, List<Pasajero> listaPasajeros) {
    	
        this.identificador = identificador;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.precio = precio;
        this.numMaxPasajeros = numMaxPasajeros;
        this.numActualPasajeros = numActualPasajeros;
        this.listaPasajeros = listaPasajeros;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void insertarPasajero(Pasajero p) {
        if (numActualPasajeros < numMaxPasajeros) {
            listaPasajeros.add(p);
            numActualPasajeros++;
        } else {
			JOptionPane.showMessageDialog(null,"No se puede agregar más pasajeros, se alcanzó el número máximo");
        }
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

    public Pasajero getPasajero(int i) {
        if (i >= 0 && i < listaPasajeros.size()) {
            return listaPasajeros.get(i);
        } else {
            JOptionPane.showMessageDialog(null, "Índice fuera de rango");
        }
		return null;
    }

    public Pasajero getPasajero(String identificador) {
        for (Pasajero pasajero : listaPasajeros) {
            if (pasajero.getPasaporte().equals(identificador)) {
                return pasajero;
            }else {
            	JOptionPane.showMessageDialog(null, "No se encontró ningún pasajero con éste número de pasaporte");
            }
        }
		return null;
    }
}

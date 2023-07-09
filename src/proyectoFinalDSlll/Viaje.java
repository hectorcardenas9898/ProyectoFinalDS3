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

    public Viaje(String id, String ciudadO, String ciudadD, double precio, int numMaxPasajeros, int numActualPasajeros) {
    	
        this.identificador = id;
        this.ciudadOrigen = ciudadO;
        this.ciudadDestino = ciudadD;
        this.precio = precio;
        this.numMaxPasajeros = numMaxPasajeros;
        this.numActualPasajeros = numActualPasajeros;
        this.listaPasajeros = new ArrayList<>();
    }

    public String getidentificador() {
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
    }

    public Pasajero getPasajero(String pasaporte) {
        for (Pasajero pasajero : listaPasajeros) {
            if (pasajero.getPasaporte().equals(pasaporte)) {
                return pasajero;
            }else {
            	JOptionPane.showMessageDialog(null, "No se encontró ningún pasajero con éste número de pasaporte");
            }
        }
    }
}

package proyectoFinalDSlll;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Viaje {

    private String identificador;
    private String ciudadOrigen = "PEREIRA";
    private String ciudadDestino;
    private double precio;
    private int numMaxPasajeros;
    private int numActualPasajeros;
    public String[] listaViajes;
    static ArrayList<Pasajero> listaPasajeros;

    public Viaje(String id, String ciudadO, String ciudadD, double precio, int numMaxPasajeros,
            int numActualPasajeros) {

        this.identificador = id;
        this.ciudadOrigen = ciudadO;
        this.ciudadDestino = ciudadD;
        this.precio = precio;
        this.numMaxPasajeros = numMaxPasajeros;
        this.numActualPasajeros = numActualPasajeros;
        this.listaPasajeros = new ArrayList<>();
    }

    // numero de viaje
    public String getIdentificador() {
        return identificador;
    }

    // lista de pasajeros
    public void insertarPasajero(Pasajero identificacion) {
        if (numActualPasajeros < numMaxPasajeros) {
            listaPasajeros.add(identificacion);
            JOptionPane.showMessageDialog(null, " Asientos disponibles ");
            numActualPasajeros++;
        } else {
            JOptionPane.showMessageDialog(null, "No se puede agregar más pasajeros, se alcanzó el número máximo");
        }
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public double Precio() {
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

    public Pasajero getPasajero(String identificacion) {

        for (Pasajero pasajero : listaPasajeros) {
            if (pasajero.getIdentificacion().equals(getIdentificador())) {
                return pasajero;
            } else {
                JOptionPane.showMessageDialog(null,
                        "No se encontró ningún pasajero con éste número de pasaporte");
            }
        }

        return null;
    }
}

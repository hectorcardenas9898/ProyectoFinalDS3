package proyectoFinalDSlll;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Viaje {

    private String identificador;
    private String ciudadOrigen = "PEREIRA";
    private String ciudadDestino;
    private double precio;
    private int numMaxPasajeros;
    private int numActualPasajeros;
    public String[] listaViajes;
    ArrayList<Pasajero> listaPasajeros;

    public Viaje(int id, String ciudadO, String ciudadD, int precio, int numMaxPasajeros, int numActualPasajeros) {

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
    public void insertarPasajero() {
        if (listaPasajeros.size() < numMaxPasajeros) {
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del pasajero");
            String id = JOptionPane.showInputDialog("Ingrese la identificación del pasajero");
            String nacionalidad = JOptionPane.showInputDialog("Ingrese la nacionalidad del pasajero");
            Pasajero pasajero = new Pasajero(nombre, id, nacionalidad);

            listaPasajeros.add(pasajero);

            JOptionPane.showMessageDialog(null, "Pasajero agregado exitosamente.");
        } else {
            JOptionPane.showMessageDialog(null, "No hay cupo disponible en este viaje.");
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
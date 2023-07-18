package proyectoFinalDSlll;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Compañia {

    private String nombreC;
    private List<Viaje> listaViajes;
    private int numViaje;

    public Compañia(String nombreC, int numViaje) {
        this.nombreC = nombreC;
        this.numViaje = numViaje;
    }

    public Compañia(String nombreC, Viaje[] listaViajes) {
        this.nombreC = nombreC;
        this.listaViajes = new ArrayList<>();

    }

    public void insertarViaje(Viaje viaje) {
        listaViajes.add(viaje);
        numViaje++;
    }

    public String getNombreC() {
        return nombreC;
    }

    public int getNumeroViaje() {
        return numViaje;
    }

    public Viaje getViaje(int i) {

        if (i >= 0 && i < listaViajes.size()) {
            return listaViajes.get(i);
        } else {
            JOptionPane.showMessageDialog(null, "Índice fuera de rango");
        }

        return getViaje(i);
    }

    public Viaje getViaje(String id) {

        for (Viaje viaje : listaViajes) {
            if (viaje.getIdentificador().equals(id)) {
                return viaje;
            } else {
                JOptionPane.showMessageDialog(null,
                        "Viaje no encontrado con el ID especificado");
            }
        }

        return getViaje(id);

    }
}

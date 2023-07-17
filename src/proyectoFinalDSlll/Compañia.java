package proyectoFinalDSlll;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Compañia {

	private String nombreC;
	private ArrayList<Viaje> listaViajes;
	private int numViaje = 0;
	
	public Compañia(String nombre) {
        this.nombreC = nombre;
    }

    public Compañia(String nombreC, ArrayList<Viaje> listaViajes, int numViaje) {
        this.nombreC = nombreC;
        this.listaViajes = new ArrayList<>();
        this.numViaje = numViaje;
    }

    public void insertarViaje(Viaje viaje) {
        listaViajes.add(viaje);
        numViaje++;
    }

    public String getNombre() {
        return nombreC;
    }

    public int getNumeroViaje() {
        return numViaje;
    }

    public Viaje getViaje(int i) {
        if	(i >= 0 && i < listaViajes.size()) {
            return listaViajes.get(i);
        } else {
        	JOptionPane.showMessageDialog(null, "Índice fuera de rango");
        }
		return null;
    }

    public Viaje getViaje(String id) {
        for (Viaje viaje : listaViajes) {
            if (viaje.getIdentificador().equals(id)) {
                return viaje;
            }else {
            	JOptionPane.showMessageDialog(null, "Viaje no encontrado con el ID especificado");
            }
        }
		return null;
    }	
}

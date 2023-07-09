package proyectoFinalDSlll;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Compañia {

	private String nombre;
	private List<Viaje> listaViajes;
	private int numViaje;
	
	public Compañia(String n) {
        this.nombre = n;
    }

    public Compañia(String n, List<Viaje> v) {
        this.nombre = n;
        this.listaViajes = v;
        this.numViaje = listaViajes.size();
    }

    public void insertarViaje(Viaje viaje) {
        listaViajes.add(viaje);
        numViaje++;
    }

    public String getNombre() {
        return nombre;
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
    }

    public Viaje getViaje(String id) {
        for (Viaje viaje : listaViajes) {
            if (viaje.getId().equals(id)) {
                return viaje;
            }else {
            	JOptionPane.showMessageDialog(null, "Viaje no encontrado con el ID especificado");
            }
        }
    }
	
	
	
	
}

package proyectoFinalDSlll;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Terminal {

	private String nombre;
    private String ciudad;
    private String departamento;
    private List<Compañia> listaCompañias;
    private int numCompañia;

    public Terminal(String n, String c, String p) {
        this.nombre = n;
        this.ciudad = c;
        this.departamento = p;
    }

    public Terminal(String n, String c, String p, List<Compañia> co, int numCompania) {
        this.nombre = n;
        this.ciudad = c;
        this.departamento = p;
        this.listaCompañias = new ArrayList<>();
        this.numCompañia = 0;
    }

    public void InsertarCompañia(Compañia compañia) {
        listaCompañias.add(compañia);
        numCompañia++;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getPais() {
        return departamento;
    }
    
    //Duda con el return
    public Compañia obtenerCompañias() {
        return (Compañia) listaCompañias;
    }
    
    /*public Compañia[] obtenerCompañias() {
        return listaCompañias.toArray(new Compañia[0]);
    }*/

    public int getNumeroCompañia() {
        return numCompañia;
    }

    public Compañia getCompañia(int i) {
        if (i >= 0 && i < numCompañia) {
            return listaCompañias.get(i);
        }else {
        	JOptionPane.showMessageDialog(null, "Indice fuera de rango");
        }
		return null;
    }

    public Compañia getCompañia(String nombre) {
        for (Compañia compañia : listaCompañias) {
            if (compañia.getNombre().equals(nombre)) {
                return compañia;
            }
        }
        return null;
    }
}

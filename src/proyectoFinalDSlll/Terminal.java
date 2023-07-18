package proyectoFinalDSlll;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Terminal {

    private String nombreC;
    private String ciudad;
    private String departamento;
    private List<Compañia> listaCompañias;
    private int numCompañia;

    public Terminal(String n, String c, String p) {
        this.nombreC = n;
        this.ciudad = c;
        this.departamento = p;
    }

    public Terminal(String n, String c, String p, List<Compañia> co, int numCompania) {
        this.nombreC = n;
        this.ciudad = c;
        this.departamento = p;
        this.listaCompañias = co;
        this.numCompañia = numCompania;
    }

    public void InsertarCompañia(Compañia compañia) {
        listaCompañias.add(compañia);
        numCompañia++;
    }

    public String getNombre() {
        return nombreC;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getPais() {
        return departamento;
    }

    // Duda con el return
    public Compañia obtenerCompañias() {
        return (Compañia) listaCompañias;
    }

    /*
     * public Compañia[] obtenerCompañias() {
     * return listaCompañias.toArray(new Compañia[0]);
     * }
     */

    public int getNumeroCompañia() {
        return numCompañia;
    }

    public Compañia getCompañia(int i) {
        return listaCompañias.get(i);
    }

    public Compañia getCompañia(String nombre) {
        for (Compañia compañia : listaCompañias) {
            if (compañia.getNombreC().equals(nombre)) {
                return compañia;
            }
        }
        return null;
    }
}

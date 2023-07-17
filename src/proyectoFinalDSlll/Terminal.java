package proyectoFinalDSlll;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Terminal {

	private String nombreT;
    private String ciudad;
    private String departamento;
    protected ArrayList<Compañia> listaCompañias;
    private int numCompañia;

    public Terminal(String nombreT, String ciudad, String departamento) {
        this.nombreT = nombreT;
        this.ciudad = ciudad;
        this.departamento = departamento;
    }

    public Terminal(String nombreT, String ciudad, String departamento, ArrayList<Compañia> listaCompañias, int numCompania) {
        this.nombreT = nombreT;
        this.ciudad = ciudad;
        this.departamento = departamento;
        this.listaCompañias = new ArrayList<>();
        this.numCompañia = 0;
    }

    public void InsertarCompañia(Compañia compañia) {
        listaCompañias.add(compañia);
        numCompañia++;
    }

    public String getNombre() {
        return nombreT;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getDepartamento() {
        return departamento;
    }
    
    //Duda con el return
    public List<Compañia> obtenerCompañias() {
        return listaCompañias;
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
    
    public String mostrarDatosTerminales() {
		return "nombre: "+nombreT+"\n Ciudad: "+ciudad+"\n Departamento: "+departamento;
	}
}

package proyectoFinalDSlll;

import java.util.ArrayList;

public class TerminalPrivado extends Terminal {
	
	private ArrayList<String> empresas;
    private int numEmpresa;
	
	public TerminalPrivado(String nombreT, String ciudad, String departamento, ArrayList<Compañia> listaCompañias, ArrayList<String> empresas, int numEmpresa) {
		super(nombreT, ciudad, departamento, listaCompañias, numEmpresa);
		this.empresas = new ArrayList<>();
		this.numEmpresa = numEmpresa;
	}
	
	public int getNumEmpresas() {
		return numEmpresa;
	}

    public void insertarEmpresa(String empresa) {
        insertarEmpresa(empresa);
        numEmpresa++;
    }

    public String getEmpresas() {
        String listaEmpresas = "";
        for (int i = 0; i < empresas.size(); i++) {
            listaEmpresas += empresas.get(i) + "\n";
        }
        return listaEmpresas;
    }
    
    
   /* public String getEmpresas() {
        // Construir una cadena con todas las empresas separadas por comas
        StringBuilder sb = new StringBuilder();
        for (Empresa empresa : listaEmpresas) {
        	sb.append(empresa.getNombre()).append(", ");
        }
        int length = sb.length();
        if (length > 2) {
            sb.delete(length - 2, length);  // Eliminar la última coma y espacio
        }
        return sb.toString();
    }*/
	
	

}

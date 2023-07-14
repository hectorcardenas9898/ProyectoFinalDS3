package proyectoFinalDSlll;

import java.util.ArrayList;
import java.util.List;

public class TerminalPrivado extends Terminal {
	
	private List<String> empresas;
    private int numEmpresa;
	
	public TerminalPrivado(String n, String c, String p, List<Compañia> co, List<String> e, int numEmpresa) {
		super(n, c, p, co, numEmpresa);
		this.empresas = e;
	}

    public void insertarEmpresas(Empresa empresa) {
        // Agregar la empresa al arreglo de empresas
        empresas.add(empresa);
        numEmpresa++;
    }

    public String getEmpresas() {
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
    }
	
	

}

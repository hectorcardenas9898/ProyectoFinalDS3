package proyectoFinalDSlll;

import java.util.ArrayList;
import java.util.List;

public class TerminalPrivado extends Terminal {
	
	private List<Empresa> listaEmpresas;
    private int numEmpresa;
	
	public TerminalPrivado(String n, String c, String p) {
		super(n, c, p);
	}
	
	public TerminalPrivado(String n, String c, String p, List<Compañia> co, List<Empresa> e, int numEmpresa) {
		super(n, c, p, co);
		this.listaEmpresas = new ArrayList<>();
        this.numEmpresa = numEmpresa;
	}

    public void insertarEmpresas(Empresa empresa) {
        // Agregar la empresa al arreglo de empresas
        listaEmpresas.add(empresa);
        numEmpresa++;
    }

    public void insertarEmpresa(Empresa empresa) {
        // Agregar la empresa al arreglo de empresas
    	listaEmpresas.add(empresa);
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

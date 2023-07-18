package proyectoFinalDSlll;

import java.util.ArrayList;
import java.util.List;

public class TerminalPrivado extends Terminal {

    private List<String> empresas;
    // private int numEmpresa;

    public TerminalPrivado(String n, String c, String p, List<Compañia> co, List<String> e, int numEmpresa) {
        super(n, c, p, co, numEmpresa);
        this.empresas = e;
    }

    public TerminalPrivado(String n, String c, String p) {
        super(n, c, p);
        this.empresas = new ArrayList<>();
        // this.numEmpresa = 10;
    }

    public void insertarEmpresas(ArrayList<String> empresas) {
        // Agregar la empresa al arreglo de empresas
        this.empresas.addAll(empresas);
    }

    public void insertarEmpresa(String empresa) {
        // Agregar la empresa al arreglo de empresas
        empresas.add(empresa);
    }

    public String getEmpresas() {
        // Construir una cadena con todas las empresas separadas por comas
        StringBuilder sb = new StringBuilder();
        for (String empresa : empresas) {
            sb.append(empresa).append(", ");
        }
        int length = sb.length();
        if (length > 2) {
            sb.delete(length - 2, length); // Eliminar la última coma y espacio
        }
        return sb.toString();
    }

}

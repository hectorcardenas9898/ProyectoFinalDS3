package proyectoFinalDSlll;

import java.util.ArrayList;

public class TerminalPublico extends Terminal{

	private double recursosPublicos;
	
	public TerminalPublico(String nombre, String ciudad, String departamento) {
		super(nombre, ciudad, departamento);
	}
	
	public TerminalPublico(String nombre, String ciudad, String departamento, ArrayList<Compañia> listaCompañias, double recursosPublicos) {
		super(nombre, ciudad, departamento);
		this.recursosPublicos = recursosPublicos;
		this.listaCompañias = new ArrayList<>();
	}
	
	public TerminalPublico(String nombre, String ciudad, String departamento, double recursosPublicos) {
		super(nombre, ciudad, departamento);
		this.recursosPublicos = recursosPublicos;
	}
	
	public double getRecursosPublicos() {
		return recursosPublicos;
	}
}

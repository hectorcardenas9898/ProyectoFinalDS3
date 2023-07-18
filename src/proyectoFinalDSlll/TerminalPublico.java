package proyectoFinalDSlll;

import java.util.ArrayList;

public class TerminalPublico extends Terminal {

	private double recursosPublicos;

	/*
	 * mirar para eliminar
	 * public TerminalPublico(String n, String c, String p) {
	 * super(n, c, p);
	 * }
	 */

	public TerminalPublico(String n, String c, String p, ArrayList<Compañia> co, double recu, int numCompania) {
		super(n, c, p, co, numCompania);
		this.recursosPublicos = recu;
	}

	public TerminalPublico(String n, String c, String p, double recu) {
		super(n, c, p);
		this.recursosPublicos = recu;
	}

	public double getRecursosPublicos() {
		return recursosPublicos;
	}
}

package proyectoFinalDSlll;

public class TerminalPublico extends Terminal{

	private double recursosPublicos;
	
	public TerminalPublico(String n, String c, String p) {
		super(n, c, p);
	}
	
	public TerminalPublico(String n, String c, String p, Compañia[] co, double recu) {
		super(n, c, p, co);
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

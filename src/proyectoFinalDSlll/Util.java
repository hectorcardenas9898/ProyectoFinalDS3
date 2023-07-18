package proyectoFinalDSlll;

import java.util.ArrayList;

public class Util {

    public static ArrayList<TerminalPublico> obtenerTerminalesPublicos() {
        ArrayList<TerminalPublico> terminalesPublicos = new ArrayList<TerminalPublico>();

        // TErminal y compañia 1
        ArrayList<Compañia> companiasT1 = new ArrayList<Compañia>();

        Compañia compania1T1 = new Compañia("Expreso Palmira ", null);

        Compañia compania2T1 = new Compañia(" Bolivariano ", null);

        companiasT1.add(compania1T1);
        companiasT1.add(compania2T1);

        TerminalPublico terminal1 = new TerminalPublico("Termianl de cali", "Cali", "Colombia", companiasT1, 123456,
                123);

        terminalesPublicos.add(terminal1);

        // terminal y compañia 2
        ArrayList<Compañia> companiasT2 = new ArrayList<Compañia>();

        Compañia compania1T2 = new Compañia(" Flota occidental ", null);

        Compañia compania2T2 = new Compañia(" TransArmenia ", null);

        companiasT2.add(compania1T2);
        companiasT2.add(compania2T2);

        TerminalPublico terminal2 = new TerminalPublico("Terminal de Medellin", "Medellin", "Colombia", companiasT2,
                30.00000, 456);

        terminalesPublicos.add(terminal2);
        // terminal y compañia 3
        ArrayList<Compañia> companiasT3 = new ArrayList<Compañia>();

        Compañia compania1T3 = new Compañia(" Flota Bogota ", null);

        Compañia compania2T3 = new Compañia(" Bolivariano ", null);

        companiasT2.add(compania1T3);
        companiasT2.add(compania2T3);

        TerminalPublico terminal3 = new TerminalPublico("Terminal de Bogota", "Bogota", "Colombia", companiasT3,
                45.000000, 789);

        terminalesPublicos.add(terminal3);

        return terminalesPublicos;

    }

    public static ArrayList<TerminalPrivado> obtenerTerminalesPrivados() {
        ArrayList<TerminalPrivado> terminalesPrivados = new ArrayList<TerminalPrivado>();

        // TerminalP y compañia 1 posicion compañia 3 terminal 0
        ArrayList<Compañia> companiasT1privado = new ArrayList<Compañia>();

        Compañia compania1T1p = new Compañia("Expreso Alcala ", null);
        companiasT1privado.add(compania1T1p);

        TerminalPrivado terminal1priv = new TerminalPrivado(" Terminal privada de Cali", "Cali", "Colombia");
        terminalesPrivados.add(terminal1priv);

        ArrayList<Compañia> companiasT2privado = new ArrayList<Compañia>();

        Compañia compania1T2 = new Compañia(" Expreso Antioquia ", null);
        companiasT2privado.add(compania1T2);

        TerminalPrivado terminal2priv = new TerminalPrivado("Terminal privada de Medellin", "Medellin", "Colombia");
        terminalesPrivados.add(terminal2priv);

        ArrayList<Compañia> companiasT3privado = new ArrayList<Compañia>();

        Compañia compania1T3 = new Compañia(" Flota Occidental ", null);
        companiasT3privado.add(compania1T3);

        TerminalPrivado terminal3priv = new TerminalPrivado("Terminal privada de Bogota", "Bogota", "Colombia");
        terminalesPrivados.add(terminal3priv);

        return terminalesPrivados;
    }
}

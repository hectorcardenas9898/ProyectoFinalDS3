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

        companiasT2.add(compania2T1);
        companiasT2.add(compania2T2);

        TerminalPublico terminal2 = new TerminalPublico("Terminal de Medellin", "Medellin", "Colombia", companiasT2,
                30.00000, 456);

        terminalesPublicos.add(terminal2);
        // terminal y compañia 3
        ArrayList<Compañia> companiasT3 = new ArrayList<Compañia>();

        Compañia compania1T3 = new Compañia(" Flota Bogota ", null);

        Compañia compania2T3 = new Compañia(" Bolivariano ", null);

        companiasT2.add(compania2T3);
        companiasT2.add(compania2T3);

        TerminalPublico terminal3 = new TerminalPublico("Terminal de Bogota", "Bogota", "Colombia", companiasT3,
                45.000000, 789);

        terminalesPublicos.add(terminal3);

        return terminalesPublicos;

    }
}

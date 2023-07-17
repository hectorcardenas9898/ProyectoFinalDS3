package proyectoFinalDSlll;

import java.util.List;

import javax.swing.JOptionPane;

import java.util.ArrayList;

public class Principal {
	private static String ciudadDestino;

	public static void main(String[] args) {
		// Pasajero
		String nombre;
		int identificacion = 0;
		String nacionalidad;
		// Viaje
		String ciudadOrigen;
		double precio = 0;
		int numMaxPasajeros = 0;
		int numActualPasajeros = 0;
		int numViaje = 0;
		Viaje listaViajes[]; // Instancia arreglo lista Viajes
		// Pasajero listaPasajeros[];
		int opc2;
		// clase terminal
		String ciudad;
		String departamento;
		int numCompañia;
		int numEmpresa;
		double recursosPublicos;

		// Clase Pasajero
		

		JOptionPane.showMessageDialog(null, " Ingresa los datos ");

		for (int i = 0; i < listaPasajeros.size(); i++) {

			nombre = JOptionPane.showInputDialog(null, " Nombre completo del Pasajero ");

			JOptionPane.showMessageDialog(null, " Indica tu tipo de documento ");
			JOptionPane.showMessageDialog(null, " 1. Cedula " + "\n 2. Pasaporte " + " \n 3. Tarjeta de identidad ");

			int opc = Integer.parseInt(JOptionPane.showInputDialog(null, " ¿ Que opcion deseas elegir ? "));

			switch (opc) {
				case 1:

					identificacion = Integer
							.parseInt(JOptionPane.showInputDialog(null, " Escribe tu numero de cedula"));

					break;
				case 2:

					identificacion = Integer
							.parseInt(JOptionPane.showInputDialog(null, " Escribe tu numero de Pasaporte "));

					break;
				case 3:

					identificacion = Integer
							.parseInt(JOptionPane.showInputDialog(null, " Escribe tu numero de Tarjeta de identidad "));

					break;

			}
			listaPasajeros.add(listaPasajeros);

			nacionalidad = JOptionPane.showInputDialog(null, " Escribe la nacionalidad del pasajero ");

			Pasajero infoPasajeros = new Pasajero(nombre, identificacion, nacionalidad);

		}
		// ------------------------------------------------------------------------------------------------------------------
		// clase Viaje
		numMaxPasajeros = Integer.parseInt(JOptionPane.showInputDialog(" Indica el número maximo de pasajeros "));

		numActualPasajeros = Integer
				.parseInt(JOptionPane.showInputDialog(" Cantidad de pasajeros actuales para el viaje  "));

		opc2 = Integer.parseInt(JOptionPane.showInputDialog(null, " ¿ Cuantos destinos quieres visitar   ? "));

		listaViajes = new Viaje[opc2];

		for (int i = 0; i < opc2; i++) {
			JOptionPane.showMessageDialog(null, " Indica tu ciudad Destino ");

			JOptionPane.showMessageDialog(null, " A. Medellin " + "\n B. Cali " + " \n C. Bogota " + " \n D. Manizales"
					+ " \n E. Cartagena " + "\n F. Bucaramanga ");

			String ciudadDestino = JOptionPane.showInputDialog(null, " ¿ Cuál es tu destiono a elegir  ? ");

			switch (ciudadDestino) {
				case "A":
					JOptionPane.showMessageDialog(null, " Haz elegido MEDELLÍN ");
					JOptionPane.showMessageDialog(null, " Precios ");
					JOptionPane.showMessageDialog(null, " 1. 65.000 " + "\n 85.000 ");
					/* getprecio */ precio = Integer
							.parseInt(JOptionPane.showInputDialog(null, " ¿ Que precio deseas elegir "));

					break;
				case "B":
					JOptionPane.showMessageDialog(null, " Haz elegido CALI ");
					JOptionPane.showMessageDialog(null, " Precios ");
					JOptionPane.showMessageDialog(null, " 1. 65.000 " + "\n 85.000 ");
					/* getprecio */ precio = Integer
							.parseInt(JOptionPane.showInputDialog(null, " ¿ Que precio deseas elegir "));

					break;
				case "C":
					JOptionPane.showMessageDialog(null, " Haz elegido BOGOTA ");
					JOptionPane.showMessageDialog(null, " Precios ");
					JOptionPane.showMessageDialog(null, " 1. 65.000 " + "\n 85.000 ");
					/* getprecio */ precio = Integer
							.parseInt(JOptionPane.showInputDialog(null, " ¿ Que precio deseas elegir "));

					break;
				case "D":
					JOptionPane.showMessageDialog(null, " Haz elegido MANIZALES ");
					JOptionPane.showMessageDialog(null, " Precios ");
					JOptionPane.showMessageDialog(null, " 1. 65.000 " + "\n 85.000 ");
					/* getprecio */ precio = Integer
							.parseInt(JOptionPane.showInputDialog(null, " ¿ Que precio deseas elegir "));

					break;
				case "E":
					JOptionPane.showMessageDialog(null, " Haz elegido CARTAGENA ");
					JOptionPane.showMessageDialog(null, " Precios ");
					JOptionPane.showMessageDialog(null, " 1. 65.000 " + "\n 85.000 ");
					/* getprecio */ precio = Integer
							.parseInt(JOptionPane.showInputDialog(null, " ¿ Que precio deseas elegir "));
					break;
				case "F":
					JOptionPane.showMessageDialog(null, " Haz elegido BUCARAMANGA ");
					JOptionPane.showMessageDialog(null, " Precios ");
					JOptionPane.showMessageDialog(null, " 1. 65.000 " + "\n 85.000 ");
					/* getprecio */ precio = Integer
							.parseInt(JOptionPane.showInputDialog(null, " ¿ Que precio deseas elegir "));
					break;

			}

		}

		String identificador = JOptionPane.showInputDialog(null,
				" Estimada asesora Indica el numero de de ticket correspondiente ");

		Viaje classViaje = new Viaje(identificador, "Pereira", ciudadDestino, precio, numMaxPasajeros,
				numActualPasajeros);

	}
    //clasecomppañia
   
    for (int i = 0; i < listaCompañias.size(); i++) {
    nombre=JOptionPane.showInputDialog( " En el siguiente menú podra visualizar las compañias que hacen parte de la terminal de Transportes ");
    JOptionPane.showMessageDialog(null, "1.Bolivariano "
        + "2.FlotaOccidental"
        + "3.Transportes la Virginia"
        + "4.Velotax");
      
      //queda pendiente la lista de viajes ya que no se tiene infromación
    int opc3=JOptionPane.showInputDialog("Seleccione una opción";

   switch(opc3){
     case 1: 
      JOptionPane.showMessageDialog(null, "Usted ha escogido la Compañia Bolivariana");
           numViaje=2456;
           JOptionPane.showMessageDialog(null, "La empresa está identidicada con el siguiente numero ".getNumeroviaje();
        //acá debe ir el arreglo donde estan los viajes
           JOptionPane.showMessageDialog(null, " Este es el portafolio de viajes de la empresa " +classViaje.Compañia[]);
           break;

    case 2: 
    JOptionPane.showMessageDialog(null, "Usted ha escogido la Compañia Flota Occidental");
           numViaje=2458;
           JOptionPane.showMessageDialog(null, "La empresa está identidicada con el siguiente numero "+getNumeroviaje()
           JOptionPane.showMessageDialog(null, " Este es el portafolio de viajes de la empresa " +classViaje.Compañia[]);
           break;

   case 3: 
    JOptionPane.showMessageDialog(null, "Usted ha escogido la Compañia Transportes la Virginia");
           numViaje=2460;
           JOptionPane.showMessageDialog(null, "La empresa está identidicada con el siguiente numero "+getNumeroviaje();
           JOptionPane.showMessageDialog(null, " Este es el portafolio de viajes de la empresa " +classViaje.Compañia[]);
           break;
   case 4: 
     JOptionPane.showMessageDialog(null, "Usted ha escogido la Compañia Transportes la Velotax");
           numViaje=2463;
           JOptionPane.showMessageDialog(null, "La empresa está identidicada con el siguiente numero "+getNumeroviaje();
           JOptionPane.showMessageDialog(null, " Este es el portafolio de viajes de la empresa " +classViaje.Compañia[]);
           break;
           // para llamar el arreglo toca asignarle otroo nombre

  default:
     JOptionPane.showMessageDialog(null,"Opcion invalida vuelva a ingresar"
     break;

}
    Compañia listaCompañias = new Compañia(nombre,numViaje);
    Viaje classViaje = new Viaje(identificador, "Pereira", ciudadDestino, precio, numMaxPasajeros,
				numActualPasajeros);

     }

     
     
      
      
      
         
     }

    


    
}

package diasSemana;

import java.util.Scanner;

//Inicio del programa y declaración de variables:
/**
 * Programa que dependiendo del número que introduce el usuario de 1 a 7, mostrará en consola un el día de la semana que corresponda
 * @author Yulei
 *
 */
public class DiasSemana {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int numero;
			String cadena = null;
// Solicitud de datos al usuario
			System.out.println("El programa te devuelve el día de la semana seleccionando:");
			System.out.println("1.- Lunes.");
			System.out.println("2.- Martes.");
			System.out.println("3.- Miércoles.");
			System.out.println("4.- Jueves.");
			System.out.println("5.- Viernes.");
			System.out.println("6.- Sábado.");
			System.out.println("7.- Domingo.");
			System.out.println("_____________________________________________________________");
			System.out.print("Dime un número y te digo a qué día de la semana corresponde: ");
			numero = scanner.nextInt();
// Realizamos comparaciones y mostramos el resultado
			cadena = decisionDia(numero);
			System.out.println(cadena);
		}
	}

	/**
	 * @param numeroDia
	 * @return la cadena correspondiente
	 */
	public static String decisionDia(int numeroDia) {
		String cadena;
		switch (numeroDia) {
		case 1:
			cadena = "El día seleccionado es LUNES";
			break;
		case 2:
			cadena = "El día seleccionado es MARTES";
			break;
		case 3:
			cadena = "El día seleccionado es MIÉRCOLES";
			break;
		case 4:
			cadena = "El día seleccionado es JUEVES";
			break;
		case 5:
			cadena = "El día seleccionado es VIERNES";
			break;
		case 6:
			cadena = "El día seleccionado es SÁBADO";
			break;
		case 7:
			cadena = "El día seleccionado es DOMINGO";
			break;
		default:
			cadena = "ERROR: número incorrecto.";
		}
		return cadena;
	}
}
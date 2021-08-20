package utilitarios;

import java.util.Scanner;

public class Lector {

	private static Scanner lectorTeclado = new Scanner(System.in);

	private Lector() {
	}

	public static String leerTexto() {
		return lectorTeclado.next();
	}

	public static long leerNumeroEntero() {

		long dato = 0;
		boolean continuarLectura = true;

		do {
			try {
				dato = lectorTeclado.nextLong();
				continuarLectura = false;
			} catch (Exception excepcion) {
				lectorTeclado.nextLine();
				Impresor.imprimirSalidaError("Número entero no válido. Por favor ingrese un número entero válido...");
			}
		} while (continuarLectura);

		return dato;
	}

	public static double leerNumeroDecimal() {

		double dato = 0;
		boolean continuarLectura = true;

		do {
			try {
				dato = lectorTeclado.nextDouble();
				continuarLectura = false;
			} catch (Exception excepcion) {
				lectorTeclado.nextLine();
				Impresor.imprimirSalidaError("Número decimal no válido. Por favor ingrese un número decimal válido...");
			}
		} while (continuarLectura);

		return dato;
	}
}

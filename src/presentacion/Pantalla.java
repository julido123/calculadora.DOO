package presentacion;

import static presentacion.Menu.mostrarMenuInicial;
import static presentacion.MenuLogin.mostrarMenuLogin;
import static presentacion.Operaciones.operar;
import static utilitarios.Impresor.imprimirSalidaError;
import static utilitarios.Lector.leerNumeroEntero;
import static presentacion.OpcionIngreso.opcionMenuLogin;

import excepcion.OperacionesExcepcion;

public class Pantalla {

	private static void correrAplicacion() {

		do {
			mostrarMenuLogin();
			try {
				opcionMenuLogin(leerNumeroEntero());
			} catch (OperacionesExcepcion excepcion) {
				imprimirSalidaError(excepcion.getMessage());
			}
		} while (true);

	}

	public static void correrCalculadora() {
		do {
			mostrarMenuInicial();
			try {
				operar(leerNumeroEntero());
			} catch (OperacionesExcepcion excepcion) {
				imprimirSalidaError(excepcion.getMessage());
			}
		} while (true);

	}

	public static void main(String[] args) {
		correrAplicacion();
	}
}

package presentacion;

import excepcion.OperacionesExcepcion;

import static utilitarios.Impresor.imprimirSalidaNormal;

import static utilitarios.Lector.leerTexto;
import login.Resgistar;

public class OpcionIngreso {

	public static void opcionMenuLogin(long opcion) {

		switch ((int) opcion) {
		case 1: {
			registrar();
			break;
		}
		case 2: {
			ingresar();
			salir();
			break;
		}

		case 3: {
			salir();
			break;
		}
		default:
			throw new OperacionesExcepcion("Opción " + opcion + " no válida... ");
		}

	}

	private static void registrar() {
		imprimirSalidaNormal("==========INICIO DE REGISTRO=========");
		imprimirSalidaNormal("Por favor ingrese su usuario ");
		String Usuario = leerTexto().toString();

		imprimirSalidaNormal("Por favor ingrese su contraseña ");
		String contraseña = leerTexto();

		Resgistar.registarUsuarioEnARchivo(Usuario, contraseña, "ArchivoConUsuarios.txt");

	}

	private static void ingresar() {
		imprimirSalidaNormal("==========INICIO DE REGISTRO=========");
		imprimirSalidaNormal("Por favor ingrese su usuario ");
		String Usuario = leerTexto().toString();

		imprimirSalidaNormal("Por favor ingrese su contraseña ");
		String contraseña = leerTexto();
		Resgistar.verificarLogin(Usuario, contraseña, "ArchivoConUsuarios.txt");
	}

	private static void salir() {
		System.exit(0);
	}

}
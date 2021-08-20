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
			throw new OperacionesExcepcion("Opci�n " + opcion + " no v�lida... ");
		}

	}

	private static void registrar() {
		imprimirSalidaNormal("==========INICIO DE REGISTRO=========");
		imprimirSalidaNormal("Por favor ingrese su usuario ");
		String Usuario = leerTexto().toString();

		imprimirSalidaNormal("Por favor ingrese su contrase�a ");
		String contrase�a = leerTexto();

		Resgistar.registarUsuarioEnARchivo(Usuario, contrase�a, "ArchivoConUsuarios.txt");

	}

	private static void ingresar() {
		imprimirSalidaNormal("==========INICIO DE REGISTRO=========");
		imprimirSalidaNormal("Por favor ingrese su usuario ");
		String Usuario = leerTexto().toString();

		imprimirSalidaNormal("Por favor ingrese su contrase�a ");
		String contrase�a = leerTexto();
		Resgistar.verificarLogin(Usuario, contrase�a, "ArchivoConUsuarios.txt");
	}

	private static void salir() {
		System.exit(0);
	}

}
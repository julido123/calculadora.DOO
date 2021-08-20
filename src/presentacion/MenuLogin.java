package presentacion;

import static utilitarios.Impresor.imprimirSalidaNormal;

public class MenuLogin {

	private MenuLogin() {
	}

	public static void mostrarMenuLogin() {
		imprimirSalidaNormal("�Qu� desea hacer?");
		imprimirSalidaNormal("1-registrar");
		imprimirSalidaNormal("2-ingresar");
		imprimirSalidaNormal("3-salir");
	}
}
package utilitarios;

public class Impresor {

	private Impresor() {
	}

	public static void imprimirSalidaNormal(String mensaje) {
		if (mensaje != null) {
			System.out.println(mensaje);
		}
	}

	public static void imprimirSalidaError(String mensaje) {
		if (mensaje != null) {
			System.err.println(mensaje);
		}
	}
}

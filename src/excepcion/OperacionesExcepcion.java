package excepcion;

public class OperacionesExcepcion extends RuntimeException {
	private static final long serialVersionUID = -1173551665462552223L;

	public OperacionesExcepcion(String mensaje) {
		super(mensaje);
	}
}

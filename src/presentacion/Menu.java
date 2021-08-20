package presentacion;

import static utilitarios.Impresor.imprimirSalidaNormal;

public class Menu {

	private Menu() {
	}

	public static void mostrarMenuInicial() {
		imprimirSalidaNormal("�Qu� desea hacer?");
		imprimirSalidaNormal("1-Sumar");
		imprimirSalidaNormal("2-Restar");
		imprimirSalidaNormal("3-Dividir");
		imprimirSalidaNormal("4-Multiplicar");
		imprimirSalidaNormal("5-Division de enteros");
		imprimirSalidaNormal("6-Validar si numero es entero");
		imprimirSalidaNormal("7-Validar si numero es primo");
		imprimirSalidaNormal("8-Hallar minimo comun  multiplo");
		imprimirSalidaNormal("9-Hallar maximo comun divisor");
		imprimirSalidaNormal("10-Elevar n�mero a una potencia");
		imprimirSalidaNormal("11-Hallar ra�z cuadrada de un n�mero");
		imprimirSalidaNormal("12-Validar si numero es mayor que otro");
		imprimirSalidaNormal("13-Validar si numero es menor que otro");
		imprimirSalidaNormal("14-Validar si numero es diferente a otro");
		imprimirSalidaNormal("15-Validar si numero es mayor o igual que otro");
		imprimirSalidaNormal("16-Validar si numero es menor or igual a otro");
		imprimirSalidaNormal("17-Validar si numero es igual a otro");
		imprimirSalidaNormal("18-Suma de fraccionarios");
		imprimirSalidaNormal("19-Resta de fraccionarios");
		imprimirSalidaNormal("20-Multiplicaci�n de fraccionarios");
		imprimirSalidaNormal("21-Divisi�n de fraccionarios");
		imprimirSalidaNormal("22-Salir");
	}
}

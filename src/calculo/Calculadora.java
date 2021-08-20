package calculo;

import excepcion.CalculadoraExcepcion;
import utilitarios.Fraccionario;
import utilitarios.Impresor;

public class Calculadora {

	public static double sumar(double numeroUno, double numeroDos) {
		return numeroUno + numeroDos;
	}

	public static double restar(double numeroUno, double numeroDos) {
		return numeroUno - numeroDos;
	}

	public static double dividir(Number numeroUno, Number numeroDos) {

		if (numeroDos.doubleValue() == 0) {
			throw new CalculadoraExcepcion("No es posible dividir por cero...");

		}

		Number resultado = 0;

		if (numeroEsEntero(numeroUno) && numeroEsEntero(numeroDos)) {
			resultado = numeroUno.longValue() / numeroDos.longValue();
		} else {
			resultado = numeroUno.doubleValue() / numeroDos.doubleValue();
		}

		return resultado.doubleValue();
	}

	public static double multiplicar(double numeroUno, double numeroDos) {
		return numeroUno * numeroDos;
	}

	public static boolean esNumeroPrimo(long numero) {
		return hallarCantidadDivisoresExactos(numero) == 2;
	}

	private static long hallarCantidadDivisoresExactos(long numero) {

		long cantidadDivisores = 0;

		for (long indice = 1; indice <= numero; indice++) {
			if (esDivisionExacta(numero, indice)) {
				cantidadDivisores = cantidadDivisores + 1;
			}
		}

		return cantidadDivisores;
	}

	public static long hallarMinimoComunMultiplo(long numeroUno, long numeroDos) {

		long mcm = 1;
		long contador = 2;

		while (contador <= numeroUno || contador <= numeroDos) {

			if (esDivisionExacta(numeroUno, contador) || esDivisionExacta(numeroDos, contador)) {
				mcm = mcm * contador;

				if (esDivisionExacta(numeroUno, contador)) {
					numeroUno = numeroUno / contador;
				}

				if (esDivisionExacta(numeroDos, contador)) {
					numeroDos = numeroDos / contador;
				}
			} else {
				contador = contador + 1;
			}
		}

		return mcm;
	}

	public static boolean esDivisionExacta(long numeroUno, long numeroDos) {
		return hallarModuloDivision(numeroUno, numeroDos) == 0;
	}

	public static long hallarMaximoComunDivisor(long numeroUno, long numeroDos) {
		long temporal;
		while (numeroDos != 0) {
			temporal = numeroDos;
			numeroDos = numeroUno % numeroDos;
			numeroUno = temporal;
		}
		return numeroUno;
	}

	public static long hallarModuloDivision(long numeroUno, long numeroDos) {
		if (numeroDos == 0) {
			throw new CalculadoraExcepcion("No es posible hallar el módulo de una división por cero...");
		}

		return numeroUno % numeroDos;
	}

	public static boolean numeroEsEntero(Number numero) {
		return (numero instanceof Byte || numero instanceof Short || numero instanceof Integer
				|| numero instanceof Long);
	}

	public static double elevarNumeroAPotencia(double numeroUno, double potencia) {
		return Math.pow(numeroUno, potencia);
	}

	public static double hallarRaizCuadrada(double numero) {
		return Math.sqrt(numero);
	}

	public static boolean esNumeroMayor(double numeroUno, double numeroDos) {
		return numeroUno > numeroDos;
	}

	public static boolean esNumeroMenor(double numeroUno, double numeroDos) {
		return numeroUno < numeroDos;
	}

	public static boolean esNumeroDiferente(double numeroUno, double numeroDos) {
		return numeroUno != numeroDos;
	}

	public static boolean esNumeroMayorOIgual(double numeroUno, double numeroDos) {
		return numeroUno >= numeroDos;
	}

	public static boolean esNumeroMenorOIgual(double numeroUno, double numeroDos) {
		return numeroUno <= numeroDos;
	}

	public static boolean esNumeroIgual(double numeroUno, double numeroDos) {
		return numeroUno == numeroDos;
	}

	public static Fraccionario crearFraccionario(long numerador, long denominador) {
		Fraccionario fraccionario = new Fraccionario();
		fraccionario.setNumerador(numerador);
		fraccionario.setDenominador(denominador);
		return fraccionario;
	}

	public static Fraccionario sumarFraccionarios(Fraccionario frac1, Fraccionario frac2) {
		Fraccionario total = new Fraccionario();
		total.setNumerador(
				frac1.getNumerador() * frac2.getDenominador() + frac1.getDenominador() * frac2.getNumerador());
		total.setDenominador(frac1.getDenominador() * frac2.getDenominador());
		return total;
	}

	public static Fraccionario restarFraccionarios(Fraccionario frac1, Fraccionario frac2) {
		Fraccionario total = new Fraccionario();
		total.setNumerador(
				frac1.getNumerador() * frac2.getDenominador() - frac1.getDenominador() * frac2.getNumerador());
		total.setDenominador(frac1.getDenominador() * frac2.getDenominador());
		return total;
	}

	public static Fraccionario multiplicarFraccionarios(Fraccionario frac1, Fraccionario frac2) {
		Fraccionario total = new Fraccionario();
		total.setNumerador(frac1.getNumerador() * frac2.getNumerador());
		total.setDenominador(frac1.getDenominador() * frac2.getDenominador());
		return total;
	}

	public static Fraccionario dividirFraccionarios(Fraccionario frac1, Fraccionario frac2) {
		Fraccionario total = new Fraccionario();
		total.setNumerador(frac1.getNumerador() * frac2.getDenominador());
		total.setDenominador(frac1.getDenominador() * frac2.getNumerador());
		return total;
	}

	public static Fraccionario simplificarFraccionario(Fraccionario numeroUno) {
		long mcd = hallarMaximoComunDivisor(numeroUno.getNumerador(), numeroUno.getDenominador());
		numeroUno.setNumerador(numeroUno.getNumerador() / mcd);
		numeroUno.setDenominador(numeroUno.getDenominador() / mcd);
		return numeroUno;
	}
}

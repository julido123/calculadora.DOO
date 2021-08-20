package presentacion;

import static utilitarios.Impresor.imprimirSalidaNormal;
import static utilitarios.Lector.leerNumeroDecimal;
import static utilitarios.Impresor.imprimirSalidaError;
import static utilitarios.Lector.leerNumeroEntero;

import calculo.Calculadora;
import excepcion.CalculadoraExcepcion;
import excepcion.OperacionesExcepcion;
import utilitarios.Fraccionario;

public class Operaciones {

	public static void operar(long opcion) {

		switch ((int) opcion) {
		case 1: {
			sumar();
			break;
		}
		case 2: {
			restar();
			break;
		}
		case 3: {
			dividir();
			break;
		}
		case 4: {
			multiplicar();
			break;
		}
		case 5: {
			dividirEntero();
			break;
		}
		case 6: {
			validarSiNumeroEsEntero();
			break;
		}
		case 7: {
			validarSiNumeroEsPrimo();
			break;
		}
		case 8: {
			hallarMinimoComunMultiplo();
			break;
		}
		case 9: {
			hallarMaximoComunDivisor();
			break;
		}
		case 10: {
			elevarNumeroAPotencia();
			break;
		}
		case 11: {
			hallarRaizCuadrada();
			break;
		}
		case 12: {
			validarSiNumeroEsMayorQueOtro();
			break;
		}
		case 13: {
			validarSiNumeroEsMenorQueOtro();
			break;
		}
		case 14: {
			validarSiNumeroEsDiferenteAOtro();
			break;
		}
		case 15: {
			validarSiNumeroEsMayorOIgualAOtro();
			break;
		}
		case 16: {
			validarSiNumeroEsMenorOIgualAOtro();
			break;
		}
		case 17: {
			validarSiNumeroEsIgualAOtro();
			break;
		}
		case 18: {
			sumarFraccionarios();
			break;
		}
		case 19: {
			restarFraccionarios();
			break;
		}
		case 20: {
			multiplicarFraccionarios();
			break;
		}
		case 21: {
			dividirFraccionarios();
			break;
		}
		case 22: {
			salir();
			break;
		}
		default:
			throw new OperacionesExcepcion("Opción " + opcion + " no válida... ");
		}

	}

	private static void sumar() {
		imprimirSalidaNormal("==========INICIO OPERACIÓN SUMAR=========");
		imprimirSalidaNormal("Por favor ingrese el número uno: ");
		double numeroUno = leerNumeroDecimal();

		imprimirSalidaNormal("Por favor ingrese el número dos: ");
		double numeroDos = leerNumeroDecimal();

		double resultado = Calculadora.sumar(numeroUno, numeroDos);

		imprimirSalidaNormal(numeroUno + "+" + numeroDos + "=" + resultado);
		imprimirSalidaNormal("==========FIN OPERACIÓN SUMAR=========");
	}

	private static void restar() {
		imprimirSalidaNormal("==========INICIO OPERACIÓN RESTAR=========");
		imprimirSalidaNormal("Por favor ingrese el número uno: ");
		double numeroUno = leerNumeroDecimal();

		imprimirSalidaNormal("Por favor ingrese el número dos: ");
		double numeroDos = leerNumeroDecimal();

		double resultado = Calculadora.restar(numeroUno, numeroDos);

		imprimirSalidaNormal(numeroUno + "-" + numeroDos + "=" + resultado);
		imprimirSalidaNormal("==========FIN OPERACIÓN RESTAR=========");
	}

	private static void dividir() {
		imprimirSalidaNormal("==========INICIO OPERACIÓN DIVIDIR=========");
		imprimirSalidaNormal("Por favor ingrese el número uno: ");
		double numeroUno = leerNumeroDecimal();

		imprimirSalidaNormal("Por favor ingrese el número dos: ");
		double numeroDos = leerNumeroDecimal();

		try {
			double resultado = Calculadora.dividir(numeroUno, numeroDos);
			imprimirSalidaNormal(numeroUno + "/" + numeroDos + "=" + resultado);
		} catch (CalculadoraExcepcion excepcion) {
			imprimirSalidaError(excepcion.getMessage());
		}

		imprimirSalidaNormal("==========FIN OPERACIÓN DIVIDIR=========");
	}

	private static void multiplicar() {
		imprimirSalidaNormal("==========INICIO OPERACIÓN MULTIPLICAR=========");
		imprimirSalidaNormal("Por favor ingrese el número uno: ");
		double numeroUno = leerNumeroDecimal();

		imprimirSalidaNormal("Por favor ingrese el número dos: ");
		double numeroDos = leerNumeroDecimal();

		double resultado = Calculadora.multiplicar(numeroUno, numeroDos);

		imprimirSalidaNormal(numeroUno + "*" + numeroDos + "=" + resultado);
		imprimirSalidaNormal("==========FIN OPERACIÓN MULTIPLICAR=========");
	}

	private static void dividirEntero() {
		imprimirSalidaNormal("==========INICIO OPERACIÓN DIVIDIR ENTEROS=========");
		imprimirSalidaNormal("Por favor ingrese el número uno: ");
		long numeroUno = leerNumeroEntero();

		imprimirSalidaNormal("Por favor ingrese el número dos: ");
		long numeroDos = leerNumeroEntero();

		try {
			long resultado = (long) Calculadora.dividir(numeroUno, numeroDos);
			imprimirSalidaNormal(numeroUno + "/" + numeroDos + "=" + resultado);
		} catch (CalculadoraExcepcion excepcion) {
			imprimirSalidaError(excepcion.getMessage());
		}
		imprimirSalidaNormal("==========FIN OPERACIÓN DIVIDIR ENTEROS=========");
	}

	private static void validarSiNumeroEsPrimo() {
		imprimirSalidaNormal("==========INICIO OPERACIÓN VALIDAR SI NUMERO ES PRIMO=========");
		imprimirSalidaNormal("Por favor ingrese el número : ");
		long numero = leerNumeroEntero();

		boolean resultado = Calculadora.esNumeroPrimo(numero);

		imprimirSalidaNormal("¿" + numero + "es primo? " + (resultado ? "SI" : "NO"));
		imprimirSalidaNormal("==========FIN OPERACIÓN VALIDAR SI NUMERO ES PRIMO=========");
	}

	private static void hallarMinimoComunMultiplo() {
		imprimirSalidaNormal("==========INICIO OPERACIÓN MINIMO COMUN MULTIPLO=========");
		imprimirSalidaNormal("Por favor ingrese el número uno: ");
		long numeroUno = leerNumeroEntero();

		imprimirSalidaNormal("Por favor ingrese el número dos: ");
		long numeroDos = leerNumeroEntero();

		long resultado = Calculadora.hallarMinimoComunMultiplo(numeroUno, numeroDos);

		imprimirSalidaNormal("El minimo comun multiplo entre" + numeroUno + " y " + numeroDos + "es: " + resultado);
		imprimirSalidaNormal("==========FIN OPERACIÓN HALLAR MINIMO COMUN MULTIPLO=========");
	}

	private static void hallarMaximoComunDivisor() {
		imprimirSalidaNormal("==========INICIO OPERACIÓN MAXIMO COMUN DIVISOR=========");
		imprimirSalidaNormal("Por favor ingrese el número uno: ");
		long numeroUno = leerNumeroEntero();

		imprimirSalidaNormal("Por favor ingrese el número dos: ");
		long numeroDos = leerNumeroEntero();

		long resultado = Calculadora.hallarMaximoComunDivisor(numeroUno, numeroDos);

		imprimirSalidaNormal("El minimo comun multiplo entre" + numeroUno + " y " + numeroDos + "es: " + resultado);
		imprimirSalidaNormal("==========FIN OPERACIÓN HALLAR MAXIMO COMUN DIVISOR=========");
	}

	private static void validarSiNumeroEsEntero() {
		imprimirSalidaNormal("==========INICIO OPERACIÓN VALIDAR SI NUMERO ES ENTERO=========");
		imprimirSalidaNormal("Por favor ingrese el número : ");
		long numero = leerNumeroEntero();

		boolean resultado = Calculadora.numeroEsEntero(numero);

		imprimirSalidaNormal("¿" + numero + "es entero? " + (resultado ? "SI" : "NO"));
		imprimirSalidaNormal("==========FIN OPERACIÓN VALIDAR SI NUMERO ES ENTERO=========");
	}

	private static void elevarNumeroAPotencia() {
		imprimirSalidaNormal("==========INICIO OPERACIÓN ELEVAR A POTENCIA=========");
		imprimirSalidaNormal("Por favor ingrese la base: ");
		double numeroUno = leerNumeroDecimal();

		imprimirSalidaNormal("Por favor ingrese el exponente: ");
		double numeroDos = leerNumeroDecimal();

		double resultado = Calculadora.elevarNumeroAPotencia(numeroUno, numeroDos);

		imprimirSalidaNormal(numeroUno + "+" + numeroDos + "=" + resultado);
		imprimirSalidaNormal("==========FIN OPERACIÓN ELEVAR A POTENCIA=========");
	}

	private static void hallarRaizCuadrada() {
		imprimirSalidaNormal("==========INICIO OPERACIÓN HALLAR RAÍZ CUADRADA=========");
		imprimirSalidaNormal("Por favor ingrese el número : ");
		double numero = leerNumeroDecimal();

		double resultado = Calculadora.hallarRaizCuadrada(numero);

		imprimirSalidaNormal("La raíz cuadrada de " + numero + "es:  " + resultado);
		imprimirSalidaNormal("==========FIN OPERACIÓN HALLAR RAÍZ CUADRADA=========");
	}

	private static void validarSiNumeroEsMayorQueOtro() {
		imprimirSalidaNormal("==========INICIO OPERACIÓN VALIDAR SI UN NUMERO ES MAYOR QUE OTRO=========");
		imprimirSalidaNormal("Por favor ingrese el número uno: ");
		double numeroUno = leerNumeroDecimal();

		imprimirSalidaNormal("Por favor ingrese el número dos: ");
		double numeroDos = leerNumeroDecimal();

		boolean resultado = Calculadora.esNumeroMayor(numeroUno, numeroDos);

		imprimirSalidaNormal("¿" + numeroUno + "es mayor que " + numeroDos + "? " + (resultado ? "SI" : "NO"));
		imprimirSalidaNormal("==========FIN OPERACIÓN VALIDAR SI UN NUMERO ES MAYOR QUE OTRO=========");
	}

	private static void validarSiNumeroEsMenorQueOtro() {
		imprimirSalidaNormal("==========INICIO OPERACIÓN VALIDAR SI UN NUMERO ES MENOR QUE OTRO=========");
		imprimirSalidaNormal("Por favor ingrese el número uno: ");
		double numeroUno = leerNumeroDecimal();

		imprimirSalidaNormal("Por favor ingrese el número dos: ");
		double numeroDos = leerNumeroDecimal();

		boolean resultado = Calculadora.esNumeroMenor(numeroUno, numeroDos);

		imprimirSalidaNormal("¿" + numeroUno + "es  menor que" + numeroDos + "? " + (resultado ? "SI" : "NO"));
		imprimirSalidaNormal("==========FIN OPERACIÓN VALIDAR SI UN NUMERO ES MENOR QUE OTRO=========");
	}

	private static void validarSiNumeroEsDiferenteAOtro() {
		imprimirSalidaNormal("==========INICIO OPERACIÓN VALIDAR SI UN NUMERO ES DIFERENTE A OTRO=========");
		imprimirSalidaNormal("Por favor ingrese el número uno: ");
		double numeroUno = leerNumeroDecimal();

		imprimirSalidaNormal("Por favor ingrese el número dos: ");
		double numeroDos = leerNumeroDecimal();

		boolean resultado = Calculadora.esNumeroDiferente(numeroUno, numeroDos);

		imprimirSalidaNormal("¿" + numeroUno + "es diferente que" + numeroDos + "? " + (resultado ? "SI" : "NO"));
		imprimirSalidaNormal("==========FIN OPERACIÓN VALIDAR SI UN NUMERO ES DIFERENTE A OTRO=========");
	}

	private static void validarSiNumeroEsMayorOIgualAOtro() {
		imprimirSalidaNormal("==========INICIO OPERACIÓN VALIDAR SI UN NUMERO ES MAYOR O IGUAL A OTRO=========");
		imprimirSalidaNormal("Por favor ingrese el número uno: ");
		double numeroUno = leerNumeroDecimal();

		imprimirSalidaNormal("Por favor ingrese el número dos: ");
		double numeroDos = leerNumeroDecimal();

		boolean resultado = Calculadora.esNumeroMayorOIgual(numeroUno, numeroDos);

		imprimirSalidaNormal("¿" + numeroUno + "es mayor o igual que" + numeroDos + "? " + (resultado ? "SI" : "NO"));
		imprimirSalidaNormal("==========FIN OPERACIÓN VALIDAR SI UN NUMERO ES MAYOR O IGUAL A OTRO=========");
	}

	private static void validarSiNumeroEsMenorOIgualAOtro() {
		imprimirSalidaNormal("==========INICIO OPERACIÓN VALIDAR SI UN NUMERO ES MENOR O IGUAL A OTRO=========");
		imprimirSalidaNormal("Por favor ingrese el número uno: ");
		double numeroUno = leerNumeroDecimal();

		imprimirSalidaNormal("Por favor ingrese el número dos: ");
		double numeroDos = leerNumeroDecimal();

		boolean resultado = Calculadora.esNumeroMenorOIgual(numeroUno, numeroDos);

		imprimirSalidaNormal("¿" + numeroUno + "es menor o igual que" + numeroDos + "? " + (resultado ? "SI" : "NO"));
		imprimirSalidaNormal("==========FIN OPERACIÓN VALIDAR SI UN NUMERO ES MENOR O IGUAL A OTRO=========");
	}

	private static void validarSiNumeroEsIgualAOtro() {
		imprimirSalidaNormal("==========INICIO OPERACIÓN VALIDAR SI UN NUMERO ES IGUAL A OTRO=========");
		imprimirSalidaNormal("Por favor ingrese el número uno: ");
		double numeroUno = leerNumeroDecimal();

		imprimirSalidaNormal("Por favor ingrese el número dos: ");
		double numeroDos = leerNumeroDecimal();

		boolean resultado = Calculadora.esNumeroIgual(numeroUno, numeroDos);

		imprimirSalidaNormal("¿" + numeroUno + "es igual que" + numeroDos + "? " + (resultado ? "SI" : "NO"));
		imprimirSalidaNormal("==========FIN OPERACIÓN VALIDAR SI UN NUMERO ES IGUAL A OTRO=========");
	}

	private static void sumarFraccionarios() {
		imprimirSalidaNormal("==========INICIO OPERACIÓN SUMA DE FRACCIONARIOS=========");
		imprimirSalidaNormal("Por favor ingrese el numerador del primer fraccionario: ");
		long numeroUno = leerNumeroEntero();

		long numeroDos;
		do {
			imprimirSalidaNormal(
					"Por favor ingrese el denominador del primer fraccionario(recuerde que no puede ser cero): ");
			numeroDos = leerNumeroEntero();
		} while (numeroDos == 0);

		Fraccionario fraccionario1 = Calculadora.crearFraccionario(numeroUno, numeroDos);

		imprimirSalidaNormal("Por favor ingrese el numerador del segundo fraccionario: ");
		long numeroTres = leerNumeroEntero();

		long numeroCuatro;
		do {
			imprimirSalidaNormal(
					"Por favor ingrese el denominador del segundo fraccionario(recuerde que no puede ser cero): ");
			numeroCuatro = leerNumeroEntero();
		} while (numeroCuatro == 0);
		Fraccionario fraccionario2 = Calculadora.crearFraccionario(numeroTres, numeroCuatro);

		Fraccionario resultado = Calculadora.sumarFraccionarios(fraccionario1, fraccionario2);
		resultado = Calculadora.simplificarFraccionario(resultado);

		imprimirSalidaNormal(numeroUno + "/" + numeroDos + " + " + numeroTres + "/" + numeroCuatro + " es igual a: "
				+ resultado.getNumerador() + "/" + resultado.getDenominador());
		imprimirSalidaNormal("==========FIN OPERACIÓN SUMA DE FRACCIONARIOS=========");
	}

	private static void restarFraccionarios() {
		imprimirSalidaNormal("==========INICIO OPERACIÓN RESTA DE FRACCIONARIOS=========");
		imprimirSalidaNormal("Por favor ingrese el numerador del primer fraccionario: ");
		long numeroUno = leerNumeroEntero();

		long numeroDos;
		do {
			imprimirSalidaNormal(
					"Por favor ingrese el denominador del primer fraccionario(recuerde que no puede ser cero): ");
			numeroDos = leerNumeroEntero();
		} while (numeroDos == 0);

		Fraccionario fraccionario1 = Calculadora.crearFraccionario(numeroUno, numeroDos);

		imprimirSalidaNormal("Por favor ingrese el numerador del segundo fraccionario: ");
		long numeroTres = leerNumeroEntero();

		long numeroCuatro;
		do {
			imprimirSalidaNormal(
					"Por favor ingrese el denominador del segundo fraccionario(recuerde que no puede ser cero): ");
			numeroCuatro = leerNumeroEntero();
		} while (numeroCuatro == 0);
		Fraccionario fraccionario2 = Calculadora.crearFraccionario(numeroTres, numeroCuatro);

		Fraccionario resultado = Calculadora.restarFraccionarios(fraccionario1, fraccionario2);
		resultado = Calculadora.simplificarFraccionario(resultado);

		imprimirSalidaNormal(numeroUno + "/" + numeroDos + " - " + numeroTres + "/" + numeroCuatro + " es igual a: "
				+ resultado.getNumerador() + "/" + resultado.getDenominador());
		imprimirSalidaNormal("==========FIN OPERACIÓN RESTA DE FRACCIONARIOS=========");
	}

	private static void multiplicarFraccionarios() {
		imprimirSalidaNormal("==========INICIO OPERACIÓN MULTIPLICACION DE FRACCIONARIOS=========");
		imprimirSalidaNormal("Por favor ingrese el numerador del primer fraccionario: ");
		long numeroUno = leerNumeroEntero();

		long numeroDos;
		do {
			imprimirSalidaNormal(
					"Por favor ingrese el denominador del primer fraccionario(recuerde que no puede ser cero): ");
			numeroDos = leerNumeroEntero();
		} while (numeroDos == 0);

		Fraccionario fraccionario1 = Calculadora.crearFraccionario(numeroUno, numeroDos);

		imprimirSalidaNormal("Por favor ingrese el numerador del segundo fraccionario: ");
		long numeroTres = leerNumeroEntero();

		long numeroCuatro;
		do {
			imprimirSalidaNormal(
					"Por favor ingrese el denominador del segundo fraccionario(recuerde que no puede ser cero): ");
			numeroCuatro = leerNumeroEntero();
		} while (numeroCuatro == 0);
		Fraccionario fraccionario2 = Calculadora.crearFraccionario(numeroTres, numeroCuatro);

		Fraccionario resultado = Calculadora.multiplicarFraccionarios(fraccionario1, fraccionario2);
		resultado = Calculadora.simplificarFraccionario(resultado);

		imprimirSalidaNormal(numeroUno + "/" + numeroDos + " * " + numeroTres + "/" + numeroCuatro + " es igual a: "
				+ resultado.getNumerador() + "/" + resultado.getDenominador());
		imprimirSalidaNormal("==========FIN OPERACIÓN MULTIPLICACION DE FRACCIONARIOS=========");
	}

	private static void dividirFraccionarios() {
		imprimirSalidaNormal("==========INICIO OPERACIÓN DIVISION DE FRACCIONARIOS=========");
		imprimirSalidaNormal("Por favor ingrese el numerador del primer fraccionario: ");
		long numeroUno = leerNumeroEntero();

		long numeroDos;
		do {
			imprimirSalidaNormal(
					"Por favor ingrese el denominador del primer fraccionario(recuerde que no puede ser cero): ");
			numeroDos = leerNumeroEntero();
		} while (numeroDos == 0);

		Fraccionario fraccionario1 = Calculadora.crearFraccionario(numeroUno, numeroDos);

		imprimirSalidaNormal("Por favor ingrese el numerador del segundo fraccionario: ");
		long numeroTres = leerNumeroEntero();

		long numeroCuatro;
		do {
			imprimirSalidaNormal(
					"Por favor ingrese el denominador del segundo fraccionario(recuerde que no puede ser cero): ");
			numeroCuatro = leerNumeroEntero();
		} while (numeroCuatro == 0);
		Fraccionario fraccionario2 = Calculadora.crearFraccionario(numeroTres, numeroCuatro);

		Fraccionario resultado = Calculadora.dividirFraccionarios(fraccionario1, fraccionario2);
		resultado = Calculadora.simplificarFraccionario(resultado);

		imprimirSalidaNormal(numeroUno + "/" + numeroDos + " ÷ " + numeroTres + "/" + numeroCuatro + " es igual a: "
				+ resultado.getNumerador() + "/" + resultado.getDenominador());
		imprimirSalidaNormal("==========FIN OPERACIÓN DIVISION DE FRACCIONARIOS=========");
	}

	private static void salir() {
		imprimirSalidaNormal("Hasta pronto");
		System.exit(0);
	}
}

package login;

import static utilitarios.Impresor.imprimirSalidaNormal;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

import excepcion.CalculadoraExcepcion;
import presentacion.Pantalla;

public class Resgistar {

	public static String filepth = "ArchivoConUsuarios.txt";

	public static void verificarLogin(String Usuario, String contraseņa, String filepth) {
		try {
			boolean found = false;
			String nombreUsuarioDocumento = "";
			String contraseņaUsuarioDocumento = "";

			Scanner leerLinea = new Scanner(new File(filepth));
			leerLinea.useDelimiter("[,\n]");

			while (leerLinea.hasNext() && !found) {
				nombreUsuarioDocumento = leerLinea.next();
				contraseņaUsuarioDocumento = leerLinea.next();

				if (nombreUsuarioDocumento.trim().equals(Usuario.trim())
						&& contraseņaUsuarioDocumento.trim().equals(contraseņa)) {
					found = true;
					imprimirSalidaNormal("Bienvenido " + Usuario);
					Pantalla.correrCalculadora();

				} else {
					imprimirSalidaNormal("el usuario o la contraseņa no coinciden");
				}

			}
			leerLinea.close();

		} catch (Exception e) {
			imprimirSalidaNormal("Ha ocurrido un error, vuelve a intentarlo");
		}
	}

	public static void registarUsuarioEnARchivo(String Usuario, String contraseņa, String filepth) {

		try {
			FileWriter fw = new FileWriter(filepth, true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);

			pw.println(Usuario + "," + contraseņa);
			pw.flush();
			pw.close();
			imprimirSalidaNormal("el usuario ha sido registrado");

		} catch (Exception e) {
			imprimirSalidaNormal("Ha ocurrido un error, vuelve a intentarlo");
		}
	}

}
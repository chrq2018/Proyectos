package tp1;
import java.util.Scanner;
/* EJERCICIO 1
 * Realiza un programa que permita que el usuario ingrese su nombre.
 * El programa debe emitir una salida con un mensaje de bienvenida
 * que incluya el nombre ingresado.
 */
public class Act1_Ej1 {
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Ingrese su nombre ");
		String nombre = input.nextLine();
		System.out.println("Bienvenido " + nombre);
	}
}

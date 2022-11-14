package tp1;
import java.util.Scanner;
/* EJERCICIO 11
 * Realizá un programa que permita ingresar un número 
 * entero e indique si se trata de un número par o impar.
 */
public class Act2_Ej11 {
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int numero;
		System.out.println("Ingrese un numero entero: ");
		numero = Integer.parseInt(input.nextLine());
		if(numero %2 == 0) {
			System.out.println("Ingreso un numero par");
		} else {
			System.out.println("Ingreso un numero impar");
		}
		input.close();
	}
}

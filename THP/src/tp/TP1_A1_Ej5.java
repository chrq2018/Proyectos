package tp;
import java.util.Scanner;
/* EJERCICIO 5
 * Realiza un programa que permita ingresar valores del mismo tipo para
 * las variables a y b. Una vez cargadas, mostrar ambas variables por
 * pantalla, intercambia sus valores (que lo cargado en a quede en b, y
 * viceversa) y volve a mostrarlas actualizadas.
 */
public class TP1_A1_Ej5 {
public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int num1,num2,aux;
		System.out.println("Ingrese un valor: ");
		num1 = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese un valor: ");
		num2 = Integer.parseInt(input.nextLine());
		System.out.println("primer valor ingresado: " + num1);
		System.out.println("segundo valor ingresado: " + num2);
		//intercambio los valores
		aux = num1;
		num1 = num2;
		num2 = aux;
		System.out.println("primer valor ingresado: " + num1);
		System.out.println("segundo valor ingresado: " + num2);
		input.close();
	}
}

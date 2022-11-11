package tp;
import java.util.Scanner;
/*
 * EJERCICIO 8
 * Realiza un programa que permita ingresar dos numeros naturales.
 * Debes mostrar los resultados para las 4 operaciones matematicas basicas
 * con los numeros ingresados.
 */
public class TP1_A1_Ej8 {
	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int num1, num2;
		double suma, resta, multiplicacion, division;
		System.out.println("Ingrese un nemero natural: ");
		num1 = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese un nemero natural: ");
		num2 = Integer.parseInt(input.nextLine());
		suma = num1 + num2;
		resta = num1 -num2;
		multiplicacion = num1 * num2;
		division = (double)num1 / num2;
		System.out.println("La suma es: " + suma);
		System.out.println("La resta es: " + resta);
		System.out.println("La la multiplicacion es: " + multiplicacion);
		System.out.println("La division es: " + division);
		input.close();
	}
}

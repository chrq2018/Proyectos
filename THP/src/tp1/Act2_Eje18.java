package tp1;
import java.util.Scanner;
/* EJERCICIO 18
 * Realizá un programa que permita al usuario 
 * ingresar dos números enteros. La computadora 
 * debe indicar si el mayor es divisible por el menor. 
 * (Un número entero a es divisible por un 
 * número entero b cuando el resto de la división entre a y b es 0 .
 */
public class Act2_Eje18 {
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int num1, num2, mayor, menor;
		System.out.print("Ingresar un numero entero: ");
		num1 = Integer.parseInt(input.nextLine());
		System.out.print("Ingresar un numero entero: ");
		num2 = Integer.parseInt(input.nextLine());
		if(num1 >= num2) {
			mayor = num1;
			menor = num2;
		}else {
			mayor = num2;
			menor = num1;
		}
		if(mayor % menor == 0) {
			System.out.println(mayor + " es divisible por " + menor);
		}else {
			System.out.println(mayor + " no es divisible por " + menor);
		}
		input.close();
	}
}

package tp1;
/* EJERCICIO 12
 * Realizá un programa que permita ingresar 
 * dos números enteros e indique cuál de 
 * ellos es el mayor.
 */
import java.util.Scanner;

public class Act2_Ej12 {
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int num1, num2;
		System.out.println("Ingrese un numero entero: ");
		num1 = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese un numero entero: ");
		num2 = Integer.parseInt(input.nextLine());
		if(num1 == num2) {
			System.out.println("Los numero ingresados son iguales ");
		}else if (num1 > num2){
			System.out.println(num1 + " es mayor que " + num2);
		}else {
			System.out.println(num2 + " es mayor que " + num1);
		}
		input.close();
	}
}

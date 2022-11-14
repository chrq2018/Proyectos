package tp1;
import java.util.Scanner;
/* EJERCICIO 13
 * Realizá un programa para ingresar tres números 
 * enteros e indique cuál de ellos es el mayor y su valor.
 */
public class Act2_Ej13 {
	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int num1, num2, num3;
		System.out.print("Ingrese un numero entero: ");
		num1 = Integer.parseInt(input.nextLine());
		System.out.print("Ingrese un numero entero: ");
		num2 = Integer.parseInt(input.nextLine());
		System.out.print("Ingrese un numero entero: ");
		num3 = Integer.parseInt(input.nextLine());
		if((num1 > num2) && (num1 > num3)){
			System.out.println("el mayor es: " + num1);
		}else if (num2 > num1 && num2 > num3) {
			System.out.println("el mayor es: " + num2);
		}else {
			System.out.println("el mayor es: " + num3);
		}
		input.close();
	}
}

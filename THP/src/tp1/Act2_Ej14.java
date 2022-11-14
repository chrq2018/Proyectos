package tp1;
import java.util.Scanner;
/* EJERCICIO 14
 * Para entrar a la montaña rusa Infierno en 
 * las alturas se requiere tener al menos 7 años 
 * y medir más de 1,50 metros. Haz el programa que 
 * permita, según las edades y estaturas ingresadas 
 * validar la entrada a la montaña rusa.
 */

public class Act2_Ej14 {
	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		double altura;
		int edad;
		System.out.print("Ingrese la edad: ");
		edad = Integer.parseInt(input.nextLine());
		System.out.print("Ingrese la altura: ");
		altura = Double.parseDouble(input.nextLine());
		if(edad >= 7 && altura > 1.5) {
			System.out.print("Puede ingresar");
		}else {
			System.out.print("No puede ingresar");
		}
		input.close();
	}
}

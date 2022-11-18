package tp1;
import java.util.Scanner;
/* EJERCICIO 15
 * Para entrar a la montaña rusa Infierno en 
 * las alturas se requiere ser mayor de 6 años 
 * y medir más de 1,50 metros. Haz el programa que 
 * permita, según las edades y estaturas ingresadas 
 * validar la entrada a la montaña rusa.
 */
public class Act2_Ej15 {

	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		double altura;
		int edad;
		System.out.print("Ingrese la edad: ");
		edad = Integer.parseInt(input.nextLine());
		System.out.print("Ingrese la altura: ");
		altura = Double.parseDouble(input.nextLine());
		if(edad > 6 && altura > 1.5) {
			System.out.print("Puede ingresar");
		}else {
			System.out.print("No puede ingresar");
		}
		input.close();
	}
}

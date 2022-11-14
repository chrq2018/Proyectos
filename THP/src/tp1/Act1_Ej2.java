package tp1;
import java.util.Scanner;
/* EJERCICIO 2
 * Realiza un programa que permita ingresar 3 notas pertenecientes a
 * tres trimestres distintos para cierto alumno de nivel secundario.
 * Debe calcularse y mostrarse la nota promedio.
 */
public class Act1_Ej2 {
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int nota1, nota2, nota3;
		float promedio;
		System.out.print("Ingrese nota: ");
		nota1 = Integer.parseInt(input.nextLine());
		System.out.print("Ingrese nota: ");
		nota2 = Integer.parseInt(input.nextLine());
		System.out.print("Ingrese nota: ");
		nota3 = Integer.parseInt(input.nextLine());
		promedio = (float)(nota1 + nota2 + nota3)/3;
		System.out.println("El promedio es: " + promedio);
	}
}

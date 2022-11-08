package tp;
import java.util.Scanner;
public class TP1_A1_Ej2 {
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

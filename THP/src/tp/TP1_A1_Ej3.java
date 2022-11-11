package tp;
import java.util.Scanner;
public class TP1_A1_Ej3 {
	public static final int MULTIPLICA_POR = 5;
	public static final int DIVIDIDO_POR = 2;
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int numero;
		System.out.println("Ingrese un numero entero: ");
		numero = Integer.parseInt(input.nextLine());
		System.out.println("El numero ingresado multiplicado por 5 es: " + numero*MULTIPLICA_POR);
		System.out.println("El numero ingresado divido por 2 es: " + (float)numero/DIVIDIDO_POR);
		input.close();
	}
}

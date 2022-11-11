package tp;
import java.util.Scanner;
/*
 * EJERCICIO 9
 * Realiza un programa que permita ingresar dos numeros que representan las medidas en grados
 * de dos angulos interiores de cierto triangulo. A partir de los valores de estos dos angulos
 * el programa debe mostrar el valor en grados del angulo restante. Recorda que la suma de los
 * angulos interiores de todo triangulo es de 180 grados.
 */
public class TP1_A1_Ej9 {
	public static final int SUMA_ANGULOS_INTERIORES = 180;
	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		double angulo1, angulo2, anguloRestante;
		System.out.println("ingrese el valor del angulo: ");
		angulo1 = Double.parseDouble(input.nextLine());
		System.out.println("ingrese el valor del angulo: ");
		angulo2 = Double.parseDouble(input.nextLine());
		anguloRestante = SUMA_ANGULOS_INTERIORES - angulo1 - angulo2;
		System.out.println("El angulo restante mide: " + anguloRestante);
		input.close();
	}
}

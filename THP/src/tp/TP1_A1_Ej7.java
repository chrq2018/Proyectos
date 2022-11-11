package tp;
import java.util.Scanner;
/*
 * EJERCICIO 7
 * Realiza un programa que permita ingresar el ancho y el largo de un terreno en metros
 * y el valor del metro cuadrado de tierra. Debe mostrarse el valor total del terreno y
 * la cantidad de metros de alambre para cercarlo completamente a tres alturas distintas.
 */
public class TP1_A1_Ej7 {
	public static final int CANTIDAD_VUELTAS_ALAMBRE = 3;
	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		double ancho,largo, valorMetroCuadradoTierra, valorTotalTerreno, cantMetrosAlambre;
		System.out.println("Ingrse el ancho: ");
		ancho = Double.parseDouble(input.nextLine());
		System.out.println("Ingrse el largo: ");
		largo = Double.parseDouble(input.nextLine());
		System.out.println("Ingrse el valor del metro cuadrado de tierra: ");
		valorMetroCuadradoTierra = Double.parseDouble(input.nextLine());
		valorTotalTerreno = ancho * largo * valorMetroCuadradoTierra;
		cantMetrosAlambre = 2 * (ancho + largo)*CANTIDAD_VUELTAS_ALAMBRE;
		System.out.println("El valor total de terreno es: " + valorTotalTerreno);
		System.out.println("Cantidad de metros de alambre para cercarlo completamente a "+ CANTIDAD_VUELTAS_ALAMBRE + " alturas es: " + cantMetrosAlambre);
		input.close();
	}

}

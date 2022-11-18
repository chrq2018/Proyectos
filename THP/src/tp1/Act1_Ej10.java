package tp1;
import java.util.Scanner;
/*
 * EJERCICIO 10
 * Realiza un programa que permita resolver el siguiente problema:
 * Tres personas aportan diferente capital a una sociedad y desean saber
 * el valor total aportado y que porcentaje aporto cada una (indicando
 * nombre y porcentaje). Solicitar la carga por teclado del nombre de
 * cada socio, su capital aportado y a partir de esto calcular e informar
 * lo requerido previamente.
 */
public class Act1_Ej10 {
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		String nombreSocio1, nombreSocio2, nombreSocio3;
		double capitalSocio1, capitalSocio2, capitalSocio3, porcentajeAportadoSocio1, porcentajeAportadoSocio2, porcentajeAportadoSocio3, capitalTotal;
		System.out.println("Ingrese nombre: ");
		nombreSocio1 = input.nextLine();
		System.out.println("Ingrese el capital que aporta: ");
		capitalSocio1 = Double.parseDouble(input.nextLine());
		System.out.println("Ingrese nombre: ");
		nombreSocio2 = input.nextLine();
		System.out.println("Ingrese el capital que aporta: ");
		capitalSocio2 = Double.parseDouble(input.nextLine());
		System.out.println("Ingrese nombre: ");
		nombreSocio3 = input.nextLine();
		System.out.println("Ingrese el capital que aporta: ");
		capitalSocio3 = Double.parseDouble(input.nextLine());
		capitalTotal = capitalSocio1 + capitalSocio2 + capitalSocio3;
		porcentajeAportadoSocio1 = 100*(capitalSocio1/capitalTotal);
		porcentajeAportadoSocio2 = 100*(capitalSocio2/capitalTotal);
		porcentajeAportadoSocio3 = 100*(capitalSocio3/capitalTotal);
		System.out.println("Valor total aportado: $" + capitalTotal);
		System.out.println(nombreSocio1 + " aporto $" + capitalSocio1 + " (" + porcentajeAportadoSocio1 + " %)" );
		System.out.println(nombreSocio2 + " aporto $" + capitalSocio2 + " (" + porcentajeAportadoSocio2 + " %)" );
		System.out.println(nombreSocio3 + " aporto $" + capitalSocio3 + " (" + porcentajeAportadoSocio3 + " %)" );
		input.close();
	}
}

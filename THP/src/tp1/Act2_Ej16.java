package tp1;
import java.util.Scanner;
/* EJERCICIO 16
 * Realizá un programa que permita ingresar 
 * la cantidad de inscriptos a una conferencia 
 * y la cantidad de asientos disponibles en el 
 * auditorio. Debes indicar si alcanzan los 
 * asientos, Si los asientos no alcanzaran 
 * indicar cuántos faltan para que todos los 
 * inscriptos puedan sentarse.
 */
public class Act2_Ej16 {
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int cantInscriptos, cantAsientosDisponibles, cantAsientosFaltantes;
		System.out.println("ingresar la cantidad de inscriptos");
		cantInscriptos = Integer.parseInt(input.nextLine());
		System.out.println("ingresar la cantidad de asientos disponibles");
		cantAsientosDisponibles = Integer.parseInt(input.nextLine());
		cantAsientosFaltantes = cantInscriptos - cantAsientosDisponibles;
		if(cantAsientosFaltantes < 0) {
			System.out.println("Alcanzan los asientos");
		}else {
			System.out.println("Faltan " + cantAsientosFaltantes + " asientos");
		}
		input.close();
	}
}

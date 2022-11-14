package tp1;
import java.util.Scanner;
/* EJERCICIO 4
 * Realiza un programa que permita ingresar el valor monetario de
 * una hora de trabajo y la cantidad de horas trabajadas por día
 * por un trabajador. Debes mostrar el valor del salario semanal,
 * sabiendo que trabaja todos los días hábiles y la mitad de las
 * horas del día habil los sabados. (Todas las horas valen lo mismo.)
 */
public class Act1_Ej4 {
	private static Scanner input = new Scanner(System.in);
	public static final double CANT_DIAS_HABILES = 5.5;
	public static void main(String[] args) {
		double valorHoraTrabajo, cantHorasTrabajadas, salarioSemanal;
		System.out.println("Ingrese el valor monetario de una hora de trabajo: ");
		valorHoraTrabajo = Double.parseDouble(input.nextLine());
		System.out.println("Ingrrese la cantidad de horas trabajadas por dia: ");
		cantHorasTrabajadas = Double.parseDouble(input.nextLine());
		salarioSemanal = CANT_DIAS_HABILES * cantHorasTrabajadas * valorHoraTrabajo;
		System.out.println("El salario semanal es: " + salarioSemanal);
		input.close();
	}
}

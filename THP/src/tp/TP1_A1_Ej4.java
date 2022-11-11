package tp;
import java.util.Scanner;
public class TP1_A1_Ej4 {
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

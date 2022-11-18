package tp1;
import java.util.Scanner;
/* EJERCICICO 17
 * Realizá un programa que permita ingresar 
 * una edad (entre 1 y 120 años) y un género 
 * ( 'F' para mujeres, 'M' para hombres). 
 * En caso de haber ingresado valores erróneos 
 * (edad fuera de rango o género inválido), 
 * informar tal situación. Si los datos están 
 * bien ingresados el programa debe indicar, 
 * sabiendo que las mujeres se jubilan con 60 
 * años o más y los hombres con 65 años o más, 
 * si la persona está en edad de jubilarse.
 */
public class Act2_Ej17 {
	public static final int EDAD_MINIMA = 1; 
	public static final int EDAD_MAXIMA = 120; 
	public static final int EDAD_JUBILACION_MUJER = 60;
	public static final int EDAD_JUBILACION_HOMBRE = 65;
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int edad;
		char genero;
		System.out.print("ingresar edad (1 a 120): ");
		edad = Integer.parseInt(input.nextLine());
		System.out.print("ingresar genero ('M' hombres 'F' mujer): ");
		genero = input.next().charAt(0);
		if((edad < EDAD_MINIMA || edad > EDAD_MAXIMA) && (genero != 'M' || genero != 'F')) {
			System.out.println("Ingresó datos erroneos");
		}else {
			if(edad >= EDAD_JUBILACION_HOMBRE) {
				System.out.println("Es jubilable");
			}else if(edad > EDAD_JUBILACION_MUJER && genero == 'M') {
				System.out.println("Es jubilable");
			}else {
				System.out.println("No es jubilable");
			}
		}
		System.out.println("Fin");
		input.close();
	}
}

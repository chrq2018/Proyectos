package tp1;
import java.util.Scanner;
/* EJERCICIO 6
 * Realiza un programa que permita ingresar el monto total de las ventas realizadas
 * por un vendedor durante el mes, de quien se sabe que gana un sueldo fijo de
 * 44000 pesos mas el 16 por ciento del monto total vendido. Con tales datos debes
 * calcular y mostrar el importe a cobrar por el vendedor.
 */
public class Act1_Ej6 {
	public static Scanner input = new Scanner(System.in);
	public static final double SUELDO_FIJO = 44000;
	public static final double PORCENTAJE_VENTA = 0.16;
	public static void main(String[] args) {
		double montoTotalVentasMes, importeaCobrar;
		System.out.println("Ingrese el monto total de ventas del mes: ");
		montoTotalVentasMes = Double.parseDouble(input.nextLine());
		importeaCobrar = montoTotalVentasMes*PORCENTAJE_VENTA + SUELDO_FIJO;
		System.out.println("El importe a cobrar es: " + importeaCobrar);
		input.close();
	}
}

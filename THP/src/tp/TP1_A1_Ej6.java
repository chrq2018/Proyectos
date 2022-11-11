package tp;
import java.util.Scanner;
public class TP1_A1_Ej6 {
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

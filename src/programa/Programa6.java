package programa;
import java.util.Scanner;
public class Programa6 {
    public static void main(String[] args) {
        String nombreEmpleado, cargo;
        double ingresoMensual, gastoMensual, ahorroMensual, ahorroBimestral, ahorroSemestral, ahorroAnual;
        // Creando el objeto lectura
        Scanner lectura = new Scanner(System.in);
        // Entrada de datos
        System.out.print("Nombre del empleado: ");
        nombreEmpleado = lectura.nextLine(); // Captura el nombre del empleado
        System.out.print("Cargo del empleado: ");
        cargo = lectura.nextLine(); // Captura el cargo del empleado
        System.out.print("Ingreso mensual del empleado: ");
        ingresoMensual = lectura.nextDouble();
        System.out.print("Gasto mensual del empleado: ");
        gastoMensual = lectura.nextDouble();
        // Proceso de datos
        ahorroMensual = ingresoMensual - gastoMensual;
        ahorroBimestral = ahorroMensual * 2;
        ahorroSemestral = ahorroMensual * 6;
        ahorroAnual = ahorroMensual * 12;
        // Salida de datos
        System.out.println("\nEmpleado: " + nombreEmpleado);
        System.out.println("Cargo: " + cargo);
        System.out.println("Ahorro Mensual: S/ " + ahorroMensual);
        System.out.println("Ahorro Bimestral: S/ " + ahorroBimestral);
        System.out.println("Ahorro Semestral: S/ " + ahorroSemestral);
        System.out.println("Ahorro Anual: S/ " + ahorroAnual);
    }
    public Programa6() {
    }
}

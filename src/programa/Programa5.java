package programa;

import java.util.Scanner;
public class Programa5 {
    public static void main(String[] args) {
        double sueldo1, sueldo2, sueldo3, sueldo4, sueldo5, totalSueldos, promedioSueldos;
        // Creando el objeto lectura
        Scanner lectura = new Scanner(System.in);
        // Entrada de datos
        System.out.print("Ingrese el sueldo del empleado 1: ");
        sueldo1 = lectura.nextDouble();
        System.out.print("Ingrese el sueldo del empleado 2: ");
        sueldo2 = lectura.nextDouble();
        System.out.print("Ingrese el sueldo del empleado 3: ");
        sueldo3 = lectura.nextDouble();
        System.out.print("Ingrese el sueldo del empleado 4: ");
        sueldo4 = lectura.nextDouble();
        System.out.print("Ingrese el sueldo del empleado 5: ");
        sueldo5 = lectura.nextDouble();
        // Proceso de datos
        totalSueldos = sueldo1 + sueldo2 + sueldo3 + sueldo4 + sueldo5;
        promedioSueldos = totalSueldos / 5;
        // Salida de datos
        System.out.println("Total de sueldos: S/ " + totalSueldos);
        System.out.println("Promedio de sueldos: S/ " + promedioSueldos);
    }
    public Programa5() {
    }
}

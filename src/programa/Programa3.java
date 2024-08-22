package programa;

import java.util.Scanner;

public class Programa3 {
    public static void main(String[] args) {
        double sueldoMensual, venta1, venta2, venta3, comision, pagoTotal;
        // Creando el objeto lectura
        Scanner lectura = new Scanner(System.in);
        // Entrada de datos
        System.out.print("Nombre del vendedor: ");
        lectura.next(); // Esta línea captura el nombre pero no lo almacena; si deseas almacenarlo, puedes usar una variable de tipo String.
        System.out.print("Sueldo mensual del vendedor: ");
        sueldoMensual = lectura.nextDouble();
        System.out.print("Monto de la primera venta: ");
        venta1 = lectura.nextDouble();
        System.out.print("Monto de la segunda venta: ");
        venta2 = lectura.nextDouble();
        System.out.print("Monto de la tercera venta: ");
        venta3 = lectura.nextDouble();
        // Proceso de datos
        comision = (venta1 + venta2 + venta3) * 0.10;
        pagoTotal = sueldoMensual + comision;
        // Salida de datos
        System.out.println("Comisión: S/ " + comision);
        System.out.println("Pago Total a fin de mes: S/ " + pagoTotal);
    }

    public Programa3() {
    }
}


package programa;
import java.util.Scanner;
public class Programa2 {
    public static void main(String[] args) {
         double horasTrabajadas, tarifaPorHora, sueldoBruto, descuento, sueldoNeto;

        // Creando el objeto lectura
        Scanner lectura = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Nombre del empleado: ");

        System.out.print("Horas trabajadas del empleado: ");
        horasTrabajadas = lectura.nextDouble();

        System.out.print("Tarifa por hora del empleado: ");
        tarifaPorHora = lectura.nextDouble();

        // Proceso de datos
        sueldoBruto = horasTrabajadas * tarifaPorHora;
        descuento = sueldoBruto * 0.13;
        sueldoNeto = sueldoBruto - descuento;

        // Salida de datos
        System.out.println("Sueldo Bruto: S/ " + sueldoBruto);
        System.out.println("Descuento (ONP): S/ " + descuento);
        System.out.println("Sueldo Neto: S/ " + sueldoNeto);
    }

    public Programa2 (){
        
    }
    }

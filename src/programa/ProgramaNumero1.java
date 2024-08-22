
package programa;
import java.util.Scanner;
public class ProgramaNumero1 {
    public static void main(String[] args) {
    double ingreso,gasto,ahorrom,ahorroa;
    //creando el objeto lectura
    Scanner lectura= new Scanner(System.in);
    //Entada de datos
    System.out.print ("nombre de empleado:");
    lectura.next ();
    System.out.print("ingresos del empleado:");
    ingreso=lectura.nextDouble ();
    System.out.print("gastos del empleado:");
    gasto=lectura.nextDouble ();
    //proceso de datos
    ahorrom=ingreso-gasto;
    ahorroa=ahorrom*12;
    //salida de datos
    System.out.println("Ahorro Mensual:" + ahorrom);
    System.out.println("Ahorro Anual:" + ahorroa);
    }
    public ProgramaNumero1() {
    }
}

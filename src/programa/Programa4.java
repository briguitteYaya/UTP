package programa;
import java.util.Scanner;
public class Programa4 {
    public static void main(String[] args) {
        String nombreCliente, producto;
        double precio, cantidad, subtotal, igv, total;
        // Creando el objeto lectura
        Scanner lectura = new Scanner(System.in);
        // Entrada de datos
        System.out.print("Nombre del cliente: ");
        nombreCliente = lectura.nextLine(); // Almacena el nombre del cliente
        System.out.print("Nombre del producto: ");
        producto = lectura.nextLine(); // Almacena el nombre del producto
        System.out.print("Precio del producto: ");
        precio = lectura.nextDouble();
        System.out.print("Cantidad del producto: ");
        cantidad = lectura.nextDouble();
        // Proceso de datos
        subtotal = precio * cantidad;
        igv = subtotal * 0.18; // Suponiendo un IGV del 18%
        total = subtotal + igv;
        // Salida de datos
        System.out.println("\nCliente: " + nombreCliente);
        System.out.println("Producto: " + producto);
        System.out.println("Subtotal: S/ " + subtotal);
        System.out.println("IGV (18%): S/ " + igv);
        System.out.println("Total a pagar: S/ " + total);
    }
    public Programa4() {
    }
}

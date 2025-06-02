import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Producto> Main = new ArrayList<>();

        while (true) {
            System.out.println("Ingrese los datos del producto:");
            System.out.print("Id del producto: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            System.out.print("Nombre del producto: ");
            String nombre = scanner.nextLine();

            System.out.print("Marca del producto: ");
            String marca = scanner.nextLine();

            System.out.print("Precio del producto: ");
            double precio = scanner.nextDouble();

            Main.add(new Producto(id, nombre, marca, precio));

            System.out.print("¿Desea ingresar otro producto? (si/no): ");
            scanner.nextLine(); // Limpiar buffer
            String respuesta = scanner.nextLine().toLowerCase();

            if (respuesta.equals("no")) {
                break;
            }
        }
        System.out.println("\nProductos registrados:");
        Iterator<Producto> iterator = Main.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        scanner.close();
    }
}


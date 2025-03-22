import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Vehiculo> vehiculos = new ArrayList<>();
        int opcion;

        do {
            System.out.println("--- Menú Concesionario ---");
            System.out.println("1.Agregar Auto");
            System.out.println("2.Agregar Motocicleta");
            System.out.println("3.Mostrar Vehículos");
            System.out.println("4.Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Por favor ingrese la marca del auto: ");
                    String marca = scanner.nextLine();
                    System.out.print("Por favor Ingrese el modelo: ");
                    String modelo = scanner.nextLine();
                    System.out.print("Por favor ingrese el año: ");
                    int año = scanner.nextInt();
                    System.out.print("Por favor Ingrese el precio base: ");
                    double precioBase = scanner.nextDouble();
                    System.out.print("Por favor Ingrese el número de puertas: ");
                    int numeroPuertas = scanner.nextInt();
                    scanner.nextLine();

                    vehiculos.add(new Auto(marca, modelo, precioBase, año, numeroPuertas));
                    System.out.println("Auto registrado correctamente!");
                }
                case 2 -> {
                    System.out.print("Por favor ingrese la marca de la motocicleta: ");
                    String marca = scanner.nextLine();
                    System.out.print(" Por favor ingrese el modelo: ");
                    String modelo = scanner.nextLine();
                    System.out.print(" Por favor ingrese el año: ");
                    int año = scanner.nextInt();
                    System.out.print("Por favor ingrese el precio base: ");
                    double precioBase = scanner.nextDouble();
                    System.out.print("Por favor ingrese la cilindrada (cc): ");
                    int cilindrada = scanner.nextInt();
                    scanner.nextLine();

                    vehiculos.add(new Motocicleta(marca, modelo, precioBase, año, cilindrada));
                    System.out.println("Motocicleta registrada correctamente!");

                }
                case 3 -> {
                    System.out.println("Lista de vehiculos registrados");
                    if (vehiculos.isEmpty()) {
                        System.out.println("No hay vehículos registrados.");
                    } else {
                        System.out.println(vehiculos);
//                        for (Vehiculo v : vehiculos) {
//                            System.out.println(v);
//                            System.out.println("Ver vehiculos registrados ");
//                        }
                    }
                }
                case 4 -> System.out.println("Saliendo del sistema...");
                default -> System.out.println("Opción inválida. Intente de nuevo.");

            }
        }while (opcion!= 4);
        scanner.close();
}   }
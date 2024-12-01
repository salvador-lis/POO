import java.util.ArrayList;
import java.util.Scanner;

public class App{
    public static void main(String[] args) {
        GestorDeReservas gestor = new GestorDeReservas();
        gestor.agregarBus(new Bus(1, 40));
        gestor.agregarBus(new Bus(2, 30));
        gestor.agregarBus(new Bus(3, 35));

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Sistema de Reserva de Autobuses ---");
            System.out.println("1. Mostrar autobuses disponibles");
            System.out.println("2. Realizar una reserva");
            System.out.println("3. Cancelar una reserva");
            System.out.println("4. Mostrar todas las reservas");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    gestor.mostrarBuses();
                    break;
                case 2:
                    System.out.print("Ingrese su nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el número del bus: ");
                    int numeroBus = scanner.nextInt();
                    gestor.realizarReserva(nombre, numeroBus);
                    break;
                case 3:
                    System.out.print("Ingrese su nombre: ");
                    String nombreCancelar = scanner.nextLine();
                    System.out.print("Ingrese el número del bus: ");
                    int busCancelar = scanner.nextInt();
                    gestor.cancelarReserva(nombreCancelar, busCancelar);
                    break;
                case 4:
                    gestor.mostrarReservas();
                    break;
                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}


import java.util.ArrayList;


public class GestorDeReservas {
    private ArrayList<Bus> buses;
    private ArrayList<Reserva> reservas;

    public GestorDeReservas() {
        buses = new ArrayList<>();
        reservas = new ArrayList<>();
    }

    public void agregarBus(Bus bus) {
        buses.add(bus);
    }

    public void mostrarBuses() {
        for (Bus bus : buses) {
            System.out.println(bus);
        }
    }

    public boolean realizarReserva(String nombrePasajero, int numeroBus) {
        for (Bus bus : buses) {
            if (bus.getNumeroBus() == numeroBus && bus.reservarAsiento()) {
                reservas.add(new Reserva(nombrePasajero, numeroBus));
                System.out.println("Reserva realizada con éxito.");
                return true;
            }
        }
        System.out.println("No se pudo realizar la reserva. Verifique el número del bus o su disponibilidad.");
        return false;
    }

    public boolean cancelarReserva(String nombrePasajero, int numeroBus) {
        for (int i = 0; i < reservas.size(); i++) {
            Reserva reserva = reservas.get(i);
            if (reserva.toString().contains(nombrePasajero) && reserva.toString().contains("Bus #" + numeroBus)) {
                reservas.remove(i);
                for (Bus bus : buses) {
                    if (bus.getNumeroBus() == numeroBus) {
                        bus.cancelarReserva();
                        System.out.println("Reserva cancelada con éxito.");
                        return true;
                    }
                }
            }
        }
        System.out.println("No se encontró la reserva para cancelar.");
        return false;
    }

    public void mostrarReservas() {
        if (reservas.isEmpty()) {
            System.out.println("No hay reservas realizadas.");
        } else {
            for (Reserva reserva : reservas) {
                System.out.println(reserva);
            }
        }
    }
}

public class Reserva {
    private String nombrePasajero;
    private int numeroBus;

    public Reserva(String nombrePasajero, int numeroBus) {
        this.nombrePasajero = nombrePasajero;
        this.numeroBus = numeroBus;
    }

    @Override
    public String toString() {
        return "Pasajero: " + nombrePasajero + " - Bus #" + numeroBus;
    }
}
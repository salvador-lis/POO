public class Bus {
    private int numeroBus;
    private int capacidad;
    private int asientosReservados;

    public Bus(int numeroBus, int capacidad) {
        this.numeroBus = numeroBus;
        this.capacidad = capacidad;
        this.asientosReservados = 0;
    }

    public int getNumeroBus() {
        return numeroBus;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public int getAsientosReservados() {
        return asientosReservados;
    }

    public boolean reservarAsiento() {
        if (asientosReservados < capacidad) {
            asientosReservados++;
            return true;
        }
        return false;
    }

    public boolean cancelarReserva() {
        if (asientosReservados > 0) {
            asientosReservados--;
            return true;
        }
        return false;
    }

    public int asientosDisponibles() {
        return capacidad - asientosReservados;
    }

    @Override
    public String toString() {
        return "Bus #" + numeroBus + " - Capacidad: " + capacidad + " - Disponibles: " + asientosDisponibles();
    }
}
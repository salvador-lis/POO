package SistemaPeaje;
import java.util.Vector;

public class Peaje {
    String nombre;
    String departamento;
    Vector vehiculos;
    int totalPeaje=0;
    static int totalCamiones=0;
    static int totalMotos=0;
    static int totalCarros=0;

    Peaje(String nombre, String departamento){
        this.nombre=nombre;
        this.departamento=departamento;
        vehiculos.new Vector();
    }
}

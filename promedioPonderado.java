import java.util.Scanner;

public class promedioPonderado {
    public static void main(String[] args){
         Scanner input= new Scanner(System.in);
        
         int i;
        System.out.println("Cuantas materias quiere promediar? : ");
        int n=input.nextInt(); 

        double[] calificaciones= new double[n];
        double[] creditos= new double[n];
        
      System.out.println("Introduzca las calificaciones");

        for(i=0;i<n;i++){
          int orden=i+1;  
          System.out.println("Materia " + orden + " = ");

          calificaciones[i]=input.nextDouble(); 
        }
        System.out.println("Introduzca los creditos");
        for(i=0;i<n;i++){
            int orden=i+1;  
            System.out.println("Materia " + orden + " = ");
  
            creditos[i]=input.nextDouble(); 
          }
          double promedioPonderado = calcularPromedioPonderado(calificaciones, creditos);
          System.out.printf("El promedio ponderado es: %.2f%n", promedioPonderado);
  
          

    }
    public static double calcularPromedioPonderado(double[] calificaciones, double[] creditos) {
        double sumaPonderada = 0.0;
        double sumaCreditos = 0.0;

        for (int i = 0; i < calificaciones.length; i++) {
            sumaPonderada += calificaciones[i] * creditos[i];
            sumaCreditos += creditos[i];
        }

        return sumaCreditos > 0 ? sumaPonderada / sumaCreditos : 0;
    }
}

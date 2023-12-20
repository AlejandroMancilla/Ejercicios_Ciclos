import java.util.Scanner;

public class Ej_TiempoViaje {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int Recorrido = 0, Tramo, Horas, Minutos;
        do{
            System.out.print("Distancia Tramo: ");
            Tramo = sc.nextInt();
            Recorrido += Tramo;
        }while(Tramo != 0);
        Horas = Recorrido / 60;
        Minutos = Recorrido % 60;
        String Total = String.format("%d:%02d",Horas, Minutos);
        System.out.println("Tiempo Total de Viaje: " + Total);
    }
}
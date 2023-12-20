import java.util.Scanner;

public class Ej_Combinaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el Puntaje: ");
        int Puntaje = sc.nextInt();
        int Contador = 0;
        for(int i = 1; i <= 6; i++) {
            for(int j = 1; j <= 6; j++) {
                if(i+j == Puntaje){
                    Contador++;
                }
            }
        }
        System.out.println("Hay " + Contador + " combinaciones para obtener " + Puntaje);
    }
}

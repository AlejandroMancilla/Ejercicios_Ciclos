import java.util.Scanner;

public class Ej_Pi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Signo = 1, N;
        double Pi = 0, Den = 1;
        System.out.print("Ingrese Numero de Iteraciones: ");
        N = sc.nextInt();
        for(int i = 0 ; i < N ; i++){
            Pi += Signo * (4/Den);
            Den += 2;
            Signo *= -1;
        }
        System.out.println("Numero Pi = " + Pi);
    }
}

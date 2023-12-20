import java.util.Scanner;

public class Ej_Invertir {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int Num, Inv, Residuo;
        Inv = 0;
        System.out.print("Ingrese numero a invertir: ");
        Num = sc.nextInt();
        
        while (Num > 0) {
            Residuo = Num % 10;
            Inv = Inv * 10 + Residuo;
            Num /= 10;
        }
        System.out.println("El numero invertido es: " + Inv);
    }
}

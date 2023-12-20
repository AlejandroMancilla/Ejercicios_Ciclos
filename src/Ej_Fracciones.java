import java.util.Scanner;

public class Ej_Fracciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese Numero de potencias a Calcular: ");
        int N = sc.nextInt();
        double Sum = 0, Fra = 0;
        String Potencia = "Potencia", Fraccion = "Fracción", Suma = "Suma";
        String Resultado = String.format("|%-10s|%-10s|%-10s|",Potencia, Fraccion, Suma);
        for(int i = 1; i <= N; i++) {
            Potencia = String.valueOf(i);
            Fra = 1/Math.pow(2,i);
            Sum += Fra;
            Suma = String.valueOf(Sum);
            Fraccion = String.valueOf(Fra);
            Resultado = String.format("|%-10s|%-10s|%-10s|",Potencia, Fraccion, Suma);
            System.out.println(Resultado);
        }
    }
}

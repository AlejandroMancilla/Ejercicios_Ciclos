import java.util.Scanner;

public class Ej_Histograma {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int Valor = 0, Pos = 0, Neg = 0;
        System.out.println("Ingrese Varios valores, termino con cero: ");
        do{
            Valor = sc.nextInt();
            if(Valor < 0){
                Neg++;
            }else if(Valor > 0){
                Pos++;
            }
        }while(Valor != 0);
        System.out.println("Positivos: " + "*".repeat(Pos));
        System.out.println("Negativos: " + "*".repeat(Neg));
    }
}

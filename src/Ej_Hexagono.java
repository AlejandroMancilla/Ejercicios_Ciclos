import java.util.Scanner;

public class Ej_Hexagono {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese Lado del Hexagono: ");
        int Lado = sc.nextInt();
        int es = Lado - 1, na = Lado;
        for(int i = 0 ; i< (Lado * 2 - 1) ; i++){
            System.out.println(" ".repeat(es) + "*".repeat(na));
            if(i < Lado-1){
                na += 2;
                es -= 1;
            }else if(i >= Lado-1){
                na -= 2;
                es += 1;
            }
        }
    }
}

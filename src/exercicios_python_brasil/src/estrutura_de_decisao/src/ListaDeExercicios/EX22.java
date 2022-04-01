import java.util.Scanner;

public class Atividade_22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por gentileza, digite um numero: ");
        int numeroDadoPeloUsuario = scanner.nextInt();

        if(numeroDadoPeloUsuario % 2 == 0) {
            System.out.print("O numero " + numeroDadoPeloUsuario +  " é par.");
        } else {
            System.out.print("O numero " + numeroDadoPeloUsuario + " é impar.");
        }
        scanner.close();
    }
}

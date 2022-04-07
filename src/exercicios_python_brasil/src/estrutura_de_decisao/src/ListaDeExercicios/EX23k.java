package estrutura_de_decisao.src.ListaDeExercicios;

import java.util.Scanner;

public class EX23k {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por gentileza, digite um numero: ");
        double numeroDadoPeloUsuario = scanner.nextDouble();

        if(numeroDadoPeloUsuario % 1 == 0) {
            System.out.print("O numero dado é Inteiro");
        } else {
            System.out.print("O numero dado é Decimal");
        }
        scanner.close();
    }
}

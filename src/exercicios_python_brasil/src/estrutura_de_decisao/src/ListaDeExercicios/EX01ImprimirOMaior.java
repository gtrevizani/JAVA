package estrutura_de_decisao.src.ListaDeExercicios;

import java.util.Scanner;

//Faça um programa que peça dois números e imprima o maior deles.
public class EX01ImprimirOMaior {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira o 1° numero: ");
        Double numeroUm = scanner.nextDouble();
        System.out.print("Insira o 2° numero: ");
        Double numeroDois = scanner.nextDouble();

        if (numeroUm > numeroDois){
            System.out.println("O maior: " + numeroUm);
        }
        else if (numeroDois > numeroUm){
            System.out.println("O maior: " + numeroDois);
        }
        else if (numeroUm.equals(numeroDois)){
            System.out.println("O maior: " + numeroDois);
        }
        scanner.close();
    }
}

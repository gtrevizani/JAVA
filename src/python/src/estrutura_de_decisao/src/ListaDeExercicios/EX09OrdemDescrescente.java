package estrutura_de_decisao.src.ListaDeExercicios;

import java.util.Scanner;

/*
Faça um Programa que leia três números e mostre-os em ordem decrescente.
 */
public class EX09OrdemDescrescente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int espacoNoVetor = 3;
        int numeros[] = new int[espacoNoVetor];


        for (int contador = 0; contador <3; contador++){
            System.out.print("Informe o valor da " + contador +"° posicao do vetor: ");
            numeros[contador] = scanner.nextInt();
        }

        for (int contador = 2; contador >= 0; contador--){
            System.out.println(" ");
            System.out.print(numeros[contador]);
        }
        scanner.close();
    }
}

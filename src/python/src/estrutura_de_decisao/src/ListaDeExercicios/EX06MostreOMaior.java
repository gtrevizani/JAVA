package estrutura_de_decisao.src.ListaDeExercicios;

import java.util.Scanner;

//Faça um programa que leia três números e mostre o maior deles.
public class EX06MostreOMaior {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadeDoVetor = 3;
        int numerosNoVetor[] = new int[quantidadeDoVetor];
        int i, maior;


        for (i=0; i<3; i++){
            System.out.print("Insira o " + i +"° numero: ");
            numerosNoVetor[i] = scanner.nextInt();
        }

        maior = numerosNoVetor[0];

        for (i=0; i<3; i++){
            if (maior<numerosNoVetor[i]){
                maior=numerosNoVetor[i];
            }
        }

        System.out.println("O maior valor é: " + maior);
        scanner.close();
    }
}

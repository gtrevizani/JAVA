package estrutura_de_decisao.src.ListaDeExercicios;

import java.util.Scanner;
//Maior e o menor entre os 3 numeros
public class EX07MaiorEMenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadeDoVetor = 3;
        int numerosNoVetor[] = new int[quantidadeDoVetor];


        for (int i=0; i<3; i++){
            System.out.print("Insira o " + i +"° numero: ");
            numerosNoVetor[i] = scanner.nextInt();
        }
        int maior = numerosNoVetor[0];
        for (int i=0; i<3; i++){
            if (maior<numerosNoVetor[i]){
                maior=numerosNoVetor[i];
            }
        }
        int menor = numerosNoVetor[0];
        for (int i=0; i<3; i++){
            if(menor>numerosNoVetor[i]){
                menor=numerosNoVetor[i];
            }
        }
        System.out.println("O maior valor é: " + maior);
        System.out.println("O menor valor é: " + menor);
    }
}

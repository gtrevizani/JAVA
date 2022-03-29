package estrutura_de_decisao.src.ListaDeExercicios;

import java.util.Scanner;

/*
Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar,
sabendo que a decisão é sempre pelo mais barato.
 */
public class EX08PreferenciaPeloMaisBarato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcoesDeProdutos = 3;
        int precoDosProdutos[] = new int[opcoesDeProdutos];


        for (int contador = 0; contador <3; contador++){
            System.out.print("Insira o preco do " + contador +"° produto: ");
            precoDosProdutos[contador] = scanner.nextInt();
        }

        int menorPreco = precoDosProdutos[0];
        for (int contador = 0; contador <3; contador++){
            if(menorPreco > precoDosProdutos[contador]){
                menorPreco = precoDosProdutos[contador];
            }
        }
        System.out.println(" ");
        System.out.println("A melhor escolha e o produto que custa R$" + menorPreco + " reais");

        scanner.close();
    }
}

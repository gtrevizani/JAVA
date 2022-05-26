package cad00_variaveis_e_constantes.pratica;

import java.util.Scanner;

/*
Crie um programa que vai receber do usuário o valor do produto e a quantidade do produto que se deseja.
Com essas informações encontre o subtotal que será o valor do produto multiplicado pela quantidade.

Depois você vai precisar usar uma estrutura de decisão.
Se a quantidade desejada do produto for maior que 10 unidades, vai ser preciso dar um desconto de 10% em cima do subtotal,
mas se for menor que 10, você NÃO aplica desconto algum.

Para encontrar o valor referente ao percentual de desconto (que vai ser 0% ou 10%, dependendo da quantidade) você multiplica
 o subtotal pelo próprio percentual e divide tudo por 100.
Tendo o valor referente ao percentual de desconto, você vai retirar esse valor do subtotal. O que sobrar será o valor total
final e deverá ser apresentado no console.
 */
public class EX04_ALGORITMO_PRODUTO_E_METODOS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int desconto = 10;
        int totalPorcentagem = 100;

        System.out.print("Informe o valor do produto: ");
        double valorProduto = scanner.nextDouble();
        System.out.print("Informe a quantidade do produto desejada: ");
        int quantidadeProduto = scanner.nextInt();

        double subtotal = obterSubtotal(valorProduto, quantidadeProduto);

        if(quantidadeProduto>10){
            double valorFinalComDesconto = obterValorFinalComDesconto(desconto, totalPorcentagem, subtotal);
            System.out.println("O valor final e: " + valorFinalComDesconto);
        } else {
            System.out.println("O valor final e: " + subtotal);
        }
        scanner.close();
    }

    private static double obterSubtotal(double valorProduto, double quantidadeProduto) {
        return valorProduto * quantidadeProduto;
    }

    private static double obterValorFinalComDesconto(int desconto, int totalPorcentagem, double subtotal) {
        return subtotal - (subtotal * desconto) / totalPorcentagem;
    }
}

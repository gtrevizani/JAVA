package estrutura_de_decisao.src.ListaDeExercicios;

import java.util.Scanner;

//Faça um programa que peça um valor e mostre na tela se o valor é positivo ou negativo
public class EX02ValorPositivoOuNegativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um valor: ");

        Double valor = scanner.nextDouble();

        if(valor>=0){
            System.out.println("O valor " + valor + " é positivo.");
        }
        else if(valor<0) {
            System.out.println("O valor " + valor + " é negativo.");
        }
        scanner.close();
    }
}
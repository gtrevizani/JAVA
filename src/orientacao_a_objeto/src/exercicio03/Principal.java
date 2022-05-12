package exercicio03;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos produtos?");
        int quantidadeProdutos = scanner.nextInt();
        scanner.nextLine();

        Estoque estoque = new Estoque();
        estoque.produtos = new Produto[quantidadeProdutos];

        for(int i = 0; i < estoque.produtos.length; i++){
            estoque.produtos[i] = new Produto();
            System.out.println("Produto " + i);
            System.out.println("------------");
            System.out.println("Informe descrição do produto:");
            estoque.produtos[i].descricao = scanner.nextLine();
            System.out.println("Informe quantidade de itens:");
            estoque.produtos[i].quantidade = scanner.nextInt();
            scanner.nextLine();
        }
        estoque.listarProdutos();
        scanner.close();
    }
}

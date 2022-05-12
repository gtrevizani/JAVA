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
        ArrayList<String> produtos = new ArrayList<>();

        for(int i = 0; i<5; i++){
            System.out.print("Produto " + i + ": ");
            String produto = scanner.nextLine();

            produtos.add(produto);
        }
        Path arquivo = Paths.get("C:\\Users\\Administrador\\Desktop\\tarefa.txt");
        Files.write(arquivo, produtos);
        scanner.close();
    }
}

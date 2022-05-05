package leitura_e_escrita_de_dados_em_arquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio01 {
    /*
Crie uma lista de tarefas e salve a lista em um arquivo
Crie um programa que vai receber, através do console, uma lista de atividades que vai ajudar o usuário a planejar suas
tarefas para o dia seguinte.
Depois que o usuário informar, uma a uma, suas tarefas, as mesmas serão salvas em um arquivo de texto - cada tarefa vai
 ocupar uma linha desse arquivo.
Para receber cada tarefa do usuário, use o laço while. Enquanto o usuário não digitar um "x" no console, continue
pedindo que ele informe as atividades.
 */
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tarefas = new ArrayList<>();

        String tarefa;
        int i = 0;

        while(true) {
            System.out.print("Tarefa " + i * -1 + ": a");
            tarefa = scanner.nextLine();

            if("x".equals(tarefa)){
                break;
            }
            tarefas.add(tarefa);
            i--;
        }

        escreverNoArquivo("C:\\Users\\Administrador\\Desktop\\arquivo.txt", tarefas);
        scanner.close();
    }

    private static void escreverNoArquivo(String arquivo, ArrayList<String> tarefas) throws IOException {
        Path path = Paths.get(arquivo);
        Files.write(path, tarefas);
    }
}

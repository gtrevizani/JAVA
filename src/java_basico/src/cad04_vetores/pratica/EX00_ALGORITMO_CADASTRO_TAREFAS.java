package cad04_vetores.pratica;

import java.util.Scanner;

/*
Crie um sistema onde o usuário vai cadastrar, utilizando o console, as 5 tarefas mais importantes do dia dele.
Armazene cada uma dessas tarefas em um vetor e, no final, imprima as tarefas novamente.
 */
public class EX00_ALGORITMO_CADASTRO_TAREFAS {
    public static void main(String[] args) {
        String[] tarefas = new String[6];
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i< tarefas.length; i++){
            System.out.print("Insira a " + i + "° tarefa mais importante do seu dia: ");
            tarefas[i] = scanner.nextLine();
        }
        System.out.println(" ");
        System.out.println("As 5 tarefas mais importantes do seu dia:");
        for(int i = 1; i<  tarefas.length; i++){

            System.out.println("["+i+"]" + tarefas[i]);
        }
        scanner.close();
    }
}

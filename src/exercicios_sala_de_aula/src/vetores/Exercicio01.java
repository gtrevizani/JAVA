package vetores;

import java.util.Scanner;

/*
Crie um sistema onde o usuário vai cadastrar, utilizando o console, as 5 tarefas mais importantes do dia dele.
Armazene cada uma dessas tarefas em um vetor e, no final, imprima as tarefas novamente.
 */
public class Exercicio01 {
    public static void main(String[] args) {
        String tarefas[] = new String[6];
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i< tarefas.length; i++){
            System.out.print("Insira a " + i + "° tarefa mais importante: ");
            tarefas[i] = scanner.nextLine();
        }
        for(int i = 1; i<  tarefas.length; i++){
            System.out.println("["+i+"]" + tarefas[i]);
        }
    }
}

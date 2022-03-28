package estrutura_de_decisao.src.ListaDeExercicios;

import java.util.Scanner;

//Faça um programa que verifique se uma letra digitada é "F" ou "M".
//Conforme a letra escrever: F - Feminino, M - Masculinio, Sexo Inválido.
public class EX03EscolhaSexo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira uma opção (F ou M): ");
        char caractere = scanner.nextLine().charAt(0);

        if (caractere=='f' || caractere=='F'){
            System.out.println("Feminino.");
        }
        else if (caractere=='m' || caractere=='M'){
            System.out.println("Masculino.");
        }
        else{
            System.out.println("Sexo inválido.");
        }
        scanner.close();
    }
}

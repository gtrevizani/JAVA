package estrutura_de_decisao.src.ListaDeExercicios;

import java.util.Scanner;
/*
Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
"Telefonou para a vítima?"
"Esteve no local do crime?"
"Mora perto da vítima?"
"Devia para a vítima?"
"Já trabalhou com a vítima?" O programa deve no final emitir uma classificação sobre a participação da pessoa no crime.
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como "Cúmplice"
e 5 como "Assassino". Caso contrário, ele será classificado como "Inocente".

 */
public class EX25k {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ISTO É UM INTERROGATORIO CRIMINAL, POR FAVOR RESPONDA COM SERIEDADE!\n" +
                "OBS: RESPONDA TODAS AS PERGUNTAS COM [s] PARA SIM E [n] PARA NÃO.\n" +
                "\nVocê telefonou para a vítima? ");
        char telefonouParaVitima = scanner.next().charAt(0);
        System.out.print("Você esteve no local do crime? ");
        char esteveNoLocalDoCrime = scanner.next().charAt(0);
        System.out.print("Você mora perto da vítima? ");
        char moraPertoDaVitima = scanner.next().charAt(0);
        System.out.print("Você devia para a vítima? ");
        char deviaParaVitima = scanner.next().charAt(0);
        System.out.print("Você já trabalhou com a vítima? ");
        char trabalhouComVitima = scanner.next().charAt(0);

        int taxaDeRespostas = 0; //cada resposta positiva deve ser consirada +1

        if (telefonouParaVitima == 's') {
            taxaDeRespostas += 1;
        } else if (esteveNoLocalDoCrime == 's') {
            taxaDeRespostas += 1;
        } else if (moraPertoDaVitima == 's') {
            taxaDeRespostas += 1;
        } else if (deviaParaVitima == 's') {
            taxaDeRespostas += 1;
        } else if (trabalhouComVitima == 's') {
            taxaDeRespostas += 1;
        }

        if (taxaDeRespostas == 2) {
            System.out.println(" ");
            System.out.print("Você é um possível suspeito!");
        } else if (taxaDeRespostas == 3 || taxaDeRespostas == 4) {
            System.out.println(" ");
            System.out.print("Você é cumplice do assasinato!");
        } else if (taxaDeRespostas == 5) {
            System.out.println(" ");
            System.out.print("Você é o assasino!");
        } else{
            System.out.println(" ");
            System.out.println("Você esta liberado, inocente.");
        }
        scanner.close();
    }
}

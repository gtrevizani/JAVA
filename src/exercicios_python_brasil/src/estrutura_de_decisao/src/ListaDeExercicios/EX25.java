import java.util.Scanner;

public class Atividade_25 {
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

        if(telefonouParaVitima == 's') {
            taxaDeRespostas = taxaDeRespostas + 1;
            if(esteveNoLocalDoCrime == 's') {
                taxaDeRespostas = taxaDeRespostas + 1;
                if (moraPertoDaVitima == 's') {
                    taxaDeRespostas = taxaDeRespostas + 1;
                    if (deviaParaVitima == 's') {
                        taxaDeRespostas = taxaDeRespostas + 1;
                        if (trabalhouComVitima == 's') {
                            taxaDeRespostas = taxaDeRespostas + 1;
                        }
                    }
                }
            }
        } if(taxaDeRespostas == 5) {
            System.out.print("Você é o assasino!");
        } else if (taxaDeRespostas == 2) {
            System.out.print("Você é um possível suspeito!");
        } else if (taxaDeRespostas == 3 || taxaDeRespostas == 4) {
            System.out.print("Você é cumplice do assasinato!");
        } else if(taxaDeRespostas == 1) {
            System.out.print("Você esta liberado, inocente.");
        } else {
            System.out.print("insira valores validos.");
        }
        scanner.close();
    }

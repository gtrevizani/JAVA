package estrutura_de_decisao.src.ListaDeExercicios;

import java.util.Scanner;

/*
Faça um programa que lê as duas notas parciais obtidas por um aluno numa disciplina ao longo de um semestre, e calcule a
sua média. A atribuição de conceitos obedece à tabela abaixo:

Média de Aproveitamento  Conceito
  Entre 9.0 e 10.0        A
  Entre 7.5 e 9.0         B
  Entre 6.0 e 7.5         C
  Entre 4.0 e 6.0         D
  Entre 4.0 e zero        E

 O algoritmo deve mostrar na tela as notas, a média, o conceito correspondente e a mensagem “APROVADO” se o conceito
 for A, B ou C ou “REPROVADO” se o conceito for D ou E.
 */
public class EX14MediasParciais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a 1° nota: ");
        Double notaUm = scanner.nextDouble();
        System.out.print("Informe a 2° nota: ");
        Double notaDois = scanner.nextDouble();
        System.out.println(" ");

        Double media = (notaUm + notaDois)/2;

        if(media<=4){
            System.out.println("1° nota: " + notaUm);
            System.out.println("2° nota: " + notaDois);
            System.out.println("Media: " + media);
            System.out.println("Conceito: E");
            System.out.println(" ");
            System.out.println("REPROVADO");
        }
        else if(media>4 && media<=6){
            System.out.println("1° nota: " + notaUm);
            System.out.println("2° nota: " + notaDois);
            System.out.println("Media: " + media);
            System.out.println("Conceito: D");
            System.out.println(" ");
            System.out.println("REPROVADO");
        }
        else if(media>6 && media<=7.5){
            System.out.println("1° nota: " + notaUm);
            System.out.println("2° nota: " + notaDois);
            System.out.println("Media: " + media);
            System.out.println("Conceito: C");
            System.out.println(" ");
            System.out.println("APROVADO");
        }
        else if(media>7.5 && media<=9){
            System.out.println("1° nota: " + notaUm);
            System.out.println("2° nota: " + notaDois);
            System.out.println("Media: " + media);
            System.out.println("Conceito: B");
            System.out.println(" ");
            System.out.println("APROVADO");
        }
        else if(media>9 && media<=10){
            System.out.println("1° nota: " + notaUm);
            System.out.println("2° nota: " + notaDois);
            System.out.println("Media: " + media);
            System.out.println("Conceito: A");
            System.out.println(" ");
            System.out.println("APROVADO");
        }
    }
}

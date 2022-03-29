package estrutura_de_decisao1.src.estrutura_de_decisao;

import java.util.Scanner;

/*
 * Crie um programa que vai receber as notas que uma pessoa tirou na de PORTUGUES e MATEMATICA de sua prova.
 *
 * Serão dois parâmetros para receber. um para receber a nota de português e outro para receber as de matemática.

* NOTA_MÍNIMA_PROVA = 150 PONTOS
* NOTA_MÁXIMA_PROVA = 200 PONTOS
* NOTA_TOTAL_MATERIA = 100
* NOTA_MINIMA_MATERIA = 60
*
 *A prova, no total, vale 200 pontos - 100 para cada matéria. A nota mínima total para passar é igual ou maior que 150.
 *
 * Entretanto, o candidato não pode tirar menos do que 60 pontos em qualquer uma das duas matérias, ou seja,
 * se tirar 59 em português e 100 em matemática (totalizando uma nota maior do que o total necessário que é 150)
 * ele não conseguirá a vaga.

 *No final mostre para o candidato se ele conseguiu ou não.
 */
public class Exercicio01 {
    static final short NOTA_MINIMA_PORTUGUES_E_MATEMATICA = 150;
    static final byte NOTA_MAXIMA_POR_MATERIA = 100;
    static final byte NOTA_MINIMA_POR_MATERIA = 60;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe sua nota em Portugues: ");
        Double notaPortugues = scanner.nextDouble();
        System.out.print("Informe sua nota em Matematica: ");
        Double notaMatematica = scanner.nextDouble();

        Double notaTotal = notaMatematica + notaPortugues;

        Boolean temNotaMinimaEmPortugues = notaPortugues >= NOTA_MINIMA_POR_MATERIA;
        Boolean temNotaMinimaEmMatematica = notaMatematica >= NOTA_MINIMA_POR_MATERIA;
        Boolean temNotaSuficientePraAprovacao = notaTotal >= NOTA_MINIMA_PORTUGUES_E_MATEMATICA;

        if(temNotaMinimaEmMatematica && temNotaMinimaEmPortugues) {
            if (temNotaSuficientePraAprovacao) {
                System.out.print("Parabens, voce conseguiu a vaga.");
            } else {
                System.out.print("Nota insuficiente para aprovacao. Media total: 150.");
            }
        } else {
            System.out.println("Nota insuficiente por materia. Media: 60.");
        }

        if (notaPortugues > NOTA_MAXIMA_POR_MATERIA || notaMatematica > NOTA_MAXIMA_POR_MATERIA){
            System.out.println("Nota invalida.");
        }
        if (notaPortugues < 0 || notaMatematica < 0){
            System.out.println("Nota invalida.");
        }
        scanner.close();
    }
}

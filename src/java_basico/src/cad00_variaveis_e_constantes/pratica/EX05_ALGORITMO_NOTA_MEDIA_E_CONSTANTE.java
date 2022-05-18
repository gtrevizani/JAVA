package cad00_variaveis_e_constantes.pratica;

import java.util.Scanner;

//Volte no exercicio 03 desse capitulo e transforme o valor 70 em uma constante.

public class EX05_ALGORITMO_NOTA_MEDIA_E_CONSTANTE {
    static final Integer NOTA_MINIMA_PARA_PASSAR_DE_ANO = 70;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira a nota do aluno: ");
        Double nota = scanner.nextDouble();

        Boolean passouDeAno = nota >= NOTA_MINIMA_PARA_PASSAR_DE_ANO;

        if(passouDeAno){
            System.out.println("Parabens voce passou de ano.");
        } else {
            System.out.println("Infelizmente voce reprovou.");
        }
        scanner.close();
    }
}

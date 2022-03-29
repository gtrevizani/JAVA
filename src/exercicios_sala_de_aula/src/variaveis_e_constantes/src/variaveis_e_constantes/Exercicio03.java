package variaveis_e_constantes.src.variaveis_e_constantes;

import java.util.Scanner;

/* Nota do aluno; Maior ou igual a 70: parabens você passou de ano, caso contrario
infelizmente vc reprovou*/

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira a nota do aluno: ");
        Double nota = scanner.nextDouble();
        if(nota>=70){
            System.out.println("Parabens voce passou de ano.");
        } else {
            System.out.println("Infelizmente voce reprovou.");
        }
    }
}

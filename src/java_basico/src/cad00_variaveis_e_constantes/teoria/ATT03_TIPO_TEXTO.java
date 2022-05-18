package cad00_variaveis_e_constantes.teoria;

import java.util.Scanner;


/*
TIPO TEXTO REPRESENTADO POR STRING OU CHARACTER;
 */


public class ATT03_TIPO_TEXTO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome = scanner.nextLine();
        System.out.println("Olá " + nome + "!");
        scanner.close();
        Character variavelChar = 'A';
    }
}
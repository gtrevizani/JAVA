package cad00_variaveis_e_constantes.teoria;

import java.util.Scanner;

/*
CONSTANTE REPRESENTADA POR "STATIC FINAL" + TIPO + NOME + DADO;


EX: static final Double PI = 3.14;
 */


public class ATT04_CONSTANTES {
    static final Integer IDADE_MINIMA_PARA_TIRAR_CARTEIRA = 18;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //final Integer idadeMinimaParaTirarCarteira = 18;

        System.out.print("idade: ");
        Integer idade = scanner.nextInt();

        Boolean podeTirarCarteira = idade >= IDADE_MINIMA_PARA_TIRAR_CARTEIRA;

        if(podeTirarCarteira){
            System.out.println("Sim! Ele(a) pode tirar carteira");
        }else{
            System.out.println("Nao! Ele(a) não pode tirar carteira");
        }
        scanner.close();
    }
}

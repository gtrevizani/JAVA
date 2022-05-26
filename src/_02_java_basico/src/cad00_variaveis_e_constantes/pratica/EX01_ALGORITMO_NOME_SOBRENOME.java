package cad00_variaveis_e_constantes.pratica; // pacote projeto

import java.util.Scanner;

public class EX01_ALGORITMO_NOME_SOBRENOME { // nome classe
	public static void main(String[] args) { // principal
		Scanner scanner = new Scanner(System.in); // inje��o de objeto
		
		System.out.print("Digite seu nome: "); // impress�o
		String nome = scanner.nextLine(); // leitura do teclado
		
		System.out.print("Digite seu sobrenome: "); // impress�o
		String sobrenome = scanner.nextLine(); // leitura do teclado
		
		System.out.println("Ola " + nome + " " + sobrenome + "!"); // impress�o de vari�vel com texto

		scanner.close(); // fechamento do objeto
	}

}

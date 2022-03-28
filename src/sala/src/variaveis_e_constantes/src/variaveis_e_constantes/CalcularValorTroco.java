package variaveis_e_constantes.src.variaveis_e_constantes; // pacote projeto

import java.util.Scanner;

public class CalcularValorTroco { // nome da classe

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // injeção de objeto

		System.out.print("Digite o valor do produto: "); // impressão na tela
		Double valorProduto = scanner.nextDouble(); // leitura do teclado

		System.out.print("Digite quantidade passada pelo cliente: "); // impressão na tela
		Double valorPassadoPeloCliente = scanner.nextDouble(); // leitura do teclado

		Double resultado = valorPassadoPeloCliente - valorProduto; // operação matemática

		System.out.println("Troco: " + resultado); // impressão de resultado

		scanner.close(); // fechamento de classe
	}

}

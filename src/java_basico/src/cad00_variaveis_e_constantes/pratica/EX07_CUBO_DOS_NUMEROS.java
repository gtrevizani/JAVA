package cad00_variaveis_e_constantes.pratica;

import java.util.Scanner;

public class EX07_CUBO_DOS_NUMEROS {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe um numero: ");
		Integer numero = scanner.nextInt();
		
		Integer cubo = numero * numero * numero;
		
		System.out.println("O cubo de " + numero + " e " + cubo + ".");
		
		scanner.close();
	}

}

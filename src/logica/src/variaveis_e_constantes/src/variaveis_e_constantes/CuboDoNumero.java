package variaveis_e_constantes.src.variaveis_e_constantes;

import java.util.Scanner;

public class CuboDoNumero {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe um numero: ");
		Integer numero = scanner.nextInt();
		
		Integer cubo = numero * numero * numero;
		
		System.out.println("O cubo de " + numero + " e " + cubo + ".");
		
		scanner.close();
	}

}

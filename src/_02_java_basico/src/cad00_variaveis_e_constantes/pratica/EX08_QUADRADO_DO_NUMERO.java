package cad00_variaveis_e_constantes.pratica;
import java.util.Scanner;
public class EX08_QUADRADO_DO_NUMERO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 

        System.out.println("Informe um numero: ");
        Integer numero = scanner.nextInt();

        Integer quadrado = numero * numero;

        System.out.println("O quadrado de " + numero + " e " + quadrado + ".");

        scanner.close();
    }
}
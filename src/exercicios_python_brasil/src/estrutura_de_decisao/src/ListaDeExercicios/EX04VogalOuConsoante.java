package estrutura_de_decisao.src.ListaDeExercicios;

import java.util.Scanner;

//Faça um programa que verifique se uma letra digitada é vogal ou consoante.
public class EX04VogalOuConsoante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira uma letra: ");
        char letra = scanner.nextLine().charAt(0);

        if (letra=='A' || letra=='E' || letra=='I' || letra=='O' || letra=='U' || letra=='a' || letra=='e' || letra=='i' || letra=='o' || letra=='u'){
            System.out.println("Esta letra é uma vogal.");
        }
        else{
            System.out.println("Esta letra é uma consoante.");
        }
        scanner.close();
    }
}

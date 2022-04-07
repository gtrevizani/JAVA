package estrutura_de_decisao.src.ListaDeExercicios;

import java.util.Scanner;

//Faça um programa que verifique se uma letra digitada é vogal ou consoante.
public class EX04VogalOuConsoante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadeVogal = 10;
        int vogaisNoVetor[] = new int[quantidadeVogal];
        int quantidadeConsoante = 42;
        int consoantesNoVetor[] = new int[quantidadeConsoante];

        vogaisNoVetor[0] = 'A'; consoantesNoVetor[0] = 'B'; consoantesNoVetor[10] = 'H'; consoantesNoVetor[20] = 'N';
        vogaisNoVetor[1] = 'a'; consoantesNoVetor[1] = 'b'; consoantesNoVetor[11] = 'h'; consoantesNoVetor[21] = 'n';
        vogaisNoVetor[2] = 'E'; consoantesNoVetor[2] = 'C'; consoantesNoVetor[12] = 'J'; consoantesNoVetor[22] = 'P';
        vogaisNoVetor[3] = 'e'; consoantesNoVetor[3] = 'c'; consoantesNoVetor[13] = 'j'; consoantesNoVetor[23] = 'p';
        vogaisNoVetor[4] = 'I'; consoantesNoVetor[4] = 'D'; consoantesNoVetor[14] = 'K'; consoantesNoVetor[24] = 'Q';
        vogaisNoVetor[5] = 'i'; consoantesNoVetor[5] = 'd'; consoantesNoVetor[15] = 'k'; consoantesNoVetor[25] = 'q';
        vogaisNoVetor[6] = 'O'; consoantesNoVetor[6] = 'F'; consoantesNoVetor[16] = 'L'; consoantesNoVetor[26] = 'R';
        vogaisNoVetor[7] = 'o'; consoantesNoVetor[7] = 'f'; consoantesNoVetor[17] = 'l'; consoantesNoVetor[27] = 'r';
        vogaisNoVetor[8] = 'U'; consoantesNoVetor[8] = 'G'; consoantesNoVetor[18] = 'M'; consoantesNoVetor[28] = 'S';
        vogaisNoVetor[9] = 'u'; consoantesNoVetor[9] = 'g'; consoantesNoVetor[19] = 'm'; consoantesNoVetor[29] = 's';
                                consoantesNoVetor[30] = 'T'; consoantesNoVetor[31] = 't'; consoantesNoVetor[32] = 'V';
                                consoantesNoVetor[33] = 'v'; consoantesNoVetor[34] = 'X'; consoantesNoVetor[35] = 'x';
                                consoantesNoVetor[36] = 'Y'; consoantesNoVetor[37] = 'y'; consoantesNoVetor[38] = 'W';
                                consoantesNoVetor[39] = 'w'; consoantesNoVetor[40] = 'Z'; consoantesNoVetor[41] = 'z';


        System.out.print("Insira uma letra: ");
        char letra = scanner.nextLine().charAt(0);

        boolean sinal = false;
        for (int i = 0; i < 10; i++) {
            if (letra == vogaisNoVetor[i]) {
                System.out.println("Essa letra é uma vogal.");
                sinal = true;
            }
        }
        for(int i=0; i<42; i++){
            if(letra==consoantesNoVetor[i]){
                System.out.println("Essa letra é uma consoante");
                sinal = true;
            }
        }
        if(!sinal){
            System.out.println("Caracetere inválido.");
        }
        scanner.close();
    }
}

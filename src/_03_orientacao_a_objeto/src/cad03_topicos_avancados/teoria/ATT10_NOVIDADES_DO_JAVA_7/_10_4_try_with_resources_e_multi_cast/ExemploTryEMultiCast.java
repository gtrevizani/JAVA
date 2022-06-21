package cad03_topicos_avancados.teoria.ATT10_NOVIDADES_DO_JAVA_7._10_4_try_with_resources_e_multi_cast;

import java.util.Scanner;

public class ExemploTryEMultiCast {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)){
            System.out.print("Informe seu nome: ");
            String nome = entrada.nextLine();

            System.out.print("Informe sua idade: ");
            String idade = entrada.nextLine();

            try{
                SalvarAluno.salvar(nome, idade);
            } catch (NegocioException | NumberFormatException e){
                System.out.println("Impossível completar operação. Motivo: " + e.getMessage());
            }
        }
    }
}

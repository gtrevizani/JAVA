package estrutura_de_decisao.src.estrutura_de_decisao;

import java.util.Scanner;

public class UtilizandoIfEncadeado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o peso: ");
        double peso = scanner.nextDouble();

        boolean pesoLeve = (peso<=60) && (peso>0);
        boolean pesoMedio = (peso>60) && (peso<=90);
        boolean pesoPesado = peso >90;

        if (pesoLeve) {
            System.out.println("O lutador e peso leve");
        } else if (pesoMedio) {
            System.out.println("O lutador e peso medio");
        } else if (pesoPesado) {
            System.out.println("O lutador e peso pesado");
        } else {
            System.out.println("O lutado nao se encaixa em categoria alguma");
        }
        scanner.close();
    }
}

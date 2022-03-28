package estrutura_sequencial.src.ListaDeExercicios;
//O programa deverá pedir o tamanho em metros quadrados da área a ser pintada. Considere que a
//cobertura da tinta é de 1 litro para cada 6 metros quadrados e a tinta é vendida em latas de 18 litros
//que custam R$80,00 ou em galões de 3,6 litros que custam R$25,00.
//
//Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3 situações:
//
//a) comprar apenas latas de 18 litros;
//b) comprar apenas galões de 3,6 litros;
//c) misturar latas e galões, de forma que o desperdício de tinta seja menor. Acrescente 10% de folga
//e sempre arredonde os valores para cima, isto é, considere latas cheias.

import java.util.Scanner;

public class EX17LojaDeTintasParteDois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double coberturaEmMetrosQuadradosParaUmLitroDeTinta = 6;
        double quantidadeDeLitrosEmUmaLata = 18;
        double precoDaLataDeTinta = 80;
        double quantidadeDeLitrosEmUmGalao = 3.6;
        double precoDoGalaoDeTinta = 25;
        double media = 2;
        double folga = 10;
        double totalDaPorcentagem = 100;

        System.out.print("Tamanho da área a ser decorada (m²): ");
        Double area = scanner.nextDouble();
        System.out.println(" ");

        Double quantidadeLitrosDeTinta = obterQuantidadeLitrosDeTinta(area, coberturaEmMetrosQuadradosParaUmLitroDeTinta);
        Double quantidadeLatasDeTinta18Litros = obterQuantidadeLatasDeTinta18Litros(quantidadeLitrosDeTinta, quantidadeDeLitrosEmUmaLata);
        Double precoTotalLataDeTinta18Litros = obterPrecoTotalLataDeTinta18Litros(quantidadeLatasDeTinta18Litros, precoDaLataDeTinta);

        Double quantidadeGalaoDeTinta3LitrosE600ML = obterQuantidadeGalaoDeTinta3LitrosE600ML(quantidadeLitrosDeTinta, quantidadeDeLitrosEmUmGalao);
        Double precoTotalGalaoDeTinta3LitrosE600ML = obterPrecoTotalGalaoDeTinta3LitrosE600ML(quantidadeGalaoDeTinta3LitrosE600ML, precoDoGalaoDeTinta);

        Double precoTotalGalaoELata = obterPrecoTotalGalaoELata(precoTotalLataDeTinta18Litros, precoTotalGalaoDeTinta3LitrosE600ML, media);
        Double precoTotalGalaoELataComFolga = obterPrecoTotalGalaoELataComFolga(precoTotalGalaoELata, folga, totalDaPorcentagem);

        System.out.println("Latas de tinta de 18 litros a serem compradas: " + quantidadeLatasDeTinta18Litros);
        System.out.println("Preço total com latas de 18 litros: " + precoTotalLataDeTinta18Litros);
        System.out.println("Galão de tinta de 3,6 litros a serem compradas: " + quantidadeGalaoDeTinta3LitrosE600ML);
        System.out.println("Preço total com galões de 3,6 litros: " + precoTotalGalaoDeTinta3LitrosE600ML);
        System.out.println("Preço misturado e com 10% de folga: " + precoTotalGalaoELataComFolga);
        scanner.close();
    }

    private static double obterQuantidadeLitrosDeTinta(Double area, Double coberturaEmMetrosQuadradosParaUmLitroDeTinta) {
        return Math.ceil(area / coberturaEmMetrosQuadradosParaUmLitroDeTinta);
    }

    private static double obterQuantidadeLatasDeTinta18Litros(Double quantidadeLitrosDeTinta, Double quantidadeDeLitrosEmUmaLata) {
        return Math.ceil(quantidadeLitrosDeTinta / quantidadeDeLitrosEmUmaLata);
    }

    private static double obterPrecoTotalLataDeTinta18Litros(Double precoTotalLatasDeTinta, Double precoDaLataDeTinta) {
        return Math.ceil(precoTotalLatasDeTinta * precoDaLataDeTinta);
    }

    private static double obterQuantidadeGalaoDeTinta3LitrosE600ML(Double quantidadeLitrosDeTinta, Double quantidadeDeLitrosEmUmGalao) {
        return Math.ceil(quantidadeLitrosDeTinta / quantidadeDeLitrosEmUmGalao);
    }

    private static double obterPrecoTotalGalaoDeTinta3LitrosE600ML(Double precoGalaoDeTinta3LitrosE600ML, Double precoDoGalaoDeTinta) {
        return Math.ceil(precoGalaoDeTinta3LitrosE600ML * precoDoGalaoDeTinta);
    }

    private static double obterPrecoTotalGalaoELata(Double precoTotalLataDeTinta18Litros, Double precoTotalGalaoDeTinta3LitrosE600ML, Double media) {
        return Math.ceil((precoTotalLataDeTinta18Litros + precoTotalGalaoDeTinta3LitrosE600ML) / media);
    }

    private static double obterPrecoTotalGalaoELataComFolga(Double precoGalaoELata, Double folga, Double totalDaPorcentagem) {
        return Math.ceil(precoGalaoELata - (precoGalaoELata * folga) / totalDaPorcentagem);
    }
}
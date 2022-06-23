package cad03_topicos_avancados._6_9_exercicios._06_03_desafio_numeros;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

/*
Desenvolva um programa que:
Recebe como parâmetro do usuário o valor de um produto do tipo double.

Instancia um objeto do tipo BigDecimal atribuindo o valor double a ele.
Calcula 10% do valor usando os métodos disponíveis na classe BigDecimal.
Formata o novo valor calculado para o padrão monetário (R$).
Exibe na tela o valor calculado e formatado.
 */
public class DesafioNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat f = new DecimalFormat("R$ #,##0.00");

        System.out.print("Informe o valor de um produto: ");
        Double produto = scanner.nextDouble();

        BigDecimal bg = new BigDecimal(produto);
        bg = bg.divide(BigDecimal.TEN);
        System.out.println("10% do valor é: " + f.format(bg));

        BigDecimal valor = new BigDecimal(produto);
        BigDecimal resultado = valor.multiply(BigDecimal.TEN).divide(new BigDecimal(100));
        String valorFormatado = f.format(resultado.doubleValue());
        System.out.println("10% do valor é: " + valorFormatado);
    }
}
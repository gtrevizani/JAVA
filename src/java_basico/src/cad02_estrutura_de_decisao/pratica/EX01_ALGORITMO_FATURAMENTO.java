package cad02_estrutura_de_decisao.pratica;

import java.util.Scanner;

/*
Pense em uma empresa fictícia que toodo o mês de Janeiro premia seus funcionários com um bônus, caso a meta seja alcançada.

Crie um programa que receba 3 parâmetros.
O primeiro será a meta de faturamento anual da empresa para o ano que passou.
Depois, receba o parâmetro referente ao faturamento real da empresa no ultimo ano.
Por último, receba a média salarial do funcionário(a) para o ano anterior (não precisa fazer cálculo de média salarial,
já que estamos trabalhando com um algoritmo fictício - na hora de informar esse parâmetro, invente um valor qualquer para
representar essa média salarial).

Nessa empresa fictícia, se o faturamento real for igual ou maior que a meta de faturamento anual, então os funcionários
ganharam um bônus que será igual a média salarial deles no último ano. Caso o faturamento seja menor que a meta, mas,
seja maior ou igual a 80% do valor da meta, então eles receberão também 80% de sua média salarial.

No final, mostre de quanto será o prêmio desse funcionário(a).
 */
public class EX01_ALGORITMO_FATURAMENTO {
    static final Double META_DE_FATURAMENTO_ULTIMO_ANO = 100000.00;
    static final Double FATURAMENTO_REAL_ULTIMO_ANO = 80000.00;
    static final Double MEDIA_SALARIAL = 1000.00;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if(FATURAMENTO_REAL_ULTIMO_ANO >= META_DE_FATURAMENTO_ULTIMO_ANO){
            Double salarioComBonus = MEDIA_SALARIAL;
            System.out.println("Prêmio do funcionario: " + salarioComBonus);
        }else{
            Double salarioComBonus = 0.8 * MEDIA_SALARIAL;
            System.out.println("Prêmio do funcionario: " + salarioComBonus);
        }
        scanner.close();
    }
}

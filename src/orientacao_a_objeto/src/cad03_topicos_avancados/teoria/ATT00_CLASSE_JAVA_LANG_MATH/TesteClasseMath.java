package cad03_topicos_avancados.teoria.ATT00_CLASSE_JAVA_LANG_MATH;

import static java.lang.Math.max;
import static java.lang.Math.PI;


public class TesteClasseMath {
    public static void main(String[] args) {
        //Comprimento de uma circunferência 2 x r x PI (3,1415)
        int raio = 4;
        double comprimento = 2 * raio * PI;
        System.out.println("Comprimento: " + comprimento);

        //Máximo e mínimo
        double[] precosProdutoA = {30.20, 25.49};
        double maiorPreco = max(precosProdutoA[0], precosProdutoA[1]);
        System.out.println("Maior preço: " + maiorPreco);
        System.out.println("Menor preço: " + Math.min(precosProdutoA[0], precosProdutoA[1]));

        //Potência
        System.out.println("2^3: " + Math.pow(2,3));

        //Raiz quadrada
        System.out.println("Raiz de 9: " + Math.sqrt(9));

        //Arredondamento ceil, floor e round
        double n = 5.4;
        System.out.println("Menor inteiro: " + Math.floor(n));
        System.out.println("Maior inteiro: " + Math.ceil(n));
        System.out.println("Arredondamento: " + Math.round(n));

        //Trigronometria
        System.out.println("Seno: " + Math.sin(40));

        //Números randomicos
        double numeroAleatorio = Math.random() * 100;
        System.out.println(numeroAleatorio);
    }
}

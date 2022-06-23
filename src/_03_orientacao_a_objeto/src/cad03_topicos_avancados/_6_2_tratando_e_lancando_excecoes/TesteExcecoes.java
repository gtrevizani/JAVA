package cad03_topicos_avancados._6_2_tratando_e_lancando_excecoes;

public class TesteExcecoes {

    public static void main(String[] args) {
        //int numero = 5 / 0; // Lança java.lang.ArithmeticException
/*        String s = null;
        String maiuscula = s.toUpperCase(); //lança java.lang.NullPointerException */

        ContaCorrente cc = new ContaCorrente(100);

        try {
            cc.depositar(10);
        } catch (IllegalArgumentException e) {
            System.out.println("Você executou uma operação ilegal: " + e.getMessage());
        }
    }
}

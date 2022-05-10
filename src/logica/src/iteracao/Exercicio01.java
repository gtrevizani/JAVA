package iteracao;

/*
Dada a lista de números abaixo:

Integer[] numeros = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

Itere por essa lista e imprima todos os números que são divisíveis por 3.
Para descobrir se um número é divisível por 3, você pode utilizar o operador módulo.

Toda vez que o módulo de um número por 3 for igual a zero, então esse número e divisível por 3.
 */
public class Exercicio01 {
    private static final byte DIVISOR = 3;

    public static void main(String[] args) {
        // INTERAÇÃO FOR COM IF.
        Integer [] numeros = new Integer [] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        for(int i = 0; i < numeros.length; i++){
            boolean eDivisivelPeloDivisor = numeros[i] % DIVISOR == 0;
            Integer numero = numeros[i];
            if(eDivisivelPeloDivisor){
                System.out.println("O numero " + numero + " é divisivel por 3!");
            }
        }



        // CONTADOR
        for(int i = 1; i <= 5; i++){
            System.out.println(i + ": Eu amo Java!");
        }

        Double[] carrinhoDeCompras = new Double[]{50.0, 51.0, 52.0};
        Double total = 0.0;
        for(int i = 0; i < carrinhoDeCompras.length; i++){
            System.out.println("Iteração: " + i + ", Total: " + total);
            total = total + carrinhoDeCompras[i];
        }
        System.out.println("Total: " + total);



        //IF COM BREAK
        for(int i = 0; i<20; i++){
            if(i == 5){
                System.out.println("Vai parar!");
                break;
            }
        }



        //IF COM CONTINUE
        for(int i = 0; i<10; i++){
            if(i == 5){
                System.out.println("Vai continuar!");
                continue;
            }
            System.out.println("Iteração: " + i);
        }

    }
}

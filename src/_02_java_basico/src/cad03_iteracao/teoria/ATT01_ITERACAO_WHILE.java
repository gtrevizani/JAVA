package cad03_iteracao.teoria;


// Utilização do While (como se fosse for).


public class ATT01_ITERACAO_WHILE {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Eu amo Java!");
        }

        int i = 0;
        while (i<10){
            System.out.println("Eu amo Java!");
            i++;
        }

        i = 0;
        while (i<10){
            if(i==5){
                System.out.println("Vai parar!");
                break;
            }
            System.out.println(i + ": Eu amo Java");
            i++;
        }

        i =0;
        while (i<10){
            if(i==5){
                System.out.println("Vai continuar...");
                i++;
                continue;
            }
            System.out.println("Eu amo IntelliJ");
            i++;
        }

    }
}

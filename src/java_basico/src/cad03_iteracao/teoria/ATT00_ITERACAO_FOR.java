package cad03_iteracao.teoria;


// Comando if dentro do comando for.


public class ATT00_ITERACAO_FOR {
    public static void main(String[] args) {
        Integer[] produtoss = new Integer[] {100, 225, 300};

        for(int i = 0; i < produtoss.length; i++){
            Integer itens = produtoss[i];

            System.out.println("Product de código: " + itens);

            if(itens.equals(225)){
                System.out.println("Product encontrado!");
                break;
            }
        }
    }
}

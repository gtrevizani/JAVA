package iteracao;

public class iteracaoFor {
    public static void main(String[] args) {
        Integer[] produtos = new Integer[] {100, 225, 300};

        for(int i = 0; i < produtos.length; i++){
            Integer produto = produtos[i];

            System.out.println("Produto de código: " + produto);

            if(produto.equals(225)){
                System.out.println("Produto encontrado!");
                break;
            }
        }
    }
}

package cad02_orientacao_a_objetos_parte2.teoria.ATT07_SOBREPOSICAO;

public class Produto {
    protected String descricao; // Protected = disponível apenas no pacote;
    public void identificar(){ // Application Program Interface público;
        // API: provê uma interface entre duas aplicações;
        System.out.println("Minha descricao é: " + descricao + ". ");
    }
}

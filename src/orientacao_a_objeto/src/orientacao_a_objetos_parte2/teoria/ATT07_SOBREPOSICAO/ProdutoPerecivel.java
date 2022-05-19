package orientacao_a_objetos_parte2.teoria.ATT07_SOBREPOSICAO;

import java.util.Date;

public class ProdutoPerecivel extends Produto{
    protected Date dataValidade; // Precisa instanciar
    public void identificar(){
        super.identificar(); // super = invoca o método.
        System.out.println("Minha data de validade é: " + dataValidade);
    }
}

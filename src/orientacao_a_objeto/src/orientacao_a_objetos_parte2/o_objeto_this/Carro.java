package orientacao_a_objetos_parte2.o_objeto_this;

import orientacao_a_objetos_parte1.composicao_de_objetos.Proprietario;

public class Carro {
    String fabricante;
    String modelo;
    String cor;
    int anoDeFabricacao;
    boolean biCombustivel;

    Proprietario dono;

    void alterarModelo(String modelo){
        if(modelo != null){
            this.modelo = modelo;
        }
    }
}

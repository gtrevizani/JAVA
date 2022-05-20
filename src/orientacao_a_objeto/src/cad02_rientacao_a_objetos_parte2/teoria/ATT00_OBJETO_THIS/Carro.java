package cad02_rientacao_a_objetos_parte2.teoria.ATT00_OBJETO_THIS;

import cad01_orientacao_a_objetos.teoria.ATT02_COMPOSICAO_DE_OBJETOS.Proprietario;

public class Carro { // Objeto
    String fabricante; // Atributos
    String modelo;
    String cor;
    int anoDeFabricacao;
    boolean biCombustivel;

    Proprietario dono; // Objeto composto

    void alterarModelo(String modelo){ // Método com parâmetro
        if(modelo != null){
            this.modelo = modelo;
        }
    }
}

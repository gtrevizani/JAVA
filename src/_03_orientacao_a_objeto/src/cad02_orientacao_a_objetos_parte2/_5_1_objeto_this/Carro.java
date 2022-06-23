package cad02_orientacao_a_objetos_parte2._5_1_objeto_this;

import cad01_orientacao_a_objetos._4_3_composicao_de_objetos.Proprietario;

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

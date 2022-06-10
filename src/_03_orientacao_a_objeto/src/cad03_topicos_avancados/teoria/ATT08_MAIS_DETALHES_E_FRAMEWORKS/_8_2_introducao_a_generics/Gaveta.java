package cad03_topicos_avancados.teoria.ATT08_MAIS_DETALHES_E_FRAMEWORKS._8_2_introducao_a_generics;

import java.util.ArrayList;
import java.util.List;

public class Gaveta<E> { // <E> = Generic

    private List<E> colecao = new ArrayList<>(); // Dentro de Gaveta tem coleção, uma lista de genericos.

    public void colocar(E e){
        colecao.add(e);
    }

    public E retirarPrimeiro(){
        return colecao.get(0);
    }
}

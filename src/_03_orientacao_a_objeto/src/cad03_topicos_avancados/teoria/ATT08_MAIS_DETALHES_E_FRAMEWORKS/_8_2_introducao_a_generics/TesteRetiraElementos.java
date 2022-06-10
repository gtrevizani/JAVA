package cad03_topicos_avancados.teoria.ATT08_MAIS_DETALHES_E_FRAMEWORKS._8_2_introducao_a_generics;

import java.util.ArrayList;
import java.util.List;

public class TesteRetiraElementos {
    public static void main(String[] args) {
        List<Funcionario> nomes = new ArrayList<>(); // Cria uma lista
        nomes.add(new Funcionario("Ricardo")); // Adiciona um Funcionario

        Funcionario f = RetiraElementos.recuperarPrimeiro(nomes); //
        System.out.println(f.getNome());
    }
}

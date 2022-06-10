package cad03_topicos_avancados.teoria.ATT08_MAIS_DETALHES_E_FRAMEWORKS._8_2_introducao_a_generics;

public class TesteGaveta {
    public static void main(String[] args) {
        Gaveta<String> gaveta = new Gaveta<>(); // Gaveta só aceita strings, pois foi especificado, mas é Generico, poderia ser qualquer tipo a se definir.
        gaveta.colocar("Livro de Java");
        System.out.println(gaveta.retirarPrimeiro());
        Gaveta<Integer> gavetaNumeros = new Gaveta<>();
        gavetaNumeros.colocar(4);
        System.out.println(gavetaNumeros.retirarPrimeiro() + 2);
    }
}

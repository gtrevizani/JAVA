package orientacao_a_objetos_parte2.teoria.ATT05_ENUMERACOES;

public enum Naipe {
    OURO("Vermelho"), PAUS("Preto"), ESPADAS("Preto"), COPAS("Vermelho"); // Propriedades
    private String cor; // Atributo privado

    Naipe(String cor) { // Constructor
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    } // Método de chamada
}

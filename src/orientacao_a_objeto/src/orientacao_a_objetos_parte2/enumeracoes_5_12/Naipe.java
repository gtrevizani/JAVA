package orientacao_a_objetos_parte2.enumeracoes_5_12;

public enum Naipe {
    OURO("Vermelho"), PAUS("Preto"), ESPADAS("Preto"), COPAS("Vermelho");
    private String cor;

    Naipe(String cor) { // Atributo de Naipe
        this.cor = cor;
    }

    public String getCor() { // Getter
        return cor;
    }
}

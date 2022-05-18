package orientacao_a_objetos_parte2.teoria.ATT05_ENUMERACOES;

public class Carta {
    private int numero; // Atributo privado
    private Naipe naipe; // Objeto privado

    public Carta(int numero, Naipe naipe){ // Constructor
        this.numero = numero;
        this.naipe = naipe;
    }
    public void imprimirCarta(){ // Método
        System.out.println("Sou " + numero + " de " + naipe + ". E tenho a cor " + naipe.getCor());
    }
}

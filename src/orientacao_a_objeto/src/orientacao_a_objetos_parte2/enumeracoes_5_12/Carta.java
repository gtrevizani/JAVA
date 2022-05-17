package orientacao_a_objetos_parte2.enumeracoes_5_12;

public class Carta {
    private int numero; // Variavel
    private Naipe naipe; // Variavel e tipo

    public Carta(int numero, Naipe naipe){ // Constructor
        this.numero = numero;
        this.naipe = naipe;
    }
    public void imprimirCarta(){ // Método
        System.out.println("Sou " + numero + " de " + naipe + ". E tenho a cor " + naipe.getCor());
    }
}

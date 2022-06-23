package cad02_orientacao_a_objetos_parte2._5_6_enumeracoes;

public class Carta {
    private int numero; // Atributo privado
    private Naipe naipe; // Objeto privado

    public Carta(int numero, Naipe naipe){ // Constructor
        this.numero = numero;
        this.naipe = naipe;
    }
    public void imprimirCarta(){ // Método
        System.out.println("Sou " + numero + " de " + naipe + ". E tenho ContaCorrente cor " + naipe.getCor());
    }
}

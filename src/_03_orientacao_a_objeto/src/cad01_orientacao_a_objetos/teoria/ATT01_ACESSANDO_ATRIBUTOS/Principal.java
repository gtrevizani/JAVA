package cad01_orientacao_a_objetos.teoria.ATT01_ACESSANDO_ATRIBUTOS;

public class Principal {
    public static void main(String[] args) {
        Carro meuCarro = new Carro(); // Instanciamento
        meuCarro.fabricante = "Fiat"; // Objeto e atributo
        meuCarro.modelo = "Palio";
        meuCarro.anoDefabricacao = 2011;
        meuCarro.cor = "Prata";

        Carro seuCarro = new Carro(); // Instanciamento
        seuCarro.fabricante = "Honda"; // Objeto e atributo
        seuCarro.modelo = "Civic";
        seuCarro.anoDefabricacao = 2009;
        seuCarro.cor = "Preto";

        System.out.println("Meu carro"); // Exibição
        System.out.println("---------------------");
        System.out.println("Modelo: " + meuCarro.modelo);
        System.out.println("Ano: " + meuCarro.anoDefabricacao);

        System.out.println();
        System.out.println("Seu carro"); // Exibição
        System.out.println("----------------------");
        System.out.println("Modelo: " + seuCarro.modelo);
        System.out.println("Ano: " + seuCarro.anoDefabricacao);
    }
}

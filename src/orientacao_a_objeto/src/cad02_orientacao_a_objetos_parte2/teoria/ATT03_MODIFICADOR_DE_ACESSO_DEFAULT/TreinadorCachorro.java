package cad02_orientacao_a_objetos_parte2.teoria.ATT03_MODIFICADOR_DE_ACESSO_DEFAULT;

public class TreinadorCachorro {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro(); // Instanciamento
        cachorro.setNome("Bob"); // Objeto e atributo
        DonoCachorro donoCachorro = new DonoCachorro(); // Instanciamento
        donoCachorro.ensinarCachorroSentar(cachorro); // Objeto e método, cachorro como parâmetro.
    }
}

package cad02_orientacao_a_objetos_parte2._5_4_modificador_de_acesso_default;

public class TreinadorCachorro {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro(); // Instanciamento
        cachorro.setNome("Bob"); // Objeto e atributo
        DonoCachorro donoCachorro = new DonoCachorro(); // Instanciamento
        donoCachorro.ensinarCachorroSentar(cachorro); // Objeto e método, cachorro como parâmetro.
    }
}

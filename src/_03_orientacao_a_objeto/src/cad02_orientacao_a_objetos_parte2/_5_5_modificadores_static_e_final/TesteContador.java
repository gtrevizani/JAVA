package cad02_orientacao_a_objetos_parte2._5_5_modificadores_static_e_final;

public class TesteContador {
    public static void main(String[] args) {
        Contador c = new Contador(); // Instanciamento
        c.incrementar(); // Método instanciado
        System.out.println(Contador.COUNT); // Objeto e propriedade

        Contador.COUNT++; // Objeto e ação
        Contador.imprimirContador(); // Objeto e método estático.
    }
}

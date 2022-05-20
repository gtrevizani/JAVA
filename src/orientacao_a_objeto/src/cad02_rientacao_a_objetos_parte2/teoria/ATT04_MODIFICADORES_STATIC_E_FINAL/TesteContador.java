package cad02_rientacao_a_objetos_parte2.teoria.ATT04_MODIFICADORES_STATIC_E_FINAL;

public class TesteContador {
    public static void main(String[] args) {
        Contador c = new Contador(); // Instanciamento
        c.incrementar(); // Método instanciado
        System.out.println(Contador.COUNT); // Objeto e propriedade

        Contador.COUNT++; // Objeto e ação
        Contador.imprimirContador(); // Objeto e método estático.
    }
}

package orientacao_a_objetos_parte2.teoria.ATT01_ENCAPSULAMENTO_E_MODIFICADORES_DE_ACESSO_PUBLIC_E_PRIVATE;

public class TesteEncapsulamento {
    public static void main(String[] args) {
        ArCondicionado ar = new ArCondicionado(); // Instanciamento
        ar.trocarTemperatura(21); // Método
        System.out.println("Temperatura do ar: " + ar.obterTemperatura() + "°");
        ar.trocarTemperatura(10); // Método
        System.out.println("Temperatura do ar: " + ar.obterTemperatura() + "°");

    }

}

package orientacao_a_objetos_parte2.teoria.ATT06_HERANCA_E_MODIFICADOR_PROTECTED;

public class TesteHerança {
    public static void main(String[] args) {
        Jogador j = new Jogador();
        j.nome = "Ronaldo";
        j.idade = 33;
        j.seApresentar();
        j.dizerSeAindaJoga();
    }
}

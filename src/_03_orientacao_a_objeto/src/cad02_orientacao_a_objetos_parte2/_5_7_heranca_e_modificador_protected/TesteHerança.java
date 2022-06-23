package cad02_orientacao_a_objetos_parte2._5_7_heranca_e_modificador_protected;

public class TesteHerança {
    public static void main(String[] args) {
        Jogador j = new Jogador();
        j.nome = "Ronaldo";
        j.idade = 33;
        j.seApresentar();
        j.dizerSeAindaJoga();
    }
}

package orientacao_a_objetos_parte2.teoria.ATT06_HERANCA_E_MODIFICADOR_PROTECTED;

public class Pessoa {
    String nome;
    protected int idade;
    public void seApresentar(){
        System.out.println("Olá, eu sou " + nome + ", e tenho " + idade + " anos.");
    }
}

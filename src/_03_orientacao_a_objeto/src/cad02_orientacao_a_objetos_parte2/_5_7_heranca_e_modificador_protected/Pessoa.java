package cad02_orientacao_a_objetos_parte2._5_7_heranca_e_modificador_protected;

public class Pessoa {
    String nome;
    protected int idade;
    public void seApresentar(){
        System.out.println("Olá, eu sou " + nome + ", e tenho " + idade + " anos.");
    }
}

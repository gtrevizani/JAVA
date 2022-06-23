package cad02_orientacao_a_objetos_parte2._5_7_heranca_e_modificador_protected;

public class Jogador extends Pessoa {
    protected boolean aindaJoga = false;
    public void dizerSeAindaJoga(){
        System.out.println("Ainda joga? " + aindaJoga);
    } // Public Void = não retorna nenhum valor.
}

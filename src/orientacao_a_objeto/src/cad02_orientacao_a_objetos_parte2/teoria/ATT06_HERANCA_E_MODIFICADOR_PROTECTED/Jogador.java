package cad02_orientacao_a_objetos_parte2.teoria.ATT06_HERANCA_E_MODIFICADOR_PROTECTED;

public class Jogador extends Pessoa {
    protected boolean aindaJoga = false;
    public void dizerSeAindaJoga(){
        System.out.println("Ainda joga? " + aindaJoga);
    } // Public Void = não retorna nenhum valor.
}

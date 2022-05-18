package orientacao_a_objetos_parte2.teoria.ATT01_ENCAPSULAMENTO_E_MODIFICADORES_DE_ACESSO_PUBLIC_E_PRIVATE;

public class ArCondicionado { // Objeto
    private int temperatura; // Atributo privado
    public void trocarTemperatura(int temperatura){ // Método público
        if(temperatura >= 17 && temperatura <= 25){ // Estrutura condicional
            this.temperatura = temperatura;
        }
    }
    public int obterTemperatura(){ // Método de chamada
        return temperatura;
    }
}

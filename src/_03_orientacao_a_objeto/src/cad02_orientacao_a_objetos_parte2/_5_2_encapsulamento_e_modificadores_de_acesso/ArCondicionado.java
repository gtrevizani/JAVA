package cad02_orientacao_a_objetos_parte2._5_2_encapsulamento_e_modificadores_de_acesso;

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

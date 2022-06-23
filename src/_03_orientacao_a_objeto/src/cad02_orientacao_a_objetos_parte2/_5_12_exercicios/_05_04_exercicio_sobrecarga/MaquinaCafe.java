package cad02_orientacao_a_objetos_parte2._5_12_exercicios._05_04_exercicio_sobrecarga;

public class MaquinaCafe {
    int acucarDisponivel;

    public void fazerCafe(){
        fazerCafe(10);
    }
    public void fazerCafe(int quantidade){
        if(acucarDisponivel < quantidade){
            System.out.println("Não há açúcar suficiente para fazer seu café.");
        } else {
            acucarDisponivel -= quantidade;
            System.out.println("Fazendo cafezinho com " + quantidade + " gramas de açucar.");
        }
    }
}

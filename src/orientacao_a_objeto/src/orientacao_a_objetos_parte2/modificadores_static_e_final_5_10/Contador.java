package orientacao_a_objetos_parte2.modificadores_static_e_final_5_10;

public class Contador {
    public static int COUNT = 0; // Propriedade pública.
    public static final double PI = 3.14; // Constante pública.
    public void incrementar(){ // Método de instância da classe, precisa de instanciamento.
        COUNT++;
    }
    public static void imprimirContador(){ // Método público.
        System.out.println("O valor do contador agora é: " + Contador.COUNT);
    }
}

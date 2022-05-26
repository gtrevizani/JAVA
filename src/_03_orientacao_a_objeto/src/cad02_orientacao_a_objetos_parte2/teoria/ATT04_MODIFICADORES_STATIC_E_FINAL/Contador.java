package cad02_orientacao_a_objetos_parte2.teoria.ATT04_MODIFICADORES_STATIC_E_FINAL;

public class Contador {
    public static int COUNT = 0; // Propriedade pública.
    public static final double PI = 3.14; // Constante pública.
    public void incrementar(){
        COUNT++;
    } // Método público
    public static void imprimirContador(){
        System.out.println("O valor do contador agora é: " + Contador.COUNT);
    } // Método estático e público
}

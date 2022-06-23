package cad03_topicos_avancados._6_3_classes_string_stringbuffer_e_stringbuilder;

public class TesteStrings {
    public static void main(String[] args) {
        String s = "Olá";
        s = s + " Pessoal!";

        System.out.println(s);

        StringBuilder sb = new StringBuilder("olá"); // Criou-se a variável
        sb.append(" Pessoal!"); // Acrescenta à variável

        String resultado = sb.toString(); // Variável resultado recebe o toString da variavel sb
        System.out.println("Com StringBuilder: " + resultado); // Exibe
    }
}

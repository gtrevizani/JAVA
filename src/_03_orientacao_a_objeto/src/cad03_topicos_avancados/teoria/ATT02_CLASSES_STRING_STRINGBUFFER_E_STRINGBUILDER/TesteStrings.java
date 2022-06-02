package cad03_topicos_avancados.teoria.ATT02_CLASSES_STRING_STRINGBUFFER_E_STRINGBUILDER;

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

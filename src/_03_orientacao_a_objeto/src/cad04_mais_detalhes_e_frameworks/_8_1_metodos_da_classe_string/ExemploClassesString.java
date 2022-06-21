package cad04_mais_detalhes_e_frameworks._8_1_metodos_da_classe_string;

public class ExemploClassesString {
    public static void main(String[] args) {
        String s = "Filipe Alves Vaz";

        System.out.println(s.charAt(0));
        System.out.println(s.charAt(2));
        System.out.println(s.charAt(8));
        System.out.println(s.charAt(9));

        System.out.println(s.length());

        char[] array = {'D', 'L', 'A'};
        String s1 = new String(array);
        System.out.println(s1);

        String s2 = "Desenvolvimento Java";
        System.out.println(s.substring(16));

        String s3 = "Cursos online de desenvolvimento de software";
        System.out.println(s3.substring(7,12));

        String s4 = "Cursos_online_de_desenvolvimento_de_software";
        String[] array1 = s4.split("_");

        for(int i = 0; i < array1.length; i++){
            System.out.println("[" + i + "]=" + array1[i]);
        }

        String s5 = "Filipe";
        System.out.println(">" + s5 + "<");
        System.out.println(">" + s5.trim() + "<");

        String s6 = "Java";

        int indice = s6.indexOf('a');
        System.out.println(indice);

        indice = s6.lastIndexOf('a');
        System.out.println(indice);

        String s7 = "Desenvolvimento Java";
        System.out.println(s7.replaceAll("Java", "de software"));
    }
}

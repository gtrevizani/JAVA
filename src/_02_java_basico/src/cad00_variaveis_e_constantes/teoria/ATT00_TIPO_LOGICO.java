package cad00_variaveis_e_constantes.teoria;
/*


Representado por BOOLEAN.
Ex: Boolean variavelFalsa = false;
Ex: Bollean podeComer = ficha >= 1;
 */



public class ATT00_TIPO_LOGICO {
    public static void main(String[] args) {
        Boolean variavelVerdadeira = true;
        System.out.println("Variavel verdadeira: " + variavelVerdadeira);

        Boolean variavelFalsa = false;
        System.out.println("Variavel falsa: " + variavelFalsa);

        System.out.println("--------------------------------------------");
        Integer idade = 15;

        Boolean podeTirarCarteira = idade >= 18;

        System.out.println(idade + " anos pode tirar carteira? " + podeTirarCarteira);
        System.out.println("--------------------------------------------");

        if (podeTirarCarteira) {
            System.out.println("Sim! Ele(a) pode tirar carteira.");
        } else {
            System.out.println("Nao! Ele(a) nao pode tirar carteira.");
        }
    }
}
